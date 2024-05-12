package io.gaegul.ch01

/**
 * 오리 슈퍼 클래스
 */
abstract class Duck {

    open fun quack() {
        println("꽥꽥~")
    }

    fun swim(): Boolean {
        return true
    }

    fun fly() {
        println("오리날다~!")
    }

    abstract fun display()
}