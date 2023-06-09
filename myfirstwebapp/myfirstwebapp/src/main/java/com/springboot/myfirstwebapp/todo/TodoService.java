package com.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	private static int todoCount=0;
	private static List<Todo> todos=new ArrayList<>();
	static {
		todos.add(new Todo(++todoCount,"Rohan","Finish Spring 1", LocalDate.now().plusDays(10), false));
		todos.add(new Todo(++todoCount,"Rohan","Apply 10 Jobs 1", LocalDate.now().plusDays(1), false));
		todos.add(new Todo(++todoCount,"Rohan","Read 1", LocalDate.now().plusDays(1), false));
		
		}
	
	public List<Todo> findByUsername(String Username){
		Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(Username);
		return todos.stream().filter(predicate).toList();
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		
		Todo todo=new Todo(++todoCount,username,description,targetDate,done);
		todos.add(todo);
		
	}
	
	public void deleteById(int id) {
		
		Predicate<? super Todo> predicate = todo -> todo.getId()==id;
		todos.removeIf(predicate);
	}
	
public void updateById(int id) {
		
		Predicate<? super Todo> predicate = todo -> todo.getId()==id;
		todos.removeIf(predicate);
	}

public Todo findById(int id) {
	// TODO Auto-generated method stub
	Predicate<? super Todo> predicate = todo -> todo.getId()==id;
	Todo todo=todos.stream().filter(predicate).findFirst().get();
	return todo;
}

public void updateTodo(@Valid Todo todo) {
	// TODO Auto-generated method stub
	deleteById(todo.getId());
	todos.add(todo);
	
}
}
