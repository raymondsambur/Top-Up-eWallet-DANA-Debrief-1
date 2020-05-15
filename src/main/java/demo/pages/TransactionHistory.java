package demo.pages;

import demo.locators.TransactionHistoryLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class TransactionHistory implements TransactionHistoryLocator {

    public boolean isOnTransactionHistoryPage(){
        return waitABit(LABEL_TITLE_TRANSACTION_HISTORY).isDisplayed();
    }

    public void clickTabInProgressButton(){
        androidDriver.findElement(TAB_IN_PROGRESS).click();
    }

    public void clickTabFinishedButton(){
        androidDriver.findElement(TAB_FINISHED).click();
    }

    public boolean getImageNoTransaction(){
        return waitABit(IMAGE_NO_TRANSACTION).isDisplayed();
    }



    public WebElement waitABit(By element) {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

}
