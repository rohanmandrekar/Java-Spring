package com.springhelloworld.firstrun.examples.e1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
class NormalClass{
	
}


@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class Prototype{
	
}

@Configuration
@ComponentScan
public class BeanScopeLauncherApplication {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(var context= new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class);){
		
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(Prototype.class));
			System.out.println(context.getBean(Prototype.class));
			System.out.println(context.getBean(Prototype.class));
		
		}
	}

}
