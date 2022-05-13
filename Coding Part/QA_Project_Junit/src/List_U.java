
public class List_U {
    public static String staffInfo(List staff) {
        if(staff == null) {
            return "none";
        }

        return staff.getId()+","+staff.getUsername()+","+staff.getPassword()+","+staff.getPosition();
    }
}
