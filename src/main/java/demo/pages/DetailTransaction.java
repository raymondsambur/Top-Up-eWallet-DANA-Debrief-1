package demo.pages;

import demo.locators.DetailTransactionLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class DetailTransaction implements DetailTransactionLocator {

    public boolean isOnDetailTransactionPage() {
        return waitABit(LABEL_TITLE_DETAIL_TRANSACTION);
    }

    public void clickBackButton() {
        androidDriver.findElement(BUTTON_BACK).click();
    }

    public void clickConfirmPaymentButton() {
        androidDriver.findElement(BUTTON_CONFIRM_PAYMENT).click();
    }

    public void clickImageTransactionPhoto(){
        androidDriver.findElement(IMAGE_TRANSACTION_PHOTO).click();
    }

    public void clickImagePopUpButton(){
        androidDriver.findElement(BUTTON_IMAGE_POP_UP).click();
    }

    public boolean isOnQRCodePage(){
        return waitABit(LABEL_TITLE_QR);
    }

    public boolean checkUsername(){
        return waitABit(LABEL_USERNAME);
    }

    public boolean checkQRImage(){
        return waitABit(IMAGE_QR_CODE);
    }

    public void clickBackQR(){
        androidDriver.findElement(BUTTON_QR_BACK);
    }

    public boolean isOnReceiptPage(){
        return waitABit(LABEL_TITLE_UPLOAD_RECEIPT);
    }

    public void clickUploadReceiptBackButton(){
        androidDriver.findElement(BUTTON_UPLOAD_RECEIPT_BACK);
    }

    public void clickConfirmUploadButton(){
        androidDriver.findElement(BUTTON_CONFIRM_UPLOAD);
    }

    public void clickTakeFromCameraButton(){
        androidDriver.findElement(BUTTON_TAKE_FROM_CAMERA);
    }

    public void clickChooseFromGalleryButton(){
        androidDriver.findElement(BUTTON_CHOOSE_FROM_GALLERY);
    }

    public void clickTakePhotoButton(){
        androidDriver.findElement(BUTTON_TAKE_PHOTO);
    }

    public void clickTakePhotoBackButton(){
        androidDriver.findElement(BUTTON_TAKE_PHOTO_BACK);
    }

    public void clickChooseFileConfirmButton(){
        androidDriver.findElement(BUTTON_CHOOSE_FILE_CONFIRM);
    }

    public void clickChooseFileCancelButton(){
        androidDriver.findElement(BUTTON_CHOOSE_FILE_CANCEL);
    }

    public boolean waitABit(By element) {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(element)).isDisplayed();
    }

}
