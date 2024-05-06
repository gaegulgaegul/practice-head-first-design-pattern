package io.gaegul.ch01;

import io.gaegul.ch01.behavior.FlyNoWay;
import io.gaegul.ch01.behavior.MuteQuack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		super(new FlyNoWay(), new MuteQuack());
	}

	@Override
	public void display() {
		System.out.println("모형 오리");
	}
}
