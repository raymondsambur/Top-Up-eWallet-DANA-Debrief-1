package demo.pages;

import demo.locators.LoginLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class Login implements LoginLocator {

    public boolean isOnLoginPage(){
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(LABEL_TITLE_LOGIN)).isDisplayed();
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


}