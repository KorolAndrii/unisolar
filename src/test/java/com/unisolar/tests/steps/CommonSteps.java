package com.unisolar.tests.steps;

import com.unisolar.tests.pages.MainPage;
import net.thucydides.core.annotations.Step;

public class CommonSteps {

    private MainPage mainPage;

    @Step
    public void openMainPage() {
        mainPage.open();
    }

    @Step
    public void clickCatalog(String elementName) {
        mainPage.clickOnButtonFromNavigationMenuByName(elementName);
    }

}