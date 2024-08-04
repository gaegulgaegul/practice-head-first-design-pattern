package io.gaegul.ch06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import io.gaegul.util.ConsoleIOTest;

@DisplayName("리모컨 사용 테스트")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class RemoteControlTest extends ConsoleIOTest {
	RemoteControl 리모컨;

	private Light 거실_조명 = new Light("거실");
	private Light 주방_조명 = new Light("주방");
	private CeilingFan 거실_선풍기 = new CeilingFan("거실");
	private GarageDoor 차고_문 = new GarageDoor("차고");
	private Stereo 거실_오디오 = new Stereo("거실");

	private Command 거실_조명_켜기;
	private Command 거실_조명_끄기;
	private Command 주방_조명_켜기;
	private Command 주방_조명_끄기;
	private Command 거실_선풍기_켜기;
	private Command 거실_선풍기_끄기;
	private Command 차고_문_열기;
	private Command 차고_문_닫기;
	private Command 거실_오디오_켜기;
	private Command 거실_오디오_끄기;

	@BeforeEach
	public void setUp() {
		리모컨 = new RemoteControl();

		거실_조명_켜기 = new LightOnCommand(거실_조명);
		거실_조명_끄기 = new LightOffCommand(거실_조명);
		주방_조명_켜기 = new LightOnCommand(주방_조명);
		주방_조명_끄기 = new LightOffCommand(주방_조명);
		거실_선풍기_켜기 = new CeilingFanOnCommand(거실_선풍기);
		거실_선풍기_끄기 = new CeilingFanOffCommand(거실_선풍기);
		차고_문_열기 = new GarageDoorUpCommand(차고_문);
		차고_문_닫기 = new GarageDoorDownCommand(차고_문);
		거실_오디오_켜기 = new StereoOnWithCDCommand(거실_오디오);
		거실_오디오_끄기 = new StereoOffCommand(거실_오디오);
	}

	@Test
	void 거실_조명을_켜고_끌_수_있다() {
		리모컨.setCommand(0, 거실_조명_켜기, 거실_조명_끄기);

		리모컨.onButtonWasPushed(0);
		리모컨.offButtonWasPushed(0);

		assertThat(output()).isEqualTo("거실 조명이 켜졌습니다.\n거실 조명이 꺼졌습니다.");
	}

	@Test
	void 주방_조명을_켜고_끌_수_있다() {
		리모컨.setCommand(0, 주방_조명_켜기, 주방_조명_끄기);

		리모컨.onButtonWasPushed(0);
		리모컨.offButtonWasPushed(0);

		assertThat(output()).isEqualTo("주방 조명이 켜졌습니다.\n주방 조명이 꺼졌습니다.");
	}

	@Test
	void 거실_선풍기를_켜고_끌_수_있다() {
		리모컨.setCommand(0, 거실_선풍기_켜기, 거실_선풍기_끄기);

		리모컨.onButtonWasPushed(0);
		리모컨.offButtonWasPushed(0);

		assertThat(output()).isEqualTo("거실 선풍기 속도가 HIGH로 설정되었습니다.\n거실 선풍기가 꺼졌습니다.");
	}

	@Test
	void 차고_문을_열고_닫을_수_있다() {
		리모컨.setCommand(0, 차고_문_열기, 차고_문_닫기);

		리모컨.onButtonWasPushed(0);
		리모컨.offButtonWasPushed(0);

		assertThat(output()).isEqualTo("차고 문이 열었습니다.\n"
			+ "차고 조명이 켜졌습니다.\n"
			+ "차고 조명이 꺼졌습니다.\n"
			+ "차고 문이 닫혔습니다.");
	}

	@Test
	void 거실_오디오를_켜고_끌_수_있다() {
		리모컨.setCommand(0, 거실_오디오_켜기, 거실_오디오_끄기);

		리모컨.onButtonWasPushed(0);
		리모컨.offButtonWasPushed(0);

		assertThat(output()).isEqualTo("거실 오디오가 켜졌습니다.\n"
			+ "거실 오디오에서 CD가 재생됩니다.\n"
			+ "거실 오디오 볼륨이 11로 설정되었습니다.\n"
			+ "거실 오디오가 꺼졌습니다.");
	}

	@DisplayName("슬롯 0번은 거실 조명")
	@Nested
	class slot0_living_room_light {

		@Test
		void 명령을_설정하면_슬롯에서_제어할_수_있다() {
			리모컨.setCommand(0, 거실_조명_켜기, 거실_조명_끄기);

			리모컨.onButtonWasPushed(0);
			리모컨.offButtonWasPushed(0);

			assertThat(output()).isEqualTo("거실 조명이 켜졌습니다.\n"
				+ "거실 조명이 꺼졌습니다.");
			assertThat(리모컨.toString()).isEqualTo("\n------ 리모컨 ------\n"
				+ "[slot 0] LightOnCommand    LightOffCommand\n"
				+ "[slot 1] NoCommand    NoCommand\n"
				+ "[slot 2] NoCommand    NoCommand\n"
				+ "[slot 3] NoCommand    NoCommand\n"
				+ "[slot 4] NoCommand    NoCommand\n"
				+ "[slot 5] NoCommand    NoCommand\n"
				+ "[slot 6] NoCommand    NoCommand\n");
		}

		@DisplayName("슬롯 1번은 주방 조명")
		@Nested
		class slot1_kitchen_light {

			@Test
			void 명령을_설정하면_슬롯에서_제어할_수_있다() {
				리모컨.setCommand(0, 거실_조명_켜기, 거실_조명_끄기);
				리모컨.setCommand(1, 주방_조명_켜기, 주방_조명_끄기);

				리모컨.onButtonWasPushed(0);
				리모컨.offButtonWasPushed(0);
				리모컨.onButtonWasPushed(1);
				리모컨.offButtonWasPushed(1);

				assertThat(output()).isEqualTo("거실 조명이 켜졌습니다.\n"
					+ "거실 조명이 꺼졌습니다.\n"
					+ "주방 조명이 켜졌습니다.\n"
					+ "주방 조명이 꺼졌습니다.");
				assertThat(리모컨.toString()).isEqualTo("\n------ 리모컨 ------\n"
					+ "[slot 0] LightOnCommand    LightOffCommand\n"
					+ "[slot 1] LightOnCommand    LightOffCommand\n"
					+ "[slot 2] NoCommand    NoCommand\n"
					+ "[slot 3] NoCommand    NoCommand\n"
					+ "[slot 4] NoCommand    NoCommand\n"
					+ "[slot 5] NoCommand    NoCommand\n"
					+ "[slot 6] NoCommand    NoCommand\n");
			}

			@DisplayName("슬롯 2번은 거실 선풍기")
			@Nested
			class slot2_living_room_ceiling_fan {

				@Test
				void 명령을_설정하면_슬롯에서_제어할_수_있다() {
					리모컨.setCommand(0, 거실_조명_켜기, 거실_조명_끄기);
					리모컨.setCommand(1, 주방_조명_켜기, 주방_조명_끄기);
					리모컨.setCommand(2, 거실_선풍기_켜기, 거실_선풍기_끄기);

					리모컨.onButtonWasPushed(0);
					리모컨.offButtonWasPushed(0);
					리모컨.onButtonWasPushed(1);
					리모컨.offButtonWasPushed(1);
					리모컨.onButtonWasPushed(2);
					리모컨.offButtonWasPushed(2);

					assertThat(output()).isEqualTo("거실 조명이 켜졌습니다.\n"
						+ "거실 조명이 꺼졌습니다.\n"
						+ "주방 조명이 켜졌습니다.\n"
						+ "주방 조명이 꺼졌습니다.\n"
						+ "거실 선풍기 속도가 HIGH로 설정되었습니다.\n"
						+ "거실 선풍기가 꺼졌습니다.");
					assertThat(리모컨.toString()).isEqualTo("\n------ 리모컨 ------\n"
						+ "[slot 0] LightOnCommand    LightOffCommand\n"
						+ "[slot 1] LightOnCommand    LightOffCommand\n"
						+ "[slot 2] CeilingFanOnCommand    CeilingFanOffCommand\n"
						+ "[slot 3] NoCommand    NoCommand\n"
						+ "[slot 4] NoCommand    NoCommand\n"
						+ "[slot 5] NoCommand    NoCommand\n"
						+ "[slot 6] NoCommand    NoCommand\n");
				}

				@DisplayName("슬롯 3번은 거실 오디오")
				@Nested
				class slot3_living_room_stereo {

					@Test
					void 명령을_설정하면_슬롯에서_제어할_수_있다() {
						리모컨.setCommand(0, 거실_조명_켜기, 거실_조명_끄기);
						리모컨.setCommand(1, 주방_조명_켜기, 주방_조명_끄기);
						리모컨.setCommand(2, 거실_선풍기_켜기, 거실_선풍기_끄기);
						리모컨.setCommand(3, 거실_오디오_켜기, 거실_오디오_끄기);

						리모컨.onButtonWasPushed(0);
						리모컨.offButtonWasPushed(0);
						리모컨.onButtonWasPushed(1);
						리모컨.offButtonWasPushed(1);
						리모컨.onButtonWasPushed(2);
						리모컨.offButtonWasPushed(2);
						리모컨.onButtonWasPushed(3);
						리모컨.offButtonWasPushed(3);

						assertThat(output()).isEqualTo("거실 조명이 켜졌습니다.\n"
							+ "거실 조명이 꺼졌습니다.\n"
							+ "주방 조명이 켜졌습니다.\n"
							+ "주방 조명이 꺼졌습니다.\n"
							+ "거실 선풍기 속도가 HIGH로 설정되었습니다.\n"
							+ "거실 선풍기가 꺼졌습니다.\n"
							+ "거실 오디오가 켜졌습니다.\n"
							+ "거실 오디오에서 CD가 재생됩니다.\n"
							+ "거실 오디오 볼륨이 11로 설정되었습니다.\n"
							+ "거실 오디오가 꺼졌습니다.");
						assertThat(리모컨.toString()).isEqualTo("\n------ 리모컨 ------\n"
							+ "[slot 0] LightOnCommand    LightOffCommand\n"
							+ "[slot 1] LightOnCommand    LightOffCommand\n"
							+ "[slot 2] CeilingFanOnCommand    CeilingFanOffCommand\n"
							+ "[slot 3] StereoOnWithCDCommand    StereoOffCommand\n"
							+ "[slot 4] NoCommand    NoCommand\n"
							+ "[slot 5] NoCommand    NoCommand\n"
							+ "[slot 6] NoCommand    NoCommand\n");
					}

					@DisplayName("슬롯 4번은 차고 문")
					@Nested
					class slot4_garage_door {

						@Test
						void 명령을_설정하면_슬롯에서_제어할_수_있다() {
							리모컨.setCommand(0, 거실_조명_켜기, 거실_조명_끄기);
							리모컨.setCommand(1, 주방_조명_켜기, 주방_조명_끄기);
							리모컨.setCommand(2, 거실_선풍기_켜기, 거실_선풍기_끄기);
							리모컨.setCommand(3, 거실_오디오_켜기, 거실_오디오_끄기);
							리모컨.setCommand(4, 차고_문_열기, 차고_문_닫기);

							리모컨.onButtonWasPushed(0);
							리모컨.offButtonWasPushed(0);
							리모컨.onButtonWasPushed(1);
							리모컨.offButtonWasPushed(1);
							리모컨.onButtonWasPushed(2);
							리모컨.offButtonWasPushed(2);
							리모컨.onButtonWasPushed(3);
							리모컨.offButtonWasPushed(3);
							리모컨.onButtonWasPushed(4);
							리모컨.offButtonWasPushed(4);

							assertThat(output()).isEqualTo("거실 조명이 켜졌습니다.\n"
								+ "거실 조명이 꺼졌습니다.\n"
								+ "주방 조명이 켜졌습니다.\n"
								+ "주방 조명이 꺼졌습니다.\n"
								+ "거실 선풍기 속도가 HIGH로 설정되었습니다.\n"
								+ "거실 선풍기가 꺼졌습니다.\n"
								+ "거실 오디오가 켜졌습니다.\n"
								+ "거실 오디오에서 CD가 재생됩니다.\n"
								+ "거실 오디오 볼륨이 11로 설정되었습니다.\n"
								+ "거실 오디오가 꺼졌습니다.\n"
								+ "차고 문이 열었습니다.\n"
								+ "차고 조명이 켜졌습니다.\n"
								+ "차고 조명이 꺼졌습니다.\n"
								+ "차고 문이 닫혔습니다.");
							assertThat(리모컨.toString()).isEqualTo("\n------ 리모컨 ------\n"
								+ "[slot 0] LightOnCommand    LightOffCommand\n"
								+ "[slot 1] LightOnCommand    LightOffCommand\n"
								+ "[slot 2] CeilingFanOnCommand    CeilingFanOffCommand\n"
								+ "[slot 3] StereoOnWithCDCommand    StereoOffCommand\n"
								+ "[slot 4] GarageDoorUpCommand    GarageDoorDownCommand\n"
								+ "[slot 5] NoCommand    NoCommand\n"
								+ "[slot 6] NoCommand    NoCommand\n");
						}
					}
				}
			}
		}
	}
}