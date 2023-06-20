package com.naveen.learnspringframework.dependencyInjection.ExerciseDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependencyInjectionApp {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(DependencyInjectionApp.class)){
			System.out.println(context.getBean
					(BusinessCalculationService.class).findMax());
			
		}
	}
}
 