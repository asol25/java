package Pizza;

import Pizza.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessPizza {
    static Scanner strScanner = new Scanner(System.in);

    protected void OrderPizza(Pizza pizza)
    {
        System.out.println("You have choose " + pizza);
        System.out.println("1. name");
        String name = strScanner.nextLine();
        System.out.println("2. dough");
        String dough = strScanner.nextLine();
        System.out.println("3. sauce");
        String sauce = strScanner.nextLine();
        System.out.println("4. list toppings");
        List<String> toppings = new ArrayList<String>();
        System.out.println("A Supreme");
        System.out.println("B BBQ Meatlovers");
        String key = strScanner.nextLine();
        switch (key) {
            case "A":
                toppings.add("Supreme");
                break;
            case "B":
                toppings.add("BBQ Meatlovers");
                break;
        }
        MakePizza(name, dough, sauce, toppings, pizza);
    }

    private void MakePizza(String name, String dough, String sauce, List<String> toppings, Pizza pizza) {
        pizza.setName(name);
        pizza.setDough(dough);
        pizza.setSauce(sauce);
        pizza.setToppings(toppings);
        ShowOrderPizza(pizza);
    }

    private void ShowOrderPizza(Pizza pizza)
    {
        pizza.Prepare();
        pizza.Bake();
        pizza.Box();
        pizza.Cut();
    }
}
