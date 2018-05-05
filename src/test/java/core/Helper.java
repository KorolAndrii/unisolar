package core;

import org.openqa.selenium.WebDriver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Helper {
    public static void switchToTheNextTab() {
        WebDriver driver =  getDriver();
        driver.getWindowHandles().forEach(windHandle -> driver.switchTo().window(windHandle));
    }

    public static String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }

    public static String findPdfName(String text) {
        Pattern pattern = Pattern.compile("([a-zA-Z0-9_-]+)\\.(pdf)");
        Matcher matcher = pattern.matcher(text);
        return matcher.group();
    }
}
