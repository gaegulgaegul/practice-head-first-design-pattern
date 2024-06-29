package io.gaegul.ch04;

public class PizzaStore {
	private SimplePizzaFactory factory;

	public PizzaStore() {
		this.factory = new SimplePizzaFactory();
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);

		assert pizza != null;

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
