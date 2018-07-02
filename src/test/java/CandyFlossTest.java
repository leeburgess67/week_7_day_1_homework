import Stalls.CandyFloss;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CandyFlossTest {

        CandyFloss candyFloss;

        @Before
        public void before(){
            candyFloss = new CandyFloss("Candy Floss", "Mr Floss", 11, 7);
        }

        @Test
        public void canGetName(){
            assertEquals("Candy Floss", candyFloss.getName());
        }

        @Test
        public void canGetOwner(){
            assertEquals("Mr Floss", candyFloss.getOwner());
        }

        @Test
        public void canGetParkingSpot(){
            assertEquals(11, candyFloss.getParkingSpot());
        }

        @Test
        public void canGetRating(){
            assertEquals(7, candyFloss.getRating());
        }
}
