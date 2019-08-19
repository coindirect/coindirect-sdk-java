# PaymentsMerchantApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentCreate**](PaymentsMerchantApi.md#paymentCreate) | **POST** /api/v1/pay | Create Payment
[**paymentList**](PaymentsMerchantApi.md#paymentList) | **GET** /api/v1/pay | List Payments
[**paymentRead**](PaymentsMerchantApi.md#paymentRead) | **GET** /api/v1/pay/{uuid} | Read Payment
[**paymentCancel**](PaymentsMerchantApi.md#paymentCancel) | **DELETE** /api/v1/pay/{uuid} | Cancel Payment

<a name="paymentCreate"></a>
# **paymentCreate**
> Payment paymentCreate(body)

Create Payment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.PaymentsMerchantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

PaymentsMerchantApi apiInstance = new PaymentsMerchantApi();
PayRequest body = new PayRequest(); // PayRequest | 
try {
    Payment result = apiInstance.paymentCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsMerchantApi#paymentCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PayRequest**](PayRequest.md)|  | [optional]

### Return type

[**Payment**](Payment.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="paymentList"></a>
# **paymentList**
> List&lt;Payment&gt; paymentList(merchantId)

List Payments

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.PaymentsMerchantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

PaymentsMerchantApi apiInstance = new PaymentsMerchantApi();
String merchantId = "merchantId_example"; // String | 
try {
    List<Payment> result = apiInstance.paymentList(merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsMerchantApi#paymentList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **String**|  | [optional]

### Return type

[**List&lt;Payment&gt;**](Payment.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentRead"></a>
# **paymentRead**
> Payment paymentRead(uuid, reference)

Read Payment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsMerchantApi;


PaymentsMerchantApi apiInstance = new PaymentsMerchantApi();
String uuid = "uuid_example"; // String | 
String reference = "reference_example"; // String | 
try {
    Payment result = apiInstance.paymentRead(uuid, reference);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsMerchantApi#paymentRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |
 **reference** | **String**|  | [optional]

### Return type

[**Payment**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentCancel"></a>
# **paymentCancel**
> paymentCancel(uuid)

Cancel Payment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.PaymentsMerchantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

PaymentsMerchantApi apiInstance = new PaymentsMerchantApi();
String uuid = "uuid_example"; // String | 
try {
    apiInstance.paymentCancel(uuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsMerchantApi#paymentCancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

