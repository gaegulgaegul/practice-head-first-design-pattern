package io.gaegul.ch01;

import io.gaegul.ch01.behavior.FlyWithWings;
import io.gaegul.ch01.behavior.Quack;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		super(new FlyWithWings(), new Quack());
	}

	@Override
	public void display() {
		System.out.println("흰죽지오리");
	}
}
