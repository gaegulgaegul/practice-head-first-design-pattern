package io.gaegul.ch01

class DecoyDuck: Duck() {
    override fun display() {
        println("가짜 오리")
    }

    override fun quack() {
        throw UnsupportedOperationException("소리를 낼 수 없습니다.")
    }

    override fun fly() {
        throw UnsupportedOperationException("날 수 없습니다.")
    }
}