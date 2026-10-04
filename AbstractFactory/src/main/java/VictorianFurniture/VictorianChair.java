package VictorianFurniture;

import Interfaces.Chair;

public class VictorianChair implements Chair {
    public boolean hasLegs() {
        return true;
    }
    public void sitOn() {
        IO.println("sitting on victorian chair");
    }
}
