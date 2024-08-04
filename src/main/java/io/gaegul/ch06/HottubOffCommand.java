package io.gaegul.ch06;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.setTemperature(36);
	}

	@Override
	public void undo() {
		hottub.on();
		hottub.setTemperature(40);
		hottub.temperature();
	}
}
