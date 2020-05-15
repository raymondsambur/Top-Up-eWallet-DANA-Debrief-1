package demo.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface TransactionHistoryLocator {

    By LABEL_TITLE_TRANSACTION_HISTORY = MobileBy.id("titleHistory");
    By TAB_IN_PROGRESS = MobileBy.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc='In Progress']");
    By TAB_FINISHED = MobileBy.id("//androidx.appcompat.app.ActionBar.Tab[@content-desc='Finished']");
    By IMAGE_NO_TRANSACTION = MobileBy.xpath("//android.widget.TextView[@text='No Transaction Yet']");
    By BOX_DATA_TRANSACTION = MobileBy.id("");
    By LABEL_DATE = MobileBy.id("");
    By LABEL_TOP_UP_BY = MobileBy.id("");
    By LABEL_INVOICE_ID = MobileBy.id("");
    By LABEL_NOMINAL = MobileBy.id("");
    By LABEL_STATUS = MobileBy.id("");

}
