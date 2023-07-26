package com.naveen.springboot.learnJPAandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.naveen.springboot.learnJPAandhibernate.course.springDataJpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//	
//	@Autowired
//	private CourseJdbcRepostitory repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn Spring boot", "Naveen"));
		repository.save(new Course(2, "JAVA SE", "Navaneethakrishnan S"));
		repository.save(new Course(3, "JAVA EE", "Naveen"));
		repository.save(new Course(4, "Java Quarkus", "Navaneethakrishnan S"));
		
		repository.deleteById(3L);
		
		System.out.println(repository.findById(2L));
		System.out.println(repository.findById(1L));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Navaneethakrishnan S"));
		
		System.out.println(repository.findByName("Java Quarkus"));
	}
}
