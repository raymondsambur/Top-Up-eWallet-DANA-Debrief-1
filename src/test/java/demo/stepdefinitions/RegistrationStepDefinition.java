package demo.stepdefinitions;

import demo.pages.Login;
import demo.pages.Register;
import demo.pages.Verification;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
        register.openRegisterPage();
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

    @And("User Click Register")
    public void userClickRegister() {
        register.clickRegisterButton();
    }

    @Then("User is Directed to Verification Page")
    public void userIsDirectedToVerificationPage() {
        verification.openVerificationPage();
    }
}
