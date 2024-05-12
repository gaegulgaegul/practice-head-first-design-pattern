package io.gaegul.ch01

import io.gaegul.ch01.behavior.FlyWithWings
import io.gaegul.ch01.behavior.Quack

class RedheadDuck: Duck(
    Quack(), FlyWithWings()
) {

    override fun display() {
        println("흰죽지오리")
    }
}