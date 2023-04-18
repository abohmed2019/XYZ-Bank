package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P02_LoginPage {

    private WebDriver driver;


    private By loginButton = By.xpath("//button[@class='btn btn-default']");

    public P02_LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectByName(){
        Select drpName = new Select(driver.findElement(By.id("userSelect")));
        drpName.selectByVisibleText("Albus Dumbledore");
    }
    public P03_ProfilePage click_login(){
        driver.findElement(loginButton).click();
        return new P03_ProfilePage(driver);
    }


}
