# P2PMarketplaceOrdersDisputesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelP2POrderDispute**](P2PMarketplaceOrdersDisputesApi.md#cancelP2POrderDispute) | **DELETE** /api/order/dispute/{id} | Cancel Dispute
[**createP2POrderDispute**](P2PMarketplaceOrdersDisputesApi.md#createP2POrderDispute) | **POST** /api/order/dispute | Create Dispute
[**getP2POrderDispute**](P2PMarketplaceOrdersDisputesApi.md#getP2POrderDispute) | **GET** /api/order/dispute/{id} | Retrieve Dispute
[**listP2PBuyerDisputeReasons**](P2PMarketplaceOrdersDisputesApi.md#listP2PBuyerDisputeReasons) | **GET** /api/order/dispute/reason/buy | List Buyer Dispute Reasons
[**listP2PSellerDisputeReasons**](P2PMarketplaceOrdersDisputesApi.md#listP2PSellerDisputeReasons) | **GET** /api/order/dispute/reason/sell | List Seller Dispute Reasons

<a name="cancelP2POrderDispute"></a>
# **cancelP2POrderDispute**
> cancelP2POrderDispute(id)

Cancel Dispute

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOrdersDisputesApi;


P2PMarketplaceOrdersDisputesApi apiInstance = new P2PMarketplaceOrdersDisputesApi();
Long id = 789L; // Long | 
try {
    apiInstance.cancelP2POrderDispute(id);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersDisputesApi#cancelP2POrderDispute");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createP2POrderDispute"></a>
# **createP2POrderDispute**
> OrderDispute createP2POrderDispute(body)

Create Dispute

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOrdersDisputesApi;


P2PMarketplaceOrdersDisputesApi apiInstance = new P2PMarketplaceOrdersDisputesApi();
OrderDispute body = new OrderDispute(); // OrderDispute | 
try {
    OrderDispute result = apiInstance.createP2POrderDispute(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersDisputesApi#createP2POrderDispute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderDispute**](OrderDispute.md)|  | [optional]

### Return type

[**OrderDispute**](OrderDispute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getP2POrderDispute"></a>
# **getP2POrderDispute**
> OrderDispute getP2POrderDispute(id)

Retrieve Dispute

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOrdersDisputesApi;


P2PMarketplaceOrdersDisputesApi apiInstance = new P2PMarketplaceOrdersDisputesApi();
Long id = 789L; // Long | 
try {
    OrderDispute result = apiInstance.getP2POrderDispute(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersDisputesApi#getP2POrderDispute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**OrderDispute**](OrderDispute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listP2PBuyerDisputeReasons"></a>
# **listP2PBuyerDisputeReasons**
> List&lt;OrderDisputeReason&gt; listP2PBuyerDisputeReasons(offset, max)

List Buyer Dispute Reasons

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOrdersDisputesApi;


P2PMarketplaceOrdersDisputesApi apiInstance = new P2PMarketplaceOrdersDisputesApi();
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<OrderDisputeReason> result = apiInstance.listP2PBuyerDisputeReasons(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersDisputesApi#listP2PBuyerDisputeReasons");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;OrderDisputeReason&gt;**](OrderDisputeReason.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listP2PSellerDisputeReasons"></a>
# **listP2PSellerDisputeReasons**
> List&lt;OrderDisputeReason&gt; listP2PSellerDisputeReasons(offset, max)

List Seller Dispute Reasons

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOrdersDisputesApi;


P2PMarketplaceOrdersDisputesApi apiInstance = new P2PMarketplaceOrdersDisputesApi();
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<OrderDisputeReason> result = apiInstance.listP2PSellerDisputeReasons(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersDisputesApi#listP2PSellerDisputeReasons");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;OrderDisputeReason&gt;**](OrderDisputeReason.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

