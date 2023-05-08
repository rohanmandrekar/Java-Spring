package com.springhelloworld.firstrun;

import com.springhelloworld.firstrun.game.Contra;
import com.springhelloworld.firstrun.game.Mario;
import com.springhelloworld.firstrun.game.Pacman;
import com.springhelloworld.firstrun.game.gameRunner;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var Game = new Mario();
		var Game = new Pacman();
		//var Game =  new Contra();
		var gameRunner= new gameRunner(Game);
		gameRunner.run();
	}

}
