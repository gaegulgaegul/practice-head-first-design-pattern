package io.gaegul.ch01.puzzle.behavior;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("화살을 쏘는 행동");
	}
}
