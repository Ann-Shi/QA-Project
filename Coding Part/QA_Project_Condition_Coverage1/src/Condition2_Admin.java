public class Condition2_Admin { /*T1="choose Blind Type"; T2: Login;T3: View the cart;T4:Drone Driver;T5:Delivery Message; */
    public boolean T1, T2, T3, T4, T5;

    public boolean n(String p) {
        if (p == "Blind") {
            T1 = true;
        }
        if(p=="Login"){
            T2 = true;
        }
        if(p=="View the Cart"){
            T3 = true;
        }
        if(p=="Drone Driver"){
            T4 = true;
        }if(p=="Delivery Message") {
            T5= true;

        }
        return false;
    }
}



