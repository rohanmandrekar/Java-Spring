package com.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJpaRepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1,"Java jpa","Abc"));
		repository.insert(new Course(2,"Python jpa","Dbc"));
		repository.insert(new Course(3,"AWS jpa","Aba"));
		repository.delete(1);
		System.out.println(repository.findById(3));	
		System.out.println(repository.findById(2));
		
		
	}

}
