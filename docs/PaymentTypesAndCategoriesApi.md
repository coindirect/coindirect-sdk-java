# PaymentTypesAndCategoriesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listOptionsForPaymentMethodType**](PaymentTypesAndCategoriesApi.md#listOptionsForPaymentMethodType) | **GET** /api/public/payment/type/options/{id} | List option for Payment Method Type
[**listPaymentMethodCategories**](PaymentTypesAndCategoriesApi.md#listPaymentMethodCategories) | **GET** /api/public/payment/categories | List Payment Method Categories
[**listPaymentMethodTypes**](PaymentTypesAndCategoriesApi.md#listPaymentMethodTypes) | **GET** /api/public/payment/types | List Payment Method Types
[**listPaymentMethodTypesByCategory**](PaymentTypesAndCategoriesApi.md#listPaymentMethodTypesByCategory) | **GET** /api/public/payment/types/{id} | List Payment Method Types for Category


<a name="listOptionsForPaymentMethodType"></a>
# **listOptionsForPaymentMethodType**
> List&lt;GenericOption&gt; listOptionsForPaymentMethodType(id)

List option for Payment Method Type



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.PaymentTypesAndCategoriesApi;


PaymentTypesAndCategoriesApi apiInstance = new PaymentTypesAndCategoriesApi();
Long id = 789L; // Long | 
try {
    List<GenericOption> result = apiInstance.listOptionsForPaymentMethodType(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTypesAndCategoriesApi#listOptionsForPaymentMethodType");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPaymentMethodCategories"></a>
# **listPaymentMethodCategories**
> List&lt;PaymentMethodCategory&gt; listPaymentMethodCategories()

List Payment Method Categories



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.PaymentTypesAndCategoriesApi;


PaymentTypesAndCategoriesApi apiInstance = new PaymentTypesAndCategoriesApi();
try {
    List<PaymentMethodCategory> result = apiInstance.listPaymentMethodCategories();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTypesAndCategoriesApi#listPaymentMethodCategories");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPaymentMethodTypes"></a>
# **listPaymentMethodTypes**
> List&lt;PaymentMethodType&gt; listPaymentMethodTypes(countryCode)

List Payment Method Types



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.PaymentTypesAndCategoriesApi;


PaymentTypesAndCategoriesApi apiInstance = new PaymentTypesAndCategoriesApi();
String countryCode = "countryCode_example"; // String | 
try {
    List<PaymentMethodType> result = apiInstance.listPaymentMethodTypes(countryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTypesAndCategoriesApi#listPaymentMethodTypes");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPaymentMethodTypesByCategory"></a>
# **listPaymentMethodTypesByCategory**
> List&lt;PaymentMethodType&gt; listPaymentMethodTypesByCategory(id, countryCode)

List Payment Method Types for Category



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.PaymentTypesAndCategoriesApi;


PaymentTypesAndCategoriesApi apiInstance = new PaymentTypesAndCategoriesApi();
Long id = 789L; // Long | 
String countryCode = "countryCode_example"; // String | 
try {
    List<PaymentMethodType> result = apiInstance.listPaymentMethodTypesByCategory(id, countryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTypesAndCategoriesApi#listPaymentMethodTypesByCategory");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

