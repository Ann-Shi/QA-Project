public class Amazon_Controls {
    private static int BlindMode=0;
    private static int Register=1;
    private static int Login=2;
    private static int Menu=3;
    private static int DeliveryMessage=4;

    private int state;

    public  Amazon_Controls(){
        state=BlindMode;
    }
    public void blind_mode(){
        if(state==BlindMode){
            System.out.println("Are you select the blind moode?");
            state=Register;
        }
        else{
            System.out.println("Normal!");
        }
    }

    public void register(){
        if(state == Register){
            System.out.println("Please enter your information?");
            state=Login;
        }
        else {
            System.out.println("Registered!");
        }
    }

    public void login(){
        if(state == Login){
            System.out.println("Login, Please");
            state=Menu;
        }
        else {
            System.out.println("Login Sucessfully!");
        }
    }

    public void menu(){
        if(state ==Menu){
            System.out.println("Selected the type of delivery");
            state=DeliveryMessage;
        }
        else{
            System.out.println("Login Page");
            state=Menu;
        }

    }
    public void delivermessage(){
        if(state==DeliveryMessage){
            System.out.println("Your package delivered!");
            state=Login;
        }
        else{
            System.out.println("Go back to the Home Page.");
        }
    }
}
