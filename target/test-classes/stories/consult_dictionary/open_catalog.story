Scenario: Unisolar check catalog

Given open unisolar main page
When download datasheet of the goods by goods <elementName> from <goodsName>
Then compare current  pdf name with <pdfName>
Examples:
|elementName        |goodsName          |pdfName                               |
|Каталог товаров    |Trina Solar TSM-270|Trinasolar_Honey_TSM-PD05_255-270W.pdf|

