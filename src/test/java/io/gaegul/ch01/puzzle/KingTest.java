package io.gaegul.ch01.puzzle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import io.gaegul.ch01.puzzle.behavior.KnifeBehavior;
import io.gaegul.util.ConsoleIOTest;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("액션 어드벤처 게임 - 왕은")
class KingTest extends ConsoleIOTest {

	@Test
	void 검을_휘두르며_전투_할_수_있습니다() {
		Character character = new King();
		character.fight();
		assertThat(output()).isEqualTo("왕은 \n"
			+ "검을 휘두르는 행동\n"
			+ "으로 전투합니다.");
	}

	@Test
	void 칼로_베며_전투_할_수_있습니다() {
		Character character = new King();
		character.weaponBehavior(new KnifeBehavior());
		character.fight();
		assertThat(output()).isEqualTo("왕은 \n"
			+ "칼로 베는 행동\n"
			+ "으로 전투합니다.");
	}
}