package demo.stepdefinitions;

import demo.pages.Home;
import demo.pages.UserInformation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserInformationStepDefinition {

    UserInformation userInformation = new UserInformation();
    Home home = new Home();

    @When("User click user information")
    public void userClickUserInformation() {
        home.clickUserInformation();
    }

    @Then("User is on User Information Page")
    public void userIsOnUserInformationPage() {
        boolean actual = userInformation.isOnUserInformationPage();
        Assert.assertTrue(actual);
    }
}
