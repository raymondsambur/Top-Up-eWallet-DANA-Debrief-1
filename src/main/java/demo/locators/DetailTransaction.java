package demo.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface DetailTransaction {

    By LABEL_TITLE_DETAIL_TRANSACTION = MobileBy.id("");
    By BUTTON_BACK = MobileBy.id("");
    By LABEL_BALANCE_AMOUNT = MobileBy.id("");
    By LABEL_TRANSACTION_STATUS = MobileBy.id("");
    By LABEL_TRANSACTION_DATE = MobileBy.id("");
    By LABEL_TRANSACTION_PAYMENT_METHOD = MobileBy.id("");
    By LABEL_TRANSACTION_INVOICE_NUMBER = MobileBy.id("");
    By BUTTON_CONFIRM_PAYMENT = MobileBy.id("");
    By IMAGE_TRANSACTION_PHOTO = MobileBy.id("");

}
