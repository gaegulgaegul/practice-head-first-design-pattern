package io.gaegul.ch01

import io.gaegul.utils.ConsoleIOTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("오리 시뮬레이션 게임 - 러버덕은")
class RubberDuckTest: ConsoleIOTest() {

    private val duck: RubberDuck
        get() {
            return RubberDuck()
        }

    @Test
    fun `삑삑 소리를 낼 수 있다`() {
        duck.performQuack()
        assertThat(output()).isEqualTo("삑삑~")
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
    fun `display()를 실행하면 러버덕을 출력한다`() {
        duck.display()
        assertThat(output()).isEqualTo("러버덕")
    }

}