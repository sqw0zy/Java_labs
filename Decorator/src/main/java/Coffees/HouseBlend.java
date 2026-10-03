package Coffees;

public class HouseBlend extends Beverage{
    public float cost() {
        return 1.99f + super.cost();
    }
    public HouseBlend() {
        description = "House blend ";
    }
}
