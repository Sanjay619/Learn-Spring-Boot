package com.learnspringframework.LearnSpringFramework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	private GamingConsole game;
	
	public GameRunner(@Qualifier("SuperContraGameQualifer") GamingConsole marioGame) {
		this.game = marioGame;
		
	}
	
	public void run() {
		System.out.println("Running game " + game );
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
