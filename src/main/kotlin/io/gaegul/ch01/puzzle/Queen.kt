package io.gaegul.ch01.puzzle

import io.gaegul.ch01.puzzle.behavior.BowAndArrowBehavior

class Queen: Character(
    BowAndArrowBehavior()
) {
    override fun fight() {
        print("여왕은 ")
        weaponBehavior.useWeapon()
        print("으로 전투할 수 있다.")
    }
}