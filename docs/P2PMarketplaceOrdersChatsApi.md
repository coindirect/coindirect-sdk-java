# P2PMarketplaceOrdersChatsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getP2POrderMessageAttachmentURL**](P2PMarketplaceOrdersChatsApi.md#getP2POrderMessageAttachmentURL) | **GET** /api/order/chat/{id}/{fileId} | Retrieve URL for message attachment
[**getP2POrderMessages**](P2PMarketplaceOrdersChatsApi.md#getP2POrderMessages) | **GET** /api/order/chat/{id} | Read messages for Order
[**sendP2POrderMessage**](P2PMarketplaceOrdersChatsApi.md#sendP2POrderMessage) | **POST** /api/order/chat/{id} | Send message for order


<a name="getP2POrderMessageAttachmentURL"></a>
# **getP2POrderMessageAttachmentURL**
> WrappedPrimitive getP2POrderMessageAttachmentURL(id, fileId)

Retrieve URL for message attachment



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.P2PMarketplaceOrdersChatsApi;


P2PMarketplaceOrdersChatsApi apiInstance = new P2PMarketplaceOrdersChatsApi();
Long id = 789L; // Long | 
Long fileId = 789L; // Long | 
try {
    WrappedPrimitive result = apiInstance.getP2POrderMessageAttachmentURL(id, fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersChatsApi#getP2POrderMessageAttachmentURL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **fileId** | **Long**|  |

### Return type

[**WrappedPrimitive**](WrappedPrimitive.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getP2POrderMessages"></a>
# **getP2POrderMessages**
> List&lt;ChatMessage&gt; getP2POrderMessages(id, start)

Read messages for Order



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.P2PMarketplaceOrdersChatsApi;


P2PMarketplaceOrdersChatsApi apiInstance = new P2PMarketplaceOrdersChatsApi();
Long id = 789L; // Long | 
Long start = 789L; // Long | 
try {
    List<ChatMessage> result = apiInstance.getP2POrderMessages(id, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersChatsApi#getP2POrderMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **start** | **Long**|  | [optional]

### Return type

[**List&lt;ChatMessage&gt;**](ChatMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendP2POrderMessage"></a>
# **sendP2POrderMessage**
> sendP2POrderMessage(id, body)

Send message for order



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.P2PMarketplaceOrdersChatsApi;


P2PMarketplaceOrdersChatsApi apiInstance = new P2PMarketplaceOrdersChatsApi();
Long id = 789L; // Long | 
ChatMessage body = new ChatMessage(); // ChatMessage | 
try {
    apiInstance.sendP2POrderMessage(id, body);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOrdersChatsApi#sendP2POrderMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**ChatMessage**](ChatMessage.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

