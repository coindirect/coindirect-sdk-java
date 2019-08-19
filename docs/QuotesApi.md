# QuotesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**quoteCreate**](QuotesApi.md#quoteCreate) | **POST** /api/v1/quote | Create Quote
[**transactionLimitRead**](QuotesApi.md#transactionLimitRead) | **GET** /api/v1/limit | Read Transaction Limits
[**quoteList**](QuotesApi.md#quoteList) | **GET** /api/v1/quote | List Quotes
[**quoteAccept**](QuotesApi.md#quoteAccept) | **PUT** /api/v1/quote/accept/{uuid} | Accept Quote
[**quoteCreateNewPaymentInstruction**](QuotesApi.md#quoteCreateNewPaymentInstruction) | **PUT** /api/v1/quote/payment/{uuid} | Create New Payment Instruction
[**quoteRead**](QuotesApi.md#quoteRead) | **GET** /api/v1/quote/{uuid} | Read Quote

<a name="quoteCreate"></a>
# **quoteCreate**
> Quote quoteCreate(body, estimate, direction)

Create Quote

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.QuotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

QuotesApi apiInstance = new QuotesApi();
QuoteRequest body = new QuoteRequest(); // QuoteRequest | 
Boolean estimate = true; // Boolean | 
String direction = "direction_example"; // String | 
try {
    Quote result = apiInstance.quoteCreate(body, estimate, direction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#quoteCreate");
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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionLimitRead"></a>
# **transactionLimitRead**
> Limits transactionLimitRead(country, currency, direction, method)

Read Transaction Limits

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
    Limits result = apiInstance.transactionLimitRead(country, currency, direction, method);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#transactionLimitRead");
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

<a name="quoteList"></a>
# **quoteList**
> Quote quoteList(merchantId)

List Quotes

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.QuotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

QuotesApi apiInstance = new QuotesApi();
String merchantId = "merchantId_example"; // String | 
try {
    Quote result = apiInstance.quoteList(merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#quoteList");
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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="quoteAccept"></a>
# **quoteAccept**
> AcceptedQuote quoteAccept(uuid, body)

Accept Quote

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.QuotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

QuotesApi apiInstance = new QuotesApi();
String uuid = "uuid_example"; // String | 
PaymentMetadata body = new PaymentMetadata(); // PaymentMetadata | 
try {
    AcceptedQuote result = apiInstance.quoteAccept(uuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#quoteAccept");
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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="quoteCreateNewPaymentInstruction"></a>
# **quoteCreateNewPaymentInstruction**
> AcceptedQuote quoteCreateNewPaymentInstruction(uuid, body)

Create New Payment Instruction

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.QuotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

QuotesApi apiInstance = new QuotesApi();
String uuid = "uuid_example"; // String | 
PaymentMetadata body = new PaymentMetadata(); // PaymentMetadata | 
try {
    AcceptedQuote result = apiInstance.quoteCreateNewPaymentInstruction(uuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#quoteCreateNewPaymentInstruction");
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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="quoteRead"></a>
# **quoteRead**
> AcceptedQuote quoteRead(uuid)

Read Quote

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.QuotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

QuotesApi apiInstance = new QuotesApi();
String uuid = "uuid_example"; // String | 
try {
    AcceptedQuote result = apiInstance.quoteRead(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#quoteRead");
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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

