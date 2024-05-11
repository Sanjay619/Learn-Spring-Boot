package com.learnspringframework.LearnSpringFramework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifer")
public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("up");
	}

	@Qualifier("superContraDown")
	public void down() {
		System.out.println("Sit down");
	}
	public void left() {
		System.out.println("Go back");
	}
	
	public void right() {
		System.out.println("Fire a bullet.");
	}

	
	
}
