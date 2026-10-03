package Coffees;

public class Espresso extends Beverage{
    public float cost() {
        return 2.49f + super.cost();
    }
    public Espresso() {
        description = "Espresso ";
    }
}
