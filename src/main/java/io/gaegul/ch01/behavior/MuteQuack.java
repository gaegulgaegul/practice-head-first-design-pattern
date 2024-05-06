package io.gaegul.ch01.behavior;

public class MuteQuack implements QuackBehavior {
	@Override
	public void quack() {
		throw new UnsupportedOperationException("소리를 낼 수 없습니다.");
	}
}
