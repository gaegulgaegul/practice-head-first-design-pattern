package io.gaegul.ch01

class RubberDuck: Duck() {
    override fun display() {
        println("러버덕")
    }

    override fun quack() {
        println("삑삑~")
    }

    override fun fly() {
        throw UnsupportedOperationException("날 수 없습니다.")
    }
}