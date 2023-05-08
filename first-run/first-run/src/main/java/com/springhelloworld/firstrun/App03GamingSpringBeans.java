package com.springhelloworld.firstrun;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springhelloworld.firstrun.game.Contra;
import com.springhelloworld.firstrun.game.GameConsole;
import com.springhelloworld.firstrun.game.Mario;
import com.springhelloworld.firstrun.game.Pacman;
import com.springhelloworld.firstrun.game.gameRunner;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(var context= new AnnotationConfigApplicationContext(GamingConfig.class);){
		
		context.getBean(GameConsole.class).up();
		
		context.getBean(gameRunner.class).run();
		
		}
	}

}
