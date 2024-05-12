package io.gaegul.ch01.puzzle

import io.gaegul.utils.ConsoleIOTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("액션 어드벤처 게임 - 기사는")
class KnightTest: ConsoleIOTest() {

    @Test
    fun `칼로 베는 행동으로 전투할 수 있다`() {
        val character = Knight()
        character.fight()
        assertThat(output()).isEqualTo("기사는 칼로 베는 행동으로 전투할 수 있다.")
    }

}