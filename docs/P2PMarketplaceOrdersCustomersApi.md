# P2PMarketplaceOrdersCustomersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**beginP2PBuyOrder**](P2PMarketplaceOrdersCustomersApi.md#beginP2PBuyOrder) | **POST** /api/order/buy | Pre-authorize buy order
[**payP2POrder**](P2PMarketplaceOrdersCustomersApi.md#payP2POrder) | **POST** /api/order/pay/{id} | Pay for order
[**beginP2PSellOrder**](P2PMarketplaceOrdersCustomersApi.md#beginP2PSellOrder) | **POST** /api/order/sell | Pre-authorize sell order
[**uploadP2POrderDocument**](P2PMarketplaceOrdersCustomersApi.md#uploadP2POrderDocument) | **POST** /api/order/upload/{id} | Upload Order Documentation
[**listP2POrders**](P2PMarketplaceOrdersCustomersApi.md#listP2POrders) | **GET** /api/order | List Orders
[**markP2POrderAsPaidSeller**](P2PMarketplaceOrdersCustomersApi.md#markP2POrderAsPaidSeller) | **PUT** /api/order/approve/{id} | Mark an order as paid (seller)
[**listP2PCompletedOrders**](P2PMarketplaceOrdersCustomersApi.md#listP2PCompletedOrders) | **GET** /api/order/completed | List Completed Orders
[**exportP2POrders**](P2PMarketplaceOrdersCustomersApi.md#exportP2POrders) | **GET** /api/order/csv | Export Orders CSV
[**markP2POrderAsPaidBuyer**](P2PMarketplaceOrdersCustomersApi.md#markP2POrderAsPaidBuyer) | **PUT** /api/order/mark-paid/{id} | Mark an order as paid (buyer)
[**updateP2POrderPayment**](P2PMarketplaceOrdersCustomersApi.md#updateP2POrderPayment) | **GET** /api/order/pay/{id} | Update payment status for order
[**listP2PPendingOrders**](P2PMarketplaceOrdersCustomersApi.md#listP2PPendingOrders) | **GET** /api/order/pending | List Pending Orders
[**rateP2POrder**](P2PMarketplaceOrdersCustomersApi.md#rateP2POrder) | **PUT** /api/order/rate/{id} | Rate order
[**getP2POrderDocument**](P2PMarketplaceOrdersCustomersApi.md#getP2POrderDocument) | **GET** /api/order/upload/{orderId} | View Upload Order Documentation
[**listP2POrderDocuments**](P2PMarketplaceOrdersCustomersApi.md#listP2POrderDocuments) | **GET** /api/order/uploads/{id} | Get documents for Order
[**getP2POrder**](P2PMarketplaceOrdersCustomersApi.md#getP2POrder) | **GET** /api/order/{id} | Get order
[**placeP2POrder**](P2PMarketplaceOrdersCustomersApi.md#placeP2POrder) | **PUT** /api/order/{id} | Place Order
[**cancelP2POrder**](P2PMarketplaceOrdersCustomersApi.md#cancelP2POrder) | **DELETE** /api/order/{id} | Cancel Order

<a name="beginP2PBuyOrder"></a>
# **beginP2PBuyOrder**
> Order beginP2PBuyOrder(body)

Pre-authorize buy order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
OrderRequest body = new OrderRequest(); // OrderRequest | 
try {
    Order result = apiInstance.beginP2PBuyOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#beginP2PBuyOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderRequest**](OrderRequest.md)|  | [optional]

### Return type

[**Order**](Order.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payP2POrder"></a>
# **payP2POrder**
> PaymentResult payP2POrder(id, body)

Pay for order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
Long id = 789L; // Long | 
PaymentOption body = new PaymentOption(); // PaymentOption | 
try {
    PaymentResult result = apiInstance.payP2POrder(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#payP2POrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**PaymentOption**](PaymentOption.md)|  | [optional]

### Return type

[**PaymentResult**](PaymentResult.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="beginP2PSellOrder"></a>
# **beginP2PSellOrder**
> Order beginP2PSellOrder(body)

Pre-authorize sell order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
OrderRequest body = new OrderRequest(); // OrderRequest | 
try {
    Order result = apiInstance.beginP2PSellOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#beginP2PSellOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderRequest**](OrderRequest.md)|  | [optional]

### Return type

[**Order**](Order.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadP2POrderDocument"></a>
# **uploadP2POrderDocument**
> uploadP2POrderDocument(id, body)

Upload Order Documentation

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
Long id = 789L; // Long | 
OrderDocument body = new OrderDocument(); // OrderDocument | 
try {
    apiInstance.uploadP2POrderDocument(id, body);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#uploadP2POrderDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**OrderDocument**](OrderDocument.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="listP2POrders"></a>
# **listP2POrders**
> List&lt;Order&gt; listP2POrders(status, offset, max)

List Orders

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
List<Integer> status = Arrays.asList(56); // List<Integer> | 
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<Order> result = apiInstance.listP2POrders(status, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#listP2POrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="markP2POrderAsPaidSeller"></a>
# **markP2POrderAsPaidSeller**
> Order markP2POrderAsPaidSeller(id)

Mark an order as paid (seller)

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
Long id = 789L; // Long | 
try {
    Order result = apiInstance.markP2POrderAsPaidSeller(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#markP2POrderAsPaidSeller");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Order**](Order.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listP2PCompletedOrders"></a>
# **listP2PCompletedOrders**
> List&lt;Order&gt; listP2PCompletedOrders()

List Completed Orders

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
try {
    List<Order> result = apiInstance.listP2PCompletedOrders();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#listP2PCompletedOrders");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="exportP2POrders"></a>
# **exportP2POrders**
> exportP2POrders(fromDate, toDate)

Export Orders CSV

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
String fromDate = "fromDate_example"; // String | 
String toDate = "toDate_example"; // String | 
try {
    apiInstance.exportP2POrders(fromDate, toDate);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#exportP2POrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromDate** | **String**|  | [optional]
 **toDate** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="markP2POrderAsPaidBuyer"></a>
# **markP2POrderAsPaidBuyer**
> Order markP2POrderAsPaidBuyer(id)

Mark an order as paid (buyer)

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
Long id = 789L; // Long | 
try {
    Order result = apiInstance.markP2POrderAsPaidBuyer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#markP2POrderAsPaidBuyer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Order**](Order.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateP2POrderPayment"></a>
# **updateP2POrderPayment**
> updateP2POrderPayment(id)

Update payment status for order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
Long id = 789L; // Long | 
try {
    apiInstance.updateP2POrderPayment(id);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#updateP2POrderPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listP2PPendingOrders"></a>
# **listP2PPendingOrders**
> List&lt;Order&gt; listP2PPendingOrders()

List Pending Orders

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
try {
    List<Order> result = apiInstance.listP2PPendingOrders();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#listP2PPendingOrders");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rateP2POrder"></a>
# **rateP2POrder**
> Order rateP2POrder(id, body)

Rate order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
Long id = 789L; // Long | 
Rating body = new Rating(); // Rating | 
try {
    Order result = apiInstance.rateP2POrder(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#rateP2POrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**Rating**](Rating.md)|  | [optional]

### Return type

[**Order**](Order.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getP2POrderDocument"></a>
# **getP2POrderDocument**
> WrappedPrimitive getP2POrderDocument(orderId, document)

View Upload Order Documentation

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
Long orderId = 789L; // Long | 
String document = "document_example"; // String | 
try {
    WrappedPrimitive result = apiInstance.getP2POrderDocument(orderId, document);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#getP2POrderDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**|  |
 **document** | **String**|  | [optional]

### Return type

[**WrappedPrimitive**](WrappedPrimitive.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listP2POrderDocuments"></a>
# **listP2POrderDocuments**
> List&lt;OrderDocument&gt; listP2POrderDocuments(id)

Get documents for Order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
Long id = 789L; // Long | 
try {
    List<OrderDocument> result = apiInstance.listP2POrderDocuments(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#listP2POrderDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**List&lt;OrderDocument&gt;**](OrderDocument.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getP2POrder"></a>
# **getP2POrder**
> Order getP2POrder(id)

Get order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
Long id = 789L; // Long | 
try {
    Order result = apiInstance.getP2POrder(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#getP2POrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Order**](Order.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="placeP2POrder"></a>
# **placeP2POrder**
> Order placeP2POrder(id, body)

Place Order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
Long id = 789L; // Long | 
Authorization body = new Authorization(); // Authorization | 
try {
    Order result = apiInstance.placeP2POrder(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#placeP2POrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**Authorization**](Authorization.md)|  | [optional]

### Return type

[**Order**](Order.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelP2POrder"></a>
# **cancelP2POrder**
> Order cancelP2POrder(id, body)

Cancel Order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PMarketplaceOrdersCustomersApi apiInstance = new P2PMarketplaceOrdersCustomersApi();
Long id = 789L; // Long | 
Authorization body = new Authorization(); // Authorization | 
try {
    Order result = apiInstance.cancelP2POrder(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersCustomersApi#cancelP2POrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**Authorization**](Authorization.md)|  | [optional]

### Return type

[**Order**](Order.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

