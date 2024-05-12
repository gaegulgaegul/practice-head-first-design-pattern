package io.gaegul.ch01.behavior

class MuteQuack: QuackBehavior {

    override fun quack() {
        throw UnsupportedOperationException("소리를 낼 수 없습니다.")
    }
}