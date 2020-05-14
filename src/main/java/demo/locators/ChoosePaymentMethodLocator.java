package demo.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface ChoosePaymentMethodLocator {

    By LABEL_TITLE = MobileBy.id("");
    By BUTTON_BACK = MobileBy.id("");
    By CARD_PAYMENT_MERCHANT = MobileBy.id("");
    By CARD_PAYMENT_BANK = MobileBy.id("");
    By CARD_MERCHANT_NAME = MobileBy.id("");
    By CARD_MERCHANT_ICON = MobileBy.id("");
    By CARD_BANK_NAME = MobileBy.id("");
    By CARD_BANK_ICON = MobileBy.id("");

    //Detail Pop Up
    By BUTTON_EXIT = MobileBy.id("");
    By LABEL_NOMINAL = MobileBy.id("");
    By LABEL_TRANSFER_TYPE = MobileBy.id("");
    By LABEL_PAYMENT_NAME = MobileBy.id("");
    By BUTTON_PAY = MobileBy.id("");

}
