package io.gaegul.ch06;

public class GarageDoor {
	private String where;

	public GarageDoor(String where) {
		this.where = where;
	}

	public void up() {
		System.out.println(this.where + " 문이 열었습니다.");
	}

	public void down() {
		System.out.println(this.where + " 문이 닫혔습니다.");
	}

	public void stop() {}

	public void lightOn() {
		System.out.println(this.where + " 조명이 켜졌습니다.");
	}

	public void lightOff() {
		System.out.println(this.where + " 조명이 꺼졌습니다.");
	}
}
