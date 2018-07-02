import Stalls.Tobacco;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TobaccoTest {

    Tobacco tobacco;

    @Before
    public void before(){
        tobacco = new Tobacco("Baccy Stall", "Toby Acco", 10);
    }

    @Test
    public void canGetName(){
        assertEquals("Baccy Stall", tobacco.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals("Toby Acco", tobacco.getOwner());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(10, tobacco.getParkingSpot());
    }


}
