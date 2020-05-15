package demo.pages;

import demo.locators.UserInformationLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class UserInformation implements UserInformationLocator {
    public boolean isOnUserInformationPage() {
        return waitABit(IMAGE_USER).isDisplayed();
    }

    public String getUsername(){
        return waitABit(LABEL_USER_NAME).getText();
    }

    public String getEmail(){
        return waitABit(LABEL_EMAIL).getText();
    }

    public String getPhoneNumber(){
        return waitABit(LABEL_PHONE_NUMBER).getText();
    }

    public String getBalance(){
        return waitABit(LABEL_BALANCE).getText();
    }

    public void clickLogOutButton(){
        androidDriver.findElement(BUTTON_LOG_OUT).click();
    }

    public WebElement waitABit(By element) {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }
}
