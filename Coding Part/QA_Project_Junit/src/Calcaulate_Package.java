public class Calcaulate_Package {
    public boolean cal(int weight, int height, int width){
        if(weight <=10 && height<=15 && width<=20){
            System.out.println("the small drone drive will be selected!");
            return true;
        }
        if(weight <50 || height<60|| width<80){
            System.out.println("the middle drone drive will be selected!");
            return true;
        }
       else{
            System.out.println("the bigger drone drive will be selected!");
            return false;
        }
    }
}
