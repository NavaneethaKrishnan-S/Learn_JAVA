package com.naveen.learnspringframework.DependencyExercise;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {

	@Override
	public int[] retrieveData() {		
		return new int[] {10, 20, 30, 40};
	}

}
