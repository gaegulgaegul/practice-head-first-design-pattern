package io.gaegul.ch04.store.pizza;

/**
 * 시카고 스타일 피자 가게
 */
public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if ("cheese".equals(item)) {
				return new ChicagoStyleCheesePizza();
		} else if ("veggie".equals(item)) {
				return new ChicagoStyleVeggiePizza();
		} else if ("clam".equals(item)) {
				return new ChicagoStyleClamPizza();
		} else if ("pepperoni".equals(item)) {
				return new ChicagoStylePepperoniPizza();
		} else return null;
	}
}
