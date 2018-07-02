package Stalls;

import Packages.ISecurity;
import sun.reflect.generics.visitor.Visitor;

public class Tobacco extends Stall implements ISecurity {

    public Tobacco(String name, String owner, int parkingSpot) {
        super(name, owner, parkingSpot);
    }


    public boolean isAllowed(Visitor visitor) {
        return false;
    }
}
