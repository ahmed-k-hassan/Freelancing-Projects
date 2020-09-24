package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CnnLogin {

    private WebDriver driver;
    private By LoginLink=By.id("login-link");
    private By LoginEmail=By.name("loginEmail");
    private By LoginPassword=By.name("loginPassword");
    private By LoginButton=By.id("login-form-button");
    public CnnLogin(WebDriver driver){this.driver= driver;}
    public void clickLoginLink(){
        WebElement postElementWait=new WebDriverWait(driver, 30)
                .until(ExpectedConditions.visibilityOfElementLocated(LoginLink));
        driver.findElement(LoginLink).click();
    }
    public void setEmail(String text){
        driver.findElement(LoginEmail).sendKeys(text);
    }
    public void setPassword(String text){
        driver.findElement(LoginPassword).sendKeys(text);
    }
    public void clickLoginButton(){

        driver.findElement(LoginButton).click();
        WebElement postElementWait=new WebDriverWait(driver, 30)
                .until(ExpectedConditions.visibilityOfElementLocated(LoginButton));
    }


}
