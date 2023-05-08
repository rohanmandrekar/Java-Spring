package com.springhelloworld.firstrun;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};

record Address (String firstline, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Rohan";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		return new Person("Max", 20);
		
	}
	
	@Bean
	public Address address() {
		return new Address("2627 live oak st", "Dallas" );
	}

}
