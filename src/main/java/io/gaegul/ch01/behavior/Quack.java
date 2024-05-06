package io.gaegul.ch01.behavior;

public class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("꽥꽥~");
	}
}
