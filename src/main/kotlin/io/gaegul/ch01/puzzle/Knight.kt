package io.gaegul.ch01.puzzle

import io.gaegul.ch01.puzzle.behavior.KnifeBehavior

class Knight: Character(
    KnifeBehavior()
) {
    override fun fight() {
        print("기사는 ")
        weaponBehavior.useWeapon()
        print("으로 전투할 수 있다.")
    }
}