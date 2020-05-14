package demo.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface TransactionHistoryLocator {

    By LABEL_TITLE_TRANSACTION_HISTORY = MobileBy.id("");
    By TAB_UNFINISHED = MobileBy.id("");
    By TAB_FINISHED = MobileBy.id("");
    By BOX_DATA_TRANSACTION = MobileBy.id("");
    By LABEL_DATE = MobileBy.id("");
    By LABEL_TOP_UP_BY = MobileBy.id("");
    By LABEL_INVOICE_ID = MobileBy.id("");
    By LABEL_NOMINAL = MobileBy.id("");
    By LABEL_STATUS = MobileBy.id("");

}
