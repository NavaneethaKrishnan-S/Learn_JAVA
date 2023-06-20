package com.naveen.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/*
 * Let's say a spring can managing an object of a custom class
 * */
record Address(String firstLine, String city) {};

record Person(String name, int age, Address address) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean 
	//Indicates that a method produces a bean to be managed by the Spring container. 
	public String name() {
		return "Naveen";
	}
	
	@Bean 
	public int age() {
		return 22;
	}
	
	@Bean
	@Primary
	public Person person() {
		return new Person("Hariharan", 24, new Address("Kochi", "Kerala"));	
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());	
	}
	
	@Bean
	public Person person3Parameter(String name, int age, Address address2) {
		return new Person(name, age, address2);	
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("Baker Street", "London");
		
	}
	
	
//	@Bean(name = "address1")
//	public Address address1() {
//		return new Address("Baker Street", "Puducherry");
//		
//	}
	
}
