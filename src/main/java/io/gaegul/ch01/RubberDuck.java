package io.gaegul.ch01;

import io.gaegul.ch01.behavior.FlyNoWay;
import io.gaegul.ch01.behavior.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super(new FlyNoWay(), new Squeak());
	}

	@Override
	public void display() {
		System.out.println("러버덕");
	}

}
