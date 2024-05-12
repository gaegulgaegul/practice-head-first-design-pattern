package io.gaegul.ch01.behavior

/**
 * 날 수 없는 동작
 */
class FlyNoWay: FlyBehavior {

    override fun fly() {
        throw UnsupportedOperationException("날 수 없습니다.")
    }
}