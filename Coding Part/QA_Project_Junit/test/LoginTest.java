import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {
 private String Name;
 private String Pwd;


    @Test
    void getUserName() {
        Login login= new Login("Emily","1234");
        assertEquals("Emily",login.getUserName());
    }

    @Test
    void getPwd() {
        Login Pass= new Login("Ali","****");
        assertEquals("****",Pass.getPwd());
    }
}