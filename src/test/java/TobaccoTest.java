import Stalls.Tobacco;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class TobaccoTest {

    Tobacco tobacco;
    Visitor underAgeVisitor;
    Visitor over18Visitor;

    @Before
    public void before(){
        tobacco = new Tobacco("Baccy Stall", "Toby Acco", 10, 6);
        underAgeVisitor = new Visitor("Young Yang", 16, 160, 50);
        over18Visitor = new Visitor("Older Ollie", 19, 160, 55);
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

    @Test
    public void canGetRating(){
        assertEquals(6, tobacco.getRating());
    }

    @Test
    public void isOldEnough() {
        assertTrue(tobacco.isAllowed(over18Visitor));
    }

    @Test
    public void isTooYoungEnough() {
        assertFalse(tobacco.isAllowed(underAgeVisitor));
    }
}
