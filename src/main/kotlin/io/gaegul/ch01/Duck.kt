package io.gaegul.ch01

/**
 * 오리 슈퍼 클래스
 */
abstract class Duck {

    fun quack() {
        println("꽥꽥~")
    }

    fun swim(): Boolean {
        return true
    }

    abstract fun display()
}