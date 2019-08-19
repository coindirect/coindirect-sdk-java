# ExchangeApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listExchangeMarkets**](ExchangeApi.md#listExchangeMarkets) | **GET** /api/v1/exchange/market | List Markets
[**getExchangeOrderBook**](ExchangeApi.md#getExchangeOrderBook) | **GET** /api/v1/exchange/market/book | Get Order Book For Market

<a name="listExchangeMarkets"></a>
# **listExchangeMarkets**
> List&lt;Market&gt; listExchangeMarkets(offset, max)

List Markets

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<Market> result = apiInstance.listExchangeMarkets(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeApi#listExchangeMarkets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;Market&gt;**](Market.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExchangeOrderBook"></a>
# **getExchangeOrderBook**
> OrderBook getExchangeOrderBook(symbol)

Get Order Book For Market

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
String symbol = "symbol_example"; // String | 
try {
    OrderBook result = apiInstance.getExchangeOrderBook(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeApi#getExchangeOrderBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**|  | [optional]

### Return type

[**OrderBook**](OrderBook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

