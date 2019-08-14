# ReportsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReport**](ReportsApi.md#getReport) | **GET** /api/report | Get Report

<a name="getReport"></a>
# **getReport**
> List&lt;EventAggregate&gt; getReport(code, offset, format)

Get Report

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.ReportsApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

