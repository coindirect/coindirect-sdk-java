# PaymentMethodsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentMethod**](PaymentMethodsApi.md#createPaymentMethod) | **POST** /api/payment-method | Create Payment Method
[**deletePaymentMethod**](PaymentMethodsApi.md#deletePaymentMethod) | **DELETE** /api/payment-method/{id} | Delete Payment Method
[**getPaymentMethod**](PaymentMethodsApi.md#getPaymentMethod) | **GET** /api/payment-method/{id} | Retrieve Payment Method
[**getPaymentMethodCategory**](PaymentMethodsApi.md#getPaymentMethodCategory) | **GET** /api/paymentMethodCategory/{id} | Read Payment Method Category
[**getPaymentMethodType**](PaymentMethodsApi.md#getPaymentMethodType) | **GET** /api/payment-method-type/{id} | Read Payment Method Type
[**listNestedOptionsForPaymentMethodType**](PaymentMethodsApi.md#listNestedOptionsForPaymentMethodType) | **GET** /api/payment-method-type/dynamic-options/{id}/{code} | List Dependant options for Payment Method Type on field
[**listOptionsForPaymentMethodType**](PaymentMethodsApi.md#listOptionsForPaymentMethodType) | **GET** /api/payment-method-type/options/{id} | List Options for Payment Method Type
[**listPaymentMethodCategories**](PaymentMethodsApi.md#listPaymentMethodCategories) | **GET** /api/paymentMethodCategory | List Payment Method Categories
[**listPaymentMethodTypes**](PaymentMethodsApi.md#listPaymentMethodTypes) | **GET** /api/payment-method-type | List Payment Method Types
[**listPaymentMethods**](PaymentMethodsApi.md#listPaymentMethods) | **GET** /api/payment-method | List Payment Methods
[**listSearchOptionsForPaymentMethodType**](PaymentMethodsApi.md#listSearchOptionsForPaymentMethodType) | **GET** /api/payment-method-type/search-options/{id} | List Search options for Payment Method Type
[**updatePaymentMethod**](PaymentMethodsApi.md#updatePaymentMethod) | **PUT** /api/payment-method/{id} | Update Payment Method

<a name="createPaymentMethod"></a>
# **createPaymentMethod**
> PaymentMethod createPaymentMethod(body)

Create Payment Method

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentMethodsApi;


PaymentMethodsApi apiInstance = new PaymentMethodsApi();
PaymentMethod body = new PaymentMethod(); // PaymentMethod | 
try {
    PaymentMethod result = apiInstance.createPaymentMethod(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#createPaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PaymentMethod**](PaymentMethod.md)|  | [optional]

### Return type

[**PaymentMethod**](PaymentMethod.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePaymentMethod"></a>
# **deletePaymentMethod**
> deletePaymentMethod(id)

Delete Payment Method

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentMethodsApi;


PaymentMethodsApi apiInstance = new PaymentMethodsApi();
Long id = 789L; // Long | 
try {
    apiInstance.deletePaymentMethod(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#deletePaymentMethod");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPaymentMethod"></a>
# **getPaymentMethod**
> PaymentMethod getPaymentMethod(id)

Retrieve Payment Method

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentMethodsApi;


PaymentMethodsApi apiInstance = new PaymentMethodsApi();
Long id = 789L; // Long | 
try {
    PaymentMethod result = apiInstance.getPaymentMethod(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#getPaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**PaymentMethod**](PaymentMethod.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPaymentMethodCategory"></a>
# **getPaymentMethodCategory**
> PaymentMethodCategory getPaymentMethodCategory(id)

Read Payment Method Category

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentMethodsApi;


PaymentMethodsApi apiInstance = new PaymentMethodsApi();
Long id = 789L; // Long | 
try {
    PaymentMethodCategory result = apiInstance.getPaymentMethodCategory(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#getPaymentMethodCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**PaymentMethodCategory**](PaymentMethodCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPaymentMethodType"></a>
# **getPaymentMethodType**
> PaymentMethodType getPaymentMethodType(id)

Read Payment Method Type

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentMethodsApi;


PaymentMethodsApi apiInstance = new PaymentMethodsApi();
Long id = 789L; // Long | 
try {
    PaymentMethodType result = apiInstance.getPaymentMethodType(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#getPaymentMethodType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**PaymentMethodType**](PaymentMethodType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNestedOptionsForPaymentMethodType"></a>
# **listNestedOptionsForPaymentMethodType**
> List&lt;GenericOption&gt; listNestedOptionsForPaymentMethodType(id, code, value)

List Dependant options for Payment Method Type on field

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentMethodsApi;


PaymentMethodsApi apiInstance = new PaymentMethodsApi();
Long id = 789L; // Long | 
String code = "code_example"; // String | 
String value = "value_example"; // String | 
try {
    List<GenericOption> result = apiInstance.listNestedOptionsForPaymentMethodType(id, code, value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#listNestedOptionsForPaymentMethodType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **code** | **String**|  |
 **value** | **String**|  | [optional]

### Return type

[**List&lt;GenericOption&gt;**](GenericOption.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOptionsForPaymentMethodType"></a>
# **listOptionsForPaymentMethodType**
> List&lt;GenericOption&gt; listOptionsForPaymentMethodType(id)

List Options for Payment Method Type

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentMethodsApi;


PaymentMethodsApi apiInstance = new PaymentMethodsApi();
Long id = 789L; // Long | 
try {
    List<GenericOption> result = apiInstance.listOptionsForPaymentMethodType(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#listOptionsForPaymentMethodType");
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

<a name="listPaymentMethodCategories"></a>
# **listPaymentMethodCategories**
> List&lt;PaymentMethodCategory&gt; listPaymentMethodCategories(offset, max)

List Payment Method Categories

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentMethodsApi;


PaymentMethodsApi apiInstance = new PaymentMethodsApi();
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<PaymentMethodCategory> result = apiInstance.listPaymentMethodCategories(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#listPaymentMethodCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;PaymentMethodCategory&gt;**](PaymentMethodCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPaymentMethodTypes"></a>
# **listPaymentMethodTypes**
> List&lt;PaymentMethodType&gt; listPaymentMethodTypes(offset, max)

List Payment Method Types

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentMethodsApi;


PaymentMethodsApi apiInstance = new PaymentMethodsApi();
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<PaymentMethodType> result = apiInstance.listPaymentMethodTypes(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#listPaymentMethodTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;PaymentMethodType&gt;**](PaymentMethodType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPaymentMethods"></a>
# **listPaymentMethods**
> List&lt;PaymentMethod&gt; listPaymentMethods(currencyCode, offset, max)

List Payment Methods

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentMethodsApi;


PaymentMethodsApi apiInstance = new PaymentMethodsApi();
String currencyCode = "currencyCode_example"; // String | 
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<PaymentMethod> result = apiInstance.listPaymentMethods(currencyCode, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#listPaymentMethods");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyCode** | **String**|  | [optional]
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;PaymentMethod&gt;**](PaymentMethod.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSearchOptionsForPaymentMethodType"></a>
# **listSearchOptionsForPaymentMethodType**
> List&lt;GenericOption&gt; listSearchOptionsForPaymentMethodType(id)

List Search options for Payment Method Type

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentMethodsApi;


PaymentMethodsApi apiInstance = new PaymentMethodsApi();
Long id = 789L; // Long | 
try {
    List<GenericOption> result = apiInstance.listSearchOptionsForPaymentMethodType(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#listSearchOptionsForPaymentMethodType");
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

<a name="updatePaymentMethod"></a>
# **updatePaymentMethod**
> PaymentMethod updatePaymentMethod(id, body)

Update Payment Method

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentMethodsApi;


PaymentMethodsApi apiInstance = new PaymentMethodsApi();
Long id = 789L; // Long | 
PaymentMethod body = new PaymentMethod(); // PaymentMethod | 
try {
    PaymentMethod result = apiInstance.updatePaymentMethod(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#updatePaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**PaymentMethod**](PaymentMethod.md)|  | [optional]

### Return type

[**PaymentMethod**](PaymentMethod.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

