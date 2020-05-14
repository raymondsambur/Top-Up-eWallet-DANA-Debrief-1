package demo.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface VerificationLocator {

    By LABEL_TITLE_VERIFICATION = MobileBy.id("tv_verify");
    By TEXT_FIELD = MobileBy.id("otp_view");
    By BUTTON_PROCEED = MobileBy.id("tv_validate");
    By BUTTON_BACK = MobileBy.id("img_back");
    By LABEL_TIMER = MobileBy.id("");

}
