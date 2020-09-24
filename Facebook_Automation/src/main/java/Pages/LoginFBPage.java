package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFBPage {

    private WebDriver driver;
    private By usernameField =By.id("email");
    private By passwordField =By.id("pass");
    private By loginButton = By.xpath("//button[@name='login']");
    private By friends=By.xpath("//span[text()='AHmed']");
    private By friendsNum=By.xpath("//span[text()='828 friends']");

    private By clickMessenger=By.xpath("//span[text()='Messenger']");
    private By findAya= By.xpath("(//div[@class='_1qt4 _7vuo _5l-m'])[1]");
    private By writeMsg=By.xpath("//div[@class='_1mf _1mj']");



    public  LoginFBPage( WebDriver driver)
    {
        this.driver=driver;
    }
    public void setEmail(String email){
        driver.findElement(usernameField).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
    public void clickProfile(){
        WebElement postElementWait=new WebDriverWait(driver, 30)
                .until(ExpectedConditions.visibilityOfElementLocated(friends));
        driver.findElement(friends).click();
    }
    public String getFriendsNumber(){
        WebElement postElementWait=new WebDriverWait(driver, 30)
                .until(ExpectedConditions.visibilityOfElementLocated(friendsNum));
        return driver.findElement(friendsNum).getText();
    }


}
