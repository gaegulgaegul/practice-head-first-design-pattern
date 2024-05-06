package io.gaegul.ch01;

/**
 * 오리 클래스
 */
public abstract class Duck {

	public void quack() {
		System.out.println("꽥꽥~");
	}

	public void swim() {
		System.out.println("헤엄치다.");
	}

	public abstract void display();
}
