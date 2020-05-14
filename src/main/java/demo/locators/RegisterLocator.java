package demo.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface RegisterLocator {

    By LABEL_TITLE_REGISTRATION = MobileBy.id("registerTitle");
    By TEXT_FIELD_FIRST_NAME = MobileBy.id("inputRegisterFirstName");
    By TEXT_FIELD_LAST_NAME = MobileBy.id("inputRegisterLastName");
    By TEXT_FIELD_EMAIL = MobileBy.id("inputRegisterEmail");
    By TEXT_FIELD_PHONE_NUMBER = MobileBy.id("inputRegisterPhone");
    By TEXT_FIELD_PASSWORD = MobileBy.id("inputRegisterPassword");
    By TEXT_FIELD_RETYPE_PASSWORD = MobileBy.id("inputRegisterPasswordVerify");
    By BUTTON_REGISTER = MobileBy.id("buttonRegister");
    By BUTTON_BACK = MobileBy.id("back_button_sign_up");

    //Error Message
    By LABEL_ERROR_FIRST_NAME = MobileBy.xpath("//android.widget.LinearLayout[1]/android.widget.LinearLayout[1]//android.widget.TextView");
    By LABEL_ERROR_LAST_NAME = MobileBy.xpath("//android.widget.LinearLayout[2]/android.widget.LinearLayout[1]//android.widget.TextView");
    By LABEL_ERROR_EMAIL = MobileBy.xpath("//android.widget.LinearLayout[3]/android.widget.LinearLayout[1]//android.widget.TextView");
    By LABEL_ERROR_PHONE_NUMBER = MobileBy.xpath("//android.widget.LinearLayout[4]/android.widget.LinearLayout[1]//android.widget.TextView");
    By LABEL_ERROR_PASSWORD = MobileBy.xpath("//android.widget.LinearLayout[5]/android.widget.LinearLayout[1]//android.widget.TextView");
    By LABEL_ERROR_RETYPE_PASSWORD = MobileBy.xpath("//android.widget.LinearLayout[6]/android.widget.LinearLayout[1]//android.widget.TextView");

}
