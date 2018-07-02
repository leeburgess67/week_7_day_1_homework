package Attractions;

import Packages.ISecurity;
import ThemePark.Visitor;

public class RollerCoaster extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowed(Visitor visitor) {
        if (visitor.getHeight() > 145 && visitor.getAge() >12){
            return true;
        } else { return false; }
    }
}