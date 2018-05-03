package com.unisolar.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class DriverExtension {
    public static void SetValueForElement(WebElement element, String value) {
        new Actions(getDriver()).sendKeys().perform();
    }
}
