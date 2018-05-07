package com.unisolar.tests.definitionSteps;

import com.unisolar.tests.steps.CommonSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class commonDefinitionSteps {

    @Steps
    private
    CommonSteps commonSteps;

    @Given("open unisolar main page")
    public void givenOpenMainPage() {
        commonSteps.openMainPage();
    }

    @When("open $anyPage from navigation menu")
    public void whenOpenCatalog(String elementName) {
        commonSteps.clickCatalog(elementName);
    }

    @Then("check $resultUrl address")
    public void thenCheckUrl(String result) {
        Assert.assertEquals("http://unisolartrade.com.ua/catalog/", result);
    }
}
