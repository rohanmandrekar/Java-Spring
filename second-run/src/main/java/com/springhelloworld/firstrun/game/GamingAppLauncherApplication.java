package com.springhelloworld.firstrun.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan("com.springhelloworld.firstrun.game")
public class GamingAppLauncherApplication {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		try(var context= new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);){
		
		context.getBean(GameConsole.class).up();
		
		context.getBean(gameRunner.class).run();
		
		}
	}

}
