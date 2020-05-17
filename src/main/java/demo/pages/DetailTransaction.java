package demo.pages;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import demo.functions.PageFunctions;
import demo.locators.DetailTransactionLocator;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
        androidDriver.findElement(BUTTON_QR_BACK).click();
    }

    public boolean isOnReceiptPage() {
        return pageFunctions.waitABit(LABEL_TITLE_UPLOAD_RECEIPT).isDisplayed();
    }

    public void clickUploadReceiptBackButton() {
        androidDriver.findElement(BUTTON_UPLOAD_RECEIPT_BACK).click();
    }

    public void clickConfirmUploadButton() {
        androidDriver.findElement(BUTTON_CONFIRM_UPLOAD).click();
    }

    public void clickTakeFromCameraButton() {
        androidDriver.findElement(BUTTON_TAKE_FROM_CAMERA).click();
    }

    public void clickChooseFromGalleryButton() {
        androidDriver.findElement(BUTTON_CHOOSE_FROM_GALLERY).click();
    }

    public void clickTakePhotoButton() {
        androidDriver.findElement(BUTTON_TAKE_PHOTO).click();
    }

    public void clickTakePhotoBackButton() {
        androidDriver.findElement(BUTTON_TAKE_PHOTO_BACK).click();
    }

    public void clickChooseFileConfirmButton() {
        androidDriver.findElement(BUTTON_CHOOSE_FILE_CONFIRM).click();
    }

    public void clickChooseFileCancelButton() {
        androidDriver.findElement(BUTTON_CHOOSE_FILE_CANCEL).click();
    }

    public void clickImageButtonTakePhoto(){
        androidDriver.findElement(IMAGE_BUTTON_TAKE_PHOTO).click();
    }

    public String readQRCode() throws IOException, com.google.zxing.NotFoundException {
        MobileElement qrCodeElement = androidDriver.findElement(IMAGE_QR_CODE);
        File screenshot = androidDriver.getScreenshotAs(OutputType.FILE);

        return decodeQRCode(generateImage(qrCodeElement, screenshot));
    }

    private BufferedImage generateImage(MobileElement element, File screenshot) throws IOException {
        BufferedImage fullImage = ImageIO.read(screenshot);
        Point imageLocation = element.getLocation();

        int qrCodeImageWidth = element.getSize().getWidth();
        int qrCodeImageHeight = element.getSize().getHeight();

        int pointXPosition = imageLocation.getX();
        int pointYPosition = imageLocation.getY();

        BufferedImage qrCodeImage = fullImage.getSubimage(pointXPosition, pointYPosition, qrCodeImageWidth, qrCodeImageHeight);
        ImageIO.write(qrCodeImage, "png", screenshot);

        return qrCodeImage;
    }

    private static String decodeQRCode(BufferedImage qrCodeImage) throws com.google.zxing.NotFoundException {
        LuminanceSource source = new BufferedImageLuminanceSource(qrCodeImage);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

        Result result = new MultiFormatReader().decode(bitmap);
        return result.getText();
    }

}
