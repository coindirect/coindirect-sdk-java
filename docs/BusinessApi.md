# BusinessApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**merchantIdCreate**](BusinessApi.md#merchantIdCreate) | **POST** /api/v1/merchant | Create Merchant ID
[**merchantUserDocumentCreate**](BusinessApi.md#merchantUserDocumentCreate) | **POST** /api/v1/merchant/user/document | Create Account Document
[**pinAuthenticationStart**](BusinessApi.md#pinAuthenticationStart) | **POST** /api/v1/merchant/user/login | Start Pin Authentication
[**merchantCreateUser**](BusinessApi.md#merchantCreateUser) | **POST** /api/v1/merchant/user/register | Create new user
[**merchantIdList**](BusinessApi.md#merchantIdList) | **GET** /api/v1/merchant | List Merchant IDs
[**merchantUserDocumentList**](BusinessApi.md#merchantUserDocumentList) | **GET** /api/v1/merchant/user/document | List Account Documents
[**pinAuthenticationComplete**](BusinessApi.md#pinAuthenticationComplete) | **PUT** /api/v1/merchant/user/login | Complete Pin Authentication
[**merchantUserSetPassword**](BusinessApi.md#merchantUserSetPassword) | **PUT** /api/v1/merchant/user/password | Account Set Password
[**merchantAccountInformationRead**](BusinessApi.md#merchantAccountInformationRead) | **GET** /api/v1/merchant/user/profile | Read Account Information
[**merchantAccountInformationUpdate**](BusinessApi.md#merchantAccountInformationUpdate) | **PUT** /api/v1/merchant/user/profile | Update Account Information
[**merchantReadById**](BusinessApi.md#merchantReadById) | **GET** /api/v1/merchant/{id} | Read Merchant by ID
[**merchantIdUpdate**](BusinessApi.md#merchantIdUpdate) | **PUT** /api/v1/merchant/{id} | Update Merchant ID

<a name="merchantIdCreate"></a>
# **merchantIdCreate**
> Merchant merchantIdCreate(body)

Create Merchant ID

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.BusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

BusinessApi apiInstance = new BusinessApi();
Merchant body = new Merchant(); // Merchant | 
try {
    Merchant result = apiInstance.merchantIdCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#merchantIdCreate");
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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="merchantUserDocumentCreate"></a>
# **merchantUserDocumentCreate**
> AccountDocument merchantUserDocumentCreate(body)

Create Account Document

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.BusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

BusinessApi apiInstance = new BusinessApi();
AccountDocument body = new AccountDocument(); // AccountDocument | 
try {
    AccountDocument result = apiInstance.merchantUserDocumentCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#merchantUserDocumentCreate");
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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pinAuthenticationStart"></a>
# **pinAuthenticationStart**
> AccessToken pinAuthenticationStart(body)

Start Pin Authentication

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
PinAuthenticationRequest body = new PinAuthenticationRequest(); // PinAuthenticationRequest | 
try {
    AccessToken result = apiInstance.pinAuthenticationStart(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#pinAuthenticationStart");
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

<a name="merchantCreateUser"></a>
# **merchantCreateUser**
> AccessToken merchantCreateUser(body)

Create new user

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.BusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="merchantIdList"></a>
# **merchantIdList**
> List&lt;PublicMerchant&gt; merchantIdList()

List Merchant IDs

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.BusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

BusinessApi apiInstance = new BusinessApi();
try {
    List<PublicMerchant> result = apiInstance.merchantIdList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#merchantIdList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PublicMerchant&gt;**](PublicMerchant.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="merchantUserDocumentList"></a>
# **merchantUserDocumentList**
> List&lt;AccountDocument&gt; merchantUserDocumentList()

List Account Documents

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.BusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

BusinessApi apiInstance = new BusinessApi();
try {
    List<AccountDocument> result = apiInstance.merchantUserDocumentList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#merchantUserDocumentList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AccountDocument&gt;**](AccountDocument.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinAuthenticationComplete"></a>
# **pinAuthenticationComplete**
> AccessToken pinAuthenticationComplete(body)

Complete Pin Authentication

The pin is usable only once, if data is not correctly stored, you will need to issue a new pin

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.BusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

BusinessApi apiInstance = new BusinessApi();
WrappedPrimitiveString body = new WrappedPrimitiveString(); // WrappedPrimitiveString | 
try {
    AccessToken result = apiInstance.pinAuthenticationComplete(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#pinAuthenticationComplete");
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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="merchantUserSetPassword"></a>
# **merchantUserSetPassword**
> merchantUserSetPassword(body)

Account Set Password

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.BusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="merchantAccountInformationRead"></a>
# **merchantAccountInformationRead**
> merchantAccountInformationRead()

Read Account Information

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.BusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

BusinessApi apiInstance = new BusinessApi();
try {
    apiInstance.merchantAccountInformationRead();
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#merchantAccountInformationRead");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="merchantAccountInformationUpdate"></a>
# **merchantAccountInformationUpdate**
> merchantAccountInformationUpdate(body)

Update Account Information

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.BusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

BusinessApi apiInstance = new BusinessApi();
AccountInformation body = new AccountInformation(); // AccountInformation | 
try {
    apiInstance.merchantAccountInformationUpdate(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#merchantAccountInformationUpdate");
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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="merchantReadById"></a>
# **merchantReadById**
> PublicMerchant merchantReadById(id)

Read Merchant by ID

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.BusinessApi;


BusinessApi apiInstance = new BusinessApi();
String id = "id_example"; // String | 
try {
    PublicMerchant result = apiInstance.merchantReadById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#merchantReadById");
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

<a name="merchantIdUpdate"></a>
# **merchantIdUpdate**
> Merchant merchantIdUpdate(id, body)

Update Merchant ID

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.BusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

BusinessApi apiInstance = new BusinessApi();
String id = "id_example"; // String | 
Merchant body = new Merchant(); // Merchant | 
try {
    Merchant result = apiInstance.merchantIdUpdate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#merchantIdUpdate");
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

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

