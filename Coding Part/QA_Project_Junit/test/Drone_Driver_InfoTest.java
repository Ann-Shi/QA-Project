import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
public class Drone_Driver_InfoTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/drone_drive_i.csv")
   public void testWithCsvSource2(int id, String height, String weight, String width,String status) {
        Drone_Driver_Info Driver = new Drone_Driver_Info(id, height,weight,width,status);

        String expectedResult = Driver.getId() + "," + Driver.getHeight() + "," + Driver.getWeight() + "," + Driver.getWidth()+","+Driver.getStatus();
        String actualResult = Drone_Driver_Info_L.Drone_Driver_Info(Driver);

        assertEquals(expectedResult, actualResult);
    }


}