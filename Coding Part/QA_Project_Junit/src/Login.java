public class Login {
    private String UserName;
    private String Pwd;


    public Login(String userName, String pwd) {
        UserName = userName;
        Pwd = pwd;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }
}

