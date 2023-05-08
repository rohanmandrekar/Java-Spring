package com.springhelloworld.firstrun.examples.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan
public class RealWorldExampleSimpleSpringContextLauncherApplication {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(var context= new AnnotationConfigApplicationContext(RealWorldExampleSimpleSpringContextLauncherApplication.class);){
		
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessCalculationService.class).findmax());
		
		}
	}

}
