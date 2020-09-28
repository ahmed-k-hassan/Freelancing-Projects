package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private By enterEmail=By.xpath("//input[@name='emailAddress']");
    private By enterPassword=By.xpath("//input[@name='password']");
    private By loginButton=By.id("nbaMembershipButtonLogin");

    public LoginPage (WebDriver driver){
       this.driver=driver;
    }

    public void setEmail(String txt){
        WebElement ElementWait=new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(enterEmail));
        driver.findElement(enterEmail).sendKeys(txt);
    }
    public void setPassword(String txt){
        driver.findElement(enterPassword).sendKeys(txt);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
        WebElement ElementWait=new WebDriverWait(driver, 30)
                .until(ExpectedConditions.visibilityOfElementLocated(loginButton));

    }

}
