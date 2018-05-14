package core;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Helper {
    public static void switchToTheNextTab() {
        WebDriver driver = getDriver();
        driver.getWindowHandles().forEach(windHandle -> driver.switchTo().window(windHandle));
    }

    public static String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }

    public static String findPdfName(String text) {
        /*Pattern pattern = Pattern.compile("([a-zA-Z0-9_-]+)\\.(pdf)");
        Matcher matcher = pattern.matcher(text);
        return matcher.toMatchResult().;*/
        String[] partsOfTheUrl = text.split("/");
        return partsOfTheUrl[partsOfTheUrl.length - 1];
    }

    public static void setValueForElement(String value, WebElement element) {
        new Actions(getDriver()).sendKeys(element, value).perform();
    }


}
