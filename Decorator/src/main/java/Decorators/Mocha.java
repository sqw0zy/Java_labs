package Decorators;

import Coffees.Beverage;

public class Mocha extends CondimentDecorator{
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    public float cost() {
        return beverage.cost() + .2f;
    }
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
}
