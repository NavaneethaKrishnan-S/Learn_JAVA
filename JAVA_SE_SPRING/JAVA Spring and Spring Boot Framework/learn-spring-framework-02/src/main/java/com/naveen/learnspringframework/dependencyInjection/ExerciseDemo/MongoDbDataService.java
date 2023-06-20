package com.naveen.learnspringframework.dependencyInjection.ExerciseDemo;

import org.springframework.stereotype.Repository;

//@Component Instead of writing component annotation, if we are using database or data access in a class, then we can use @Repository annotation.
@Repository
public class MongoDbDataService implements DataService {

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] {50, 60, 70, 80};
	}
	
}
