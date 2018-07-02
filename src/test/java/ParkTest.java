import Attractions.Attraction;
import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Playpark", 5);
    }

    @Test
    public void canGetName(){
        assertEquals("Playpark", park.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(5, park.getRating());
    }

}
