package com.unisolar.tests.definitionSteps;

import com.unisolar.tests.pages.CatalogPage;
import com.unisolar.tests.steps.CommonSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class commonDifinitionSteps {

    private CommonSteps commonSteps;

    @Given("open unisolar main page")
    public void givenOpenMainPage() {
        commonSteps.openMainPage();
    }

    @When("open $somePage")
    public void whenOpenCatalog(String elementName) {
        commonSteps.clickCatalog(elementName);
    }

    @Then("check $resultUrl adress")
    public void thenCheckUrl(String result) {
        Assert.assertEquals("http://unisolartrade.com.ua/catalog/", result);
    }
}
