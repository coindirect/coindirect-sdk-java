# ExchangeOrderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**price** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**wallet** | [**Wallet**](Wallet.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**side** | [**SideEnum**](#SideEnum) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
LIMIT | &quot;LIMIT&quot;
MARKET | &quot;MARKET&quot;

<a name="SideEnum"></a>
## Enum: SideEnum
Name | Value
---- | -----
BUY | &quot;BUY&quot;
SELL | &quot;SELL&quot;
