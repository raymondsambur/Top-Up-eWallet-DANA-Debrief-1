package demo.pages;

import demo.locators.LoginLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class Login implements LoginLocator {

    public boolean isOnLoginPage(){
        return waitABit(LABEL_TITLE_LOGIN);
    }

    public void clickRegisterButton() {
        androidDriver.findElement(BUTTON_REGISTRATION).click();
    }

    public void inputUserEmailOrPhone(String userorphone){
        androidDriver.findElement(TEXT_FIELD_USERNAME).sendKeys(userorphone);
    }

    public void inputUserPassword(String password){
        androidDriver.findElement(TEXT_FIELD_PASSWORD).sendKeys(password);
    }

    public void clickLoginButton(){
        androidDriver.findElement(BUTTON_LOGIN).click();
    }

    public String errorMessageFieldEmpty(){
        WebElement errorMessage = androidDriver.findElement(TOAST_ERROR_MESSAGE);
        return errorMessage.getAttribute("name");
    }

    public boolean waitABit(By element) {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(element)).isDisplayed();
    }

}