package io.gaegul.ch01

import io.gaegul.ch01.behavior.FlyWithWings
import io.gaegul.ch01.behavior.Quack

class MallardDuck: Duck(
    Quack(), FlyWithWings()
) {

    override fun display() {
        println("청둥오리")
    }
}