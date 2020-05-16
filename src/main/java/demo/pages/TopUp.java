package demo.pages;

import demo.functions.PageFunctions;
import demo.locators.TopUpLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class TopUp implements TopUpLocator {

    PageFunctions pageFunctions = new PageFunctions();

    public boolean isOnTopUpPage(){
        return pageFunctions.waitABit(LABEL_TOP_UP).isDisplayed();
    }
    public void clickBackButton(){
        androidDriver.findElement(BUTTON_BACK).click();
    }

    public void chooseNominal(String nominal){
        pageFunctions.waitABit(By.xpath("//android.widget.TextView[@text='"+nominal+"']")).click();
    }

    public void clickSelectPaymentButton(){
        androidDriver.findElement(BUTTON_SELECT_PAYMENT).click();
    }

}
