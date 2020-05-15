package demo.pages;

import demo.locators.DetailTransactionLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class DetailTransaction implements DetailTransactionLocator {

    public boolean isOnDetailTransactionPage(){
        return waitABit(LABEL_TITLE_DETAIL_TRANSACTION);
    }

    public boolean waitABit(By element) {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(element)).isDisplayed();
    }

}
