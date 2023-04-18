package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P01_HomePage;
import pages.P02_LoginPage;
import pages.P03_ProfilePage;

public class D01_Login {

    protected P01_HomePage homepage;
    protected P02_LoginPage loginPage;
    protected P03_ProfilePage profilePage;

    @Given("user navigate to the home page")
    public void user_navigates(){
        homepage = new P01_HomePage(Hooks.driver);
    }
    @When("user login to the profile page")
    public void customer_logIn(){
        loginPage = homepage.clickLogin();
        loginPage.selectByName();
        profilePage = loginPage.click_login();
    }
}
