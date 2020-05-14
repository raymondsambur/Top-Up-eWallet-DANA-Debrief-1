package demo.pages;

import demo.locators.VerificationLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class Verification implements VerificationLocator {

    public boolean openVerificationPage() {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(LABEL_TITLE_VERIFICATION)).isDisplayed();

    }

}
