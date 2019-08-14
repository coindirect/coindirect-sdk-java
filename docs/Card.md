# Card

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**uuid** | **String** |  |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastFourDigits** | **String** |  |  [optional]
**holderName** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
COMPLETE | &quot;COMPLETE&quot;
FAILED | &quot;FAILED&quot;
DELETED | &quot;DELETED&quot;
