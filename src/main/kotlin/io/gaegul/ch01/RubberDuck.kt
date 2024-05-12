package io.gaegul.ch01

import io.gaegul.ch01.behavior.FlyNoWay
import io.gaegul.ch01.behavior.Squeak

class RubberDuck: Duck(
    Squeak(), FlyNoWay()
) {
    override fun display() {
        println("러버덕")
    }
}