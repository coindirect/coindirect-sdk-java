# PaymentsUserApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentRead**](PaymentsUserApi.md#paymentRead) | **GET** /api/v1/pay/{uuid} | Read Payment
[**paymentAccept**](PaymentsUserApi.md#paymentAccept) | **PUT** /api/v1/pay/{uuid}/accept | Accept Payment
[**paymentLock**](PaymentsUserApi.md#paymentLock) | **PUT** /api/v1/pay/{uuid}/lock | Lock Payment
[**paymentSettle**](PaymentsUserApi.md#paymentSettle) | **PUT** /api/v1/pay/{uuid}/settle | Settle Payment
[**paymentUpdate**](PaymentsUserApi.md#paymentUpdate) | **PUT** /api/v1/pay/{uuid}/update | Update Payment

<a name="paymentRead"></a>
# **paymentRead**
> Payment paymentRead(uuid, reference)

Read Payment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsUserApi;


PaymentsUserApi apiInstance = new PaymentsUserApi();
String uuid = "uuid_example"; // String | 
String reference = "reference_example"; // String | 
try {
    Payment result = apiInstance.paymentRead(uuid, reference);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsUserApi#paymentRead");
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

<a name="paymentAccept"></a>
# **paymentAccept**
> Payment paymentAccept(uuid, body)

Accept Payment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsUserApi;


PaymentsUserApi apiInstance = new PaymentsUserApi();
String uuid = "uuid_example"; // String | 
PaymentMetadata body = new PaymentMetadata(); // PaymentMetadata | 
try {
    Payment result = apiInstance.paymentAccept(uuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsUserApi#paymentAccept");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |
 **body** | [**PaymentMetadata**](PaymentMetadata.md)|  | [optional]

### Return type

[**Payment**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="paymentLock"></a>
# **paymentLock**
> Payment paymentLock(uuid)

Lock Payment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsUserApi;


PaymentsUserApi apiInstance = new PaymentsUserApi();
String uuid = "uuid_example"; // String | 
try {
    Payment result = apiInstance.paymentLock(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsUserApi#paymentLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**Payment**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentSettle"></a>
# **paymentSettle**
> Payment paymentSettle(uuid, body)

Settle Payment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsUserApi;


PaymentsUserApi apiInstance = new PaymentsUserApi();
String uuid = "uuid_example"; // String | 
Quote body = new Quote(); // Quote | 
try {
    Payment result = apiInstance.paymentSettle(uuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsUserApi#paymentSettle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |
 **body** | [**Quote**](Quote.md)|  | [optional]

### Return type

[**Payment**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="paymentUpdate"></a>
# **paymentUpdate**
> Payment paymentUpdate(uuid, body)

Update Payment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsUserApi;


PaymentsUserApi apiInstance = new PaymentsUserApi();
String uuid = "uuid_example"; // String | 
PayDetailRequest body = new PayDetailRequest(); // PayDetailRequest | 
try {
    Payment result = apiInstance.paymentUpdate(uuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsUserApi#paymentUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |
 **body** | [**PayDetailRequest**](PayDetailRequest.md)|  | [optional]

### Return type

[**Payment**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

