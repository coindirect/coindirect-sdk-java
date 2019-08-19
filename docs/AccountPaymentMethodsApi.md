# AccountPaymentMethodsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentMethodCreate**](AccountPaymentMethodsApi.md#paymentMethodCreate) | **POST** /api/payment-method | Create Payment Method
[**paymentMethodList**](AccountPaymentMethodsApi.md#paymentMethodList) | **GET** /api/payment-method | List Payment Methods
[**listPaymentMethodTypes**](AccountPaymentMethodsApi.md#listPaymentMethodTypes) | **GET** /api/payment-method-type | List Payment Method Types
[**listNestedOptionsForPaymentMethodType**](AccountPaymentMethodsApi.md#listNestedOptionsForPaymentMethodType) | **GET** /api/payment-method-type/dynamic-options/{id}/{code} | List Dependant options for Payment Method Type on field
[**listOptionsForPaymentMethodType**](AccountPaymentMethodsApi.md#listOptionsForPaymentMethodType) | **GET** /api/payment-method-type/options/{id} | List Options for Payment Method Type
[**listSearchOptionsForPaymentMethodType**](AccountPaymentMethodsApi.md#listSearchOptionsForPaymentMethodType) | **GET** /api/payment-method-type/search-options/{id} | List Search options for Payment Method Type
[**getPaymentMethodType**](AccountPaymentMethodsApi.md#getPaymentMethodType) | **GET** /api/payment-method-type/{id} | Read Payment Method Type
[**paymentMethodRead**](AccountPaymentMethodsApi.md#paymentMethodRead) | **GET** /api/payment-method/{id} | Read Payment Method
[**paymentMethodUpdate**](AccountPaymentMethodsApi.md#paymentMethodUpdate) | **PUT** /api/payment-method/{id} | Update Payment Method
[**paymentMethodDelete**](AccountPaymentMethodsApi.md#paymentMethodDelete) | **DELETE** /api/payment-method/{id} | Delete Payment Method
[**listPaymentMethodCategories**](AccountPaymentMethodsApi.md#listPaymentMethodCategories) | **GET** /api/paymentMethodCategory | List Payment Method Categories
[**getPaymentMethodCategory**](AccountPaymentMethodsApi.md#getPaymentMethodCategory) | **GET** /api/paymentMethodCategory/{id} | Read Payment Method Category

<a name="paymentMethodCreate"></a>
# **paymentMethodCreate**
> PaymentMethod paymentMethodCreate(body)

Create Payment Method

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.AccountPaymentMethodsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

AccountPaymentMethodsApi apiInstance = new AccountPaymentMethodsApi();
PaymentMethod body = new PaymentMethod(); // PaymentMethod | 
try {
    PaymentMethod result = apiInstance.paymentMethodCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountPaymentMethodsApi#paymentMethodCreate");
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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="paymentMethodList"></a>
# **paymentMethodList**
> List&lt;PaymentMethod&gt; paymentMethodList(currencyCode, offset, max)

List Payment Methods

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.AccountPaymentMethodsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

AccountPaymentMethodsApi apiInstance = new AccountPaymentMethodsApi();
String currencyCode = "currencyCode_example"; // String | 
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<PaymentMethod> result = apiInstance.paymentMethodList(currencyCode, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountPaymentMethodsApi#paymentMethodList");
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

[Hawk](../README.md#Hawk)

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
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.AccountPaymentMethodsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

AccountPaymentMethodsApi apiInstance = new AccountPaymentMethodsApi();
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<PaymentMethodType> result = apiInstance.listPaymentMethodTypes(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountPaymentMethodsApi#listPaymentMethodTypes");
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

[Hawk](../README.md#Hawk)

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
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.AccountPaymentMethodsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

AccountPaymentMethodsApi apiInstance = new AccountPaymentMethodsApi();
Long id = 789L; // Long | 
String code = "code_example"; // String | 
String value = "value_example"; // String | 
try {
    List<GenericOption> result = apiInstance.listNestedOptionsForPaymentMethodType(id, code, value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountPaymentMethodsApi#listNestedOptionsForPaymentMethodType");
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

[Hawk](../README.md#Hawk)

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
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.AccountPaymentMethodsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

AccountPaymentMethodsApi apiInstance = new AccountPaymentMethodsApi();
Long id = 789L; // Long | 
try {
    List<GenericOption> result = apiInstance.listOptionsForPaymentMethodType(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountPaymentMethodsApi#listOptionsForPaymentMethodType");
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

[Hawk](../README.md#Hawk)

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
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.AccountPaymentMethodsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

AccountPaymentMethodsApi apiInstance = new AccountPaymentMethodsApi();
Long id = 789L; // Long | 
try {
    List<GenericOption> result = apiInstance.listSearchOptionsForPaymentMethodType(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountPaymentMethodsApi#listSearchOptionsForPaymentMethodType");
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

[Hawk](../README.md#Hawk)

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
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.AccountPaymentMethodsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

AccountPaymentMethodsApi apiInstance = new AccountPaymentMethodsApi();
Long id = 789L; // Long | 
try {
    PaymentMethodType result = apiInstance.getPaymentMethodType(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountPaymentMethodsApi#getPaymentMethodType");
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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentMethodRead"></a>
# **paymentMethodRead**
> PaymentMethod paymentMethodRead(id)

Read Payment Method

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.AccountPaymentMethodsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

AccountPaymentMethodsApi apiInstance = new AccountPaymentMethodsApi();
Long id = 789L; // Long | 
try {
    PaymentMethod result = apiInstance.paymentMethodRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountPaymentMethodsApi#paymentMethodRead");
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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentMethodUpdate"></a>
# **paymentMethodUpdate**
> PaymentMethod paymentMethodUpdate(id, body)

Update Payment Method

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.AccountPaymentMethodsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

AccountPaymentMethodsApi apiInstance = new AccountPaymentMethodsApi();
Long id = 789L; // Long | 
PaymentMethod body = new PaymentMethod(); // PaymentMethod | 
try {
    PaymentMethod result = apiInstance.paymentMethodUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountPaymentMethodsApi#paymentMethodUpdate");
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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="paymentMethodDelete"></a>
# **paymentMethodDelete**
> paymentMethodDelete(id)

Delete Payment Method

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.AccountPaymentMethodsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

AccountPaymentMethodsApi apiInstance = new AccountPaymentMethodsApi();
Long id = 789L; // Long | 
try {
    apiInstance.paymentMethodDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountPaymentMethodsApi#paymentMethodDelete");
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

<a name="listPaymentMethodCategories"></a>
# **listPaymentMethodCategories**
> List&lt;PaymentMethodCategory&gt; listPaymentMethodCategories(offset, max)

List Payment Method Categories

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.AccountPaymentMethodsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

AccountPaymentMethodsApi apiInstance = new AccountPaymentMethodsApi();
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<PaymentMethodCategory> result = apiInstance.listPaymentMethodCategories(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountPaymentMethodsApi#listPaymentMethodCategories");
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

[Hawk](../README.md#Hawk)

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
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.AccountPaymentMethodsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

AccountPaymentMethodsApi apiInstance = new AccountPaymentMethodsApi();
Long id = 789L; // Long | 
try {
    PaymentMethodCategory result = apiInstance.getPaymentMethodCategory(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountPaymentMethodsApi#getPaymentMethodCategory");
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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

