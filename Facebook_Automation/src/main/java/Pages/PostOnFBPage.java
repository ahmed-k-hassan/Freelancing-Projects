package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PostOnFBPage {
    private WebDriver driver;

    private By openWritePost =By.xpath ("//div[@class='m9osqain a5q79mjw jm1wdb64 k4urcfbm']");
    private By writePost=By.xpath("(//div[@class='_1mf _1mj'])[1]");
    private By post=By.xpath("//div[text()='Post']");
    public PostOnFBPage(WebDriver driver){ this.driver=driver; }


    public void clickToOpenWritePost(){
        WebElement postElementWait=new WebDriverWait(driver, 30)
                .until(ExpectedConditions.visibilityOfElementLocated(openWritePost));
        driver.findElement(openWritePost).click();
    }
    public void setWritePost(String post ){
        WebElement postElementWait=new WebDriverWait(driver, 30)
                .until(ExpectedConditions.visibilityOfElementLocated(writePost));
        driver.findElement(writePost).sendKeys(post);
    }
    public void clickPost(){
        driver.findElement(post).click();

    }


}
