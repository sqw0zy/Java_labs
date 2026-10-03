package Coffees;

public abstract class Beverage {
    String description;
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;

    public String getDescription() {
        String res = description;
        if (hasSoy()) res += "with soy ";
        if (hasWhip()) res += "with whip ";
        if (hasMocha()) res += "with mocha ";
        if (hasMilk()) res += "with milk";

        return res;
    }
    public float cost() {
        float sum = 0f;

        if (hasMilk()) sum += .4f;
        if (hasMocha()) sum += .4f;
        if (hasWhip()) sum += .3f;
        if (hasSoy()) sum += .3f;

        return sum;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean m) {
        milk = m;
    }

    public boolean hasSoy() {
        return soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
