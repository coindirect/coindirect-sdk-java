# P2PMarketplaceOrdersVendorsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vendorCancelP2POrder**](P2PMarketplaceOrdersVendorsApi.md#vendorCancelP2POrder) | **DELETE** /api/partner/order/{id} | Cancel Order
[**vendorExportP2POrders**](P2PMarketplaceOrdersVendorsApi.md#vendorExportP2POrders) | **GET** /api/partner/order/csv | Export Orders CSV
[**vendorGetP2POrder**](P2PMarketplaceOrdersVendorsApi.md#vendorGetP2POrder) | **GET** /api/partner/order/{id} | Get order
[**vendorGetP2POrderDocument**](P2PMarketplaceOrdersVendorsApi.md#vendorGetP2POrderDocument) | **GET** /api/partner/order/uploads/{id} | Get documents for Order
[**vendorListP2PCompletedOrders**](P2PMarketplaceOrdersVendorsApi.md#vendorListP2PCompletedOrders) | **GET** /api/partner/order/completed | List Completed Orders
[**vendorListP2PPendingOrders**](P2PMarketplaceOrdersVendorsApi.md#vendorListP2PPendingOrders) | **GET** /api/partner/order/pending | List Pending Orders
[**vendorMarkP2POrderAsPaidBuyer**](P2PMarketplaceOrdersVendorsApi.md#vendorMarkP2POrderAsPaidBuyer) | **PUT** /api/partner/order/mark-paid/{id} | Mark an order as paid (buyer)
[**vendorMarkP2POrderAsPaidSeller**](P2PMarketplaceOrdersVendorsApi.md#vendorMarkP2POrderAsPaidSeller) | **PUT** /api/partner/order/approve/{id} | Mark an order as paid (seller)
[**vendorPayP2POrder**](P2PMarketplaceOrdersVendorsApi.md#vendorPayP2POrder) | **POST** /api/partner/order/pay/{id} | Pay for order
[**vendorPlaceP2POrder**](P2PMarketplaceOrdersVendorsApi.md#vendorPlaceP2POrder) | **PUT** /api/partner/order/{id} | Confirm Order
[**vendorUploadP2POrderDocument**](P2PMarketplaceOrdersVendorsApi.md#vendorUploadP2POrderDocument) | **POST** /api/partner/order/upload/{id} | Upload Order Documentation

<a name="vendorCancelP2POrder"></a>
# **vendorCancelP2POrder**
> Order vendorCancelP2POrder(id, body)

Cancel Order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOrdersVendorsApi;


P2PMarketplaceOrdersVendorsApi apiInstance = new P2PMarketplaceOrdersVendorsApi();
Long id = 789L; // Long | 
Authorization body = new Authorization(); // Authorization | 
try {
    Order result = apiInstance.vendorCancelP2POrder(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersVendorsApi#vendorCancelP2POrder");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="vendorExportP2POrders"></a>
# **vendorExportP2POrders**
> vendorExportP2POrders(fromDate, toDate)

Export Orders CSV

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOrdersVendorsApi;


P2PMarketplaceOrdersVendorsApi apiInstance = new P2PMarketplaceOrdersVendorsApi();
String fromDate = "fromDate_example"; // String | 
String toDate = "toDate_example"; // String | 
try {
    apiInstance.vendorExportP2POrders(fromDate, toDate);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersVendorsApi#vendorExportP2POrders");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="vendorGetP2POrder"></a>
# **vendorGetP2POrder**
> Order vendorGetP2POrder(id)

Get order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOrdersVendorsApi;


P2PMarketplaceOrdersVendorsApi apiInstance = new P2PMarketplaceOrdersVendorsApi();
Long id = 789L; // Long | 
try {
    Order result = apiInstance.vendorGetP2POrder(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersVendorsApi#vendorGetP2POrder");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="vendorGetP2POrderDocument"></a>
# **vendorGetP2POrderDocument**
> List&lt;OrderDocument&gt; vendorGetP2POrderDocument(id)

Get documents for Order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOrdersVendorsApi;


P2PMarketplaceOrdersVendorsApi apiInstance = new P2PMarketplaceOrdersVendorsApi();
Long id = 789L; // Long | 
try {
    List<OrderDocument> result = apiInstance.vendorGetP2POrderDocument(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersVendorsApi#vendorGetP2POrderDocument");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="vendorListP2PCompletedOrders"></a>
# **vendorListP2PCompletedOrders**
> List&lt;Order&gt; vendorListP2PCompletedOrders(offset, max)

List Completed Orders

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOrdersVendorsApi;


P2PMarketplaceOrdersVendorsApi apiInstance = new P2PMarketplaceOrdersVendorsApi();
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<Order> result = apiInstance.vendorListP2PCompletedOrders(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersVendorsApi#vendorListP2PCompletedOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="vendorListP2PPendingOrders"></a>
# **vendorListP2PPendingOrders**
> List&lt;Order&gt; vendorListP2PPendingOrders(offset, max)

List Pending Orders

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOrdersVendorsApi;


P2PMarketplaceOrdersVendorsApi apiInstance = new P2PMarketplaceOrdersVendorsApi();
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<Order> result = apiInstance.vendorListP2PPendingOrders(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersVendorsApi#vendorListP2PPendingOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="vendorMarkP2POrderAsPaidBuyer"></a>
# **vendorMarkP2POrderAsPaidBuyer**
> Order vendorMarkP2POrderAsPaidBuyer(id)

Mark an order as paid (buyer)

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOrdersVendorsApi;


P2PMarketplaceOrdersVendorsApi apiInstance = new P2PMarketplaceOrdersVendorsApi();
Long id = 789L; // Long | 
try {
    Order result = apiInstance.vendorMarkP2POrderAsPaidBuyer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersVendorsApi#vendorMarkP2POrderAsPaidBuyer");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="vendorMarkP2POrderAsPaidSeller"></a>
# **vendorMarkP2POrderAsPaidSeller**
> Order vendorMarkP2POrderAsPaidSeller(id)

Mark an order as paid (seller)

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOrdersVendorsApi;


P2PMarketplaceOrdersVendorsApi apiInstance = new P2PMarketplaceOrdersVendorsApi();
Long id = 789L; // Long | 
try {
    Order result = apiInstance.vendorMarkP2POrderAsPaidSeller(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersVendorsApi#vendorMarkP2POrderAsPaidSeller");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="vendorPayP2POrder"></a>
# **vendorPayP2POrder**
> PaymentResult vendorPayP2POrder(id, body)

Pay for order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOrdersVendorsApi;


P2PMarketplaceOrdersVendorsApi apiInstance = new P2PMarketplaceOrdersVendorsApi();
Long id = 789L; // Long | 
PaymentOption body = new PaymentOption(); // PaymentOption | 
try {
    PaymentResult result = apiInstance.vendorPayP2POrder(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersVendorsApi#vendorPayP2POrder");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="vendorPlaceP2POrder"></a>
# **vendorPlaceP2POrder**
> Order vendorPlaceP2POrder(id, body)

Confirm Order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOrdersVendorsApi;


P2PMarketplaceOrdersVendorsApi apiInstance = new P2PMarketplaceOrdersVendorsApi();
Long id = 789L; // Long | 
Authorization body = new Authorization(); // Authorization | 
try {
    Order result = apiInstance.vendorPlaceP2POrder(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersVendorsApi#vendorPlaceP2POrder");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="vendorUploadP2POrderDocument"></a>
# **vendorUploadP2POrderDocument**
> vendorUploadP2POrderDocument(id, body)

Upload Order Documentation

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOrdersVendorsApi;


P2PMarketplaceOrdersVendorsApi apiInstance = new P2PMarketplaceOrdersVendorsApi();
Long id = 789L; // Long | 
OrderDocument body = new OrderDocument(); // OrderDocument | 
try {
    apiInstance.vendorUploadP2POrderDocument(id, body);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersVendorsApi#vendorUploadP2POrderDocument");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

