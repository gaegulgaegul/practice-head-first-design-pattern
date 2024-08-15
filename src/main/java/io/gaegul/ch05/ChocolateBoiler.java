package io.gaegul.ch05;

/**
 * 초콜릿 보일러
 */
public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;

	private static ChocolateBoiler instance = new ChocolateBoiler();

	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
		System.out.println("[%s] init ChocolateBoiler".formatted(Thread.currentThread().getName()));
	}

	public static ChocolateBoiler getInstance() {
		System.out.println("[%s] return instance".formatted(Thread.currentThread().getName()));
		return instance;
	}

	/**
	 * 보일러에 우유와 초콜릿을 혼합한 재료를 넣습니다.
	 */
	public void fill() {
		/* 보일러가 비어 있을 때만 재표를 넣습니다. */
		if (isEmpty()) {
			System.out.println("[%s] empty voiler".formatted(Thread.currentThread().getName()));
			empty = false;
			boiled = false;
		}
	}

	/**
	 * 끓인 재료를 다음 단계로 넘깁니다.
	 */
	public void drain() {
		/*
		 * 보일러가 가득 차 있고 다 끓여진 상태에서만
		 * 보일러에 들어있는 재표를 다음 단계로 넘깁니다.
		 */
		if (!isEmpty() && isBoiled()) {
			System.out.println("[%s] drain voiler".formatted(Thread.currentThread().getName()));
			empty = true;
		}
	}

	/**
	 * 재료를 끓입니다.
	 */
	public void boil() {
		/*
		 * 보일러가 가득 차 있고 아직 끓지 않은 상태에서만
		 * 초콜릿과 우유가 혼합된 재료를 끓입니다.
		 */
		if (!isEmpty() && !isBoiled()) {
			System.out.println("[%s] boil voiler".formatted(Thread.currentThread().getName()));
			boiled = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
