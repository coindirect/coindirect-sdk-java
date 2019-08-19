# PaymentMethodsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**payInMethodList**](PaymentMethodsApi.md#payInMethodList) | **GET** /api/v1/pay/in/method | List Pay In Methods
[**payOutMethodList**](PaymentMethodsApi.md#payOutMethodList) | **GET** /api/v1/pay/out/method | List Pay Out Methods

<a name="payInMethodList"></a>
# **payInMethodList**
> List&lt;PayInMethod&gt; payInMethodList(country, currency, uuid, merchant)

List Pay In Methods

Available pay out methods will be listed based on the parameters provided

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentMethodsApi;


PaymentMethodsApi apiInstance = new PaymentMethodsApi();
String country = "country_example"; // String | 
String currency = "currency_example"; // String | 
String uuid = "uuid_example"; // String | 
String merchant = "merchant_example"; // String | 
try {
    List<PayInMethod> result = apiInstance.payInMethodList(country, currency, uuid, merchant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#payInMethodList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**|  | [optional]
 **currency** | **String**|  | [optional]
 **uuid** | **String**|  | [optional]
 **merchant** | **String**|  | [optional]

### Return type

[**List&lt;PayInMethod&gt;**](PayInMethod.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="payOutMethodList"></a>
# **payOutMethodList**
> List&lt;PayOutMethod&gt; payOutMethodList(country, currency, uuid, merchant)

List Pay Out Methods

Available pay out methods will be listed based on the parameters provided

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentMethodsApi;


PaymentMethodsApi apiInstance = new PaymentMethodsApi();
String country = "country_example"; // String | 
String currency = "currency_example"; // String | 
String uuid = "uuid_example"; // String | 
String merchant = "merchant_example"; // String | 
try {
    List<PayOutMethod> result = apiInstance.payOutMethodList(country, currency, uuid, merchant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#payOutMethodList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**|  | [optional]
 **currency** | **String**|  | [optional]
 **uuid** | **String**|  | [optional]
 **merchant** | **String**|  | [optional]

### Return type

[**List&lt;PayOutMethod&gt;**](PayOutMethod.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

