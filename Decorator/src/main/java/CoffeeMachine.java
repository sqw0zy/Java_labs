import Coffees.*;
import Decorators.*;

public class CoffeeMachine {
    public static void main(String[] args) {
        Beverage beverage1 = new Milk(new DarkRoast());

        IO.println(String.format("%s $%.2f", beverage1.getDescription(), beverage1.cost()));


        Beverage beverage2 = new Whip(new Soy(new Mocha(new Milk(new Decaf()))));
        IO.println(String.format("%s $%.2f", beverage2.getDescription(), beverage2.cost()));
    }
}
