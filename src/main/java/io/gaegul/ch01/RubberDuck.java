package io.gaegul.ch01;

import io.gaegul.ch01.behavior.QuackBehavior;

public class RubberDuck extends Duck implements QuackBehavior {

	@Override
	public void display() {
		System.out.println("러버덕");
	}

	@Override
	public void quack() {
		System.out.println("삑삑~");
	}
}
