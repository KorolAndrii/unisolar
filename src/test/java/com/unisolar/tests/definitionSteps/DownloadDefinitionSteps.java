package com.unisolar.tests.definitionSteps;

import com.unisolar.tests.steps.DownloadSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static core.Helper.*;
import static org.assertj.core.api.Assertions.assertThat;

public class DownloadDefinitionSteps extends CommonDefinitionSteps {
    @Steps
    private
    DownloadSteps downloadSteps;

    @When("find $anyGood by name from content page and click on it")
    public void whenOpenGoods(String goodsName) {
        downloadSteps.clickOnGoodsByName(goodsName);
    }

    @When("try to download datasheet of the current goods")
    public void whenDownloadDatasheet() {
        downloadSteps.clickOnDownload();
    }

    @When("download datasheet of the goods by goods $elementName from $goodsName")
    public void whenDownloadDatasheetByName(String elementName, String goodsName) {
        whenOpenCatalog(elementName);
        whenOpenGoods(goodsName);
        whenDownloadDatasheet();
        switchToTheNextTab();
    }

    @Then("compare current  pdf name with $pdfName")
    public void thenCheckUrl(String pdfName) {
        assertThat(pdfName).isEqualTo(findPdfName(getCurrentUrl()));
    }

}
