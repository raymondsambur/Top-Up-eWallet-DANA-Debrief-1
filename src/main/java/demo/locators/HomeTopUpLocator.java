package demo.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface HomeTopUpLocator {

    //General
    By BUTTON_HOME = MobileBy.id("navigation_home");
    By BUTTON_HISTORY = MobileBy.id("navigation_history");
    By BUTTON_USER_INFORMATION = MobileBy.id("navigation_user");

    //Top Up Menu
    By LABEL_TITLE_TOP_UP = MobileBy.id("toolbar_title");
    By CARD_CATALOG = MobileBy.id("card_catalog");
    By LABEL_NOMINAL = MobileBy.id("tv_balance_catalog");
    By BUTTON_SELECT_PAYMENT = MobileBy.id("btn_select_payment");
    By LABEL_NAME = MobileBy.id("tv_name");
    By LABEL_BALANCE = MobileBy.id("tv_balance");

}
