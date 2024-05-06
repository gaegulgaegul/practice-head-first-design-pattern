package io.gaegul.ch01.puzzle;

import io.gaegul.ch01.puzzle.behavior.WeaponBehavior;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

/**
 * 게임 캐릭터용 클래스
 */
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Character {
	private WeaponBehavior weaponBehavior;

	public abstract void fight();
}
