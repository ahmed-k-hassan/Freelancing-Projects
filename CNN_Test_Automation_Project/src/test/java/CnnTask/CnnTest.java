package CnnTask;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CnnTest extends CnnBase{

    @Test
    public void TestInvalidEmail(){
        CnnRegister.setEmail("ahmed");
        CnnRegister.setPassword("12354");
        assertTrue(CnnRegister.invalidResult().isDisplayed());
    }
    @Test
    public void TestValidEmail(){
        CnnRegister.setEmail("ahmd@yah.c");
        CnnRegister.setPassword("AHm1346.");
        CnnRegister.ClickRegisterButton();
        assertTrue(CnnRegister.validResult().isDisplayed());

    }
    @Test
    public void TestLogin(){
        CnnLogin.clickLoginLink();
        CnnLogin.setEmail("write your mail here");
        CnnLogin.setPassword("wirte your password here");
        CnnLogin.clickLoginButton();
    }

    @Test
    public void TestLogout(){
        CnnLogout.clickMenuIcon();

        CnnLogout.clickLogoutButton();
    }

}
