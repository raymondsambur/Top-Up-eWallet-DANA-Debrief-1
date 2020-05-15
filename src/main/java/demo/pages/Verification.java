package demo.pages;

import demo.locators.VerificationLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class Verification implements VerificationLocator {

    public boolean openVerificationPage() {
        return waitABit(LABEL_TITLE_VERIFICATION).isDisplayed();
    }

    public void inputOTPCode(String otp){
        waitABit(TEXT_FIELD_OTP).sendKeys(otp);
    }

    public void clickProceedButton(){
        androidDriver.findElement(BUTTON_PROCEED).click();
    }

    public void clickBackButton(){
        androidDriver.findElement(BUTTON_BACK).click();
    }

    public String getTimer(){
        return waitABit(LABEL_TIMER).getText();
    }

    public String getPhoneEmail(){
        return waitABit(LABEL_PHONE_EMAIL).getText();
    }

    public WebElement waitABit(By element) {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

}
