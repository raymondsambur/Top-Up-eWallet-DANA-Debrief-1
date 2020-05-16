package demo.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.androiddriver.AndroidDriverInstance.androidDriver;

public class PageFunctions {

    public WebElement waitABit(By element) {
        WebDriverWait wait = new WebDriverWait(androidDriver, 50);
        return wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

}
