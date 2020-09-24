package CnnTask;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CnnTest extends CnnBase{

    @Test
    public void TestInvalidEmail(){
        CnnRegister.setEmail("write invalid email");
        CnnRegister.setPassword("write password");
        assertTrue(CnnRegister.invalidResult().isDisplayed());
    }
    @Test
    public void TestValidEmail(){
        CnnRegister.setEmail("write valid email");
        CnnRegister.setPassword("write valid password");
        CnnRegister.ClickRegisterButton();
        assertTrue(CnnRegister.validResult().isDisplayed());

    }
    @Test
    public void TestLogin(){
        CnnLogin.clickLoginLink();
        CnnLogin.setEmail("write your mail here");
        CnnLogin.setPassword("write your password here");
        CnnLogin.clickLoginButton();
    }

    @Test
    public void TestLogout(){
        CnnLogout.clickMenuIcon();

        CnnLogout.clickLogoutButton();
    }

}
