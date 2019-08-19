# BankingApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBank**](BankingApi.md#createBank) | **POST** /api/bank | Create Bank
[**getBank**](BankingApi.md#getBank) | **GET** /api/bank/read/{id} | Read Bank
[**listBanksByCountry**](BankingApi.md#listBanksByCountry) | **GET** /api/bank/{countryCode} | List Banks by Country

<a name="createBank"></a>
# **createBank**
> Bank createBank(body)

Create Bank

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.BankingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

BankingApi apiInstance = new BankingApi();
Bank body = new Bank(); // Bank | 
try {
    Bank result = apiInstance.createBank(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankingApi#createBank");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Bank**](Bank.md)|  | [optional]

### Return type

[**Bank**](Bank.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBank"></a>
# **getBank**
> Bank getBank(id)

Read Bank

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.BankingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

BankingApi apiInstance = new BankingApi();
Long id = 789L; // Long | 
try {
    Bank result = apiInstance.getBank(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankingApi#getBank");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Bank**](Bank.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBanksByCountry"></a>
# **listBanksByCountry**
> List&lt;Bank&gt; listBanksByCountry(countryCode, offset, max)

List Banks by Country

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.BankingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

BankingApi apiInstance = new BankingApi();
String countryCode = "countryCode_example"; // String | 
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<Bank> result = apiInstance.listBanksByCountry(countryCode, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankingApi#listBanksByCountry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**|  |
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;Bank&gt;**](Bank.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

