# CurrenciesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertCurrency**](CurrenciesApi.md#convertCurrency) | **GET** /api/currency/convert/{fromCode}/{toCode} | Convert Currency Value
[**getCurrency**](CurrenciesApi.md#getCurrency) | **GET** /api/currency/{id} | Read Currency
[**getCurrencyMetadata**](CurrenciesApi.md#getCurrencyMetadata) | **GET** /api/currency/metadata/{code} | Read Currency Metadata
[**getValuesForCurrency**](CurrenciesApi.md#getValuesForCurrency) | **GET** /api/currency/values/{baseCurrency} | Get Values for Currency
[**listCurrenciesCrypto**](CurrenciesApi.md#listCurrenciesCrypto) | **GET** /api/currency/crypto | List Crypto Currencies
[**listCurrenciesFiat**](CurrenciesApi.md#listCurrenciesFiat) | **GET** /api/currency/fiat | List Fiat Currencies

<a name="convertCurrency"></a>
# **convertCurrency**
> WrappedPrimitive convertCurrency(fromCode, toCode, amount)

Convert Currency Value

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.CurrenciesApi;


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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrency"></a>
# **getCurrency**
> Currency getCurrency(id)

Read Currency

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.CurrenciesApi;


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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrencyMetadata"></a>
# **getCurrencyMetadata**
> Currency getCurrencyMetadata(code)

Read Currency Metadata

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.CurrenciesApi;


CurrenciesApi apiInstance = new CurrenciesApi();
String code = "code_example"; // String | 
try {
    Currency result = apiInstance.getCurrencyMetadata(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#getCurrencyMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**|  |

### Return type

[**Currency**](Currency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getValuesForCurrency"></a>
# **getValuesForCurrency**
> List&lt;CurrencyRate&gt; getValuesForCurrency(baseCurrency, all)

Get Values for Currency

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.CurrenciesApi;


CurrenciesApi apiInstance = new CurrenciesApi();
String baseCurrency = "baseCurrency_example"; // String | 
Boolean all = true; // Boolean | 
try {
    List<CurrencyRate> result = apiInstance.getValuesForCurrency(baseCurrency, all);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#getValuesForCurrency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseCurrency** | **String**|  |
 **all** | **Boolean**|  | [optional]

### Return type

[**List&lt;CurrencyRate&gt;**](CurrencyRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCurrenciesCrypto"></a>
# **listCurrenciesCrypto**
> List&lt;Currency&gt; listCurrenciesCrypto(allowDeposits, all, offset, max)

List Crypto Currencies

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.CurrenciesApi;


CurrenciesApi apiInstance = new CurrenciesApi();
Boolean allowDeposits = true; // Boolean | 
Boolean all = true; // Boolean | 
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<Currency> result = apiInstance.listCurrenciesCrypto(allowDeposits, all, offset, max);
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
 **all** | **Boolean**|  | [optional]
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;Currency&gt;**](Currency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCurrenciesFiat"></a>
# **listCurrenciesFiat**
> List&lt;Currency&gt; listCurrenciesFiat(usable, all, offset, max)

List Fiat Currencies

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.CurrenciesApi;


CurrenciesApi apiInstance = new CurrenciesApi();
Boolean usable = true; // Boolean | 
Boolean all = true; // Boolean | 
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<Currency> result = apiInstance.listCurrenciesFiat(usable, all, offset, max);
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
 **all** | **Boolean**|  | [optional]
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;Currency&gt;**](Currency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

