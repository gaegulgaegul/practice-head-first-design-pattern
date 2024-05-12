package io.gaegul.ch01

import io.gaegul.ch01.behavior.FlyNoWay
import io.gaegul.ch01.behavior.MuteQuack

class DecoyDuck: Duck(
    MuteQuack(), FlyNoWay()
) {
    override fun display() {
        println("가짜 오리")
    }
}