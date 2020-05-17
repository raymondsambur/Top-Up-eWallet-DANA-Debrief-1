package demo.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface TopUpLocator {

    By LABEL_TOP_UP = MobileBy.xpath("//android.widget.TextView[@text='Choose Top Up Variant']");
    By BUTTON_SELECT_PAYMENT = MobileBy.id("btn_select_payment");
    By BUTTON_BACK = MobileBy.xpath("//android.widget.ImageButton");

}
