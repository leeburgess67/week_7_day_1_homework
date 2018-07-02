import Stalls.CandyFloss;
import Stalls.IceCream;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IceCreamTest {

    IceCream iceCream;

    @Before
    public void before(){
        iceCream = new IceCream("Ice Cream", "Mr Whip", 19, 8);
    }

    @Test
    public void canGetName(){
        assertEquals("Ice Cream", iceCream.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals("Mr Whip", iceCream.getOwner());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(19, iceCream.getParkingSpot());
    }

    @Test
    public void canGetRating(){
        assertEquals(8, iceCream.getRating());
    }
}
