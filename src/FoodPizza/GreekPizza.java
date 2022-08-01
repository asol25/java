package FoodPizza;

import Pizza.Pizza;

import java.util.List;

public class GreekPizza extends Pizza {
    public GreekPizza() {
    }

    public GreekPizza(String name, String dough, String sauce, List<String> toppings) {
        super(name, dough, sauce, toppings);
    }
}
