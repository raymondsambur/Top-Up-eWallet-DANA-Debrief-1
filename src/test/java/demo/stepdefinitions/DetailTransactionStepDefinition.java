package demo.stepdefinitions;

import demo.pages.DetailTransaction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DetailTransactionStepDefinition {
    DetailTransaction detailTransaction = new DetailTransaction();

    @Then("User see transaction Top Up amount as {string}")
    public void userSeeTransactionTopUpAmountAs(String amount) {
        String actual = detailTransaction.checkTransactionBalanceAmount();
        Assert.assertEquals(amount, actual);
    }

    @And("User see transaction Status is {string}")
    public void userSeeTransactionStatusIs(String status) {
        String actual = detailTransaction.checkTransactionStatus();
        Assert.assertEquals(status, actual);
    }

    @And("User see transaction date")
    public void userSeeTransactionDate() {
        Boolean actual = detailTransaction.checkTransactionDate();
        Assert.assertTrue(actual);
    }

    @And("User see transaction payment method is {string}")
    public void userSeeTransactionPaymentMethodIs(String paymentType) {
        String actual = detailTransaction.checkTransactionPaymentType();
        Assert.assertEquals(paymentType, actual);
    }

    @And("User see transaction payment name is {string}")
    public void userSeeTransactionPaymentNameIs(String paymentName) {
        String actual = detailTransaction.checkTransactionPaymentMethod();
        Assert.assertEquals(paymentName, actual);
    }

    @And("User see transaction validity timer")
    public void userSeeTransactionValidityTimer() {
        Boolean actual = detailTransaction.checkTransactionTimer();
        Assert.assertTrue(actual);
    }

    @And("User click confirm button on Detail Transaction Page")
    public void userClickConfirmButtonOnDetailTransactionPage() {
        detailTransaction.clickConfirmPaymentButton();
    }

    @And("User click take photo button")
    public void userClickTakePhotoButton() {
        detailTransaction.clickImageButtonTakePhoto();
    }

    @And("User take a receipt photo")
    public void userTakeAReceiptPhoto() {
        detailTransaction.clickTakePhotoButton();
    }

    @And("User click confirm button on Confirm Upload Receipt Page")
    public void userClickConfirmButtonOnConfirmUploadReceiptPage() {
        detailTransaction.clickConfirmUploadButton();
    }

    @And("User click confirm button on pop up message confirmation")
    public void userClickConfirmButtonOnPopUpMessageConfirmation() {
        detailTransaction.clickChooseFileConfirmButton();
    }

    @And("User choose take from camera")
    public void userChooseTakeFromCamera() {
        detailTransaction.clickTakeFromCameraButton();
    }

    @And("User is on Confirm Upload Receipt")
    public void userIsOnConfirmUploadReceipt() {
        Assert.assertTrue(detailTransaction.isOnReceiptPage());

    }
}
