package com.learnspringframework.LearnSpringFramework.game;

public class PacManGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("jump..");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("down..");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Go left..");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Go right..");
	}

}
