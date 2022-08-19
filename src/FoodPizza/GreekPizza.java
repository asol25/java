package FoodPizza;

import Pizza.Pizza;

import java.util.List;

public class GreekPizza extends Pizza {
    public GreekPizza() {
    }

    public GreekPizza(String name, String dough, String sauce, List<String> toppings) {
        super(name, dough, sauce, toppings);
    }

    @Override
    public void Prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... " + dough);
        System.out.println("Adding sauce... " + sauce);
        System.out.println("Adding toppings: ");
        for (String topping: toppings) {
            System.out.println("\t" + topping);
        }
    }

    @Override
    public void Bake() {
        System.out.println("Baking " + name + " in 15 mins");

    }

    @Override
    public void Cut() {
        System.out.println("Cutting " + name);

    }

    @Override
    public void Box() {
        System.out.println("Boxing " + name);
    }
}
