package com.naveen.learnspringframework.dependencyInjection.ExerciseDemo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Component - Instead of writing component annotation, if we are using business logic in a class, then we can use @Service annotation.
@Service
public class BusinessCalculationService {
	
	DataService dataService;
	
	@Autowired
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}


	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
