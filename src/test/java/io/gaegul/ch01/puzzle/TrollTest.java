package io.gaegul.ch01.puzzle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import io.gaegul.util.ConsoleIOTest;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("액션 어드벤처 게임 - 트롤은")
class TrollTest extends ConsoleIOTest {

	@Test
	void 도끼로_찍으며_전투_할_수_있습니다() {
		Character character = new Troll();
		character.fight();
		assertThat(output()).isEqualTo("트롤은 \n"
			+ "도끼로 찍는 행동\n"
			+ "으로 전투합니다.");
	}
}