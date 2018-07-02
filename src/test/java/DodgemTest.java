import Attractions.Attraction;
import Attractions.Dodgem;
import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DodgemTest {

    Dodgem dodgem;

    @Before
    public void before(){
        dodgem = new Dodgem("Bump and Ride", 7);
    }

    @Test
    public void canGetName(){
        assertEquals("Bump and Ride", dodgem.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(7, dodgem.getRating());
    }

}