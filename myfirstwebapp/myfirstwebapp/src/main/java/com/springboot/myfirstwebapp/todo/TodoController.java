package com.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

//@Controller
@SessionAttributes("name")
public class TodoController {
	private TodoService todoService;
	
	
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	

	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		String username=getLoggedinUsername(model);
		List<Todo> todos=todoService.findByUsername(username);
		model.addAttribute("todos",todos);
		return "listTodos";
	}



	private String getLoggedinUsername(ModelMap model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name=auth.getName();
		name=name.substring(0, 1).toUpperCase() + name.substring(1);
		return name;
	}
	
	@RequestMapping(value="add-todo", method=RequestMethod.GET)
	public String shownewTodoPage(ModelMap model) {
		String username=getLoggedinUsername(model);
		Todo todo= new Todo(0,username,"",LocalDate.now().plusDays(1),false);
		model.put("todo", todo);
		return "todo";
	}
	
	@RequestMapping(value="add-todo", method=RequestMethod.POST)
	public String addnewTodoPage(ModelMap model, @Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "todo";
		}
		String username=getLoggedinUsername(model);
		todoService.addTodo(username, todo.getDescription(), todo.getTargetDate(), false);
		return "redirect:list-todos";
	}
	
	@RequestMapping("delete-todo")
	public String deleteTodos(@RequestParam int id) {
		todoService.deleteById(id);
		return "redirect:list-todos";
	}
	
	@RequestMapping(value="update-todo",method=RequestMethod.GET)
	public String showUpdatePage(@RequestParam int id,ModelMap model) {
		Todo todo=todoService.findById(id);
		model.addAttribute("todo",todo);
		return "todo";
	}
	
	@RequestMapping(value="update-todo", method=RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "todo";
		}
		String username=getLoggedinUsername(model);
		todo.setUsername(username);
		todoService.updateTodo(todo);
		return "redirect:list-todos";
	}
	
}
