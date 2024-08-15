package io.gaegul.ch06;

public class CeilingFanMediumCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;

	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.medium();
	}

	@Override
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
			return;
		}
		if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
			return;
		}
		if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
			return;
		}
		ceilingFan.off();
	}
}
