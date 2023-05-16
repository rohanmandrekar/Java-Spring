package com.springboot.springboottutorial;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList( 	new Course(1, "Python", "abc"), 
				new Course(2,"Java","bcd")	);
				
		
	}

}
