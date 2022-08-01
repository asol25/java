import FoodPizza.CheesePizza;
import FoodPizza.GreekPizza;
import Pizza.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;


public class PizzaStore {
   static Scanner strScanner = new Scanner(System.in);
   static Scanner numScanner = new Scanner(System.in);
   static ArrayList<Pizza> store = new ArrayList<>();

    public static void main(String[] args)
    {
        PizzaStore store = new PizzaStore();
        System.out.println("Choose category Pizza: ");
        System.out.println("1. Order Cheese Pizza: ");
        System.out.println("2. Order Greek Pizza: ");
        Integer key = numScanner.nextInt();
        Pizza pizza = null;
        switch(key) {
            case 0:
                // code block
                exit(0);
                break;
            case 1:
                // code block
                pizza = new CheesePizza();
                store.OrderPizza(pizza);
                break;
            case 2:
                // code block
                pizza = new GreekPizza();
                store.OrderPizza(pizza);
                break;
            default:
                // code block
                System.out.println("Having error!");
        }
      store.ShowOrderPizza();
    }

    private void OrderPizza(Pizza pizza)
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
        if(pizza instanceof CheesePizza) {
            Pizza cheese = new CheesePizza(name, dough, sauce, toppings);
            store.add(cheese);
        }

        if(pizza instanceof GreekPizza) {
            Pizza green = new GreekPizza(name, dough, sauce, toppings);
            store.add(green);
        }
    }

    private void  ShowOrderPizza()
    {
        for (Pizza pizza: store) {
            pizza.Prepare();
            pizza.Bake();
            pizza.Box();
            pizza.Cut();
        }
    }
}
