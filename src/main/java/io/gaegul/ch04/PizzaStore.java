package io.gaegul.ch04;

public class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if ("veggie".equals(type)) {
			pizza = new VeggiePizza();
		} else if ("pepperoni".equals(type)) {
			return new PepperoniPizza();
		} else if ("clam".equals(type)) {
			return new ClamPizza();
		}

		assert pizza != null;

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
