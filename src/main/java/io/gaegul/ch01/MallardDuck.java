package io.gaegul.ch01;

import io.gaegul.ch01.behavior.FlyWithWings;
import io.gaegul.ch01.behavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super(new FlyWithWings(), new Quack());
	}

	@Override
	public void display() {
		System.out.println("청둥오리");
	}
}
