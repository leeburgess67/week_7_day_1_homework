import Attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Loop da loop", 9);
    }

    @Test
    public void canGetName(){
        assertEquals("Loop da loop", rollerCoaster.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(9, rollerCoaster.getRating());
    }

}
