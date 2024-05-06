package io.gaegul.ch01;

public class DecoyDuck extends Duck {
	@Override
	public void display() {
		System.out.println("가짜 오리");
	}

	@Override
	public void quack() {
		throw new UnsupportedOperationException("가짜 오리는 소리를 내지 않습니다.");
	}

	@Override
	public void fly() {
		throw new UnsupportedOperationException("가짜 오리는 날 수 없습니다.");
	}
}
