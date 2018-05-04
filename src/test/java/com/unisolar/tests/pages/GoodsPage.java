package com.unisolar.tests.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoodsPage extends PageObject {

    public WebElement getDocumentationDownloadButton() {
        return getDriver().findElement(By.xpath("//a[contains(text(), 'Скачать тех паспорт')]"));
    }

    public void clickOnDownloadButton() {
        getDocumentationDownloadButton().click();
    }
}
