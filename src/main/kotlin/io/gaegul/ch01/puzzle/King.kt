package io.gaegul.ch01.puzzle

import io.gaegul.ch01.puzzle.behavior.SwordBehavior

class King: Character(
    SwordBehavior()
) {

    override fun fight() {
        print("왕은 ")
        weaponBehavior.useWeapon()
        print("으로 전투할 수 있다.")
    }
}