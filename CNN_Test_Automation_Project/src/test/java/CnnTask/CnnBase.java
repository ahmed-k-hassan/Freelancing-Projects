package CnnTask;

import Pages.CnnLogin;
import Pages.CnnLogout;
import Pages.CnnRegister;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class CnnBase {
    public WebDriver driver;
    protected CnnRegister CnnRegister;
    protected CnnLogin CnnLogin;
    protected CnnLogout CnnLogout;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver=new ChromeDriver();
        CnnRegister=new CnnRegister(driver);
        CnnLogin=new CnnLogin(driver);
        CnnLogout=new CnnLogout(driver);
        driver.manage().window().maximize();
        goHome();

    }
    public void goHome(){
        driver.get("https://edition.cnn.com/account/register?fbclid=IwAR30uUBjXw3vfe7HEkhKLVWhGEq9AO1bRCqh7w-Gw2xiWq8xVUtVnFgq0rs");

    }
}
