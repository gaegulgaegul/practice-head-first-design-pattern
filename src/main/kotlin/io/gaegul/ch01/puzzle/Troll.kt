package io.gaegul.ch01.puzzle

import io.gaegul.ch01.puzzle.behavior.AxeBehavior

class Troll: Character(
    AxeBehavior()
) {
    override fun fight() {
        print("트롤은 ")
        weaponBehavior.useWeapon()
        print("으로 전투할 수 있다.")
    }
}