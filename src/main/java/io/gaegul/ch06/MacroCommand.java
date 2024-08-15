package io.gaegul.ch06;

/**
 * 여러 커맨드 객체를 한번에 실행할 수 있다.
 */
public class MacroCommand implements Command {
	Command[] commands;

	public MacroCommand(Command... commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		/**
		 * 사용자가 만든 매크로 작업을 거꾸로 해야 한다.
		 */
		for (int i = commands.length - 1; i >= 0; i--) {
			commands[i].undo();
		}
	}
}
