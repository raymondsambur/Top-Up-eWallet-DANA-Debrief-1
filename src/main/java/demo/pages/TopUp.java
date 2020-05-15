package demo.pages;

import demo.locators.TopUpLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class TopUp implements TopUpLocator {

    public boolean isOnTopUpPage(){
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(LABEL_TOP_UP)).isDisplayed();
    }

    public void clickNominal10Button(){
        androidDriver.findElement(CARD_NOMINAL_10).click();
    }

    public void clickNominal20Button(){
        androidDriver.findElement(CARD_NOMINAL_20).click();
    }

    public void clickNominal50Button(){
        androidDriver.findElement(CARD_NOMINAL_50).click();
    }

    public void clickNominal100Button(){
        androidDriver.findElement(CARD_NOMINAL_100).click();
    }

    public void clickNominal200Button(){
        androidDriver.findElement(CARD_NOMINAL_200).click();
    }

    public void clickNominal500Button(){
        androidDriver.findElement(CARD_NOMINAL_500).click();
    }

    public void clickSelectPaymentButton(){
        androidDriver.findElement(BUTTON_SELECT_PAYMENT).click();
    }

    public void clickBackButton(){
        androidDriver.findElement(BUTTON_BACK).click();
    }

    public void chooseNominal(String nominal){

    }

}
