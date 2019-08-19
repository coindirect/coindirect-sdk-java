# ReportsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReport**](ReportsApi.md#getReport) | **GET** /api/report | Read Report

<a name="getReport"></a>
# **getReport**
> List&lt;EventAggregate&gt; getReport(code, offset, format)

Read Report

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.ReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

ReportsApi apiInstance = new ReportsApi();
String code = "code_example"; // String | 
Integer offset = 56; // Integer | 
String format = "format_example"; // String | 
try {
    List<EventAggregate> result = apiInstance.getReport(code, offset, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#getReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**|  | [optional]
 **offset** | **Integer**|  | [optional]
 **format** | **String**|  | [optional]

### Return type

[**List&lt;EventAggregate&gt;**](EventAggregate.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

