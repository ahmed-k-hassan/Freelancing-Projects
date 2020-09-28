package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    private By enterSearch=By.id("player-search");

    public SearchPage (WebDriver driver){this.driver= driver;}

    public void setSearchBar(String txt){
        driver.findElement(enterSearch).sendKeys(txt);
    }


}
