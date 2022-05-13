import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ListTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void testWithCsvSource(int id, String username, String password, String position) {
        List staff = new List(id, username, password, position);

        String expected = staff.getId() + "," + staff.getUsername() + "," + staff.getPassword() + "," + staff.getPosition();
        String actual = List_U.staffInfo(staff);

        assertEquals(expected, actual);
    }
}