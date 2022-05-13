public class Select_Blind_Mode {

    private boolean blind;
    private boolean normal;

    public Select_Blind_Mode(boolean blind, boolean normal) {
        this.blind = blind;
        this.normal = normal;
    }

    public boolean isBlind() {
        return blind;
    }

    public void setBlind(boolean blind) {
        this.blind = blind;
    }

    public boolean isNormal() {
        return normal;
    }

    public void setNormal(boolean normal) {
        this.normal = normal;
    }

    boolean select_blind_mode(boolean blind,boolean normal){
        if(blind && !normal){
            System.out.println("You seleted the blind mode!");
            return true;
        }
        else if(!blind && normal){
            System.out.println("You did not selected the blind mode");
            return true;
        }
        else{
            System.out.println("Error!");
            return false;
        }
    }


}
