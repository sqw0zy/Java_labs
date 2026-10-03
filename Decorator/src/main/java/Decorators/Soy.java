package Decorators;

import Coffees.Beverage;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    public float cost() {
        return beverage.cost() + .2f;
    }
}
