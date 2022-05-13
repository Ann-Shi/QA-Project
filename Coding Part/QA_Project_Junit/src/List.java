public class List { //list of staff information
    private int id;
    private String Username;
    private String Password;
    private String Position;
    public List(){}


    public List(int id, String username, String password, String position) {
        this.id = id;
        Username = username;
        Password = password;
        Position = position;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }


}
