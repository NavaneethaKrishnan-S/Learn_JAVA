package com.naveen.learnspringframework.JakartaCDIExample;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//instead of @Component, there is an alternative that is @named.
@Named
class BusinessService{
	
	private DataService dataService;
	
	//instead of @autowired, there is an alternative that is @inject.
	@Inject
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
		System.out.println("Data service dependency injected");
	}
	
	public DataService getDataService() {
		return dataService;
	}	
}

@Named
class DataService{
	
}

@Configuration
@ComponentScan
public class JakartaCDIExampleApp {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(JakartaCDIExampleApp.class)){
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessService.class));
			
		}
	}
}
 