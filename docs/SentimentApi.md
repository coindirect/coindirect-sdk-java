# SentimentApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listExchangeRatesLast**](SentimentApi.md#listExchangeRatesLast) | **GET** /api/exchange-rate/last | Read Last Exchange Rates
[**listExchangeRatesRecent**](SentimentApi.md#listExchangeRatesRecent) | **GET** /api/exchange-rate/recent | Read Exchange Rates
[**listSentimentAggregated**](SentimentApi.md#listSentimentAggregated) | **GET** /api/sentiment/aggregated | Read Aggregated Sentiment
[**listSentimentLast**](SentimentApi.md#listSentimentLast) | **GET** /api/sentiment/last | Read Last Sentiment

<a name="listExchangeRatesLast"></a>
# **listExchangeRatesLast**
> List&lt;ExchangeRate&gt; listExchangeRatesLast(currency)

Read Last Exchange Rates

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.SentimentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

SentimentApi apiInstance = new SentimentApi();
String currency = "currency_example"; // String | 
try {
    List<ExchangeRate> result = apiInstance.listExchangeRatesLast(currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SentimentApi#listExchangeRatesLast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  | [optional]

### Return type

[**List&lt;ExchangeRate&gt;**](ExchangeRate.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listExchangeRatesRecent"></a>
# **listExchangeRatesRecent**
> List&lt;ExchangeRate&gt; listExchangeRatesRecent(baseCurrency, counterCurrency)

Read Exchange Rates

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.SentimentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

SentimentApi apiInstance = new SentimentApi();
String baseCurrency = "baseCurrency_example"; // String | 
String counterCurrency = "counterCurrency_example"; // String | 
try {
    List<ExchangeRate> result = apiInstance.listExchangeRatesRecent(baseCurrency, counterCurrency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SentimentApi#listExchangeRatesRecent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseCurrency** | **String**|  | [optional]
 **counterCurrency** | **String**|  | [optional]

### Return type

[**List&lt;ExchangeRate&gt;**](ExchangeRate.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSentimentAggregated"></a>
# **listSentimentAggregated**
> List&lt;Sentiment&gt; listSentimentAggregated(currency, after)

Read Aggregated Sentiment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.SentimentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

SentimentApi apiInstance = new SentimentApi();
List<String> currency = Arrays.asList("currency_example"); // List<String> | 
Long after = 789L; // Long | 
try {
    List<Sentiment> result = apiInstance.listSentimentAggregated(currency, after);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SentimentApi#listSentimentAggregated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **after** | **Long**|  | [optional]

### Return type

[**List&lt;Sentiment&gt;**](Sentiment.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSentimentLast"></a>
# **listSentimentLast**
> List&lt;Sentiment&gt; listSentimentLast(currency)

Read Last Sentiment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.SentimentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

SentimentApi apiInstance = new SentimentApi();
List<String> currency = Arrays.asList("currency_example"); // List<String> | 
try {
    List<Sentiment> result = apiInstance.listSentimentLast(currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SentimentApi#listSentimentLast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**List&lt;Sentiment&gt;**](Sentiment.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

