# CountriesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCountries**](CountriesApi.md#listCountries) | **GET** /api/country | List Countries
[**listCountryCodes**](CountriesApi.md#listCountryCodes) | **GET** /api/country/codes | List Country Codes
[**readCountryByCode**](CountriesApi.md#readCountryByCode) | **GET** /api/country/codes/{code} | Read Country by Code
[**detectCountryByIp**](CountriesApi.md#detectCountryByIp) | **GET** /api/country/detect | Detect Country by IP
[**readCountry**](CountriesApi.md#readCountry) | **GET** /api/country/{id} | Read Country

<a name="listCountries"></a>
# **listCountries**
> List&lt;Country&gt; listCountries(enabled, offset, max)

List Countries

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.CountriesApi;


CountriesApi apiInstance = new CountriesApi();
Boolean enabled = true; // Boolean | 
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<Country> result = apiInstance.listCountries(enabled, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountriesApi#listCountries");
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
//import org.coindirect.api.CountriesApi;


CountriesApi apiInstance = new CountriesApi();
Boolean enabled = true; // Boolean | 
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<String> result = apiInstance.listCountryCodes(enabled, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountriesApi#listCountryCodes");
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

<a name="readCountryByCode"></a>
# **readCountryByCode**
> Country readCountryByCode(code)

Read Country by Code

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.CountriesApi;


CountriesApi apiInstance = new CountriesApi();
String code = "code_example"; // String | 
try {
    Country result = apiInstance.readCountryByCode(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountriesApi#readCountryByCode");
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

<a name="detectCountryByIp"></a>
# **detectCountryByIp**
> Country detectCountryByIp()

Detect Country by IP

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.CountriesApi;


CountriesApi apiInstance = new CountriesApi();
try {
    Country result = apiInstance.detectCountryByIp();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountriesApi#detectCountryByIp");
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

<a name="readCountry"></a>
# **readCountry**
> Country readCountry(id)

Read Country

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.CountriesApi;


CountriesApi apiInstance = new CountriesApi();
Long id = 789L; // Long | 
try {
    Country result = apiInstance.readCountry(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountriesApi#readCountry");
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

