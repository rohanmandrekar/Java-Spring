package com.rest.webservices.restfulwebservices.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


//exposing the rest API

@RestController
public class HelloWorldController {
	
	private MessageSource messageSource;
	
	public HelloWorldController (MessageSource messageSource) {
		this.messageSource=messageSource;	}
	
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
	
	@GetMapping("hello-world-i18n")
	public String helloWorldBeani18n() {
		
		Locale locale= LocaleContextHolder.getLocale();
		return messageSource.getMessage("goodmorning.message", null, "default message", locale);
		//return "Hello World";
	}

}
