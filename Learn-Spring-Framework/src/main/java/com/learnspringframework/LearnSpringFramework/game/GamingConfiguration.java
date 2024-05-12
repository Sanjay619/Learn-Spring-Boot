package com.learnspringframework.LearnSpringFramework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		
		return new PacManGame();
	}

	
	@Bean
	public GameRunner gmeRunner(GamingConsole game) {
		
		GameRunner gameRunner = new GameRunner(game);
		return  gameRunner;
	}

}
