package com.unisolar.tests.steps;

import com.unisolar.tests.pages.CatalogPage;
import com.unisolar.tests.pages.MainPage;
import core.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class SearchSteps {
    private WebElement searchField;
    private MainPage mainPage;
    private CatalogPage catalogPage;

    public void setTextInSearchField(String text) {
        searchField = mainPage.findSearchField();
        Helper.setValueForElement(text, searchField);
    }

    public void pushEnter() {
        searchField.sendKeys(Keys.ENTER);
    }

    public List<String> getNamesOfFoundedGoods() {
        return catalogPage.getWebElements().stream().map(element -> element.getText()).collect(toList());
    }
}
