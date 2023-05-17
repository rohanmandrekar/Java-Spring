package com.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	//@Autowired
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void delete(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
		
	}

}
