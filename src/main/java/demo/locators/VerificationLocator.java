package demo.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface VerificationLocator {

    By LABEL_TITLE_VERIFICATION = MobileBy.id("tv_verify");
    By TEXT_FIELD_OTP = MobileBy.id("otp_view");
    By BUTTON_PROCEED = MobileBy.id("tv_validate");
    By BUTTON_BACK = MobileBy.id("img_back");
    By LABEL_TIMER = MobileBy.id("tv_timer");
    By LABEL_PHONE_EMAIL = MobileBy.id("tv_email_phone");

    //Email Verification Page
    By LABEL_TITLE_FORGOT_PASSWORD = MobileBy.id("forgotPasswordTitle");
    By TEXT_FIELD_EMAIL = MobileBy.id("inputEmailForgotPassword");
    By BUTTON_VERIFY = MobileBy.id("buttonVerifyEmailForPassword");

}
