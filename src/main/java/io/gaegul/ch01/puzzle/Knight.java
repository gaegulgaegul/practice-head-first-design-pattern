package io.gaegul.ch01.puzzle;

import io.gaegul.ch01.puzzle.behavior.KnifeBehavior;

public class Knight extends Character {

	protected Knight() {
		super(new KnifeBehavior());
	}

	@Override
	public void fight() {
		System.out.println("나이트가 전투합니다.");
	}
}
