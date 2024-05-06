package io.gaegul.ch01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import io.gaegul.util.ConsoleIOTest;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("오리 시뮬레이션 게임 - 러버덕은")
class RubberDuckTest extends ConsoleIOTest {

	@Test
	void 삑삑소리를_낼_수_있다() {
		RubberDuck duck = new RubberDuck();
		duck.quack();
		assertThat(output()).isEqualTo("삑삑~");
	}

	@Test
	void 헤엄을_칠_수_있다() {
		Duck duck = new RubberDuck();
		boolean result = duck.swim();
		assertThat(result).isTrue();
	}

	@Nested
	class display_메서드를_실행하면 {

		@Test
		void 러버덕을_출력한다() {
			Duck duck = new RubberDuck();
			duck.display();
			assertThat(output()).isEqualTo("러버덕");
		}

	}
}