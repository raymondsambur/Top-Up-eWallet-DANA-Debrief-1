package demo.stepdefinitions;

import demo.pages.ChoosePaymentMethod;
import demo.pages.DetailTransaction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ChoosePaymentStepDefinition {
    ChoosePaymentMethod choosePaymentMethod = new ChoosePaymentMethod();
    DetailTransaction detailTransaction = new DetailTransaction();

    @And("User choose {string} as Payment Method")
    public void userChooseAsPaymentMethod(String paymentName) {
        choosePaymentMethod.clickPaymentMethodButton(paymentName);
    }

    @And("User see Purchase Pop Up")
    public void userSeePurchasePopUp() {
        choosePaymentMethod.isOnPopUpPurchaseDetail();
    }

    @And("User see top up amount of {string}")
    public void userSeeTopUpAmountOf(String amount) {
        String actual = choosePaymentMethod.returnBalance();
        Assert.assertEquals(amount,actual);
    }

    @And("User see {string} as Payment Name")
    public void userSeeAsPaymentName(String paymentName) {
        String actual = choosePaymentMethod.returnPaymentName();
        Assert.assertEquals(paymentName, actual);
    }

    @And("User click Pay button on Choose Payment Type Page")
    public void userClickPayButtonOnChoosePaymentTypePage() {
        choosePaymentMethod.clickPayButton();
    }

    @Then("User is on Detail Transaction Page")
    public void userIsOnDetailTransactionPage() {
        Assert.assertTrue(detailTransaction.isOnDetailTransactionPage());

    }
}
