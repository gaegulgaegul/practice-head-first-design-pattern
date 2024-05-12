package io.gaegul.ch01.behavior

/**
 * 날개가 달린 오리가 나는 동작
 */
class FlyWithWings: FlyBehavior {

    override fun fly() {
        println("오리 날다~!")
    }
}