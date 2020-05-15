package demo.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface DetailTransactionLocator {

    By LABEL_TITLE_DETAIL_TRANSACTION = MobileBy.xpath("//android.widget.TextView[@text='Detail Transaction']");
    By BUTTON_BACK = MobileBy.xpath("//android.widget.ImageButton");

    //Payment Information
    By LABEL_BALANCE_AMOUNT = MobileBy.id("tv_balance");
    By LABEL_TRANSACTION_STATUS = MobileBy.id("tv_status");
    By LABEL_TRANSACTION_DATE = MobileBy.id("tv_date");
    By LABEL_TRANSACTION_PAYMENT_TYPE = MobileBy.id("tv_payment_type");
    By LABEL_TRANSACTION_PAYMENT_METHOD = MobileBy.id("tv_payment_method");
    By LABEL_TRANSACTION_INVOICE_NUMBER = MobileBy.id("tv_invoice");
    By LABEL_TRANSACTION_TIMER = MobileBy.id("tv_timer");

    By BUTTON_CONFIRM_PAYMENT = MobileBy.id("btn_confirm");
    By IMAGE_TRANSACTION_PHOTO = MobileBy.id("img_prof_payment");
    By BUTTON_IMAGE_POP_UP = MobileBy.id("imagePopUp");

    //QR Code Section
    By LABEL_TITLE_QR = MobileBy.id("tv_app_name");
    By LABEL_USERNAME = MobileBy.id("tv_name_user");
    By IMAGE_QR_CODE = MobileBy.id("img_qr_code");
    By BUTTON_QR_BACK = MobileBy.id("img_back");

    //Upload Receipt Section
    By LABEL_TITLE_UPLOAD_RECEIPT = MobileBy.xpath("//android.widget.TextView[@text='Confirm Upload Receipt']");
    By BUTTON_UPLOAD_RECEIPT_BACK = MobileBy.xpath("//android.widget.ImageButton");
    By IMAGE_BUTTON_TAKE_PHOTO = MobileBy.id("img_receipt");
    By BUTTON_CONFIRM_UPLOAD = MobileBy.id("btn_confirm");
    By BUTTON_TAKE_FROM_CAMERA = MobileBy.id("tv_camera");
    By BUTTON_CHOOSE_FROM_GALLERY = MobileBy.id("tv_gallery");
    By BUTTON_TAKE_PHOTO = MobileBy.id("img_take_photo");
    By BUTTON_TAKE_PHOTO_BACK = MobileBy.xpath("//android.widget.ImageButton");
    By BUTTON_CHOOSE_FILE_CONFIRM = MobileBy.id("button1");
    By BUTTON_CHOOSE_FILE_CANCEL = MobileBy.id("button2");
}
