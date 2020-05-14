package demo.pages;

import demo.locators.RegisterLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class Register implements RegisterLocator {

    public boolean openRegisterPage() {
        return waitABit(LABEL_TITLE_REGISTRATION);
    }

    public void inputFirstName(String firstName) {
        androidDriver.findElement(TEXT_FIELD_FIRST_NAME).sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        androidDriver.findElement(TEXT_FIELD_LAST_NAME).sendKeys(lastName);
    }

    public void inputEmail(String email) {
        androidDriver.findElement(TEXT_FIELD_EMAIL).sendKeys(email);
    }

    public void inputPhoneNumber(String phoneNumber) {
        androidDriver.findElement(TEXT_FIELD_PHONE_NUMBER).sendKeys(phoneNumber);
    }

    public void inputPassword(String password) {
        androidDriver.findElement(TEXT_FIELD_PASSWORD).sendKeys(password);
    }

    public void inputRetypePassword(String retypePassword) {
        androidDriver.findElement(TEXT_FIELD_RETYPE_PASSWORD).sendKeys(retypePassword);
    }

    public void clickRegisterButton() {
        androidDriver.findElement(BUTTON_REGISTER).click();
    }

    public void clickBackButton() {
        androidDriver.findElement(BUTTON_BACK).click();
    }

    public boolean errorMessageFirstName() {
        return waitABit(LABEL_ERROR_FIRST_NAME);
    }

    public boolean errorMessageLastName() {
        return waitABit(LABEL_ERROR_LAST_NAME);
    }

    public boolean errorMessageEmail() {
        return waitABit(LABEL_ERROR_EMAIL);
    }

    public boolean errorMessagePhoneNumber() {
        return waitABit(LABEL_ERROR_PHONE_NUMBER);
    }

    public boolean errorMessagePassword() {
        return waitABit(LABEL_ERROR_PASSWORD);
    }

    public boolean errorMessageRetypePassword() {
        return waitABit(LABEL_ERROR_RETYPE_PASSWORD);
    }

    public boolean waitABit(By element) {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(element)).isDisplayed();
    }

}
