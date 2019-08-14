# IdentityApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**identityVerificationRequest**](IdentityApi.md#identityVerificationRequest) | **POST** /api/v1/identity | Request Identity Verification
[**identityVerificationStarted**](IdentityApi.md#identityVerificationStarted) | **PUT** /api/v1/identity | Notify of completion

<a name="identityVerificationRequest"></a>
# **identityVerificationRequest**
> AmlCheckResponse identityVerificationRequest()

Request Identity Verification

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.IdentityApi;


IdentityApi apiInstance = new IdentityApi();
try {
    AmlCheckResponse result = apiInstance.identityVerificationRequest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#identityVerificationRequest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AmlCheckResponse**](AmlCheckResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="identityVerificationStarted"></a>
# **identityVerificationStarted**
> identityVerificationStarted()

Notify of completion

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.IdentityApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

