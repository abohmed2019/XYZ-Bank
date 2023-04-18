package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.P01_HomePage;
import pages.P02_LoginPage;
import pages.P03_ProfilePage;
import pages.P04_TransactionsPage;

public class D03_Withdraw {


    protected P03_ProfilePage profilePage;
    protected P04_TransactionsPage transactionsPage;

    @And("user withdraw 400 from his account")
    public void withdraw() throws InterruptedException {
        profilePage = new P03_ProfilePage(Hooks.driver);
        profilePage.withdrawMoney(400.00);
    }
    @Then("transaction done successfully")
    public void assert_transaction()  {
        profilePage.assert_Transaction();
    }
    @And("assert the withdraw")
    public void assert_withdraw()  {
        transactionsPage = new P04_TransactionsPage(Hooks.driver);
        transactionsPage.assert_withdraw();
    }



}
