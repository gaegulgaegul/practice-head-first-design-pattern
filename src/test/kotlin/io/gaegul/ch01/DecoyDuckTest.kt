package io.gaegul.ch01

import io.gaegul.utils.ConsoleIOTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("오리 시뮬레이션 게임 - 가짜오리는")
class DecoyDuckTest: ConsoleIOTest() {

    private val duck: DecoyDuck
        get() {
            return DecoyDuck()
        }

    @Test
    fun `소리를 낼 수 없다`() {
        assertThatThrownBy { duck.performQuack() }
            .isInstanceOf(UnsupportedOperationException::class.java)
    }

    @Test
    fun `혜엄을 칠 수 있다`() {
        val result = duck.swim()
        assertThat(result).isTrue()
    }

    @Test
    fun `날 수 없다`() {
        assertThatThrownBy { duck.performFly() }
            .isInstanceOf(UnsupportedOperationException::class.java)
    }

    @Test
    fun `display()를 실행하면 가짜오리를 출력한다`() {
        duck.display()
        assertThat(output()).isEqualTo("가짜 오리")
    }
}