package com.unisolar.tests.steps;

import com.unisolar.tests.pages.MainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class CommonSteps {

     MainPage mainPage;

    @Step
    public void openMainPage() {
        mainPage.open();
    }

    @Step
    public void clickCatalog(String elementName) {
        mainPage.clickOnButtonFromNavigationMenuByName(elementName);
    }

}