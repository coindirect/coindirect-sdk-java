# IdentityApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**identityVerificationStart**](IdentityApi.md#identityVerificationStart) | **POST** /api/v1/identity | Start Identity Verification
[**identityVerificationStarted**](IdentityApi.md#identityVerificationStarted) | **PUT** /api/v1/identity | Notify of Start

<a name="identityVerificationStart"></a>
# **identityVerificationStart**
> AmlCheckResponse identityVerificationStart()

Start Identity Verification

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.IdentityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

IdentityApi apiInstance = new IdentityApi();
try {
    AmlCheckResponse result = apiInstance.identityVerificationStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#identityVerificationStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AmlCheckResponse**](AmlCheckResponse.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="identityVerificationStarted"></a>
# **identityVerificationStarted**
> identityVerificationStarted()

Notify of Start

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.IdentityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

IdentityApi apiInstance = new IdentityApi();
try {
    apiInstance.identityVerificationStarted();
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#identityVerificationStarted");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

