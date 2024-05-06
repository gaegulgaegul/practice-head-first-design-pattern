package io.gaegul.ch01;

/**
 * 오리 클래스
 */
public abstract class Duck {

	public void quack() {
		System.out.println("꽥꽥~");
	}

	public boolean swim() {
		return true;
	}

	public abstract void display();
}
