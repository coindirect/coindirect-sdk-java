# PaymentsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptPayment**](PaymentsApi.md#acceptPayment) | **PUT** /api/v1/pay/{uuid}/accept | Accept payment
[**cancelPayment**](PaymentsApi.md#cancelPayment) | **DELETE** /api/v1/pay/{uuid} | Cancel payment
[**listPayments**](PaymentsApi.md#listPayments) | **GET** /api/v1/pay | Read payments
[**listSupportedPayInMethods**](PaymentsApi.md#listSupportedPayInMethods) | **GET** /api/v1/pay/in/method | List supported pay in methods
[**listSupportedPayOutMethods**](PaymentsApi.md#listSupportedPayOutMethods) | **GET** /api/v1/pay/out/method | List supported pay out methods
[**lockPayment**](PaymentsApi.md#lockPayment) | **PUT** /api/v1/pay/{uuid}/lock | Lock payment
[**readPayment**](PaymentsApi.md#readPayment) | **GET** /api/v1/pay/{uuid} | Read payment information
[**requestPayment**](PaymentsApi.md#requestPayment) | **POST** /api/v1/pay | Request a new payment
[**settlePaymentWithQuote**](PaymentsApi.md#settlePaymentWithQuote) | **PUT** /api/v1/pay/{uuid}/settle | Settle payment
[**updatePayment**](PaymentsApi.md#updatePayment) | **PUT** /api/v1/pay/{uuid}/update | Update payment details

<a name="acceptPayment"></a>
# **acceptPayment**
> Payment acceptPayment(uuid, body)

Accept payment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
String uuid = "uuid_example"; // String | 
PaymentMetadata body = new PaymentMetadata(); // PaymentMetadata | 
try {
    Payment result = apiInstance.acceptPayment(uuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#acceptPayment");
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

<a name="cancelPayment"></a>
# **cancelPayment**
> cancelPayment(uuid)

Cancel payment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
String uuid = "uuid_example"; // String | 
try {
    apiInstance.cancelPayment(uuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#cancelPayment");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listPayments"></a>
# **listPayments**
> List&lt;Payment&gt; listPayments(merchantId)

Read payments

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
String merchantId = "merchantId_example"; // String | 
try {
    List<Payment> result = apiInstance.listPayments(merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#listPayments");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSupportedPayInMethods"></a>
# **listSupportedPayInMethods**
> List&lt;PayInMethod&gt; listSupportedPayInMethods(country, currency, uuid, merchant)

List supported pay in methods

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
String country = "country_example"; // String | 
String currency = "currency_example"; // String | 
String uuid = "uuid_example"; // String | 
String merchant = "merchant_example"; // String | 
try {
    List<PayInMethod> result = apiInstance.listSupportedPayInMethods(country, currency, uuid, merchant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#listSupportedPayInMethods");
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

<a name="listSupportedPayOutMethods"></a>
# **listSupportedPayOutMethods**
> List&lt;PayOutMethod&gt; listSupportedPayOutMethods(country, currency, uuid, merchant)

List supported pay out methods

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
String country = "country_example"; // String | 
String currency = "currency_example"; // String | 
String uuid = "uuid_example"; // String | 
String merchant = "merchant_example"; // String | 
try {
    List<PayOutMethod> result = apiInstance.listSupportedPayOutMethods(country, currency, uuid, merchant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#listSupportedPayOutMethods");
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

<a name="lockPayment"></a>
# **lockPayment**
> Payment lockPayment(uuid)

Lock payment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
String uuid = "uuid_example"; // String | 
try {
    Payment result = apiInstance.lockPayment(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#lockPayment");
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

<a name="readPayment"></a>
# **readPayment**
> Payment readPayment(uuid, reference)

Read payment information

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
String uuid = "uuid_example"; // String | 
String reference = "reference_example"; // String | 
try {
    Payment result = apiInstance.readPayment(uuid, reference);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#readPayment");
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

<a name="requestPayment"></a>
# **requestPayment**
> Payment requestPayment(body)

Request a new payment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
PayRequest body = new PayRequest(); // PayRequest | 
try {
    Payment result = apiInstance.requestPayment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#requestPayment");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="settlePaymentWithQuote"></a>
# **settlePaymentWithQuote**
> Payment settlePaymentWithQuote(uuid, body)

Settle payment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
String uuid = "uuid_example"; // String | 
Quote body = new Quote(); // Quote | 
try {
    Payment result = apiInstance.settlePaymentWithQuote(uuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#settlePaymentWithQuote");
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

<a name="updatePayment"></a>
# **updatePayment**
> Payment updatePayment(uuid, body)

Update payment details

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
String uuid = "uuid_example"; // String | 
PayDetailRequest body = new PayDetailRequest(); // PayDetailRequest | 
try {
    Payment result = apiInstance.updatePayment(uuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#updatePayment");
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

