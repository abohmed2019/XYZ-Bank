package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class P03_ProfilePage {

    private WebDriver driver;

    private By depositButton = By.xpath("//button[@ng-class='btnClass2']");
    private By moneyInput = By.xpath("//input[@type='number']");
    private By depositSubmit = By.xpath("//button[@class='btn btn-default']");

    private By withdrawButton = By.xpath("//button[@ng-class='btnClass3']");
    private By withdrawSubmit = By.xpath("//button[@type='submit']");


    public P03_ProfilePage(WebDriver driver){
        this.driver = driver;
    }

    public void depositMoney(double amount) throws InterruptedException {
        driver.findElement(depositButton).click();
        driver.findElement(moneyInput).sendKeys(String.valueOf(amount));
        driver.findElement(depositSubmit).click();
        Thread.sleep(1000);
        /*WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Deposit Successful')]")));*/
    }
    public void withdrawMoney(double amount) throws InterruptedException {
        driver.findElement(withdrawButton).click();
        Thread.sleep(1000);
        driver.findElement(moneyInput).sendKeys(String.valueOf(amount));
        driver.findElement(withdrawSubmit).click();
    }

    public void assert_Transaction() {
        String expectedResults = "600" ;
        String actualResults = driver.findElement(By.xpath("//strong[contains(@class,'ng-binding')][2]")).getText();
        Assert.assertTrue(actualResults.contains(expectedResults));
        System.out.println("actualResults :" + actualResults);
    }
}
