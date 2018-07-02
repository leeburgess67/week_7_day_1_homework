import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;

import static junit.framework.TestCase.assertEquals;

public class AttractionTest {


    Attraction rollercoaster;
    Attraction dodgems;
    Attraction park;


    @Before
    public void before(){
        rollercoaster = new Attraction("Rollercoaster");
        dodgems = new Attraction("Dodgems");
        park = new Attraction("Park");
    }

    @Test
    public void hasName(){
        assertEquals("Rollercoaster", rollercoaster.getName());
    }
}
