# QuotesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptQuote**](QuotesApi.md#acceptQuote) | **PUT** /api/v1/quote/accept/{uuid} | Accept a quote
[**listQuotes**](QuotesApi.md#listQuotes) | **GET** /api/v1/quote | List quotes
[**readQuote**](QuotesApi.md#readQuote) | **GET** /api/v1/quote/{uuid} | Read a quote
[**readTransactionLimits**](QuotesApi.md#readTransactionLimits) | **GET** /api/v1/limit | Get transaction limits
[**requestNewQuotePaymentInstructions**](QuotesApi.md#requestNewQuotePaymentInstructions) | **PUT** /api/v1/quote/payment/{uuid} | Request new payment instructions
[**requestQuote**](QuotesApi.md#requestQuote) | **POST** /api/v1/quote | Request a quote

<a name="acceptQuote"></a>
# **acceptQuote**
> AcceptedQuote acceptQuote(uuid, body)

Accept a quote

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.QuotesApi;


QuotesApi apiInstance = new QuotesApi();
String uuid = "uuid_example"; // String | 
PaymentMetadata body = new PaymentMetadata(); // PaymentMetadata | 
try {
    AcceptedQuote result = apiInstance.acceptQuote(uuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#acceptQuote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |
 **body** | [**PaymentMetadata**](PaymentMetadata.md)|  | [optional]

### Return type

[**AcceptedQuote**](AcceptedQuote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listQuotes"></a>
# **listQuotes**
> Quote listQuotes(merchantId)

List quotes

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.QuotesApi;


QuotesApi apiInstance = new QuotesApi();
String merchantId = "merchantId_example"; // String | 
try {
    Quote result = apiInstance.listQuotes(merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#listQuotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **String**|  | [optional]

### Return type

[**Quote**](Quote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readQuote"></a>
# **readQuote**
> AcceptedQuote readQuote(uuid)

Read a quote

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.QuotesApi;


QuotesApi apiInstance = new QuotesApi();
String uuid = "uuid_example"; // String | 
try {
    AcceptedQuote result = apiInstance.readQuote(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#readQuote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**AcceptedQuote**](AcceptedQuote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readTransactionLimits"></a>
# **readTransactionLimits**
> Limits readTransactionLimits(country, currency, direction, method)

Get transaction limits

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.QuotesApi;


QuotesApi apiInstance = new QuotesApi();
String country = "country_example"; // String | 
String currency = "currency_example"; // String | 
String direction = "direction_example"; // String | 
String method = "method_example"; // String | 
try {
    Limits result = apiInstance.readTransactionLimits(country, currency, direction, method);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#readTransactionLimits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**|  | [optional]
 **currency** | **String**|  | [optional]
 **direction** | **String**|  | [optional]
 **method** | **String**|  | [optional]

### Return type

[**Limits**](Limits.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestNewQuotePaymentInstructions"></a>
# **requestNewQuotePaymentInstructions**
> AcceptedQuote requestNewQuotePaymentInstructions(uuid, body)

Request new payment instructions

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.QuotesApi;


QuotesApi apiInstance = new QuotesApi();
String uuid = "uuid_example"; // String | 
PaymentMetadata body = new PaymentMetadata(); // PaymentMetadata | 
try {
    AcceptedQuote result = apiInstance.requestNewQuotePaymentInstructions(uuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#requestNewQuotePaymentInstructions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |
 **body** | [**PaymentMetadata**](PaymentMetadata.md)|  | [optional]

### Return type

[**AcceptedQuote**](AcceptedQuote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="requestQuote"></a>
# **requestQuote**
> Quote requestQuote(body, estimate, direction)

Request a quote

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.QuotesApi;


QuotesApi apiInstance = new QuotesApi();
QuoteRequest body = new QuoteRequest(); // QuoteRequest | 
Boolean estimate = true; // Boolean | 
String direction = "direction_example"; // String | 
try {
    Quote result = apiInstance.requestQuote(body, estimate, direction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#requestQuote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QuoteRequest**](QuoteRequest.md)|  | [optional]
 **estimate** | **Boolean**|  | [optional]
 **direction** | **String**|  | [optional]

### Return type

[**Quote**](Quote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

