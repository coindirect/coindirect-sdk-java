# BusinessApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptPayment**](BusinessApi.md#acceptPayment) | **PUT** /api/v1/pay/{uuid}/accept | Accept payment
[**acceptQuote**](BusinessApi.md#acceptQuote) | **PUT** /api/v1/quote/accept/{uuid} | Accept a quote
[**cancelPayment**](BusinessApi.md#cancelPayment) | **DELETE** /api/v1/pay/{uuid} | Cancel payment
[**completePinAuthentication**](BusinessApi.md#completePinAuthentication) | **PUT** /api/v1/merchant/user/login | Login with pin
[**convertCurrency**](BusinessApi.md#convertCurrency) | **GET** /api/currency/convert/{fromCode}/{toCode} | Convert Currency Value
[**createMerchantId**](BusinessApi.md#createMerchantId) | **POST** /api/v1/merchant | Create Merchant ID
[**detectCountryByIp**](BusinessApi.md#detectCountryByIp) | **GET** /api/country/detect | Detect Country by IP
[**getCountry**](BusinessApi.md#getCountry) | **GET** /api/country/{id} | Read Country
[**getCountryByCode**](BusinessApi.md#getCountryByCode) | **GET** /api/country/codes/{code} | Read Country by Code
[**getCurrency**](BusinessApi.md#getCurrency) | **GET** /api/currency/{id} | Read Currency
[**getCurrencyMetadata**](BusinessApi.md#getCurrencyMetadata) | **GET** /api/currency/metadata/{code} | Read Currency Metadata
[**getValuesForCurrency**](BusinessApi.md#getValuesForCurrency) | **GET** /api/currency/values/{baseCurrency} | Get Values for Currency
[**listCountries**](BusinessApi.md#listCountries) | **GET** /api/country | List Countries
[**listCountryCodes**](BusinessApi.md#listCountryCodes) | **GET** /api/country/codes | List Country Codes
[**listCurrenciesCrypto**](BusinessApi.md#listCurrenciesCrypto) | **GET** /api/currency/crypto | List Crypto Currencies
[**listCurrenciesFiat**](BusinessApi.md#listCurrenciesFiat) | **GET** /api/currency/fiat | List Fiat Currencies
[**listMerchantIds**](BusinessApi.md#listMerchantIds) | **GET** /api/v1/merchant | List Merchant IDs
[**listPayments**](BusinessApi.md#listPayments) | **GET** /api/v1/pay | Read payments
[**listQuotes**](BusinessApi.md#listQuotes) | **GET** /api/v1/quote | List quotes
[**listSupportedPayInMethods**](BusinessApi.md#listSupportedPayInMethods) | **GET** /api/v1/pay/in/method | List supported pay in methods
[**listSupportedPayOutMethods**](BusinessApi.md#listSupportedPayOutMethods) | **GET** /api/v1/pay/out/method | List supported pay out methods
[**lockPayment**](BusinessApi.md#lockPayment) | **PUT** /api/v1/pay/{uuid}/lock | Lock payment
[**merchantCreateUser**](BusinessApi.md#merchantCreateUser) | **POST** /api/v1/merchant/user/register | Create new user
[**merchantCreateUserDocument**](BusinessApi.md#merchantCreateUserDocument) | **POST** /api/v1/merchant/user/document | Upload a document for an account
[**merchantListUserDocuments**](BusinessApi.md#merchantListUserDocuments) | **GET** /api/v1/merchant/user/document | List uploaded documents for an account
[**merchantReadAccountInformation**](BusinessApi.md#merchantReadAccountInformation) | **GET** /api/v1/merchant/user/profile | Get account information
[**merchantUpdateAccountInformation**](BusinessApi.md#merchantUpdateAccountInformation) | **PUT** /api/v1/merchant/user/profile | Update account information
[**merchantUserSetPassword**](BusinessApi.md#merchantUserSetPassword) | **PUT** /api/v1/merchant/user/password | Set password
[**readMerchantById**](BusinessApi.md#readMerchantById) | **GET** /api/v1/merchant/{id} | Read merchant by id
[**readPayment**](BusinessApi.md#readPayment) | **GET** /api/v1/pay/{uuid} | Read payment information
[**readQuote**](BusinessApi.md#readQuote) | **GET** /api/v1/quote/{uuid} | Read a quote
[**readTransactionLimits**](BusinessApi.md#readTransactionLimits) | **GET** /api/v1/limit | Get transaction limits
[**requestNewQuotePaymentInstructions**](BusinessApi.md#requestNewQuotePaymentInstructions) | **PUT** /api/v1/quote/payment/{uuid} | Request new payment instructions
[**requestPayment**](BusinessApi.md#requestPayment) | **POST** /api/v1/pay | Request a new payment
[**requestQuote**](BusinessApi.md#requestQuote) | **POST** /api/v1/quote | Request a quote
[**settlePaymentWithQuote**](BusinessApi.md#settlePaymentWithQuote) | **PUT** /api/v1/pay/{uuid}/settle | Settle payment
[**startPinAuthentication**](BusinessApi.md#startPinAuthentication) | **POST** /api/v1/merchant/user/login | Start pin authentication
[**updateMerchantId**](BusinessApi.md#updateMerchantId) | **PUT** /api/v1/merchant/{id} | Update Merchant ID
[**updatePayment**](BusinessApi.md#updatePayment) | **PUT** /api/v1/pay/{uuid}/update | Update payment details

<a name="acceptPayment"></a>
# **acceptPayment**
> Payment acceptPayment(uuid, body)

Accept payment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String uuid = "uuid_example"; // String | 
PaymentMetadata body = new PaymentMetadata(); // PaymentMetadata | 
try {
    Payment result = apiInstance.acceptPayment(uuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#acceptPayment");
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

<a name="acceptQuote"></a>
# **acceptQuote**
> AcceptedQuote acceptQuote(uuid, body)

Accept a quote

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String uuid = "uuid_example"; // String | 
PaymentMetadata body = new PaymentMetadata(); // PaymentMetadata | 
try {
    AcceptedQuote result = apiInstance.acceptQuote(uuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#acceptQuote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |
 **body** | [**PaymentMetadata**](PaymentMetadata.md)|  | [optional]

### Return type

[**AcceptedQuote**](AcceptedQuote.md)

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
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String uuid = "uuid_example"; // String | 
try {
    apiInstance.cancelPayment(uuid);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#cancelPayment");
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

<a name="completePinAuthentication"></a>
# **completePinAuthentication**
> AccessToken completePinAuthentication(body)

Login with pin

The pin is usable only once, if data is not correctly stored, you will need to issue a new pin

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
WrappedPrimitiveString body = new WrappedPrimitiveString(); // WrappedPrimitiveString | 
try {
    AccessToken result = apiInstance.completePinAuthentication(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#completePinAuthentication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WrappedPrimitiveString**](WrappedPrimitiveString.md)|  | [optional]

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="convertCurrency"></a>
# **convertCurrency**
> WrappedPrimitive convertCurrency(fromCode, toCode, amount)

Convert Currency Value

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String fromCode = "fromCode_example"; // String | 
String toCode = "toCode_example"; // String | 
BigDecimal amount = new BigDecimal(); // BigDecimal | 
try {
    WrappedPrimitive result = apiInstance.convertCurrency(fromCode, toCode, amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#convertCurrency");
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

<a name="createMerchantId"></a>
# **createMerchantId**
> Merchant createMerchantId(body)

Create Merchant ID

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
Merchant body = new Merchant(); // Merchant | 
try {
    Merchant result = apiInstance.createMerchantId(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#createMerchantId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Merchant**](Merchant.md)|  | [optional]

### Return type

[**Merchant**](Merchant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="detectCountryByIp"></a>
# **detectCountryByIp**
> Country detectCountryByIp()

Detect Country by IP

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
try {
    Country result = apiInstance.detectCountryByIp();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#detectCountryByIp");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Country**](Country.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCountry"></a>
# **getCountry**
> Country getCountry(id)

Read Country

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
Long id = 789L; // Long | 
try {
    Country result = apiInstance.getCountry(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#getCountry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Country**](Country.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCountryByCode"></a>
# **getCountryByCode**
> Country getCountryByCode(code)

Read Country by Code

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String code = "code_example"; // String | 
try {
    Country result = apiInstance.getCountryByCode(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#getCountryByCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**|  |

### Return type

[**Country**](Country.md)

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
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
Long id = 789L; // Long | 
try {
    Currency result = apiInstance.getCurrency(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#getCurrency");
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
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String code = "code_example"; // String | 
try {
    Currency result = apiInstance.getCurrencyMetadata(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#getCurrencyMetadata");
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
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String baseCurrency = "baseCurrency_example"; // String | 
Boolean all = true; // Boolean | 
try {
    List<CurrencyRate> result = apiInstance.getValuesForCurrency(baseCurrency, all);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#getValuesForCurrency");
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

<a name="listCountries"></a>
# **listCountries**
> List&lt;Country&gt; listCountries(enabled, offset, max)

List Countries

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
Boolean enabled = true; // Boolean | 
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<Country> result = apiInstance.listCountries(enabled, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#listCountries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enabled** | **Boolean**|  | [optional]
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;Country&gt;**](Country.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCountryCodes"></a>
# **listCountryCodes**
> List&lt;String&gt; listCountryCodes(enabled, offset, max)

List Country Codes

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
Boolean enabled = true; // Boolean | 
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<String> result = apiInstance.listCountryCodes(enabled, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#listCountryCodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enabled** | **Boolean**|  | [optional]
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

**List&lt;String&gt;**

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
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
Boolean allowDeposits = true; // Boolean | 
Boolean all = true; // Boolean | 
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<Currency> result = apiInstance.listCurrenciesCrypto(allowDeposits, all, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#listCurrenciesCrypto");
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
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
Boolean usable = true; // Boolean | 
Boolean all = true; // Boolean | 
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<Currency> result = apiInstance.listCurrenciesFiat(usable, all, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#listCurrenciesFiat");
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

<a name="listMerchantIds"></a>
# **listMerchantIds**
> List&lt;PublicMerchant&gt; listMerchantIds()

List Merchant IDs

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
try {
    List<PublicMerchant> result = apiInstance.listMerchantIds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#listMerchantIds");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PublicMerchant&gt;**](PublicMerchant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPayments"></a>
# **listPayments**
> List&lt;Payment&gt; listPayments(merchantId)

Read payments

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String merchantId = "merchantId_example"; // String | 
try {
    List<Payment> result = apiInstance.listPayments(merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#listPayments");
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

<a name="listQuotes"></a>
# **listQuotes**
> Quote listQuotes(merchantId)

List quotes

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String merchantId = "merchantId_example"; // String | 
try {
    Quote result = apiInstance.listQuotes(merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#listQuotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **String**|  | [optional]

### Return type

[**Quote**](Quote.md)

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
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String country = "country_example"; // String | 
String currency = "currency_example"; // String | 
String uuid = "uuid_example"; // String | 
String merchant = "merchant_example"; // String | 
try {
    List<PayInMethod> result = apiInstance.listSupportedPayInMethods(country, currency, uuid, merchant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#listSupportedPayInMethods");
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
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String country = "country_example"; // String | 
String currency = "currency_example"; // String | 
String uuid = "uuid_example"; // String | 
String merchant = "merchant_example"; // String | 
try {
    List<PayOutMethod> result = apiInstance.listSupportedPayOutMethods(country, currency, uuid, merchant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#listSupportedPayOutMethods");
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
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String uuid = "uuid_example"; // String | 
try {
    Payment result = apiInstance.lockPayment(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#lockPayment");
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

<a name="merchantCreateUser"></a>
# **merchantCreateUser**
> AccessToken merchantCreateUser(body)

Create new user

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
UserRegistrationRequest body = new UserRegistrationRequest(); // UserRegistrationRequest | 
try {
    AccessToken result = apiInstance.merchantCreateUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#merchantCreateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserRegistrationRequest**](UserRegistrationRequest.md)|  | [optional]

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="merchantCreateUserDocument"></a>
# **merchantCreateUserDocument**
> AccountDocument merchantCreateUserDocument(body)

Upload a document for an account

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
AccountDocument body = new AccountDocument(); // AccountDocument | 
try {
    AccountDocument result = apiInstance.merchantCreateUserDocument(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#merchantCreateUserDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountDocument**](AccountDocument.md)|  | [optional]

### Return type

[**AccountDocument**](AccountDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="merchantListUserDocuments"></a>
# **merchantListUserDocuments**
> List&lt;AccountDocument&gt; merchantListUserDocuments()

List uploaded documents for an account

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
try {
    List<AccountDocument> result = apiInstance.merchantListUserDocuments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#merchantListUserDocuments");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AccountDocument&gt;**](AccountDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="merchantReadAccountInformation"></a>
# **merchantReadAccountInformation**
> merchantReadAccountInformation()

Get account information

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
try {
    apiInstance.merchantReadAccountInformation();
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#merchantReadAccountInformation");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="merchantUpdateAccountInformation"></a>
# **merchantUpdateAccountInformation**
> merchantUpdateAccountInformation(body)

Update account information

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
AccountInformation body = new AccountInformation(); // AccountInformation | 
try {
    apiInstance.merchantUpdateAccountInformation(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#merchantUpdateAccountInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountInformation**](AccountInformation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="merchantUserSetPassword"></a>
# **merchantUserSetPassword**
> merchantUserSetPassword(body)

Set password

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
WrappedPrimitiveString body = new WrappedPrimitiveString(); // WrappedPrimitiveString | 
try {
    apiInstance.merchantUserSetPassword(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#merchantUserSetPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WrappedPrimitiveString**](WrappedPrimitiveString.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readMerchantById"></a>
# **readMerchantById**
> PublicMerchant readMerchantById(id)

Read merchant by id

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String id = "id_example"; // String | 
try {
    PublicMerchant result = apiInstance.readMerchantById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#readMerchantById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**PublicMerchant**](PublicMerchant.md)

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
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String uuid = "uuid_example"; // String | 
String reference = "reference_example"; // String | 
try {
    Payment result = apiInstance.readPayment(uuid, reference);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#readPayment");
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

<a name="readQuote"></a>
# **readQuote**
> AcceptedQuote readQuote(uuid)

Read a quote

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String uuid = "uuid_example"; // String | 
try {
    AcceptedQuote result = apiInstance.readQuote(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#readQuote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**AcceptedQuote**](AcceptedQuote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readTransactionLimits"></a>
# **readTransactionLimits**
> Limits readTransactionLimits(country, currency, direction, method)

Get transaction limits

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String country = "country_example"; // String | 
String currency = "currency_example"; // String | 
String direction = "direction_example"; // String | 
String method = "method_example"; // String | 
try {
    Limits result = apiInstance.readTransactionLimits(country, currency, direction, method);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#readTransactionLimits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**|  | [optional]
 **currency** | **String**|  | [optional]
 **direction** | **String**|  | [optional]
 **method** | **String**|  | [optional]

### Return type

[**Limits**](Limits.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestNewQuotePaymentInstructions"></a>
# **requestNewQuotePaymentInstructions**
> AcceptedQuote requestNewQuotePaymentInstructions(uuid, body)

Request new payment instructions

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String uuid = "uuid_example"; // String | 
PaymentMetadata body = new PaymentMetadata(); // PaymentMetadata | 
try {
    AcceptedQuote result = apiInstance.requestNewQuotePaymentInstructions(uuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#requestNewQuotePaymentInstructions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |
 **body** | [**PaymentMetadata**](PaymentMetadata.md)|  | [optional]

### Return type

[**AcceptedQuote**](AcceptedQuote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="requestPayment"></a>
# **requestPayment**
> Payment requestPayment(body)

Request a new payment

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
PayRequest body = new PayRequest(); // PayRequest | 
try {
    Payment result = apiInstance.requestPayment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#requestPayment");
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

<a name="requestQuote"></a>
# **requestQuote**
> Quote requestQuote(body, estimate, direction)

Request a quote

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
QuoteRequest body = new QuoteRequest(); // QuoteRequest | 
Boolean estimate = true; // Boolean | 
String direction = "direction_example"; // String | 
try {
    Quote result = apiInstance.requestQuote(body, estimate, direction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#requestQuote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QuoteRequest**](QuoteRequest.md)|  | [optional]
 **estimate** | **Boolean**|  | [optional]
 **direction** | **String**|  | [optional]

### Return type

[**Quote**](Quote.md)

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
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String uuid = "uuid_example"; // String | 
Quote body = new Quote(); // Quote | 
try {
    Payment result = apiInstance.settlePaymentWithQuote(uuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#settlePaymentWithQuote");
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

<a name="startPinAuthentication"></a>
# **startPinAuthentication**
> AccessToken startPinAuthentication(body)

Start pin authentication

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
PinAuthenticationRequest body = new PinAuthenticationRequest(); // PinAuthenticationRequest | 
try {
    AccessToken result = apiInstance.startPinAuthentication(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#startPinAuthentication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PinAuthenticationRequest**](PinAuthenticationRequest.md)|  | [optional]

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMerchantId"></a>
# **updateMerchantId**
> Merchant updateMerchantId(id, body)

Update Merchant ID

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String id = "id_example"; // String | 
Merchant body = new Merchant(); // Merchant | 
try {
    Merchant result = apiInstance.updateMerchantId(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#updateMerchantId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**Merchant**](Merchant.md)|  | [optional]

### Return type

[**Merchant**](Merchant.md)

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
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String uuid = "uuid_example"; // String | 
PayDetailRequest body = new PayDetailRequest(); // PayDetailRequest | 
try {
    Payment result = apiInstance.updatePayment(uuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#updatePayment");
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

