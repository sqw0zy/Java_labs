import Coffees.*;
public class CoffeeMachine {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        darkRoast.setMilk(true);
        IO.println(darkRoast.getDescription());

        Beverage decaf = new Decaf();
        decaf.setSoy(true);
        decaf.setWhip(true);
        IO.println(decaf.getDescription());
    }
}
