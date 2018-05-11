package com.unisolar.tests.steps;

import com.unisolar.tests.pages.MainPage;
import core.Helper;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchSteps extends CommonSteps{
    private MainPage mainPage;

    public void setSearch(String text) {
        Helper.SetValueForElement(mainPage.getSearchField(), text);
    }

    public void pushSearch() {

    }
}
