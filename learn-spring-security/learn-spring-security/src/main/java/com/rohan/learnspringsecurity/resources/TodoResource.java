package com.rohan.learnspringsecurity.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.security.RolesAllowed;

@RestController
public class TodoResource {
	private static final List<Todo> List_todos = List.of(new Todo("rohan","Learn AWS"),
			new Todo("rohan","Get a job"));
	
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@GetMapping("/todos")
	public List<Todo> retrieveAllTodos() {
		return List_todos;
	}
	
	@PreAuthorize("hasRole('USER') and #username == authentication.name")
	@GetMapping("/users/{username}/todos")
	@RolesAllowed({"ADMIN", "USER"})
	@PostAuthorize("returnObject.username == 'rohan'")
	public Todo retrieveTodoforUser(@PathVariable String username) {
		return List_todos.get(0);
	}
	
	@PostMapping("/users/{username}/todos")
	public void createTodoforUser(@PathVariable String username, @RequestBody Todo todo) {
		logger.info("Create {} for {}",todo, username);
	
	}

}

record Todo (String username, String description) {}