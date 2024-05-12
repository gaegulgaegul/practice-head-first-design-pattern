package io.gaegul.ch01.puzzle

import io.gaegul.utils.ConsoleIOTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("액션 어드벤처 게임 - 왕은")
class KingTest: ConsoleIOTest() {

    @Test
    fun `검을 휘두르는 행동으로 전투할 수 있다`() {
        val character = King()
        character.fight()
        assertThat(output()).isEqualTo("왕은 검을 휘두르는 행동으로 전투할 수 있다.")
    }
}