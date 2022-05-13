import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
@Category(GroupTestFindObject.class)
public class Calcaulate_PackageTest {
    private int a;
    private int b;
    private int c;

    public Calcaulate_PackageTest(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Parameters
    public static Collection Calca_Pac() {
        return Arrays.asList(new Object[][] {
                {10, 15,20},
                {40, 40,40},
                {0, 0,0}
        });
    }
    @Test
    public void cal() {
        Calcaulate_Package cal1=new Calcaulate_Package();
        assertEquals(true,cal1.cal(a,b,c));
    }
}