public class Drone_Driver_Info_L {
    public static String Drone_Driver_Info(Drone_Driver_Info droneDriver) {
        if(droneDriver == null) {
            return "none";
        }

        return droneDriver.getId()+","+droneDriver.getHeight()+","+droneDriver.getWeight()+","+droneDriver.getWidth()+","+droneDriver.getStatus();


    }
}
