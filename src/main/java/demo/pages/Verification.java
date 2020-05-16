package demo.pages;

import demo.functions.PageFunctions;
import demo.locators.VerificationLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class Verification implements VerificationLocator {

    PageFunctions pageFunctions = new PageFunctions();

    public boolean openVerificationPage() {
        return pageFunctions.waitABit(LABEL_TITLE_VERIFICATION).isDisplayed();
    }

    public void inputOTPCode(String otp){
        pageFunctions.waitABit(TEXT_FIELD_OTP).sendKeys(otp);
    }

    public void clickProceedButton(){
        androidDriver.findElement(BUTTON_PROCEED).click();
    }

    public void clickBackButton(){
        androidDriver.findElement(BUTTON_BACK).click();
    }

    public String getTimer(){
        return pageFunctions.waitABit(LABEL_TIMER).getText();
    }

    public String getPhoneEmail(){
        return pageFunctions.waitABit(LABEL_PHONE_EMAIL).getText();
    }


}
