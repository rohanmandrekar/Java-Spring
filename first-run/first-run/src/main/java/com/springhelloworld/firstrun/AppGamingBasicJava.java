package com.springhelloworld.firstrun;

import com.springhelloworld.firstrun.game.Contra;
import com.springhelloworld.firstrun.game.Mario;
import com.springhelloworld.firstrun.game.gameRunner;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var Mario = new Mario();
		var Contra =  new Contra();
		var gameRunner= new gameRunner(Contra);
		gameRunner.run();
	}

}
