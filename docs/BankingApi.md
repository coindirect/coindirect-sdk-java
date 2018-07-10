# BankingApi

All URIs are relative to *https://localhost*

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
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.BankingApi;


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

No authorization required

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
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.BankingApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listBanksByCountry"></a>
# **listBanksByCountry**
> List&lt;Bank&gt; listBanksByCountry(countryCode, offset, max)

List Banks by Country



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.BankingApi;


BankingApi apiInstance = new BankingApi();
String countryCode = "countryCode_example"; // String | 
Integer offset = 0; // Integer | start offset
Integer max = 10; // Integer | max results
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
 **offset** | **Integer**| start offset | [optional] [default to 0]
 **max** | **Integer**| max results | [optional] [default to 10]

### Return type

[**List&lt;Bank&gt;**](Bank.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

