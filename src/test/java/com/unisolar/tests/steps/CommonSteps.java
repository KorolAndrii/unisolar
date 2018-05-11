package com.unisolar.tests.steps;

import com.unisolar.tests.pages.MainPage;
import lombok.Getter;
import lombok.Setter;
import net.thucydides.core.annotations.Step;
@Getter
@Setter
public class CommonSteps {

    protected MainPage mainPage;

    @Step
    public void openMainPage() {
        mainPage.open();
    }

    @Step
    public void clickCatalog(String elementName) {
        mainPage.clickOnButtonFromNavigationMenuByName(elementName);
    }
}