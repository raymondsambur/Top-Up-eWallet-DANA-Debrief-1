package demo.pages;

import demo.locators.LoginLocator;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class Login implements LoginLocator {

    public void clickRegisterButton() {
        androidDriver.findElement(BUTTON_REGISTRATION).click();
    }
}