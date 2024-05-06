package io.gaegul.ch01.puzzle;

import io.gaegul.ch01.puzzle.behavior.SwordBehavior;

public class King extends Character {

	protected King() {
		super(new SwordBehavior());
	}

	@Override
	public void fight() {
		System.out.println("왕이 전투합니다.");
	}
}
