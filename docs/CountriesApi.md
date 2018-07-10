# CountriesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**detectCountryByIp**](CountriesApi.md#detectCountryByIp) | **GET** /api/country/detect | Detect Country by IP
[**getCountry**](CountriesApi.md#getCountry) | **GET** /api/country/{id} | Read Country
[**listCountries**](CountriesApi.md#listCountries) | **GET** /api/country | List Countries


<a name="detectCountryByIp"></a>
# **detectCountryByIp**
> Country detectCountryByIp()

Detect Country by IP



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.CountriesApi;


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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCountry"></a>
# **getCountry**
> Country getCountry(id)

Read Country



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.CountriesApi;


CountriesApi apiInstance = new CountriesApi();
Long id = 789L; // Long | 
try {
    Country result = apiInstance.getCountry(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountriesApi#getCountry");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCountries"></a>
# **listCountries**
> List&lt;Country&gt; listCountries(enabled, offset, max)

List Countries



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.CountriesApi;


CountriesApi apiInstance = new CountriesApi();
Boolean enabled = true; // Boolean | 
Integer offset = 0; // Integer | start offset
Integer max = 10; // Integer | max results
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
 **offset** | **Integer**| start offset | [optional] [default to 0]
 **max** | **Integer**| max results | [optional] [default to 10]

### Return type

[**List&lt;Country&gt;**](Country.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

