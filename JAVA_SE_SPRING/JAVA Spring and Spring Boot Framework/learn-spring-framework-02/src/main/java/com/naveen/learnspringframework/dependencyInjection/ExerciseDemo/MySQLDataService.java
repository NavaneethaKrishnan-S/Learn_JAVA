package com.naveen.learnspringframework.dependencyInjection.ExerciseDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MySQLDataService implements DataService {

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] {10, 20, 30, 40};
	}

}
