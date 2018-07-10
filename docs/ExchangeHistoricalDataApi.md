# ExchangeHistoricalDataApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHistoricalExchangeData**](ExchangeHistoricalDataApi.md#getHistoricalExchangeData) | **GET** /api/v1/exchange/historical/{market}/{history}/{grouping} | Retrieve Historical Data
[**getHistoricalExchangeTrades**](ExchangeHistoricalDataApi.md#getHistoricalExchangeTrades) | **GET** /api/v1/exchange/historical/trades/{market}/{history} | Retrieve Historical Trades


<a name="getHistoricalExchangeData"></a>
# **getHistoricalExchangeData**
> HistoricalData getHistoricalExchangeData(market, history, grouping, limit)

Retrieve Historical Data



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.ExchangeHistoricalDataApi;


ExchangeHistoricalDataApi apiInstance = new ExchangeHistoricalDataApi();
String market = "market_example"; // String | 
String history = "history_example"; // String | 
String grouping = "grouping_example"; // String | 
Long limit = 789L; // Long | 
try {
    HistoricalData result = apiInstance.getHistoricalExchangeData(market, history, grouping, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeHistoricalDataApi#getHistoricalExchangeData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **String**|  |
 **history** | **String**|  |
 **grouping** | **String**|  |
 **limit** | **Long**|  | [optional]

### Return type

[**HistoricalData**](HistoricalData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHistoricalExchangeTrades"></a>
# **getHistoricalExchangeTrades**
> getHistoricalExchangeTrades(market, history, limit)

Retrieve Historical Trades



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.ExchangeHistoricalDataApi;


ExchangeHistoricalDataApi apiInstance = new ExchangeHistoricalDataApi();
String market = "market_example"; // String | 
String history = "history_example"; // String | 
Long limit = 789L; // Long | 
try {
    apiInstance.getHistoricalExchangeTrades(market, history, limit);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeHistoricalDataApi#getHistoricalExchangeTrades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **String**|  |
 **history** | **String**|  |
 **limit** | **Long**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

