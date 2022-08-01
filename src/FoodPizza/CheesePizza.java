package FoodPizza;

import Pizza.Pizza;

import java.util.List;


public class CheesePizza extends Pizza {
    public CheesePizza() {
    }

    public CheesePizza(String name, String dough, String sauce, List<String> toppings) {
        super(name, dough, sauce, toppings);
    }
}
