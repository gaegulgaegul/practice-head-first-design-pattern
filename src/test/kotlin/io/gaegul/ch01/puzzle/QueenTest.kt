package io.gaegul.ch01.puzzle

import io.gaegul.utils.ConsoleIOTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("액션 어드벤처 게임 - 여왕은")
class QueenTest: ConsoleIOTest() {

    @Test
    fun `화살을 쏘는 행동으로 전투할 수 있다`() {
        val character = Queen()
        character.fight()
        assertThat(output()).isEqualTo("여왕은 화살을 쏘는 행동으로 전투할 수 있다.")
    }

}