package com.springhelloworld.firstrun.examples.g1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusinessService{
	private DataService dataservice;
	
	//@Autowired
	@Inject
	public void setDataservice(DataService dataservice) {
		System.out.println("Setter injection performed");
		this.dataservice = dataservice;
	}
	
	public DataService getDataservice() {
		
		return dataservice;
	}
	
	
}

//@Component
@Named
class DataService{
	
}

@Configuration
@ComponentScan
public class CDIContextContextLauncherApplication {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(var context= new AnnotationConfigApplicationContext(CDIContextContextLauncherApplication.class);){
		
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessService.class).getDataservice());
		
		}
	}

}
