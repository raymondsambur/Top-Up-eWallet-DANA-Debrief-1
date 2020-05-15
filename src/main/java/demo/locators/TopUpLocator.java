package demo.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface TopUpLocator {

    By LABEL_TOP_UP = MobileBy.xpath("//android.widget.TextView[@text='Top Up']");
    By BUTTON_SELECT_PAYMENT = MobileBy.id("btn_select_payment");
    By BUTTON_BACK = MobileBy.xpath("//android.widget.ImageButton");
    //Nominal
    By CARD_NOMINAL_10 = MobileBy.xpath("//androidx.cardview.widget.CardView[1]");
    By CARD_NOMINAL_20 = MobileBy.xpath("//androidx.cardview.widget.CardView[2]");
    By CARD_NOMINAL_50 = MobileBy.xpath("//androidx.cardview.widget.CardView[3]");
    By CARD_NOMINAL_100 = MobileBy.xpath("//androidx.cardview.widget.CardView[4]");
    By CARD_NOMINAL_200 = MobileBy.xpath("//androidx.cardview.widget.CardView[5]");
    By CARD_NOMINAL_500 = MobileBy.xpath("//androidx.cardview.widget.CardView[6]");

}
