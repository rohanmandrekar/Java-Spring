package com.springhelloworld.firstrun;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Launch a SPRING CONTEXT
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		
		//Configure the things that we want spring to manage
		//Helloworldconfiguration @configuration
		//name- @Bean
		
		//Retrieving Bean managed by spring
		System.out.println(context.getBean("name"));
		
		
	}

}
