import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
@Category(GroupTestBlindMode.class)
@RunWith(Parameterized.class)

public class Select_Blind_ModeTest {
    private boolean b;
    private boolean n;

    public Select_Blind_ModeTest(boolean b, boolean n) {
        this.b = b;
        this.n = n;
    }
    @Parameterized.Parameters
    public static Collection getParameters2() {
        System.out.println("List all the cases below!");
        return Arrays.asList(new Object[][] {
                {false, true},
                {true, false},

        });
    }

    @Test
    public void select_blind_mode() {
        Select_Blind_Mode bb = new Select_Blind_Mode(b,n);
        assertEquals(true, bb.select_blind_mode(b,n));
    }
}