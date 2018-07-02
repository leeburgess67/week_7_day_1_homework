package Attractions;

import Packages.ISecurity;
import sun.reflect.generics.visitor.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }


    public boolean isAllowed(Visitor visitor) {
        return false;
    }
}

