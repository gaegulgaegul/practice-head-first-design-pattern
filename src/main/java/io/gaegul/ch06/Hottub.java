package io.gaegul.ch06;

public class Hottub {
	private boolean on;
	private int temperature;

	public void on() {
		on = true;
	}

	public void off() {
		on = false;
	}

	public void circulate() {}

	public void jetsOn() {
	}

	public void jetsOff() {}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		System.out.println("욕조 온도를 " + temperature + "도로 설정합니다.");
	}

	public void temperature() {
		System.out.println("현재 욕조 온도: " + temperature + "도");
	}
}
