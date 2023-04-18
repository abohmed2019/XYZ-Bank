package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P01_HomePage;
import pages.P02_LoginPage;
import pages.P03_ProfilePage;

public class D02_Deposit {

    protected P01_HomePage homepage;
    protected P02_LoginPage loginPage;
    protected P03_ProfilePage profilePage;

    @And("user deposit 1000 in his account")
    public void deposit() throws InterruptedException {
        profilePage = new P03_ProfilePage(Hooks.driver);
        profilePage.depositMoney(1000.00);
    }

}
