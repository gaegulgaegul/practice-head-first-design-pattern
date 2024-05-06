package io.gaegul.ch01.behavior;

public class FLyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("로켓 추진으로 날아갑니다.");
	}
}
