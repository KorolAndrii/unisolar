package com.unisolar.tests.definitionSteps;

import com.unisolar.tests.steps.SearchSteps;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.SoftAssertions;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchDefinitionSteps extends CommonDefinitionSteps {
    @Steps
    private SearchSteps searchSteps;

    @When("set name of '$anygoods' to searchfield and push enter")
    public void whenSetTextIntoSearchFieldAndPushEnter(String anygoods) {
        searchSteps.setTextInSearchField(anygoods);
        searchSteps.pushEnter();
    }

    @Then("compare the list of foundeGoodsList with the entered text '$text'")
    public void thanCompareNameOfGoodsIsFoundedWithSettedName(String text) {
        SoftAssertions soft = new SoftAssertions();
        searchSteps.getNamesOfFoundedGoods().forEach(element -> soft.assertThat(element).containsIgnoringCase(text));
        soft.assertAll();
    }
}
