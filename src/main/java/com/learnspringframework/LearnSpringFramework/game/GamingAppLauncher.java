package com.learnspringframework.LearnSpringFramework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;








@Configuration
@ComponentScan("com.learnspringframework.LearnSpringFramework.game")
public class GamingAppLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(GamingAppLauncher.class)){
			
			 context.getBean(PacManGame.class).up();
			 context.getBean(GameRunner.class).run();
			 context.getBean(SuperContraGame.class).down();
			 context.getBean(Mariogame.class).left();
			 
	}
	

	}
	


}
