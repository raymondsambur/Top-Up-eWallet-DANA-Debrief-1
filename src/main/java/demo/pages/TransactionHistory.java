package demo.pages;

import demo.functions.PageFunctions;
import demo.locators.TransactionHistoryLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class TransactionHistory implements TransactionHistoryLocator {

    PageFunctions pageFunctions = new PageFunctions();

    public boolean isOnTransactionHistoryPage(){
        return pageFunctions.waitABit(LABEL_TITLE_TRANSACTION_HISTORY).isDisplayed();
    }

    public void clickTabInProgressButton(){
        androidDriver.findElement(TAB_IN_PROGRESS).click();
    }

    public void clickTabFinishedButton(){
        androidDriver.findElement(TAB_FINISHED).click();
    }

    public boolean getImageNoTransaction(){
        return pageFunctions.waitABit(IMAGE_NO_TRANSACTION).isDisplayed();
    }


}
