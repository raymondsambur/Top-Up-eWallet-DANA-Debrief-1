package demo.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface HomeLocator {

    By BUTTON_HOME = MobileBy.id("navigation_home");
    By BUTTON_HISTORY = MobileBy.id("navigation_history");
    By BUTTON_USER_INFORMATION = MobileBy.id("navigation_user");
    By BUTTON_TOP_UP = MobileBy.id("tv_top_up");
    By LABEL_TITLE_HOME = MobileBy.id("tv_title_app");
    By LABEL_BALANCE = MobileBy.id("tv_rp");

}
