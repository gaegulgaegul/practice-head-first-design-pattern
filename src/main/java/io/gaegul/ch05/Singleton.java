package io.gaegul.ch05;

/**
 * 고전적인 싱글턴 패턴 구현법
 */
public class Singleton {

	/**
	 * Singleton 클래스의 하나뿐인 인스턴스를 저장하는 정적 변수
	 */
	private static Singleton uniqueInstance;

	/**
	 * 생성자를 private으로 선언했으므로 Singleton에서만
	 * 클래스의 인스턴스를 만들 수 있습니다.
	 */
	private Singleton() {}

	/**
	 * 클래스의 인스턴스를 만들어서 리턴합니다.
	 * @return
	 */
	public static Singleton getInstance() {
		/*
		 * uniqueInstance에 하나뿐인 인스턴스가 저장됩니다.(정적 변수)
		 * uniqueInstance가 null이면 아직 인스턴스가 생성되지 않았다는 의미입니다.
		 */
		if (uniqueInstance == null) {
			/*
			 * 아직 인스턴스가 만들어지지 않았다면 private으로 선언된 생성자를 사용해서
			 * Singleton 객체를 만든 다음 uniqueInstance에 그 객체를 대입합니다.
			 *
			 * 인스턴스가 필요한 상황이 닥치기 전까지 아예 인스턴스를 생성하지 않게 됩니다.(Lazyinstantiation)
			 */
			uniqueInstance = new Singleton();
		}
		/*
		 * uniqueInstance가 null이 아니면 이미 객체가 생성된 것으로 리턴합니다.
		 */
		return uniqueInstance;
	}
}
