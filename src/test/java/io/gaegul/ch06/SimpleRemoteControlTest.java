package io.gaegul.ch06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import io.gaegul.util.ConsoleIOTest;

@DisplayName("리모컨 사용 테스트")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SimpleRemoteControlTest extends ConsoleIOTest {

	@Test
	void 리모컨_버튼을_클릭하면_불이_켜진다() {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);

		remote.setCommand(lightOn);
		remote.buttonWasPressed();

		assertThat(output()).isEqualTo("조명이 켜졌습니다.");
	}
}