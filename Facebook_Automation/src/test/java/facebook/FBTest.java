package facebook;

import Pages.LoginFBPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FBTest extends BaseTestFB{


    @Test(priority = 1)
    public void TestLogin() {
        Login.setEmail("write your mail");
        Login.setPassword("write your password");
        Login.clickLoginButton();
    }

    @Test(priority = 2)
            public void TestFriendsNumber()
    {
        Login.clickProfile();
        assertEquals(Login.getFriendsNumber(),"828 friends","not correct");

    }

    @Test
     public void TestPost(){

        Post.clickToOpenWritePost();
        Post.setWritePost("Hello World!");
        Post.clickPost();

    }



}
