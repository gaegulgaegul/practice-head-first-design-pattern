package io.gaegul.ch06;

public class Light {

	private String where;

	public Light() {
	}

	public Light(String where) {
		this.where = where;
	}

	public void on() {
		if (this.where == null) {
			System.out.println("조명이 켜졌습니다.");
			return;
		}
		System.out.println(this.where + " 조명이 켜졌습니다.");
	}

	public void off() {
		if (this.where == null) {
			System.out.println("조명이 꺼졌습니다.");
			return;
		}
		System.out.println(this.where + " 조명이 꺼졌습니다.");
	}
}
