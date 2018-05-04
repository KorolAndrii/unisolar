package com.unisolar.tests.definitionSteps;

import com.unisolar.tests.steps.DownloadSteps;
import org.jbehave.core.annotations.When;

public class DownloadDefinitionSteps extends commonDefinitionSteps{

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
    }


}
