import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
@Category(GroupTestDroneDriver.class)
@RunWith(Parameterized.class)
public class Selected_Drone_DriverTest {
    private boolean d;// d= drone driver
    private boolean p; // p= person driver

    public Selected_Drone_DriverTest(boolean d, boolean p) {
        this.d = d;
        this.p = p;
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
    public void select_drone_driver() {
        Selected_Drone_Driver driver = new Selected_Drone_Driver(d,p);
        assertEquals(true, driver.select_drone_driver(d,p));
    }
}