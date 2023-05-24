package com.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static int todoCount=0;
	private static List<Todo> todos=new ArrayList<>();
	static {
		todos.add(new Todo(++todoCount,"Rohan","Finish Spring", LocalDate.now().plusDays(10), false));
		todos.add(new Todo(++todoCount,"Rohan","Apply 10 Jobs", LocalDate.now().plusDays(1), false));
		todos.add(new Todo(++todoCount,"Rohan","Read", LocalDate.now().plusDays(1), false));
		
		}
	
	public List<Todo> findByUsername(String Username){
		
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		
		Todo todo=new Todo(++todoCount,username,description,targetDate,done);
		todos.add(todo);
		
	}
}
