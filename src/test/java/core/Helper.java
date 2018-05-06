package core;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Collections;
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
        /*Pattern pattern = Pattern.compile("([a-zA-Z0-9_-]+)\\.(pdf)");
        Matcher matcher = pattern.matcher(text);
        return matcher.toMatchResult().;*/
        String[] partsOfTheUrl = text.split("/");
        return partsOfTheUrl[partsOfTheUrl.length-1];
    }

    public static void main(String[] args) {
        System.out.println(findPdfName("http://unisolartrade.com.ua/wp-content/uploads/Trinasolar_Honey_TSM-PD05_255-270W.pdf"));
    }
}
