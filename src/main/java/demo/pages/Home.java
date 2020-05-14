package demo.pages;

import demo.locators.HomeTopUpLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class Home implements HomeTopUpLocator {
    public boolean isOnHomePage(){
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(LABEL_NAME)).isDisplayed();
    }
}
