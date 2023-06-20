package com.naveen.learnspringframework.DependencyExercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class MongoDbDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[] {50, 60, 70, 80};
	}

}
