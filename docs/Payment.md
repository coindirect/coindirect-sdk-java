# Payment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**reference** | **String** |  |  [optional]
**uuid** | **String** |  |  [optional]
**dateCreated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**quote** | [**Quote**](Quote.md) |  |  [optional]
**currencies** | **List&lt;String&gt;** |  |  [optional]
**payInstruction** | [**PayInstruction**](PayInstruction.md) |  |  [optional]
**merchantId** | **String** |  |  [optional]
**returnUrl** | **String** |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
IN | &quot;IN&quot;
OUT | &quot;OUT&quot;

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
COMPLETE | &quot;COMPLETE&quot;
CANCELLED | &quot;CANCELLED&quot;
PROCESSING | &quot;PROCESSING&quot;
