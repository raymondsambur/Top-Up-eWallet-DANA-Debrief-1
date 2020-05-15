package demo.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface LoginLocator {

    By LABEL_TITLE_LOGIN = MobileBy.id("loginTitle");
    By TEXT_FIELD_USERNAME = MobileBy.id("inputUsername");
    By TEXT_FIELD_PASSWORD = MobileBy.id("inputPassword");
    By BUTTON_LOGIN = MobileBy.id("btnLogin");
    By BUTTON_REGISTRATION = MobileBy.id("textRegister");
    By TOAST_ERROR_MESSAGE = MobileBy.xpath("//android.widget.Toast[1]");
}
