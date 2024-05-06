package io.gaegul.ch01.puzzle.behavior;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("검을 휘두르는 행동");
	}
}
