import Attractions.RollerCoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Loop da loop", 9);
        visitor1 = new Visitor("Tiny Timmy", 13, 140, 0);
        visitor2 = new Visitor("Young Yang", 10, 150, 0);
        visitor3 = new Visitor("Old Ollie", 14, 150, 0);
        visitor4 = new Visitor("Tall Tam", 15, 150, 0);
    }

    @Test
    public void canGetName(){
        assertEquals("Loop da loop", rollerCoaster.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(9, rollerCoaster.getRating());
    }

    @Test
    public void underAgeRefusedEntry(){
        assertEquals(false, rollerCoaster.isAllowed(visitor1));

    }
    @Test
    public void underHeightRefusedEntry(){
        assertEquals(false, rollerCoaster.isAllowed(visitor2));

    }
    @Test
    public void oldEnoughToRide(){
        assertEquals(true, rollerCoaster.isAllowed(visitor3));

    }
    @Test
    public void tallEnoughToRide(){
        assertEquals(true, rollerCoaster.isAllowed(visitor4));

    }

}
