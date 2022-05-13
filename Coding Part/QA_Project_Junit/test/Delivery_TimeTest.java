import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Delivery_TimeTest {
    @Test
    void testExpectedException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Delivery_Time("Emily", 10);

        });
       /* assertThrows(IllegalArgumentException.class, () -> {
            new Delivery_Time("EE", 1);

        });*/
    }

/*   @Test
    void testExpectedExceptionMessage() {
        final Exception ee = assertThrows(IllegalArgumentException.class, () -> {
            new Delivery_Time("Emma", 1);

        });
        assertThat(ee.getMessage(), containsString("Package is processing, need to more time to package your stuff"));
    }*/


}