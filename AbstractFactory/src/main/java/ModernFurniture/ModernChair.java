package ModernFurniture;

import Interfaces.Chair;

public class ModernChair implements Chair {
    public boolean hasLegs() {
        return false;
    }

    public void sitOn() {
        IO.println("sitting on modern chair");
    }
}
