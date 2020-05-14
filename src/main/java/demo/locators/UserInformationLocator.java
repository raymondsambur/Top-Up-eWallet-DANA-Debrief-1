package demo.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface UserInformationLocator {

    By LABEL_TITLE_USER_INFORMATION = MobileBy.id("");
    By IMAGE_USER = MobileBy.id("");
    By BUTTON_LOG_OUT = MobileBy.id("");
    By LABEL_EMAIL = MobileBy.id("");
    By LABEL_PHONE_NUMBER = MobileBy.id("");
    By LABEL_BALANCE = MobileBy.id("");
    By LABEL_FIRST_NAME = MobileBy.id("");
    By LABEL_LAST_NAME = MobileBy.id("");

}
