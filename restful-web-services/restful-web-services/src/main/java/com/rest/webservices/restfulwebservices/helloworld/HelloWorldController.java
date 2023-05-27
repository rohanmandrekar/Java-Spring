package com.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//exposing the rest API

@RestController
public class HelloWorldController {
	
	@GetMapping("hello-world")
	public String helloWorld() {
		return"HELLOW WORLD";
	}

}
