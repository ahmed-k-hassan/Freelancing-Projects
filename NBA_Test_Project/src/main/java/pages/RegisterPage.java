package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
    private WebDriver driver;
    private By acceptCookies=By.xpath("//button[@id='onetrust-accept-btn-handler']");
    private By navToAccount=By.xpath("//button[@class='nba-nav__account']");
    private By accountDetail=By.xpath("//a[@class='acctDetails']");
    private By createAccountButton=By.id("nbaMembershipCreateAccountLink");

    private By enterEmail=By.xpath("//input[@name='emailAddress']");
    private By enterPassword=By.xpath("//input[@name='password']");
    private By enterMonth=By.id("nbaMembershipPersonalizeMonth");
    private By enterDay=By.id("nbaMembershipPersonalizeDay");
    private By enterYear=By.id("nbaMembershipPersonalizeYear");

    private By selectCountry=By.xpath("//select[@name='country']");

    private By enterPostalCode=By.xpath("//input[@name='postalcode']");

    private By agreePolicy=By.xpath("(//label[@class='nbaCheckbox dark'])[3]");

    private By RegisterButton=By.id("nbaMembershipButtonCreateAccount");


    public RegisterPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickAcceptCookies(){
        WebElement ElementWait=new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(acceptCookies));
        driver.findElement(acceptCookies).click();
    }
    public void clickNavButton(){

        driver.findElement(navToAccount).click();
    }
    public void clickAccountDetail(){
        driver.findElement(accountDetail).click();
    }
    public void clickCreateAccountButton(){
        WebElement ElementWait=new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(createAccountButton));
        driver.findElement(createAccountButton).click();
    }
    public void setEmail(String txt){
        WebElement ElementWait=new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(enterEmail));
        driver.findElement(enterEmail).sendKeys(txt);
    }
    public void setPassword(String txt){
        driver.findElement(enterPassword).sendKeys(txt);
    }
    public void setMonth(String txt){
        driver.findElement(enterMonth).sendKeys(txt);
    }
    public void setDay(String txt){
        driver.findElement(enterDay).sendKeys(txt);
    }
    public void setYear(String txt){
        driver.findElement(enterYear).sendKeys(txt);
    }
    public void setPostalCode(String txt){
        driver.findElement(enterPostalCode).sendKeys(txt);
    }
    public void selectFromDropDown(String txt) {
        WebElement element=driver.findElement(selectCountry);
        Select sel = new Select(element);
        sel.selectByVisibleText(txt);
    }
    public void clickAgreePolicy(){
        driver.findElement(agreePolicy).click();
    }
    public void clickRegisterButton(){
        driver.findElement(RegisterButton).click();
        WebElement ElementWait=new WebDriverWait(driver, 30)
                .until(ExpectedConditions.visibilityOfElementLocated(RegisterButton));

    }





}
