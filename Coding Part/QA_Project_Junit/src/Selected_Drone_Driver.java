public class Selected_Drone_Driver {
    private boolean Dronedriver;
    private boolean Inperson;

    public Selected_Drone_Driver(boolean dronedriver, boolean inperson) {
        Dronedriver = dronedriver;
        Inperson = inperson;
    }

    public boolean isDronedriver() {
        return Dronedriver;
    }

    public void setDronedriver(boolean dronedriver) {
        Dronedriver = dronedriver;
    }

    public boolean isInperson() {
        return Inperson;
    }

    public void setInperson(boolean inperson) {
        Inperson = inperson;
    }

    boolean select_drone_driver(boolean drone,boolean person){
        if(drone && !person){
            System.out.println("You seleted the Drone Driver to delivery your package!");
            return true;
        }
        else if(!drone && person){
            System.out.println("You selected person to delivery your package.");
            return true;
        }
        else{
            System.out.println("Error!");
            return false;
        }
    }

}
