# P2PMarketplaceOrdersChatsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendP2POrderMessage**](P2PMarketplaceOrdersChatsApi.md#sendP2POrderMessage) | **POST** /api/order/chat/{id} | Send message for order
[**getP2POrderMessages**](P2PMarketplaceOrdersChatsApi.md#getP2POrderMessages) | **GET** /api/order/chat/{id} | Read messages for Order
[**getP2POrderMessageAttachmentURL**](P2PMarketplaceOrdersChatsApi.md#getP2POrderMessageAttachmentURL) | **GET** /api/order/chat/{id}/{fileId} | Retrieve URL for message attachment

<a name="sendP2POrderMessage"></a>
# **sendP2POrderMessage**
> sendP2POrderMessage(id, body)

Send message for order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getP2POrderMessages"></a>
# **getP2POrderMessages**
> List&lt;ChatMessage&gt; getP2POrderMessages(id, start)

Read messages for Order

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getP2POrderMessageAttachmentURL"></a>
# **getP2POrderMessageAttachmentURL**
> WrappedPrimitive getP2POrderMessageAttachmentURL(id, fileId)

Retrieve URL for message attachment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PMarketplaceOrdersChatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

