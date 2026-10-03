package Coffees;

public class DarkRoast extends Beverage{
    public float cost() {
        return 1.49f + super.cost();
    }
    public DarkRoast() {
        description = "Dark roast ";
    }
}
