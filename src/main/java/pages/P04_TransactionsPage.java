package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_TransactionsPage {

    private WebDriver driver;

    private By transactionsButton = By.xpath("//button[@ng-class='btnClass1']");
    private By table = By.xpath("//tr[@id=\"anchor1\"]/td[2]");

    public P04_TransactionsPage(WebDriver driver){
        this.driver = driver;
    }



    public void assert_withdraw() {
        driver.findElement(transactionsButton).click();
        String expectedResults = "400" ;
        String actualResults = driver.findElement(table).getText();
        Assert.assertTrue(actualResults.contains(expectedResults));
        System.out.println("actualResultssssssssss :" + actualResults);
    }
}
