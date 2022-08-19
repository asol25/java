package Pizza;

import FoodPizza.CheesePizza;
import FoodPizza.GreekPizza;
import Pizza.Pizza;

import java.util.Scanner;

import static java.lang.System.exit;


public class PizzaStore {
    public void DisplayMenu()
    {
        Scanner numScanner = new Scanner(System.in);

        do {
            System.out.println("Choose category Pizza: ");
            System.out.println("1. Order Cheese Pizza: ");
            System.out.println("2. Order Greek Pizza: ");
            Integer key = numScanner.nextInt();
            GetInput(key);
        }
        while (true);
    }

    private static void GetInput(Integer key)
    {
        ProcessPizza processPizza = new ProcessPizza();
        Pizza pizza = null;
        switch(key) {
            case 0:
                // code block
                exit(0);
                break;
            case 1:
                // code block
                pizza = new CheesePizza();
                break;
            case 2:
                // code block
                pizza = new GreekPizza();
                break;
            default:
                // code block
                System.out.println("Having error!");
        }
        processPizza.OrderPizza(pizza);
    }
}
