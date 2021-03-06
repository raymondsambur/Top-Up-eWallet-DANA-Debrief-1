package demo.pages;

import demo.functions.PageFunctions;
import demo.locators.ChoosePaymentMethodLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class ChoosePaymentMethod implements ChoosePaymentMethodLocator {

    PageFunctions pageFunctions = new PageFunctions();

    public boolean isOnChoosePaymentMethod(){
        return pageFunctions.waitABit(LABEL_TITLE_CHOOSE_PAYMENT_TYPE).isDisplayed();
    }

    public boolean isOnPopUpPurchaseDetail(){
        return  pageFunctions.waitABit(LABEL_TITLE_PURCHASE_DETAIL).isDisplayed();
    }

    public void clickPaymentMethodButton(String paymentMethod){
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='"+paymentMethod+"']")).click();
    }

    public void clickBackButton(){
        androidDriver.findElement(BUTTON_BACK).click();
    }

    public void clickExitButton(){
        androidDriver.findElement(BUTTON_EXIT).click();
    }

    public void clickPayButton(){
        androidDriver.findElement(BUTTON_PAY).click();
    }

    public String returnPaymentType(){
        return androidDriver.findElement(LABEL_PAYMENT_TYPE).getText();
    }

    public String returnPaymentName(){
        return androidDriver.findElement(LABEL_PAYMENT_NAME).getText();
    }

    public String returnBalance(){
        return androidDriver.findElement(LABEL_NOMINAL).getText();
    }



}
