# CardsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add**](CardsApi.md#add) | **POST** /api/card | addCard
[**list**](CardsApi.md#list) | **GET** /api/card | listCards
[**get**](CardsApi.md#get) | **GET** /api/card/{uuid} | getCard
[**remove**](CardsApi.md#remove) | **DELETE** /api/card/{uuid} | removeCard

<a name="add"></a>
# **add**
> CardAddResponse add(body)

addCard

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.CardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

CardsApi apiInstance = new CardsApi();
CardAddRequest body = new CardAddRequest(); // CardAddRequest | 
try {
    CardAddResponse result = apiInstance.add(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#add");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardAddRequest**](CardAddRequest.md)|  | [optional]

### Return type

[**CardAddResponse**](CardAddResponse.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="list"></a>
# **list**
> Card list(offset, max)

listCards

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.CardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

CardsApi apiInstance = new CardsApi();
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    Card result = apiInstance.list(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**Card**](Card.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="get"></a>
# **get**
> Card get(uuid)

getCard

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.CardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

CardsApi apiInstance = new CardsApi();
String uuid = "uuid_example"; // String | 
try {
    Card result = apiInstance.get(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**Card**](Card.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="remove"></a>
# **remove**
> remove(uuid)

removeCard

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.CardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

CardsApi apiInstance = new CardsApi();
String uuid = "uuid_example"; // String | 
try {
    apiInstance.remove(uuid);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#remove");
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

