package io.gaegul.ch01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import io.gaegul.util.ConsoleIOTest;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("오리 시뮬레이션 게임 - 흰죽지오리는")
class RedheadTest extends ConsoleIOTest {

	@Test
	void 꽥꽥_울음소리를_낼_수_있다() {
		Duck duck = new RedheadDuck();
		duck.quack();
		assertThat(output()).isEqualTo("꽥꽥~");
	}

	@Test
	void 헤엄을_칠_수_있다() {
		Duck duck = new RedheadDuck();
		boolean result = duck.swim();
		assertThat(result).isTrue();
	}

	@Test
	void 날_수_있다() {
		Duck duck = new MallardDuck();
		duck.fly();
		assertThat(output()).isEqualTo("오리날다~!");
	}

	@Nested
	class display_메서드를_실행하면 {

		@Test
		void 흰죽지오리를_출력한다() {
			Duck duck = new RedheadDuck();
			duck.display();
			assertThat(output()).isEqualTo("흰죽지오리");
		}

	}
}