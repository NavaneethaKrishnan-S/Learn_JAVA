package com.naveen.learnspringframework.SpringXMLConfigExample;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naveen.learnspringframework.game.GameRunner;

public class SpringXML_ConfigApp {

	public static void main(String[] args) {
		
		try(var context = 
				new ClassPathXmlApplicationContext
						("contextConfiguration.xml")){
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);	
			
			System.out.println(context.getBean("name"));
			
			context.getBean(GameRunner.class).run();
		}
	}
}
 