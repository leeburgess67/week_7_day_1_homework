import Packages.IReviewed;
import ThemePark.ThemePark;
import org.junit.Before;

import java.util.ArrayList;

public class  ThemeParkTest {

    ThemePark themePark;
    ArrayList<IReviewed> reviewed;

    @Before
    public void before(){
        themePark = new ThemePark(9, reviewed) {

        }
    }
}
