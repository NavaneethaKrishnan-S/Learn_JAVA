package com.naveen.learnspringframework.LazyAndEagerInitialization;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
class Manager{
	
	Employee employee;

	public Manager(Employee employee) {
		super();
		this.employee = employee;
		System.out.println("Manager bean created and got employee.");
	}
	
	public String doWork() {
		return "Manager doing work";
	}
}

@Component
@Lazy
class Employee{
	
}

@Configuration
@ComponentScan
public class LazyInitializationApp {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(LazyInitializationApp.class)){
		
			System.out.println("Initialization of context is completed");
			
//			context.getBean(Manager.class).doWork();
//			Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println);
			System.out.println(context.getBean(Manager.class).doWork());
			
		}
	}
}
 