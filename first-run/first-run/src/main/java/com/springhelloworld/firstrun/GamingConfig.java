package com.springhelloworld.firstrun;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springhelloworld.firstrun.game.Pacman;
import com.springhelloworld.firstrun.game.GameConsole;
import com.springhelloworld.firstrun.game.gameRunner;

@Configuration
public class GamingConfig {
	
	@Bean
	public GameConsole game() {
		var game= new Pacman();
		return game;
	}
	
	@Bean
	public gameRunner gameRunner(GameConsole game) {
		var gameRunner = new gameRunner(game);
		return gameRunner;
	}
	

}
