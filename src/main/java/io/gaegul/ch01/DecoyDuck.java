package io.gaegul.ch01;

import io.gaegul.ch01.behavior.FlyNoWay;
import io.gaegul.ch01.behavior.MuteQuack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		super(new FlyNoWay(), new MuteQuack());
	}

	@Override
	public void display() {
		System.out.println("가짜 오리");
	}
}
