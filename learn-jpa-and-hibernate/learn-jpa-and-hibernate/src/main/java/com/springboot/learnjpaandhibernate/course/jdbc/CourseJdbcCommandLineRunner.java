package com.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learnjpaandhibernate.course.Course;


@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJdbcRepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1,"Java","Abc"));
		repository.insert(new Course(2,"Python","Dbc"));
		repository.insert(new Course(3,"AWS","Aba"));
		repository.delete(1);
		System.out.println(repository.findById(3));	
		System.out.println(repository.findById(2));
		
		
	}

}
