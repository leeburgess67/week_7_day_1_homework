package Attractions;

import Packages.ISecurity;
import sun.reflect.generics.visitor.Visitor;

public class RollerCoaster extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowed(Visitor visitor) {
        return false;
    }
}