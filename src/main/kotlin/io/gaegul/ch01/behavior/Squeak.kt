package io.gaegul.ch01.behavior

/**
 * 삑삑거리는 소리
 */
class Squeak: QuackBehavior {

    override fun quack() {
        println("삑삑~")
    }
}