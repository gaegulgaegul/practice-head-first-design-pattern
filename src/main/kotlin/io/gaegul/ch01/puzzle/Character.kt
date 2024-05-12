package io.gaegul.ch01.puzzle

import io.gaegul.ch01.puzzle.behavior.WeaponBehavior

abstract class Character(
    private var weaponBehavior: WeaponBehavior
) {

    fun setWeapon(weaponBehavior: WeaponBehavior) {
        this.weaponBehavior = weaponBehavior
    }

    abstract fun fight()
}
