package com.naveen.learnspringframework.SingletonAndPrototypeScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class Manager{
	
}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class Employee{
	
}

@Configuration
@ComponentScan
public class SingletonPrototypeApp {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(SingletonPrototypeApp.class)){
			
			System.out.println(context.getBean(Manager.class));
			System.out.println(context.getBean(Manager.class));
			System.out.println(context.getBean(Manager.class));
			System.out.println(context.getBean(Manager.class));
			System.out.println(context.getBean(Manager.class));
			
			System.out.println(context.getBean(Employee.class));
			System.out.println(context.getBean(Employee.class));
			System.out.println(context.getBean(Employee.class));
			System.out.println(context.getBean(Employee.class));
			System.out.println(context.getBean(Employee.class));
		}
	}
}
 