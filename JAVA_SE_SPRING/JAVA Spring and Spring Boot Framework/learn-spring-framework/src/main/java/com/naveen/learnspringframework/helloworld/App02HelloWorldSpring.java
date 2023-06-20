package com.naveen.learnspringframework.helloworld;

//import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		// Launch a Spring Context.		
		try(var context = 
				new AnnotationConfigApplicationContext
					(HelloWorldConfiguration.class)){
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("person2MethodCall"));
			
			System.out.println(context.getBean("person3Parameter"));
		
			System.out.println(context.getBean(Person.class));
			
			System.out.println(context.getBean(Address.class));
			
//			Arrays.stream(context.getBeanDefinitionNames())
//				.forEach(System.out::println);
			
			
			
			/*
			 * We have created the name object and it is managed by spring. 
			 * We can ask the spring context to give the name object.
			 * Anything that is managed by spring is called a bean.
			 * getBean method used to retrieving Beans managed by Spring.
			 * There are multiple ways to retrieve values from the context.
			 * One of the way is give method name.
			 * */
		}
		
		
		
	}
	
}
 