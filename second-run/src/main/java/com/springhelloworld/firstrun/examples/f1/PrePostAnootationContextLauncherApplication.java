package com.springhelloworld.firstrun.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependency somedependency;
	
	public SomeClass(SomeDependency somedependency) {
		super();
		this.somedependency=somedependency;
		System.out.println("Dependencies ready");
	}
	
	@PostConstruct
	public void initialize() {
		somedependency.getReady();
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("cleaning up");
	}
	
}

@Component
class SomeDependency{

	public void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Some logic to get ready in dependency");
	}
	
}

@Configuration
@ComponentScan
public class PrePostAnootationContextLauncherApplication {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(var context= new AnnotationConfigApplicationContext(PrePostAnootationContextLauncherApplication.class);){
		
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		}
	}

}
