# P2PVendorInformationApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getP2PVendor**](P2PVendorInformationApi.md#getP2PVendor) | **GET** /api/public/vendor/{id} | Get P2P Vendor

<a name="getP2PVendor"></a>
# **getP2PVendor**
> PublicAccount getP2PVendor(id)

Get P2P Vendor

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PVendorInformationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PVendorInformationApi apiInstance = new P2PVendorInformationApi();
Long id = 789L; // Long | 
try {
    PublicAccount result = apiInstance.getP2PVendor(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PVendorInformationApi#getP2PVendor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**PublicAccount**](PublicAccount.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

