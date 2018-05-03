package com.unisolar.tests.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://unisolartrade.com.ua/product/trina-solar-tsm-270pd05/")
public class GoodsPage extends PageObject {

    public WebElement getGoodsFromPageContentByName(String elementName) {
        return getDriver().findElement(By.xpath(String.format("//*[@id='menu-main']//a[contains(text(), \"%s\")]", elementName)));
    }

    public void clickOnButtonFromNavigationMenuByName(String elementName) {
        getGoodsFromPageContentByName(elementName).click();
    }
}
