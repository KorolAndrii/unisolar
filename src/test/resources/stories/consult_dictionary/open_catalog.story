Scenario: Unisolar check catalog

Given open unisolar main page
When download datasheet of the goods by goods <elementName> from <goodsName>
Then check <resultUrl> address
Examples:
|elementName        |goodsName          |
|Каталог товаров    |Trina Solar TSM-270|

