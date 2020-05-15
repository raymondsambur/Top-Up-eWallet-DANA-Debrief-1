package demo.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface UserInformationLocator {

    By IMAGE_USER = MobileBy.id("userPhoto");
    By BUTTON_LOG_OUT = MobileBy.id("buttonLogout");
    By LABEL_EMAIL = MobileBy.id("textEmail");
    By LABEL_PHONE_NUMBER = MobileBy.id("textPhoneNumber");
    By LABEL_BALANCE = MobileBy.id("textBalanceNominal");
    By LABEL_USER_NAME = MobileBy.id("textName");

}
