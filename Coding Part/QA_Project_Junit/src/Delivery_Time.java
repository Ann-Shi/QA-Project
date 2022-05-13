//after 5 business will be delivery
public class Delivery_Time {
    private final String username;
    private final int time;

    public Delivery_Time(String username, int time) {
        this.username = username;
        this.time = time;
        if(time >5){
            throw new IllegalArgumentException("oops! Package is processing, need to more time to package your stuff" + time);
        }
        else{
            System.out.println("you package will be delivery within 5 business days");
        }
    }
}
