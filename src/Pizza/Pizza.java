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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public Pizza(String name, String dough, String sauce, List<String> toppings) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public void Prepare()
    {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... " + dough);
        System.out.println("Adding sauce... " + sauce);
        System.out.println("Adding toppings: ");
        for (String topping: toppings) {
            System.out.println("\t" + topping);
        }
    }

    public void Bake()
    {
        System.out.println("Baking " + name + " in 30 mins");
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
