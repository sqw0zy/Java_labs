package Coffees;

public class Decaf extends Beverage{
    public float cost() {
        return 0.99f + super.cost();
    }
    public Decaf() {
        description = "Decaf ";
    }
}
