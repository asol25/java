package Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings;

    public Pizza() {
    }

    public Pizza(String name, String dough, String sauce, List<String> toppings) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public void Prepare()
    {
        System.out.println("Preparing" + name);
        System.out.println("Tossing dough..." + dough);
        System.out.println("Adding sauce..." + sauce);
        System.out.println("Adding toppings:");
        for (String topping: toppings) {
            System.out.println("\t" + topping);
        }
    }

    public void Bake()
    {
        System.out.println("Baking " + name + "in 30 mins");
    }

    public void Cut()
    {
        System.out.println("Cutting " + name);
    }

    public void Box()
    {
        System.out.println("Boxing " + name);
    }
}
