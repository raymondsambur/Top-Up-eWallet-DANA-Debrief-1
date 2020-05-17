package demo.stepdefinitions;

import demo.pages.Home;
import demo.pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {

    Login login = new Login();
    Home home = new Home();

    @Given("User is on Login Page")
    public void userIsOnLoginPage() {
        boolean actual = login.isOnLoginPage();
        Assert.assertTrue(actual);
    }

    @When("User input email/phone {string} on email/phone form")
    public void userInputEmailOnEmailForm(String keyword) {
        login.inputUserEmailOrPhone(keyword);
    }

    @And("User input password {string} on password form")
    public void userInputPasswordOnPasswordForm(String password) {
        login.inputUserPassword(password);
    }

    @And("User click signIn button")
    public void userClickSignInButton() {
        login.clickLoginButton();
    }


    @Then("User is on Home Page")
    public void userIsOnHomePage() {
        boolean actual = home.isOnHomePage();
        Assert.assertTrue(actual);
    }

    @Then("User See Error Message for Invalid Username or Password")
    public void userSeeErrorMessageForInvalidUsernameOrPassword() {
        String text = login.errorMessageInvalid();
        Assert.assertTrue(text.contains("Unauthorized"));
    }

    @Then("User See Error Message for Empty Field")
    public void userSeeErrorMessageForEmptyField() {
        String text = login.errorMessageInvalid();
        Assert.assertTrue(text.contains("Username/Password"));
    }
}
