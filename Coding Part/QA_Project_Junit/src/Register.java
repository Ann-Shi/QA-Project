public class Register {
    private String Username;
    private String pwd;
    private String cnf_pwd;


    public Register(String username, String pwd, String cnf_pwd) {
        Username = username;
        this.pwd = pwd;
        this.cnf_pwd = cnf_pwd;
    }


    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCnf_pwd() {
        return cnf_pwd;
    }

    public void setCnf_pwd(String cnf_pwd) {
        this.cnf_pwd = cnf_pwd;
    }
}
