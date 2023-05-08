package com.springhelloworld.firstrun.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Launch a SPRING CONTEXT
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);){
			
			
			//Configure the things that we want spring to manage
			//Helloworldconfiguration @configuration
			//name- @Bean
			
			//Retrieving Bean managed by spring
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean("person2methodcall"));
			
			System.out.println(context.getBean("person3parameters"));
			
			System.out.println(context.getBean(Person.class));
			
			System.out.println(context.getBean("person5quali"));
			
		
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			
			
			
			}
			
			
			
			
			
		}
		
		
		
		
		

}
