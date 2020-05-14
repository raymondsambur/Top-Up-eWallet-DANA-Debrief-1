package demo.stepdefinitions;

import demo.pages.Login;
import demo.pages.Register;
import demo.pages.Verification;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegistrationStepDefinition {

    Register register = new Register();
    Login login = new Login();
    Verification verification = new Verification();

    @Given("User Click Register Button On Login Page")
    public void userClickRegisterButtonOnLoginPage() {
        login.clickRegisterButton();
    }

    @And("User Is On Register Page")
    public void userIsOnRegisterPage() {
        Assert.assertTrue(register.openRegisterPage());
    }

    @When("User Input {string} as First Name")
    public void userInputAsFirstName(String firstName) {
        register.inputFirstName(firstName);
    }

    @And("User Input {string} as Last Name")
    public void userInputAsLastName(String lastName) {
        register.inputLastName(lastName);
    }

    @And("User Input {string} as Phone Number")
    public void userInputAsPhoneNumber(String phoneNumber) {
        register.inputPhoneNumber(phoneNumber);
    }

    @And("User Input {string} as Email")
    public void userInputAsEmail(String email) {
        register.inputEmail(email);
    }

    @And("User Input {string} as Password")
    public void userInputAsPassword(String password) {
        register.inputPassword(password);
    }

    @And("User Input {string} as Retype Password")
    public void userInputAsRetypePassword(String retypePassword) {
        register.inputRetypePassword(retypePassword);
    }

    @And("User Click Register On Register Page")
    public void userClickRegister() {
        register.clickRegisterButton();
    }

    @Then("User is Directed to Verification Page")
    public void userIsDirectedToVerificationPage() {
        verification.openVerificationPage();
    }

    @When("User Click Back Button On Register Page")
    public void userClickBackButtonOnRegisterPage() {
        register.clickBackButton();
    }

    @Then("User See Error Message In First Name Field")
    public void userSeeErrorMessageInFirstNameField() {
        Assert.assertTrue(register.errorMessageFirstName());
    }

    @Then("User See Error Message In Last Name Field")
    public void userSeeErrorMessageInLastNameField() {
        Assert.assertTrue(register.errorMessageLastName());
    }

    @Then("User See Error Message In Email Field")
    public void userSeeErrorMessageInEmailField() {
        Assert.assertTrue(register.errorMessageEmail());
    }

    @Then("User See Error Message In Phone Number Field")
    public void userSeeErrorMessageInPhoneNumberField() {
        Assert.assertTrue(register.errorMessagePhoneNumber());
    }

    @Then("User See Error Message In Password Field")
    public void userSeeErrorMessageInPasswordField() {
        Assert.assertTrue(register.errorMessagePassword());
    }

    @Then("User See Error Message In Retype Password Field")
    public void userSeeErrorMessageInRetypePasswordField() {
        Assert.assertTrue(register.errorMessageRetypePassword());
    }
}
