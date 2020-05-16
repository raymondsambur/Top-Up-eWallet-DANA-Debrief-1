package demo.pages;

import demo.functions.PageFunctions;
import demo.locators.UserInformationLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class UserInformation implements UserInformationLocator {

    PageFunctions pageFunctions = new PageFunctions();

    public boolean isOnUserInformationPage() {
        return pageFunctions.waitABit(IMAGE_USER).isDisplayed();
    }

    public String getUsername(){
        return pageFunctions.waitABit(LABEL_USER_NAME).getText();
    }

    public String getEmail(){
        return pageFunctions.waitABit(LABEL_EMAIL).getText();
    }

    public String getPhoneNumber(){
        return pageFunctions.waitABit(LABEL_PHONE_NUMBER).getText();
    }

    public String getBalance(){
        return pageFunctions.waitABit(LABEL_BALANCE).getText();
    }

    public void clickLogOutButton(){
        androidDriver.findElement(BUTTON_LOG_OUT).click();
    }

}
