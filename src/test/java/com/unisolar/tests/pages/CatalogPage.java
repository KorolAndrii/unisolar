package com.unisolar.tests.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CatalogPage extends PageObject {

    public WebElement getGoodsFromPageContentByName(String elementName) {
        return getDriver().findElement(By.xpath(String.format("//a[contains(text(), '%s')]", elementName)));
    }

    public void clickOnGoodsByName(String elementName) {
        getGoodsFromPageContentByName(elementName).click();
    }
}

