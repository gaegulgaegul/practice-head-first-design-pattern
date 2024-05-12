package io.gaegul.ch01.puzzle

import io.gaegul.utils.ConsoleIOTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("액션 어드벤처 게임 - 트롤은")
class TrollTest: ConsoleIOTest() {

    @Test
    fun `도끼로 찍는 행동으로 전투할 수 있다`() {
        val character = Troll()
        character.fight()
        assertThat(output()).isEqualTo("트롤은 도끼로 찍는 행동으로 전투할 수 있다.")
    }
}