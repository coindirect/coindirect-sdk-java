# P2PVendorApplicationsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createP2PVendorApplication**](P2PVendorApplicationsApi.md#createP2PVendorApplication) | **POST** /api/partner/application | Apply to be a vendor
[**uploadP2PVendorApplicationDocument**](P2PVendorApplicationsApi.md#uploadP2PVendorApplicationDocument) | **POST** /api/partner/application/{applicationId}/upload | Upload an application document
[**listP2PVendorApplications**](P2PVendorApplicationsApi.md#listP2PVendorApplications) | **GET** /api/partner/application | List Applications
[**getP2PVendorApplication**](P2PVendorApplicationsApi.md#getP2PVendorApplication) | **GET** /api/partner/application/{id} | Retrieve Application
[**cancelP2PVendorApplication**](P2PVendorApplicationsApi.md#cancelP2PVendorApplication) | **DELETE** /api/partner/application/{id} | Cancel Application

<a name="createP2PVendorApplication"></a>
# **createP2PVendorApplication**
> PartnerApplication createP2PVendorApplication(body)

Apply to be a vendor

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PVendorApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PVendorApplicationsApi apiInstance = new P2PVendorApplicationsApi();
PartnerApplication body = new PartnerApplication(); // PartnerApplication | 
try {
    PartnerApplication result = apiInstance.createP2PVendorApplication(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PVendorApplicationsApi#createP2PVendorApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PartnerApplication**](PartnerApplication.md)|  | [optional]

### Return type

[**PartnerApplication**](PartnerApplication.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadP2PVendorApplicationDocument"></a>
# **uploadP2PVendorApplicationDocument**
> PartnerApplicationDocument uploadP2PVendorApplicationDocument(applicationId, body)

Upload an application document

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PVendorApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PVendorApplicationsApi apiInstance = new P2PVendorApplicationsApi();
Long applicationId = 789L; // Long | 
PartnerApplicationDocument body = new PartnerApplicationDocument(); // PartnerApplicationDocument | 
try {
    PartnerApplicationDocument result = apiInstance.uploadP2PVendorApplicationDocument(applicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PVendorApplicationsApi#uploadP2PVendorApplicationDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Long**|  |
 **body** | [**PartnerApplicationDocument**](PartnerApplicationDocument.md)|  | [optional]

### Return type

[**PartnerApplicationDocument**](PartnerApplicationDocument.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listP2PVendorApplications"></a>
# **listP2PVendorApplications**
> List&lt;PartnerApplication&gt; listP2PVendorApplications(offset, max)

List Applications

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PVendorApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PVendorApplicationsApi apiInstance = new P2PVendorApplicationsApi();
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<PartnerApplication> result = apiInstance.listP2PVendorApplications(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PVendorApplicationsApi#listP2PVendorApplications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;PartnerApplication&gt;**](PartnerApplication.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getP2PVendorApplication"></a>
# **getP2PVendorApplication**
> PartnerApplication getP2PVendorApplication(id)

Retrieve Application

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PVendorApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PVendorApplicationsApi apiInstance = new P2PVendorApplicationsApi();
Long id = 789L; // Long | 
try {
    PartnerApplication result = apiInstance.getP2PVendorApplication(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PVendorApplicationsApi#getP2PVendorApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**PartnerApplication**](PartnerApplication.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cancelP2PVendorApplication"></a>
# **cancelP2PVendorApplication**
> cancelP2PVendorApplication(id)

Cancel Application

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.P2PVendorApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

P2PVendorApplicationsApi apiInstance = new P2PVendorApplicationsApi();
Long id = 789L; // Long | 
try {
    apiInstance.cancelP2PVendorApplication(id);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PVendorApplicationsApi#cancelP2PVendorApplication");
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

