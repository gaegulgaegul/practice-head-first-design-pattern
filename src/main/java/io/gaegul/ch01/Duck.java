package io.gaegul.ch01;

import io.gaegul.ch01.behavior.FlyBehavior;
import io.gaegul.ch01.behavior.QuackBehavior;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

/**
 * 오리 클래스
 */
@AllArgsConstructor(access = AccessLevel.PROTECTED)
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

	public void flyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void quackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public abstract void display();

}
