package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
        String[] partsOfTheUrl = text.split("/");
        return partsOfTheUrl[partsOfTheUrl.length - 1];
    }

    public static void SetValueForElement(WebElement element, String value) {
        new Actions(getDriver()).sendKeys(element,value).perform();
    }
}
