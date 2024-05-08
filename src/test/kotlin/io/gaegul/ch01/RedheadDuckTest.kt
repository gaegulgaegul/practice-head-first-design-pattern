package io.gaegul.ch01

import io.gaegul.utils.ConsoleIOTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("오리 시뮬레이션 게임 - 흰죽지오리는")
class RedheadDuckTest: ConsoleIOTest() {

    private val duck: RedheadDuck
        get() {
            return RedheadDuck()
        }

    @Test
    fun `꽥꽥 울음소리를 낼 수 있다`() {
        duck.quack()
        assertThat(output()).isEqualTo("꽥꽥~")
    }

    @Test
    fun `혜엄을 칠 수 있다`() {
        val result = duck.swim()
        assertThat(result).isTrue()
    }

    @Test
    fun `display()를 실행하면 흰죽지오리를 출력한다`() {
        duck.display()
        assertThat(output()).isEqualTo("흰죽지오리")
    }
}