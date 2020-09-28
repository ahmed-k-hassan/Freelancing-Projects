package NBA_Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import pages.RegisterPage;
import pages.SearchPage;

public class BaseTest {
            public WebDriver driver;
            protected RegisterPage RegisterPage;
            protected LoginPage LoginPage;
            protected SearchPage SearchPage;


            @BeforeClass
        public void setUp() {
                System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
                driver=new ChromeDriver();
                driver.manage().window().maximize();
                RegisterPage=new RegisterPage(driver);
                LoginPage=new LoginPage(driver);
                SearchPage=new SearchPage(driver);

                goHome();

            }
            public void goHome(){
                driver.get("https://www.nba.com/players?fbclid=IwAR1ZH9u-QZzEhgPyiHtEeEOUI6oBf6iyif6MxiYQrhd4E1j5-EsRHtjQU40");
            }
}
