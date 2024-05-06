package io.gaegul.ch01.behavior;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		throw new UnsupportedOperationException("날 수 없습니다.");
	}
}
