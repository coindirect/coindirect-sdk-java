# ExchangeOrdersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**placeExchangeOrder**](ExchangeOrdersApi.md#placeExchangeOrder) | **POST** /api/v1/exchange/order | Place Order
[**listExchangeOrders**](ExchangeOrdersApi.md#listExchangeOrders) | **GET** /api/v1/exchange/order | List Orders
[**getMarketAccess**](ExchangeOrdersApi.md#getMarketAccess) | **GET** /api/v1/exchange/order/access/{symbol} | Check access to market
[**getExchangeOrder**](ExchangeOrdersApi.md#getExchangeOrder) | **GET** /api/v1/exchange/order/read/{uuid} | Get Order
[**cancelExchangeOrder**](ExchangeOrdersApi.md#cancelExchangeOrder) | **DELETE** /api/v1/exchange/order/{uuid} | Cancel Order

<a name="placeExchangeOrder"></a>
# **placeExchangeOrder**
> ExchangeOrder placeExchangeOrder(body)

Place Order

Place an Order on the Exchange

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.ExchangeOrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

ExchangeOrdersApi apiInstance = new ExchangeOrdersApi();
ExchangeOrderRequest body = new ExchangeOrderRequest(); // ExchangeOrderRequest | 
try {
    ExchangeOrder result = apiInstance.placeExchangeOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeOrdersApi#placeExchangeOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExchangeOrderRequest**](ExchangeOrderRequest.md)|  | [optional]

### Return type

[**ExchangeOrder**](ExchangeOrder.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listExchangeOrders"></a>
# **listExchangeOrders**
> List&lt;ExchangeOrder&gt; listExchangeOrders(symbol, completed, offset, max)

List Orders

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.ExchangeOrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

ExchangeOrdersApi apiInstance = new ExchangeOrdersApi();
String symbol = "symbol_example"; // String | 
Boolean completed = true; // Boolean | 
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<ExchangeOrder> result = apiInstance.listExchangeOrders(symbol, completed, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeOrdersApi#listExchangeOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**|  | [optional]
 **completed** | **Boolean**|  | [optional]
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;ExchangeOrder&gt;**](ExchangeOrder.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMarketAccess"></a>
# **getMarketAccess**
> Reasons getMarketAccess(symbol)

Check access to market

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.ExchangeOrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

ExchangeOrdersApi apiInstance = new ExchangeOrdersApi();
String symbol = "symbol_example"; // String | 
try {
    Reasons result = apiInstance.getMarketAccess(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeOrdersApi#getMarketAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**|  |

### Return type

[**Reasons**](Reasons.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExchangeOrder"></a>
# **getExchangeOrder**
> ExchangeOrder getExchangeOrder(uuid)

Get Order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.ExchangeOrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

ExchangeOrdersApi apiInstance = new ExchangeOrdersApi();
String uuid = "uuid_example"; // String | 
try {
    ExchangeOrder result = apiInstance.getExchangeOrder(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeOrdersApi#getExchangeOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**ExchangeOrder**](ExchangeOrder.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cancelExchangeOrder"></a>
# **cancelExchangeOrder**
> ExchangeOrder cancelExchangeOrder(uuid)

Cancel Order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.ExchangeOrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

ExchangeOrdersApi apiInstance = new ExchangeOrdersApi();
String uuid = "uuid_example"; // String | 
try {
    ExchangeOrder result = apiInstance.cancelExchangeOrder(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeOrdersApi#cancelExchangeOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**ExchangeOrder**](ExchangeOrder.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

