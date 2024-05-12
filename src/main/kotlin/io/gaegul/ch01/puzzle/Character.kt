package io.gaegul.ch01.puzzle

import io.gaegul.ch01.puzzle.behavior.WeaponBehavior

abstract class Character(
    var weaponBehavior: WeaponBehavior
) {
    abstract fun fight()
}
