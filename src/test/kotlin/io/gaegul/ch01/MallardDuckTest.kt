package io.gaegul.ch01

import io.gaegul.utils.ConsoleIOTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("오리 시뮬레이션 게임 - 청둥오리는")
class MallardDuckTest: ConsoleIOTest() {

    private val duck: MallardDuck
        get() {
            return MallardDuck()
        }

    @Test
    fun `꽥꽥 울음소리를 낼 수 있다`() {
        duck.performQuack()
        assertThat(output()).isEqualTo("꽥꽥~")
    }

    @Test
    fun `혜엄을 칠 수 있다`() {
        val result = duck.swim()
        assertThat(result).isTrue()
    }

    @Test
    fun `날 수 있다`() {
        duck.performFly()
        assertThat(output()).isEqualTo("오리날다~!")
    }

    @Test
    fun `display()를 실행하면 청둥오리를 출력한다`() {
        duck.display()
        assertThat(output()).isEqualTo("청둥오리")
    }
}