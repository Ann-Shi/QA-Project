import java.awt.*;

public class Amazon_Menu {
    private static int Username;
    private static int Cart;
    private static int ViewCart;
    private static int DroneDriver;
    private static int Payment;

    private int state;

    public Amazon_Menu(){
        state=Username;
    }
    public void username(){
        if(state==Username){
            System.out.println("Check your username");
            state=Cart;
        }
        else{
            System.out.println("Correct!");
        }
    }

    public void cart(){
        if(state==Cart){
            System.out.println("Check your Cart");
            state=ViewCart;
        }
        else{
            System.out.print("View the Web Broswer");
        }
    }

    public void viewcart(){
        if(state==ViewCart){
            System.out.println("View your shopping cart!");
            state=DroneDriver;
        }
        else{
            System.out.println("Add more items?" );
        }
    }
    public void dronedrive(){
        if(state==DroneDriver){
            System.out.println("You selected the drone driver to delivery your package!");
            state=Payment;
        }
        else{
            System.out.println("You selected the person to delivery your package!");
        }
    }
    public void payment(){
        if(state==Payment){
            System.out.println("Your selected mastercard to pay!");
            state=Username;
        }
        else{
            System.out.println("You selected creditcard to pay");
        }
    }
}
