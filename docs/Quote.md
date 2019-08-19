# Quote

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**from** | **String** |  |  [optional]
**to** | **String** |  |  [optional]
**amountIn** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**amountOut** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**price** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**quoteStatus** | [**QuoteStatusEnum**](#QuoteStatusEnum) |  |  [optional]
**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) |  |  [optional]
**acceptanceExpiryDate** | **Long** |  |  [optional]
**paymentExpiryDate** | **Long** |  |  [optional]
**paymentReceiptDate** | **Long** |  |  [optional]
**payInMethod** | [**PayInMethod**](PayInMethod.md) |  |  [optional]
**payOutMethod** | [**PayOutMethod**](PayOutMethod.md) |  |  [optional]
**uuid** | **String** |  |  [optional]
**payOutInstruction** | [**PayOutInstruction**](PayOutInstruction.md) |  |  [optional]
**payInInstruction** | [**PayInInstruction**](PayInInstruction.md) |  |  [optional]
**usePayInMethod** | [**AccountMethod**](AccountMethod.md) |  |  [optional]
**usePayOutMethod** | [**AccountMethod**](AccountMethod.md) |  |  [optional]
**fee** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**processingFee** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**netPrice** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**grossPrice** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**amountInGross** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**amountInNet** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**fees** | [**Fees**](Fees.md) |  |  [optional]
**dateCreated** | **Long** |  |  [optional]
**lastUpdated** | **Long** |  |  [optional]

<a name="QuoteStatusEnum"></a>
## Enum: QuoteStatusEnum
Name | Value
---- | -----
ESTIMATE | &quot;ESTIMATE&quot;
TEMPLATE | &quot;TEMPLATE&quot;
PENDING | &quot;PENDING&quot;
ACCEPTED | &quot;ACCEPTED&quot;
PAYMENT_IN_RECEIVED | &quot;PAYMENT_IN_RECEIVED&quot;
FRAUD_CHECK_PENDING | &quot;FRAUD_CHECK_PENDING&quot;
FRAUD_CHECK_FAILED | &quot;FRAUD_CHECK_FAILED&quot;
PAYMENT_OUT_PENDING | &quot;PAYMENT_OUT_PENDING&quot;
PAYMENT_OUT_PROCESSED | &quot;PAYMENT_OUT_PROCESSED&quot;
PAYMENT_OUT_USED | &quot;PAYMENT_OUT_USED&quot;
COMPLETED | &quot;COMPLETED&quot;
CONVERSION_FAILED | &quot;CONVERSION_FAILED&quot;
PAYMENT_OUT_FAILED | &quot;PAYMENT_OUT_FAILED&quot;
LOCKED | &quot;LOCKED&quot;

<a name="PaymentStatusEnum"></a>
## Enum: PaymentStatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
SEEN | &quot;SEEN&quot;
SUCCESS | &quot;SUCCESS&quot;
CANCELLED | &quot;CANCELLED&quot;
FAILED | &quot;FAILED&quot;
FRAUD_PENDING | &quot;FRAUD_PENDING&quot;
FRAUD_PENDING_MANUAL_REVIEW | &quot;FRAUD_PENDING_MANUAL_REVIEW&quot;
FRAUD_FAILED | &quot;FRAUD_FAILED&quot;
REFUND_PENDING | &quot;REFUND_PENDING&quot;
REFUNDED | &quot;REFUNDED&quot;
MANUAL_SUCCESS | &quot;MANUAL_SUCCESS&quot;
REFUND_FAILED | &quot;REFUND_FAILED&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FIXED | &quot;FIXED&quot;
MARKET | &quot;MARKET&quot;
