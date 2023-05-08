package com.springhelloworld.firstrun;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {};

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
		return new Person("Max", 20, new Address("1800 N hall st", "Dallas"));
		
	}
	
	@Bean(name="address2")
	public Address address() {
		return new Address("2627 live oak st", "Dallas" );
	}
	
	@Bean
	public Person person2methodcall() {
		return new Person(name(),age(),address());
	}
	
	@Bean
	public Person person3parameters (String name, int age, Address address2) {
		return new Person(name,age,address2);
	}

}
