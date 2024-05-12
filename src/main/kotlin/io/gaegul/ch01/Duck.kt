package io.gaegul.ch01

import io.gaegul.ch01.behavior.FlyBehavior
import io.gaegul.ch01.behavior.QuackBehavior

/**
 * 오리 슈퍼 클래스
 */
abstract class Duck(
    private var quackBehavior: QuackBehavior,
    private var flyBehavior: FlyBehavior
) {

    fun performQuack() {
        quackBehavior.quack()
    }

    fun swim(): Boolean {
        return true
    }

    fun performFly() {
        flyBehavior.fly()
    }

    abstract fun display()
}