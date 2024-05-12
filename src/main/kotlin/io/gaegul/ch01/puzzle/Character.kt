package io.gaegul.ch01.puzzle

import io.gaegul.ch01.puzzle.behavior.WeaponBehavior
import lombok.AccessLevel
import lombok.Getter
import lombok.Setter

abstract class Character(
    var weaponBehavior: WeaponBehavior
) {
    abstract fun fight()
}
