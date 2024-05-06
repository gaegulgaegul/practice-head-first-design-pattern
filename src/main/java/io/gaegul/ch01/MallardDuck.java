package io.gaegul.ch01;

import io.gaegul.ch01.behavior.FlyBehavior;
import io.gaegul.ch01.behavior.QuackBehavior;

public class MallardDuck extends Duck implements FlyBehavior, QuackBehavior {

	@Override
	public void display() {
		System.out.println("청둥오리");
	}

	@Override
	public void fly() {
		System.out.println("오리날다~!");
	}

	@Override
	public void quack() {
		System.out.println("꽥꽥~");
	}
}
