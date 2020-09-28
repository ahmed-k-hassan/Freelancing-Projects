package NBA_Task;

import org.testng.annotations.Test;
import pages.RegisterPage;

public class NBATest extends BaseTest{

    @Test
    public void testSuccessfulRegister(){
        RegisterPage.clickAcceptCookies();
        RegisterPage.clickNavButton();
        RegisterPage.clickAccountDetail();
        RegisterPage.clickCreateAccountButton();
        RegisterPage.setEmail("");//write your mail here
        RegisterPage.setPassword(""); //write your password here
        RegisterPage.setMonth(""); //write your month here
        RegisterPage.setDay("");//write your day here
        RegisterPage.setYear("");//write your year here
        RegisterPage.selectFromDropDown(""); //write your country here
        RegisterPage.setPostalCode(""); //write your postalCode here
        RegisterPage.clickAgreePolicy();
        RegisterPage.clickRegisterButton();
    }
    @Test
    public void testSuccessfulLogin(){
        RegisterPage.clickAcceptCookies();
        RegisterPage.clickNavButton();
        RegisterPage.clickAccountDetail();
        LoginPage.setEmail(""); //write your registered email to login
        LoginPage.setPassword(""); //write your registered password to login
        LoginPage.clickLoginButton();
    }
    @Test
    public void testSuccessfulSearch(){
        RegisterPage.clickAcceptCookies();
        SearchPage.setSearchBar("Adam");


    }
}
