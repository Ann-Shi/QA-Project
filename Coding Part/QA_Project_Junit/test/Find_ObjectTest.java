import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
@Category(GroupTestFindObject.class)
public class Find_ObjectTest {
    private int x;
    private int y;



    @Parameters
    public static Collection Dronesearch() {
        return Arrays.asList(new Object[][] {
                {100, 200},
                {200, 200},
                {205, 200},
                {210, 200},

        });
    }
    public Find_ObjectTest(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Test
    public void testObject() {
        Find_Object fo = new Find_Object();
        assertEquals(true, fo.object(x,y));
    }
}