package demo.stepdefinitions;

import demo.controller.APIController;
import demo.controller.VerificationRequest;
import demo.pages.Login;
import demo.pages.Verification;
import io.cucumber.java.en.And;
import io.restassured.response.Response;
import org.junit.Assert;

public class VerificationStepDefinition {
    Verification verification = new Verification();
    APIController apiController = new APIController();
    Login login = new Login();

    public String phoneNumberValidate = "";
    public String emailValidate = "";
    public String otp_code = "";

    @And("User click Back Button On Verification")
    public void userClickBackButtonOnVerification() {
        verification.clickBackButton();
    }

    @And("User is on Email Verification Page")
    public void userIsOnEmailVerificationPage() {
        Assert.assertTrue(verification.isOnEmailVerificationPage());
    }

    @And("User input {string} as email")
    public void userInputAsEmail(String email) {
        verification.inputEmail(email);
        emailValidate = email;
    }

    @And("User click verify button on Email Verification Page")
    public void userClickVerifyButtonOnEmailVerificationPage() {
        verification.clickVerifyButton();
    }

    @And("User input otp code")
    public void userInputOtpCode() {
        verification.inputOTPCode(otp_code);
    }

    @And("User click Validate button on Verification Page")
    public void userClickValidateButtonOnVerificationPage() {
        verification.clickProceedButton();
    }

    @And("User click resend button on Email Verification Page")
    public void userClickResendButtonOnEmailVerificationPage() {
        verification.clickProceedButton();
        VerificationRequest verificationRequest = new VerificationRequest();
        verificationRequest.setEmail(emailValidate);
        verificationRequest.setPhoneNumber(phoneNumberValidate);

        Response response = apiController.resendOTPCode(verificationRequest);
        response.getBody().prettyPrint();
        otp_code = response.path("otp_code");
    }

    @And("User input phone {string} on phone login page")
    public void userInputPhoneOnPhoneLoginPage(String phone) {
        login.inputUserEmailOrPhone(phone);
        phoneNumberValidate = phone;
    }

    @And("User input password {string} on password login page")
    public void userInputPasswordOnPasswordLoginPage(String password) {
        login.inputUserPassword(password);
    }
}
