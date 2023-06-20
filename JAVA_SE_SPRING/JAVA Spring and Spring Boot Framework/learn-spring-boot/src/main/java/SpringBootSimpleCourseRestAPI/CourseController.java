package SpringBootSimpleCourseRestAPI;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "JAVA MASTERY", "MOSH HAMEDANI"),
				new Course(2, "PYTHON MASTERY", "MOSH HAMEDANI"),
				new Course(3, "C++ MASTERY", "MOSH HAMEDANI")
				);
	}
}
