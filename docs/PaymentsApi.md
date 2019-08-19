# PaymentsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionLimitRead**](PaymentsApi.md#transactionLimitRead) | **GET** /api/v1/limit | Read Transaction Limits

<a name="transactionLimitRead"></a>
# **transactionLimitRead**
> Limits transactionLimitRead(country, currency, direction, method)

Read Transaction Limits

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
String country = "country_example"; // String | 
String currency = "currency_example"; // String | 
String direction = "direction_example"; // String | 
String method = "method_example"; // String | 
try {
    Limits result = apiInstance.transactionLimitRead(country, currency, direction, method);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#transactionLimitRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**|  | [optional]
 **currency** | **String**|  | [optional]
 **direction** | **String**|  | [optional]
 **method** | **String**|  | [optional]

### Return type

[**Limits**](Limits.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

