package com.unisolar.tests.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://unisolartrade.com.ua/")
public class MainPage extends PageObject {
    public WebElement getButtonFromNavigationMenu(String elementName) {
        return getDriver().findElement(By.xpath(String.format("//*[@id='menu-main']//a[contains(text(), '%s')]", elementName)));
    }

    public void clickOnButtonFromNavigationMenuByName(String elementName) {
        getButtonFromNavigationMenu(elementName).click();
    }

    public WebElement findSearchField() {
        return $("//*[contains(@placeholder, 'Поиск товаров')]");
    }
}