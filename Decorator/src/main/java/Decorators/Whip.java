package Decorators;

import Coffees.Beverage;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
    public float cost() {
        return beverage.cost() + .15f;
    }
}
