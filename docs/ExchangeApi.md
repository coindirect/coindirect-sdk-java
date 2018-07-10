# ExchangeApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExchangeOrderBook**](ExchangeApi.md#getExchangeOrderBook) | **GET** /api/v1/exchange/market/book | Get Order Book For Market
[**listExchangeMarkets**](ExchangeApi.md#listExchangeMarkets) | **GET** /api/v1/exchange/market | List Markets


<a name="getExchangeOrderBook"></a>
# **getExchangeOrderBook**
> OrderBook getExchangeOrderBook(symbol)

Get Order Book For Market



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.ExchangeApi;


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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listExchangeMarkets"></a>
# **listExchangeMarkets**
> List&lt;Market&gt; listExchangeMarkets(offset, max)

List Markets



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.ExchangeApi;


ExchangeApi apiInstance = new ExchangeApi();
Integer offset = 0; // Integer | start offset
Integer max = 10; // Integer | max results
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
 **offset** | **Integer**| start offset | [optional] [default to 0]
 **max** | **Integer**| max results | [optional] [default to 10]

### Return type

[**List&lt;Market&gt;**](Market.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

