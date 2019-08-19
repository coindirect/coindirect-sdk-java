# UsersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiKeyCreate**](UsersApi.md#apiKeyCreate) | **POST** /api/token | Create API Key
[**createIdVerificationDocument**](UsersApi.md#createIdVerificationDocument) | **POST** /api/user/document | Create ID Verification Document
[**forgotPasswordConfirm**](UsersApi.md#forgotPasswordConfirm) | **POST** /api/user/forgot/confirm | Forgot Password Confirm
[**forgotPasswordRequest**](UsersApi.md#forgotPasswordRequest) | **POST** /api/user/forgot/request | Forgot Password Request
[**registerNewUser**](UsersApi.md#registerNewUser) | **POST** /api/user/register | Register New User
[**confirmNewUser**](UsersApi.md#confirmNewUser) | **POST** /api/user/register/confirm | Confirm New User
[**resendVerificationEmail**](UsersApi.md#resendVerificationEmail) | **POST** /api/user/register/resend | Resend Verification
[**twoFactorConfirm**](UsersApi.md#twoFactorConfirm) | **POST** /api/user/twofactor/confirm | Confirm Two Factor Code
[**twoFactorStart**](UsersApi.md#twoFactorStart) | **POST** /api/user/twofactor/request | Start Two Factor Setup
[**apiKeyList**](UsersApi.md#apiKeyList) | **GET** /api/token | List API Keys
[**apiKeyRevoke**](UsersApi.md#apiKeyRevoke) | **DELETE** /api/token | Revoke API Key
[**updateUserProfile**](UsersApi.md#updateUserProfile) | **PUT** /api/user | Update User Profile
[**readUserWebsocketChannel**](UsersApi.md#readUserWebsocketChannel) | **GET** /api/user/channel | Read WebSocket Channel
[**updateUserProfileImage**](UsersApi.md#updateUserProfileImage) | **PUT** /api/user/image | Update User Profile Image
[**updateUserPassword**](UsersApi.md#updateUserPassword) | **PUT** /api/user/password | Update User Password
[**readUserProfile**](UsersApi.md#readUserProfile) | **GET** /api/user/profile | Read User Profile
[**updateUserProfile_0**](UsersApi.md#updateUserProfile_0) | **PUT** /api/user/profile | Update User Profile
[**twoFactorStatusRead**](UsersApi.md#twoFactorStatusRead) | **GET** /api/user/twofactor/state | Read Two Factor Status

<a name="apiKeyCreate"></a>
# **apiKeyCreate**
> apiKeyCreate(body)

Create API Key

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
AuthenticationTokenRequest body = new AuthenticationTokenRequest(); // AuthenticationTokenRequest | 
try {
    apiInstance.apiKeyCreate(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#apiKeyCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuthenticationTokenRequest**](AuthenticationTokenRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createIdVerificationDocument"></a>
# **createIdVerificationDocument**
> createIdVerificationDocument(body)

Create ID Verification Document

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
EncodedFile body = new EncodedFile(); // EncodedFile | 
try {
    apiInstance.createIdVerificationDocument(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#createIdVerificationDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EncodedFile**](EncodedFile.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="forgotPasswordConfirm"></a>
# **forgotPasswordConfirm**
> forgotPasswordConfirm(body)

Forgot Password Confirm

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
UserForgotPasswordRequest body = new UserForgotPasswordRequest(); // UserForgotPasswordRequest | 
try {
    apiInstance.forgotPasswordConfirm(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#forgotPasswordConfirm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserForgotPasswordRequest**](UserForgotPasswordRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="forgotPasswordRequest"></a>
# **forgotPasswordRequest**
> forgotPasswordRequest(body)

Forgot Password Request

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
UserForgotPasswordRequest body = new UserForgotPasswordRequest(); // UserForgotPasswordRequest | 
try {
    apiInstance.forgotPasswordRequest(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#forgotPasswordRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserForgotPasswordRequest**](UserForgotPasswordRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="registerNewUser"></a>
# **registerNewUser**
> registerNewUser(body)

Register New User

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
UserRegistrationRequest body = new UserRegistrationRequest(); // UserRegistrationRequest | 
try {
    apiInstance.registerNewUser(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#registerNewUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserRegistrationRequest**](UserRegistrationRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="confirmNewUser"></a>
# **confirmNewUser**
> confirmNewUser(body)

Confirm New User

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
WrappedString body = new WrappedString(); // WrappedString | 
try {
    apiInstance.confirmNewUser(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#confirmNewUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WrappedString**](WrappedString.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="resendVerificationEmail"></a>
# **resendVerificationEmail**
> resendVerificationEmail(body)

Resend Verification

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
UserRegistrationRequest body = new UserRegistrationRequest(); // UserRegistrationRequest | 
try {
    apiInstance.resendVerificationEmail(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#resendVerificationEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserRegistrationRequest**](UserRegistrationRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="twoFactorConfirm"></a>
# **twoFactorConfirm**
> twoFactorConfirm(body)

Confirm Two Factor Code

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
WrappedString body = new WrappedString(); // WrappedString | 
try {
    apiInstance.twoFactorConfirm(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#twoFactorConfirm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WrappedString**](WrappedString.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="twoFactorStart"></a>
# **twoFactorStart**
> WrappedString twoFactorStart(body)

Start Two Factor Setup

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
WrappedString body = new WrappedString(); // WrappedString | 
try {
    WrappedString result = apiInstance.twoFactorStart(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#twoFactorStart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WrappedString**](WrappedString.md)|  | [optional]

### Return type

[**WrappedString**](WrappedString.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiKeyList"></a>
# **apiKeyList**
> List&lt;AuthenticationToken&gt; apiKeyList()

List API Keys

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
try {
    List<AuthenticationToken> result = apiInstance.apiKeyList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#apiKeyList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AuthenticationToken&gt;**](AuthenticationToken.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiKeyRevoke"></a>
# **apiKeyRevoke**
> apiKeyRevoke(token)

Revoke API Key

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
String token = "token_example"; // String | 
try {
    apiInstance.apiKeyRevoke(token);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#apiKeyRevoke");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateUserProfile"></a>
# **updateUserProfile**
> User updateUserProfile(body)

Update User Profile

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
User body = new User(); // User | 
try {
    User result = apiInstance.updateUserProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUserProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readUserWebsocketChannel"></a>
# **readUserWebsocketChannel**
> WrappedPrimitive readUserWebsocketChannel()

Read WebSocket Channel

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
try {
    WrappedPrimitive result = apiInstance.readUserWebsocketChannel();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#readUserWebsocketChannel");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WrappedPrimitive**](WrappedPrimitive.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUserProfileImage"></a>
# **updateUserProfileImage**
> updateUserProfileImage(body)

Update User Profile Image

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
EncodedFile body = new EncodedFile(); // EncodedFile | 
try {
    apiInstance.updateUserProfileImage(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUserProfileImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EncodedFile**](EncodedFile.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateUserPassword"></a>
# **updateUserPassword**
> updateUserPassword(body)

Update User Password

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
UserPasswordChangeRequest body = new UserPasswordChangeRequest(); // UserPasswordChangeRequest | 
try {
    apiInstance.updateUserPassword(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUserPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserPasswordChangeRequest**](UserPasswordChangeRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readUserProfile"></a>
# **readUserProfile**
> UserProfile readUserProfile()

Read User Profile

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
try {
    UserProfile result = apiInstance.readUserProfile();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#readUserProfile");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserProfile**](UserProfile.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUserProfile_0"></a>
# **updateUserProfile_0**
> UserProfile updateUserProfile_0(body)

Update User Profile

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
UserProfile body = new UserProfile(); // UserProfile | 
try {
    UserProfile result = apiInstance.updateUserProfile_0(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUserProfile_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserProfile**](UserProfile.md)|  | [optional]

### Return type

[**UserProfile**](UserProfile.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="twoFactorStatusRead"></a>
# **twoFactorStatusRead**
> Boolean twoFactorStatusRead()

Read Two Factor Status

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
try {
    Boolean result = apiInstance.twoFactorStatusRead();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#twoFactorStatusRead");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Boolean**

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

