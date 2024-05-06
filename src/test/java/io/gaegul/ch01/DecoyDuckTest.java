package io.gaegul.ch01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import io.gaegul.util.ConsoleIOTest;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("오리 시뮬레이션 게임 - 가짜 오리는")
class DecoyDuckTest extends ConsoleIOTest {

	@Test
	void 헤엄을_칠_수_있다() {
		Duck duck = new DecoyDuck();
		boolean result = duck.swim();
		assertThat(result).isTrue();
	}

	@Nested
	class display_메서드를_실행하면 {

		@Test
		void 가짜오리를_출력한다() {
			Duck duck = new DecoyDuck();
			duck.display();
			assertThat(output()).isEqualTo("가짜 오리");
		}

	}
}