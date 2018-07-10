# CurrenciesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertCurrency**](CurrenciesApi.md#convertCurrency) | **GET** /api/currency/convert/{fromCode}/{toCode} | Convert Currency Value
[**getCurrency**](CurrenciesApi.md#getCurrency) | **GET** /api/currency/{id} | Read Currency
[**listCurrenciesCrypto**](CurrenciesApi.md#listCurrenciesCrypto) | **GET** /api/currency/crypto | List Crypto Currencies
[**listCurrenciesFiat**](CurrenciesApi.md#listCurrenciesFiat) | **GET** /api/currency/fiat | List Fiat Currencies


<a name="convertCurrency"></a>
# **convertCurrency**
> WrappedPrimitive convertCurrency(fromCode, toCode, amount)

Convert Currency Value



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.CurrenciesApi;


CurrenciesApi apiInstance = new CurrenciesApi();
String fromCode = "fromCode_example"; // String | 
String toCode = "toCode_example"; // String | 
BigDecimal amount = new BigDecimal(); // BigDecimal | 
try {
    WrappedPrimitive result = apiInstance.convertCurrency(fromCode, toCode, amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#convertCurrency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromCode** | **String**|  |
 **toCode** | **String**|  |
 **amount** | **BigDecimal**|  | [optional]

### Return type

[**WrappedPrimitive**](WrappedPrimitive.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrency"></a>
# **getCurrency**
> Currency getCurrency(id)

Read Currency



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.CurrenciesApi;


CurrenciesApi apiInstance = new CurrenciesApi();
Long id = 789L; // Long | 
try {
    Currency result = apiInstance.getCurrency(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#getCurrency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Currency**](Currency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCurrenciesCrypto"></a>
# **listCurrenciesCrypto**
> List&lt;Currency&gt; listCurrenciesCrypto(allowDeposits, offset, max)

List Crypto Currencies



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.CurrenciesApi;


CurrenciesApi apiInstance = new CurrenciesApi();
Boolean allowDeposits = true; // Boolean | 
Integer offset = 0; // Integer | start offset
Integer max = 10; // Integer | max results
try {
    List<Currency> result = apiInstance.listCurrenciesCrypto(allowDeposits, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#listCurrenciesCrypto");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowDeposits** | **Boolean**|  | [optional]
 **offset** | **Integer**| start offset | [optional] [default to 0]
 **max** | **Integer**| max results | [optional] [default to 10]

### Return type

[**List&lt;Currency&gt;**](Currency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCurrenciesFiat"></a>
# **listCurrenciesFiat**
> List&lt;Currency&gt; listCurrenciesFiat(usable, offset, max)

List Fiat Currencies



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.CurrenciesApi;


CurrenciesApi apiInstance = new CurrenciesApi();
Boolean usable = true; // Boolean | 
Integer offset = 0; // Integer | start offset
Integer max = 10; // Integer | max results
try {
    List<Currency> result = apiInstance.listCurrenciesFiat(usable, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#listCurrenciesFiat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usable** | **Boolean**|  | [optional]
 **offset** | **Integer**| start offset | [optional] [default to 0]
 **max** | **Integer**| max results | [optional] [default to 10]

### Return type

[**List&lt;Currency&gt;**](Currency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

