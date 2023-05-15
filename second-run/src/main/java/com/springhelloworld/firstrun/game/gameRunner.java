package com.springhelloworld.firstrun.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class gameRunner {
	
	private GameConsole game;

	public gameRunner(@Qualifier("ContraQualifier") GameConsole game) {
		this.game=game;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game : "+game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
