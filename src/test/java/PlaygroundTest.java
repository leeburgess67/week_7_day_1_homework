
import Attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground("Big kids playground", 4);
    }

    @Test
    public void canGetName(){
        assertEquals("Big kids playground", playground.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(4, playground.getRating());
    }

}