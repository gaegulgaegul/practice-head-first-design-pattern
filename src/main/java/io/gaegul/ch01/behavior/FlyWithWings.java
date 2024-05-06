package io.gaegul.ch01.behavior;

public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("오리날다~!");
	}
}
