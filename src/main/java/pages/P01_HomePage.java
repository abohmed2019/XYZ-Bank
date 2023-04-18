package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_HomePage {

    private WebDriver driver;
    private By loginButton = By.xpath("//button[@class='btn btn-primary btn-lg']");



    public P01_HomePage(WebDriver driver){
        this.driver = driver;
    }

    public P02_LoginPage clickLogin(){
        driver.findElement(loginButton).click();
        return new P02_LoginPage(driver);
    }

}
