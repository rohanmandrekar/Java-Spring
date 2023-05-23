package com.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos=new ArrayList<>();
	static {
		todos.add(new Todo(1,"Rohan","Finish Spring", LocalDate.now().plusDays(10), false));
		todos.add(new Todo(1,"Rohan","Apply 10 Jobs", LocalDate.now().plusDays(1), false));
		todos.add(new Todo(1,"Rohan","Read", LocalDate.now().plusDays(1), false));
		
		}
	
	public List<Todo> findByUsername(String Username){
		
		return todos;
	}
}
