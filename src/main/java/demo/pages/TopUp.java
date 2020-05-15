package demo.pages;

import demo.locators.TopUpLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class TopUp implements TopUpLocator {

    public boolean isOnTopUpPage(){
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(LABEL_TOP_UP)).isDisplayed();
    }
    public void clickBackButton(){
        androidDriver.findElement(BUTTON_BACK).click();
    }

    public void chooseNominal(String nominal){
        androidDriver.findElement(By.xpath("//android.widget.TextView[@text='"+nominal+"']")).click();
    }

    public void clickSelectPaymentButton(){
        androidDriver.findElement(BUTTON_SELECT_PAYMENT).click();
    }

}
