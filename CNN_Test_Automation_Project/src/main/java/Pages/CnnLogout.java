package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CnnLogout {
    private WebDriver driver;
    private By MenuIcon=By.xpath("(//div[@class='Box-sc-1fet97o-0 hyVhvp'])[1]");
    private By LogoutButton=By.xpath("(//li[@id='userLogout-link'])[1]");


    public CnnLogout(WebDriver driver){
        this.driver=driver;
    }
    public void clickMenuIcon(){
        WebElement postElementWait=new WebDriverWait(driver, 30)
                .until(ExpectedConditions.visibilityOfElementLocated(MenuIcon));
        driver.findElement(MenuIcon).click();
    }

    public void clickLogoutButton(){
        WebElement postElementWait=new WebDriverWait(driver, 30)
                .until(ExpectedConditions.visibilityOfElementLocated(LogoutButton));
        driver.findElement(LogoutButton).click();
    }
}
