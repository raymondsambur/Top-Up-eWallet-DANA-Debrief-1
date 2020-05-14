package demo.pages;

import demo.locators.RegisterLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class Register implements RegisterLocator {

    public boolean openRegisterPage() {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(LABEL_TITLE_REGISTRATION)).isDisplayed();
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

}
