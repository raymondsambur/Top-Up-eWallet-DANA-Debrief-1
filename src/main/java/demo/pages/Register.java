package demo.pages;

import demo.functions.PageFunctions;
import demo.locators.RegisterLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class Register implements RegisterLocator {

    PageFunctions pageFunctions = new PageFunctions();

    public boolean openRegisterPage() {
        return pageFunctions.waitABit(LABEL_TITLE_REGISTRATION).isDisplayed();
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
        return pageFunctions.waitABit(LABEL_ERROR_FIRST_NAME).isDisplayed();
    }

    public boolean errorMessageLastName() {
        return pageFunctions.waitABit(LABEL_ERROR_LAST_NAME).isDisplayed();
    }

    public boolean errorMessageEmail() {
        return pageFunctions.waitABit(LABEL_ERROR_EMAIL).isDisplayed();
    }

    public boolean errorMessagePhoneNumber() {
        return pageFunctions.waitABit(LABEL_ERROR_PHONE_NUMBER).isDisplayed();
    }

    public boolean errorMessagePassword() {
        return pageFunctions.waitABit(LABEL_ERROR_PASSWORD).isDisplayed();
    }

    public boolean errorMessageRetypePassword() {
        return pageFunctions.waitABit(LABEL_ERROR_RETYPE_PASSWORD).isDisplayed();
    }

}
