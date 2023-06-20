package com.naveen.learnspringframework.DependencyExercise;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependencyNeedExerciseApp {

	public static void main(String[] args) {
		try (var context 
				= new AnnotationConfigApplicationContext
					(DependencyNeedExerciseApp.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(
			context.getBean(BusinessCalculationService.class).findMax());
		}
	}

}
