package io.gaegul.ch06;

public class Stereo {
	private String where;

	public Stereo(String where) {
		this.where = where;
	}

	public void on() {
		System.out.println(this.where + " 오디오가 켜졌습니다.");
	}

	public void off() {
		System.out.println(this.where + " 오디오가 꺼졌습니다.");
	}

	public void setCd() {
		System.out.println(this.where + " 오디오에서 CD가 재생됩니다.");
	}

	public void setDvd() {}

	public void setRadio() {}

	public void SetVolume() {}

	public void setVolume(int level) {
		System.out.println(this.where + " 오디오 볼륨이 " + level + "로 설정되었습니다.");
	}
}
