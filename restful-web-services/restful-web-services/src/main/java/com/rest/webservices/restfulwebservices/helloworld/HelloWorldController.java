package com.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


//exposing the rest API

@RestController
public class HelloWorldController {
	
	@GetMapping("hello-world")
	public String helloWorld() {
		return"HELLOW WORLD";
	}
	
	@GetMapping("hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("HELLOW WORLD");
	}
	
	@GetMapping("hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean("HELLOW WORLD "+ name );
	}

}
