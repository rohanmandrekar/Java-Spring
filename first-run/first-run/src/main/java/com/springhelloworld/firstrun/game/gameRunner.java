package com.springhelloworld.firstrun.game;

public class gameRunner {
	Mario game;
	public gameRunner(Mario game) {
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
