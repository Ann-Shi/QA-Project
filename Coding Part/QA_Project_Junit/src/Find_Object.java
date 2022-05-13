public class Find_Object {
    //test drone driver to find the object or package
    public boolean object(int h, int w) {
        if (h == 100 && w == 200) {
            System.out.println("find the box.");
            return true;
        }
        if (h == 200 && w == 200) {
            System.out.println("Scanning the label of items.");
            return true;
        }
        if (h == 205 && w == 200) {
            System.out.println("Check the information.");
            return true;
        }
        if (h == 210 && w == 200) {
            System.out.println("calculator the shortest routine.");
            return true;
        }
        if (h == 240 && w == 200) {
            System.out.println("Package the stuff");
            return true;
        }
        if (h == 140 && w == 200) {
            System.out.println("Checking Drone's body");
            return true;
        }
        if (h == 120 && w == 150) {
            System.out.println("Maintenance!");
            return true;
        }
        if (h == 90 && w == 100) {
            System.out.println("Starting Work");
            return true;
        }
        if (h == 90 && w == 80) {
            System.out.println("Processing");
            return true;
        }
        if (h == 50 && w == 90) {
            System.out.println("out of delivery");
            return true;
        }
        if (h == 90 && w == 50) {
            System.out.println("Delivered");
            return true;
        }
        else {
            System.out.println("cant find the package");
            return false;
        }
    }
}


