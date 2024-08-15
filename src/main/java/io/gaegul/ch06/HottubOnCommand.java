package io.gaegul.ch06;

public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.on();
		hottub.setTemperature(40);
		hottub.temperature();
	}

	@Override
	public void undo() {
		hottub.setTemperature(36);
	}
}
