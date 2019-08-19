# PaymentTypesAndCategoriesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentMethodCategoryList**](PaymentTypesAndCategoriesApi.md#paymentMethodCategoryList) | **GET** /api/public/payment/categories | List Payment Method Categories
[**paymentMethodTypeListOption**](PaymentTypesAndCategoriesApi.md#paymentMethodTypeListOption) | **GET** /api/public/payment/type/options/{id} | List Option for Payment Method Type
[**paymentMethodTypeList**](PaymentTypesAndCategoriesApi.md#paymentMethodTypeList) | **GET** /api/public/payment/types | List Payment Method Types
[**paymentMethodTypeListByCategory**](PaymentTypesAndCategoriesApi.md#paymentMethodTypeListByCategory) | **GET** /api/public/payment/types/{id} | List Payment Method Types for Category

<a name="paymentMethodCategoryList"></a>
# **paymentMethodCategoryList**
> List&lt;PaymentMethodCategory&gt; paymentMethodCategoryList()

List Payment Method Categories

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentTypesAndCategoriesApi;


PaymentTypesAndCategoriesApi apiInstance = new PaymentTypesAndCategoriesApi();
try {
    List<PaymentMethodCategory> result = apiInstance.paymentMethodCategoryList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTypesAndCategoriesApi#paymentMethodCategoryList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PaymentMethodCategory&gt;**](PaymentMethodCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentMethodTypeListOption"></a>
# **paymentMethodTypeListOption**
> List&lt;GenericOption&gt; paymentMethodTypeListOption(id)

List Option for Payment Method Type

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentTypesAndCategoriesApi;


PaymentTypesAndCategoriesApi apiInstance = new PaymentTypesAndCategoriesApi();
Long id = 789L; // Long | 
try {
    List<GenericOption> result = apiInstance.paymentMethodTypeListOption(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTypesAndCategoriesApi#paymentMethodTypeListOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**List&lt;GenericOption&gt;**](GenericOption.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentMethodTypeList"></a>
# **paymentMethodTypeList**
> List&lt;PaymentMethodType&gt; paymentMethodTypeList(countryCode)

List Payment Method Types

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentTypesAndCategoriesApi;


PaymentTypesAndCategoriesApi apiInstance = new PaymentTypesAndCategoriesApi();
String countryCode = "countryCode_example"; // String | 
try {
    List<PaymentMethodType> result = apiInstance.paymentMethodTypeList(countryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTypesAndCategoriesApi#paymentMethodTypeList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**|  | [optional]

### Return type

[**List&lt;PaymentMethodType&gt;**](PaymentMethodType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentMethodTypeListByCategory"></a>
# **paymentMethodTypeListByCategory**
> List&lt;PaymentMethodType&gt; paymentMethodTypeListByCategory(id, countryCode)

List Payment Method Types for Category

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentTypesAndCategoriesApi;


PaymentTypesAndCategoriesApi apiInstance = new PaymentTypesAndCategoriesApi();
Long id = 789L; // Long | 
String countryCode = "countryCode_example"; // String | 
try {
    List<PaymentMethodType> result = apiInstance.paymentMethodTypeListByCategory(id, countryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTypesAndCategoriesApi#paymentMethodTypeListByCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **countryCode** | **String**|  | [optional]

### Return type

[**List&lt;PaymentMethodType&gt;**](PaymentMethodType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

