package demo.stepdefinitions;

import demo.pages.Home;
import demo.pages.TopUp;
import demo.pages.TransactionHistory;
import demo.pages.UserInformation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeStepDefinition {

    Home home = new Home();
    TopUp topUp = new TopUp();
    UserInformation userInformation = new UserInformation();
    TransactionHistory transactionHistory = new TransactionHistory();

    @When("User click Top Up button on Home Page")
    public void userClickTopUpButtonOnHomePage() {
        home.clickTopUpButton();
    }

    @Then("User is on Top Up Page")
    public void userIsOnTopUpPage() {
        boolean actual = topUp.isOnTopUpPage();
        Assert.assertTrue(actual);
    }

    @When("User click Home button on Home Page")
    public void userClickHomeButtonOnHomePage() {
        home.clickHomeButton();
    }

    @When("User click History button on Home Page")
    public void userClickHistoryButtonOnHomePage() {
        home.clickHistoryButton();
    }

    @Then("User is on History Page")
    public void userIsOnHistoryPage() {
        boolean actual = transactionHistory.isOnTransactionHistoryPage();
        Assert.assertTrue(actual);
    }

    @When("User click User Information button on Home Page")
    public void userClickUserInformationButtonOnHomePage() {
        home.clickUserInformationButton();
    }
}
