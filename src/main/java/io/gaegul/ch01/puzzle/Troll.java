package io.gaegul.ch01.puzzle;

import io.gaegul.ch01.puzzle.behavior.AxeBehavior;

public class Troll extends Character {

	protected Troll() {
		super(new AxeBehavior());
	}

	@Override
	public void fight() {
		System.out.println("트롤은 ");
		this.performWeapon();
		System.out.println("으로 전투합니다.");
	}
}
