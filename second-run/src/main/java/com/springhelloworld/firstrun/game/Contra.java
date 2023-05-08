package com.springhelloworld.firstrun.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ContraQualifier")
public class Contra implements GameConsole{
	
	public void up() {
		System.out.println("Up");
	}
	
	public void down() {
		System.out.println("Duck");
	}
	
	public void left() {
		System.out.println("Go back");
	}
	
	public void right() {
		System.out.println("Shoot");
	}

}
