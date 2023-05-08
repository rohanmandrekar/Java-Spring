package com.springhelloworld.firstrun;

import com.springhelloworld.firstrun.game.Contra;
import com.springhelloworld.firstrun.game.Mario;
import com.springhelloworld.firstrun.game.Pacman;
import com.springhelloworld.firstrun.game.gameRunner;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//var Game = new Mario();
		var Game = new Pacman(); //Creating Object
		//var Game =  new Contra();
		
		var gameRunner= new gameRunner(Game);
		//Wiring dependencies: Game is a dependency of Game runner
		
		gameRunner.run();
	}

}
