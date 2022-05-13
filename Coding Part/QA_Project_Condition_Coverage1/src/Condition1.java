public class Condition1 {
    /*T1="choose Blind Type"; T2: Register;T3: Login;T4:Cart;T5:Drone Driver; T6: Inperson ;T7:View Cart;
    T8: Payment T9: Delivery message*/
    public boolean T1, T2, T3, T4, T5, T6, T7, T8, T9;

    public boolean m(String p) {
        if (p == "Blind") {
            T1 = true;
        }
        if(p=="Register"){
            T2 = true;
        }
        if(p=="Login"){
            T3 = true;
        }
        if(p=="Cart"){
            T4 = true;
        }if(p=="Drone Driver"){
            T5 = true;
        }if(p=="View the cart"){
            T6 = true;
        }if(p=="Payment"){
            T7 = true;
        }if(p=="Delivery Message"){
            T8 = true;
        }
        return false;
    }
}
