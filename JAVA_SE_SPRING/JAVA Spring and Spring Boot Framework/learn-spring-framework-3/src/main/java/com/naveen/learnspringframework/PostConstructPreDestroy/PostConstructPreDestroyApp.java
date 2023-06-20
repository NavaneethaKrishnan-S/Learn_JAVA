package com.naveen.learnspringframework.PostConstructPreDestroy;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class Server{
	private Database database;

	public Server(Database database) {
		super();
		this.database = database;
		System.out.println("All dependencies are wired and ready");
	}
	
	@PostConstruct
	public void initialize() {
		database.connect();
	}
	
	@PreDestroy
	public void cleanUp() {
		database.close();
	}
}

@Component
class Database{
	public void connect() {
		System.out.println("Requesting for database connection");
		System.out.println("CONNECTED");
	}

	public void close() {
		System.out.println("Requesting for close connection.");
		System.out.println("CONNECTION - ENDED");
	}
}
@Configuration
@ComponentScan
public class PostConstructPreDestroyApp {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(PostConstructPreDestroyApp.class)){
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
		}
	}
}
 