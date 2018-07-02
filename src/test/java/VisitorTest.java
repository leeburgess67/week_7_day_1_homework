import ThemePark.Visitor;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor("Neymar Jnr", 24, 180, 3000.00);
    }

    @Test
    public void hasName(){
        TestCase.assertEquals("Neymar Jnr", visitor.getName());
    }

    @Test
    public void hasAge(){
        TestCase.assertEquals(24, visitor.getAge());
    }
    @Test
    public void hasHeight(){
        TestCase.assertEquals(180, visitor.getHeight());
    }

    @Test
    public void hasMoney(){
        TestCase.assertEquals(3000.00, visitor.getMoney());
    }


}
