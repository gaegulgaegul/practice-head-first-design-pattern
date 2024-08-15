package io.gaegul.ch06;

/**
 * 리모컨 역할 클래스
 */
public class SimpleRemoteControl {
	/**
	 * 커맨드를 저장할 슬롯 1개로 제어
	 */
	Command slot;

	public SimpleRemoteControl() {
	}

	/**
	 * 슬롯을 가지고 명령을 설정
	 *   - 리모컨 버튼의 기능을 바꾸고 싶다면 이 메서드를 사용한다.
	 * @param command 커맨드 객체
	 */
	public void setCommand(Command command) {
		this.slot = command;
	}

	/**
	 * 리모컨 버튼 클릭
	 *   - 슬롯에 연결된 커맨드 객체의 execute() 실행
	 */
	public void buttonWasPressed() {
		slot.execute();
	}
}
