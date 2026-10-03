package Decorators;

import Coffees.Beverage;

abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
}
