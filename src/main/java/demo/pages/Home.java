package demo.pages;

import demo.locators.HomeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class Home implements HomeLocator {
    public boolean isOnHomePage(){
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(LABEL_TITLE_HOME)).isDisplayed();
    }

    public void clickUserInformationButton(){
        androidDriver.findElement(BUTTON_USER_INFORMATION).click();
    }
    public void clickHomeButton(){
        androidDriver.findElement(BUTTON_HOME).click();
    }

    public void clickHistoryButton(){
        androidDriver.findElement(BUTTON_HISTORY).click();
    }

    public void clickTopUpButton(){
        androidDriver.findElement(BUTTON_TOP_UP).click();
    }
}
