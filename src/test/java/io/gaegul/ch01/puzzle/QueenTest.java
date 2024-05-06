package io.gaegul.ch01.puzzle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import io.gaegul.ch01.puzzle.behavior.KnifeBehavior;
import io.gaegul.util.ConsoleIOTest;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("액션 어드벤처 게임 - 여왕은")
class QueenTest extends ConsoleIOTest {

	@Test
	void 화살을_쏘며_전투_할_수_있습니다() {
		Character character = new Queen();
		character.fight();
		assertThat(output()).isEqualTo("여왕은 \n"
			+ "화살을 쏘는 행동\n"
			+ "으로 전투합니다.");
	}
}