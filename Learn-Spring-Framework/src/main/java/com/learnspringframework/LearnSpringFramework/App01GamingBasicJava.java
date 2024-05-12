package com.learnspringframework.LearnSpringFramework;

import com.learnspringframework.LearnSpringFramework.game.GameRunner;
import com.learnspringframework.LearnSpringFramework.game.Mariogame;
import com.learnspringframework.LearnSpringFramework.game.PacManGame;
import com.learnspringframework.LearnSpringFramework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var game = new Mariogame();
		//var  game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		
	}

}
