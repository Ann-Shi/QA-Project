import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    private String userame;
    private String pwd_;

    @Test
    void getUsername() {
        Register name= new Register("CC","1234","1234");
        assertEquals("CC",name.getUsername());
    }

    @Test
    void getPwd() {
        Register ppass= new Register("CC","1234","1234");
        assertEquals("1234",ppass.getPwd());
    }

    @Test
    void getCnf_pwd() {
        Register Con_Pass= new Register("CC","1234","1234");
        assertEquals("1234",Con_Pass.getCnf_pwd());
    }
}