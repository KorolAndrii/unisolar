package com.unisolar.tests.steps;

import com.unisolar.tests.pages.CatalogPage;
import com.unisolar.tests.pages.GoodsPage;


public class DownloadSteps extends CommonSteps {
     private CatalogPage catalogPage;
     private GoodsPage goodsPage;

    public void clickOnGoodsByName(String goodsName) {
        catalogPage.clickOnGoodsByName(goodsName);
    }

    public void clickOnDownload() {
        goodsPage.clickOnDownloadButton();
    }
}
