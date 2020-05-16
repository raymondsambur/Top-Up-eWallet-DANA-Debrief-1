package demo.stepdefinitions;

import demo.pages.ChoosePaymentMethod;
import demo.pages.DetailTransaction;
import demo.pages.TopUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TopUpStepDefinition {

    TopUp topUp = new TopUp();
    ChoosePaymentMethod choosePaymentMethod = new ChoosePaymentMethod();

    @When("User click {string} as Top Up amount")
    public void userClickAsTopUpAmount(String amount) {
        topUp.chooseNominal(amount);
    }

    @And("User click Select Payment Method button on Top Up Page")
    public void userClickSelectPaymentMethodButtonOnTopUpPage() {
        topUp.clickSelectPaymentButton();
    }

    @When("User click Back Button On Top Up Page")
    public void userClickBackButtonOnTopUpPage() {
        topUp.clickBackButton();
    }

    @Then("User is on Choose Payment Method Page")
    public void userIsOnChoosePaymentMethodPage() {
        Assert.assertTrue(choosePaymentMethod.isOnChoosePaymentMethod());
    }
}
