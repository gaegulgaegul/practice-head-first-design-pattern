package io.gaegul.ch06;

/**
 * 오디오를 켜는 커맨드 객체 클래스
 */
public class StereoOnWithCDCommand implements Command {
	Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		stereo.off();
	}
}
