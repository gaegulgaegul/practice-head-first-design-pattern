package io.gaegul.ch01

class RubberDuck: Duck() {
    override fun display() {
        println("러버덕")
    }

    override fun quack() {
        println("삑삑~")
    }
}