package com.learnspringframework.LearnSpringFramework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspringframework.LearnSpringFramework.game.GameRunner;
import com.learnspringframework.LearnSpringFramework.game.Mariogame;
import com.learnspringframework.LearnSpringFramework.game.PacManGame;
import com.learnspringframework.LearnSpringFramework.game.SuperContraGame;

public class App02GamingSpringBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(GamingConfiguration.class)){
			
			 context.getBean(PacManGame.class).up();
			 context.getBean(GameRunner.class).run();
		}
	}

}
