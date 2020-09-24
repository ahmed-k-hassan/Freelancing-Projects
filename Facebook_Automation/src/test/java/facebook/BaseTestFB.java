package facebook;

import Pages.LoginFBPage;
import Pages.PostOnFBPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;


public class BaseTestFB {
    public WebDriver driver;
    protected LoginFBPage Login;
    protected PostOnFBPage Post;


    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        Login = new LoginFBPage(driver);
        Post=new PostOnFBPage(driver);

        goHome();

    }
    public void goHome(){
        driver.get("https://www.facebook.com/");
    }
}
