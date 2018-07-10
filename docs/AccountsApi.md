# AccountsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountDocument**](AccountsApi.md#createAccountDocument) | **POST** /api/account/document | Upload a document for an account
[**getAccountPreference**](AccountsApi.md#getAccountPreference) | **GET** /api/account/preference/{name} | Read Account Preference
[**getAccountProgress**](AccountsApi.md#getAccountProgress) | **GET** /api/account/progress | Check progress of account setup
[**getAccountWebsocketChannel**](AccountsApi.md#getAccountWebsocketChannel) | **GET** /api/account/channel | Get WebSocket Channel
[**getAffiliateCode**](AccountsApi.md#getAffiliateCode) | **GET** /api/account/affiliate/code | Get affiliate code
[**listAccountDocuments**](AccountsApi.md#listAccountDocuments) | **GET** /api/account/document | List uploaded documents for an account
[**listAccountPreferences**](AccountsApi.md#listAccountPreferences) | **GET** /api/account/preference | List Account Preferences
[**listAffiliateBalances**](AccountsApi.md#listAffiliateBalances) | **GET** /api/account/affiliate/balance | Get affiliate balances
[**listAffiliateTransactions**](AccountsApi.md#listAffiliateTransactions) | **GET** /api/account/affiliate/transaction | Get affiliate transactions
[**updateAccountPreference**](AccountsApi.md#updateAccountPreference) | **PUT** /api/account/preference/{name} | Update Account Preference


<a name="createAccountDocument"></a>
# **createAccountDocument**
> AccountDocument createAccountDocument(body)

Upload a document for an account



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
AccountDocument body = new AccountDocument(); // AccountDocument | 
try {
    AccountDocument result = apiInstance.createAccountDocument(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#createAccountDocument");
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

<a name="getAccountPreference"></a>
# **getAccountPreference**
> AccountPreference getAccountPreference(name)

Read Account Preference



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String name = "name_example"; // String | 
try {
    AccountPreference result = apiInstance.getAccountPreference(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountPreference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**AccountPreference**](AccountPreference.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getAccountProgress"></a>
# **getAccountProgress**
> AccountProgress getAccountProgress()

Check progress of account setup



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
try {
    AccountProgress result = apiInstance.getAccountProgress();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountProgress");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountProgress**](AccountProgress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountWebsocketChannel"></a>
# **getAccountWebsocketChannel**
> WrappedPrimitive getAccountWebsocketChannel()

Get WebSocket Channel



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
try {
    WrappedPrimitive result = apiInstance.getAccountWebsocketChannel();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountWebsocketChannel");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WrappedPrimitive**](WrappedPrimitive.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAffiliateCode"></a>
# **getAffiliateCode**
> WrappedPrimitive getAffiliateCode()

Get affiliate code



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
try {
    WrappedPrimitive result = apiInstance.getAffiliateCode();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAffiliateCode");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WrappedPrimitive**](WrappedPrimitive.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAccountDocuments"></a>
# **listAccountDocuments**
> List&lt;AccountDocument&gt; listAccountDocuments()

List uploaded documents for an account



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
try {
    List<AccountDocument> result = apiInstance.listAccountDocuments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#listAccountDocuments");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAccountPreferences"></a>
# **listAccountPreferences**
> Map&lt;String, Object&gt; listAccountPreferences(offset, max)

List Account Preferences

This will return a key/value object of the preferences that have been stored for this account.

### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
Integer offset = 0; // Integer | start offset
Integer max = 10; // Integer | max results
try {
    Map<String, Object> result = apiInstance.listAccountPreferences(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#listAccountPreferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional] [default to 0]
 **max** | **Integer**| max results | [optional] [default to 10]

### Return type

**Map&lt;String, Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listAffiliateBalances"></a>
# **listAffiliateBalances**
> List&lt;Wallet&gt; listAffiliateBalances()

Get affiliate balances



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
try {
    List<Wallet> result = apiInstance.listAffiliateBalances();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#listAffiliateBalances");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Wallet&gt;**](Wallet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAffiliateTransactions"></a>
# **listAffiliateTransactions**
> List&lt;AffiliateTransaction&gt; listAffiliateTransactions(offset, max)

Get affiliate transactions



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
Integer offset = 0; // Integer | start offset
Integer max = 10; // Integer | max results
try {
    List<AffiliateTransaction> result = apiInstance.listAffiliateTransactions(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#listAffiliateTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional] [default to 0]
 **max** | **Integer**| max results | [optional] [default to 10]

### Return type

[**List&lt;AffiliateTransaction&gt;**](AffiliateTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAccountPreference"></a>
# **updateAccountPreference**
> AccountPreference updateAccountPreference(name, body)

Update Account Preference



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String name = "name_example"; // String | 
AccountPreference body = new AccountPreference(); // AccountPreference | 
try {
    AccountPreference result = apiInstance.updateAccountPreference(name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#updateAccountPreference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **body** | [**AccountPreference**](AccountPreference.md)|  | [optional]

### Return type

[**AccountPreference**](AccountPreference.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

