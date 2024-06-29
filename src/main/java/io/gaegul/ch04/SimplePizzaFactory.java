package io.gaegul.ch04;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if ("veggie".equals(type)) {
			pizza = new VeggiePizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza();
		} else if ("clam".equals(type)) {
			pizza = new ClamPizza();
		}
		return pizza;
	}
}
