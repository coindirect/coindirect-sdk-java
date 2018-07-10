# PricesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCurrencySnapshots**](PricesApi.md#listCurrencySnapshots) | **GET** /api/currency/snapshot | List Latest Prices


<a name="listCurrencySnapshots"></a>
# **listCurrencySnapshots**
> List&lt;CurrencySnapshot&gt; listCurrencySnapshots(baseCurrency, countryCode, offset, max)

List Latest Prices



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.PricesApi;


PricesApi apiInstance = new PricesApi();
String baseCurrency = "baseCurrency_example"; // String | 
String countryCode = "countryCode_example"; // String | 
Integer offset = 0; // Integer | start offset
Integer max = 10; // Integer | max results
try {
    List<CurrencySnapshot> result = apiInstance.listCurrencySnapshots(baseCurrency, countryCode, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PricesApi#listCurrencySnapshots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseCurrency** | **String**|  | [optional]
 **countryCode** | **String**|  | [optional]
 **offset** | **Integer**| start offset | [optional] [default to 0]
 **max** | **Integer**| max results | [optional] [default to 10]

### Return type

[**List&lt;CurrencySnapshot&gt;**](CurrencySnapshot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

