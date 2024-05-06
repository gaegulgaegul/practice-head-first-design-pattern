package io.gaegul.ch01;

import io.gaegul.ch01.behavior.FlyBehavior;
import io.gaegul.ch01.behavior.QuackBehavior;
import lombok.AllArgsConstructor;

/**
 * 오리 클래스
 */
@AllArgsConstructor
public abstract class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;

	public boolean swim() {
		return true;
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public abstract void display();

}
