package io.gaegul.ch06;

/**
 * 리모컨
 */
public class RemoteControl {
	/**
	 * 리모컨은 7개의 ON, OFF 명령을 처리할 수 있습니다.
	 * 각 명령은 배열에 저장됩니다.
	 */
	Command[] onCommands;
	Command[] offCommands;

	/**
	 * 각 ON, OFF 배열의 인스턴스를 만들고 초기화
	 */
	public RemoteControl() {
		this.onCommands = new Command[7];
		this.offCommands = new Command[7];

		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	/**
	 * 슬롯 번호에 ON, OFF 커맨드 설정
	 * @param slot 슬롯 번호
	 * @param onCommand ON 커맨드 객체
	 * @param offCommand OFF 커맨드 객체
	 */
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	/**
	 * ON 커맨드 실행
	 * @param slot 슬롯 번호
	 */
	public void onButtonWasPushed(int slot) {
		if (onCommands[slot] != null) {
			onCommands[slot].execute();
		}
	}

	/**
	 * OFF 커맨드 실행
	 * @param slot 슬롯 번호
	 */
	public void offButtonWasPushed(int slot) {
		if (offCommands[slot] != null) {
			offCommands[slot].execute();
		}
	}

	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n------ 리모컨 ------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName() + "    " + offCommands[i].getClass().getSimpleName() + "\n");
		}
		return stringBuffer.toString();
	}
}
