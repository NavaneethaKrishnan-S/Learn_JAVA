package com.naveen.learnspringframework.dependencyInjection.exercise;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component	
class YourBusiness{
		
	Manager manager1;
	Employee employee1;
		
	public YourBusiness(Manager manager1, Employee employee1) {
		super();
		this.manager1 = manager1;
		this.employee1 = employee1;
	}



//	@Autowired
//	public YourBusiness(Dependency1 dependency1, Dependency2 dependency2) {
//		super();
//		System.out.println("Constructor Injection - YourBusiness");
//		this.dependency1 = dependency1;
//		this.dependency2 = dependency2;
//	}
 

//	@Autowired
//	public void setDependency1(Manager firstManager) {
//		System.out.println("Manager Dependency.");
//		this.manager1 = firstManager;
//	}
//
//	@Autowired
//	public void setDependency2(Employee firstEmployee) {
//		System.out.println("Employee Dependency.");
//		this.employee1 = firstEmployee;
//	}

	public String toString() {
		return "Using " + manager1 + " and " + employee1;
	}
}
@Component
class Manager{
	
}
@Component
class Employee{
	
}

@Configuration
@ComponentScan // automatically scan on current package
public class DependencyInjectionApp {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(DependencyInjectionApp.class)){
			
		Arrays.stream(context.getBeanDefinitionNames())
		.forEach(System.out::println);
		
		System.out.println(context.getBean(YourBusiness.class));
		}
	}
}
 