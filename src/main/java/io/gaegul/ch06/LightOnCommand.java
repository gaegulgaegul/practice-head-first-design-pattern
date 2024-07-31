package io.gaegul.ch06;

/**
 * 조명을 켤 때 필요한 커맨드 객체 클래스
 */
public class LightOnCommand implements Command {
	Light light;

	/**
	 * 생성자에 커맨드 객체로 제어할 정보가 전달된다.
	 * @param light 특정 조명 (거실 조명 등)
	 */
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}
}
