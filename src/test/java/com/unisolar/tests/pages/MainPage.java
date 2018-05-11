package com.unisolar.tests.pages;

import lombok.Getter;
import lombok.Setter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Getter
@Setter
@DefaultUrl("http://unisolartrade.com.ua/")
public class MainPage extends PageObject {
    private WebElement search = getDriver().findElement(By.xpath("//*[contains(@class, 'header_form header_form_search')]"));

    public WebElement getButtonFromNavigationMenu(String elementName) {
        return getDriver().findElement(By.xpath(String.format("//*[@id='menu-main']//a[contains(text(), '%s')]", elementName)));
    }

    public WebElement getSearchField() {
        return search;
    }


    public void clickOnButtonFromNavigationMenuByName(String elementName) {
        getButtonFromNavigationMenu(elementName).click();
    }

    public void clickOnSearchField() {
        getSearchField().click();
    }
}