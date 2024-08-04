package io.gaegul.ch06;

public class CeilingFan {
	private String where;

	public CeilingFan(String where) {
		this.where = where;
	}

	public void high() {
		System.out.println(this.where + " 선풍기 속도가 HIGH로 설정되었습니다.");
	}

	public void medium() {}

	public void low() {}

	public void off() {
		System.out.println(this.where + " 선풍기가 꺼졌습니다.");
	}

	public void getSpeed() {}
}
