package io.gaegul.ch01.puzzle;

import io.gaegul.ch01.puzzle.behavior.BowAndArrowBehavior;

public class Queen extends Character {

	protected Queen() {
		super(new BowAndArrowBehavior());
	}

	@Override
	public void fight() {
		System.out.println("여왕이 전투합니다.");
	}
}
