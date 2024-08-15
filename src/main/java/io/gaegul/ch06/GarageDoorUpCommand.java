package io.gaegul.ch06;

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
		garageDoor.lightOn();
	}

	@Override
	public void undo() {
		garageDoor.lightOff();
		garageDoor.down();
	}
}
