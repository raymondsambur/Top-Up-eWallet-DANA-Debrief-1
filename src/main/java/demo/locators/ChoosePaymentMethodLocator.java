package demo.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface ChoosePaymentMethodLocator {

    By LABEL_TITLE_CHOOSE_PAYMENT_TYPE = MobileBy.xpath("//android.widget.TextView[@text='Choose Payment Type']");
    By BUTTON_BACK = MobileBy.xpath("//android.widget.ImageButton");

    //Detail Pop Up
    By LABEL_TITLE_PURCHASE_DETAIL = MobileBy.id("tv_detail_purchase");
    By BUTTON_EXIT = MobileBy.id("img_close");
    By LABEL_NOMINAL = MobileBy.id("tv_balance");
    By LABEL_PAYMENT_TYPE = MobileBy.id("tv_payment_type");
    By LABEL_PAYMENT_NAME = MobileBy.id("tv_payment");
    By BUTTON_PAY = MobileBy.id("btn_purchase");

}
