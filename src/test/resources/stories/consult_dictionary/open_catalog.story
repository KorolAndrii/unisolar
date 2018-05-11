Scenario: Unisolar check catalog

Given open unisolar main page
When download datasheet of the goods by goods <elementName> from <goodsName>
Then compare current  pdf name with <pdfName>
Examples:
|elementName        |goodsName               |pdfName                               |
|Каталог товаров    |Trina Solar TSM-270    |Trinasolar_Honey_TSM-PD05_255-270W.pdf|
|Каталог товаров    |Challenger A12-50      |Trinasolar_Honey_TSM-PD05_255-270W.pdf|
|Каталог товаров    |Рейка Renusol VS+      |Trinasolar_Honey_TSM-PD05_255-270W.pdf|
|Каталог товаров    |Azzurro ZS3-15.000TL-S2|Trinasolar_Honey_TSM-PD05_255-270W.pdf|
|Каталог товаров    |Steca Tarom 245 (12/24V)|Trinasolar_Honey_TSM-PD05_255-270W.pdf|
|Каталог товаров    |Victron BlueSolar MPPT 75/15 (12/24V)|Trinasolar_Honey_TSM-PD05_255-270W.pdf|
|Каталог товаров    |Комплект оборудования для солнечной электрической станции под зеленый тариф 10 кВт|Trinasolar_Honey_TSM-PD05_255-270W.pdf|
|Каталог товаров    |Trina Solar TSM-270|Trinasolar_Honey_TSM-PD05_255-270W.pdf|
|Каталог товаров    |Trina Solar TSM-270|Trinasolar_Honey_TSM-PD05_255-270W.pdf|
|Каталог товаров    |Trina Solar TSM-270|Trinasolar_Honey_TSM-PD05_255-270W.pdf|


