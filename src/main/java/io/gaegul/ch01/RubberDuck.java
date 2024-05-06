package io.gaegul.ch01;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("러버덕");
	}

	@Override
	public void quack() {
		System.out.println("삑삑~");
	}

	@Override
	public void fly() {
		throw new UnsupportedOperationException("러버덕은 날 수 없습니다.");
	}
}
