package Stalls;

import Packages.ISecurity;
import ThemePark.Visitor;

public class Tobacco extends Stall implements ISecurity {

    public Tobacco(String name, String owner, int parkingSpot) {
        super(name, owner, parkingSpot);
    }


    public boolean isAllowed(Visitor visitor) {
        if (visitor.getAge() > 18) {
            return true; } else { return false;}
    }

    public int getRating() {
        return this.getRating();
    }


}

