package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CnnRegister {
    private WebDriver driver;

    private By Email=By.name("registrationEmail");
    private By Password=By.name("registrationPassword");
    private By InvalidMsg=By.xpath("(//div[@data-testid='helperText'])[1]");
    private By ValidMsg =By.id("unverified-modal-body");

    private By RegisteButton=By.id("registration-button");



    public CnnRegister(WebDriver driver){this.driver=driver;}
    public void setEmail(String text){
        WebElement postElementWait=new WebDriverWait(driver, 30)
                .until(ExpectedConditions.visibilityOfElementLocated(Email));
        driver.findElement(Email).sendKeys(text);
    }
    public void setPassword(String text){

        driver.findElement(Password).sendKeys(text);
    }
    public WebElement invalidResult(){
        return driver.findElement(InvalidMsg);
    }
   public void ClickRegisterButton(){

        driver.findElement(RegisteButton).click();
    }
    public WebElement validResult(){
        WebElement postElementWait=new WebDriverWait(driver, 30)
                .until(ExpectedConditions.visibilityOfElementLocated(ValidMsg));
        return driver.findElement(ValidMsg);
    }

}
