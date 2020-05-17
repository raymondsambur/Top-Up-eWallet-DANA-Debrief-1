package demo.pages;

import demo.functions.PageFunctions;
import demo.locators.DetailTransactionLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class DetailTransaction implements DetailTransactionLocator {

    PageFunctions pageFunctions = new PageFunctions();

    public boolean isOnDetailTransactionPage() {
        return pageFunctions.waitABit(LABEL_TITLE_DETAIL_TRANSACTION).isDisplayed();
    }

    public void clickBackButton() {
        androidDriver.findElement(BUTTON_BACK).click();
    }

    public String checkTransactionBalanceAmount(){
        return androidDriver.findElement(LABEL_BALANCE_AMOUNT).getText();
    }

    public String checkTransactionStatus(){
        return androidDriver.findElement(LABEL_TRANSACTION_STATUS).getText();
    }

    public Boolean checkTransactionDate(){
        return androidDriver.findElement(LABEL_TRANSACTION_DATE).isDisplayed();
    }

    public String checkTransactionPaymentType(){
        return androidDriver.findElement(LABEL_TRANSACTION_PAYMENT_TYPE).getText();
    }

    public String checkTransactionPaymentMethod(){
        return androidDriver.findElement(LABEL_TRANSACTION_PAYMENT_METHOD).getText();
    }

    public Boolean checkTransactionInvoiceNumber(){
        return androidDriver.findElement(LABEL_TRANSACTION_INVOICE_NUMBER).isDisplayed();
    }

    public Boolean checkTransactionTimer(){
        return androidDriver.findElement(LABEL_TRANSACTION_TIMER).isDisplayed();
    }

    public void clickLeaveNoButton() {
        androidDriver.findElement(BUTTON_LEAVE_NO).click();
    }

    public void clickLeaveYesButton() {
        androidDriver.findElement(BUTTON_LEAVE_YES).click();
    }

    public void clickConfirmPaymentButton() {
        androidDriver.findElement(BUTTON_CONFIRM_PAYMENT).click();
    }

    public void clickImageTransactionPhoto() {
        androidDriver.findElement(IMAGE_TRANSACTION_PHOTO).click();
    }

    public void clickImagePopUpButton() {
        androidDriver.findElement(BUTTON_IMAGE_POP_UP).click();
    }

    public boolean isOnQRCodePage() {
        return pageFunctions.waitABit(LABEL_TITLE_QR).isDisplayed();
    }

    public boolean checkUsername() {
        return pageFunctions.waitABit(LABEL_USERNAME).isDisplayed();
    }

    public boolean checkQRImage() {
        return pageFunctions.waitABit(IMAGE_QR_CODE).isDisplayed();
    }

    public void clickBackQR() {
        androidDriver.findElement(BUTTON_QR_BACK);
    }

    public boolean isOnReceiptPage() {
        return pageFunctions.waitABit(LABEL_TITLE_UPLOAD_RECEIPT).isDisplayed();
    }

    public void clickUploadReceiptBackButton() {
        androidDriver.findElement(BUTTON_UPLOAD_RECEIPT_BACK);
    }

    public void clickConfirmUploadButton() {
        androidDriver.findElement(BUTTON_CONFIRM_UPLOAD);
    }

    public void clickTakeFromCameraButton() {
        androidDriver.findElement(BUTTON_TAKE_FROM_CAMERA);
    }

    public void clickChooseFromGalleryButton() {
        androidDriver.findElement(BUTTON_CHOOSE_FROM_GALLERY);
    }

    public void clickTakePhotoButton() {
        androidDriver.findElement(BUTTON_TAKE_PHOTO);
    }

    public void clickTakePhotoBackButton() {
        androidDriver.findElement(BUTTON_TAKE_PHOTO_BACK);
    }

    public void clickChooseFileConfirmButton() {
        androidDriver.findElement(BUTTON_CHOOSE_FILE_CONFIRM);
    }

    public void clickChooseFileCancelButton() {
        androidDriver.findElement(BUTTON_CHOOSE_FILE_CANCEL);
    }

    public void clickImageButtonTakePhoto(){
        androidDriver.findElement(IMAGE_BUTTON_TAKE_PHOTO).click();
    }

}
