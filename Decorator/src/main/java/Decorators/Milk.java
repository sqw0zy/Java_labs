package Decorators;

import Coffees.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
    public float cost() {
        return beverage.cost() + .2f;
    }
}
