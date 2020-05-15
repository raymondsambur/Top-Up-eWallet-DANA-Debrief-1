package demo.stepdefinitions;

import demo.pages.DetailTransaction;
import demo.pages.TopUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TopUpStepDefinition {

    TopUp topUp = new TopUp();
    DetailTransaction detailTransaction = new DetailTransaction();

    @When("User click {string} as Top Up amount")
    public void userClickAsTopUpAmount(String amount) {
        topUp.chooseNominal(amount);
    }

    @And("User click Select Payment Method button on Top Up Page")
    public void userClickSelectPaymentMethodButtonOnTopUpPage() {
        topUp.clickSelectPaymentButton();
    }

    @Then("User is on Detail Transaction Page")
    public void userIsOnDetailTransactionPage() {
        detailTransaction.isOnDetailTransactionPage();
    }

    @When("User click Back Button On Top Up Page")
    public void userClickBackButtonOnTopUpPage() {
        topUp.clickBackButton();
    }
}
