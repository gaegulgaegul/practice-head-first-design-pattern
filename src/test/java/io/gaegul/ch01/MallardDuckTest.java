package io.gaegul.ch01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import io.gaegul.util.ConsoleIOTest;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("오리 시뮬레이션 게임 - 청둥오리 테스트")
class MallardDuckTest extends ConsoleIOTest {

	@Test
	void 청둥오리는_꽥꽥_울음소리를_낼_수_있다() {
		MallardDuck duck = new MallardDuck();
		duck.quack();
		assertThat(output()).isEqualTo("꽥꽥~");
	}

	@Test
	void 청둥오리는_헤엄을_칠_수_있다() {
		MallardDuck duck = new MallardDuck();
		boolean result = duck.swim();
		assertThat(result).isTrue();
	}
}