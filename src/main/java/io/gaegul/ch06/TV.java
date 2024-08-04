package io.gaegul.ch06;

public class TV {
	private String location;
	private int channel;

	public TV(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(this.location + " TV가 켜졌습니다.");
	}

	public void off() {
		System.out.println(this.location + " TV가 꺼졌습니다.");
	}

	public void setInputChannel() {
		this.channel = 3;
		System.out.println(this.location + " TV에서 DVD를 재생합니다.");
	}

	public void setVolume() {}
}
