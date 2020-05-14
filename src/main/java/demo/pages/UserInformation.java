package demo.pages;

import demo.locators.UserInformationLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class UserInformation implements UserInformationLocator {
    public boolean isOnUserInformationPage() {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(LABEL_TITLE_USER_INFORMATION)).isDisplayed();
    }
}
