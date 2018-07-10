# UsersApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**beginForgotPassword**](UsersApi.md#beginForgotPassword) | **POST** /api/user/forgot/request | Forgot Password Request
[**beginTwoFactorSetup**](UsersApi.md#beginTwoFactorSetup) | **POST** /api/user/twofactor/request | Begin Two Factor Setup
[**confirmForgotPassword**](UsersApi.md#confirmForgotPassword) | **POST** /api/user/forgot/confirm | Forgot Password Confirm Reset
[**confirmNewUser**](UsersApi.md#confirmNewUser) | **POST** /api/user/register/confirm | Confirm new user registration
[**confirmTwoFactorSetup**](UsersApi.md#confirmTwoFactorSetup) | **POST** /api/user/twofactor/confirm | Confirm Two Factor Code
[**createApiKey**](UsersApi.md#createApiKey) | **POST** /api/token | Create API Key
[**deleteApiKey**](UsersApi.md#deleteApiKey) | **DELETE** /api/token | Delete/Revoke API Key
[**getProfile**](UsersApi.md#getProfile) | **GET** /api/user/profile | Get current user profile
[**getTwoFactorStatus**](UsersApi.md#getTwoFactorStatus) | **GET** /api/user/twofactor/state | Check Two Factor Status
[**getUserWebsocketChannel**](UsersApi.md#getUserWebsocketChannel) | **GET** /api/user/channel | Get WebSocket Channel
[**listApiKeys**](UsersApi.md#listApiKeys) | **GET** /api/token | List API Keys
[**registerNewUser**](UsersApi.md#registerNewUser) | **POST** /api/user/register | Register a new user
[**reissueApiToken**](UsersApi.md#reissueApiToken) | **POST** /api/login/reissue | Reissue Temporary Token
[**resendVerificationEmail**](UsersApi.md#resendVerificationEmail) | **POST** /api/user/register/resend | Resend verification email
[**updatePassword**](UsersApi.md#updatePassword) | **PUT** /api/user/password | Update user password
[**updateProfile**](UsersApi.md#updateProfile) | **PUT** /api/user | Update User Profile
[**updateProfileImage**](UsersApi.md#updateProfileImage) | **PUT** /api/user/image | Update profile image
[**updateProfile_0**](UsersApi.md#updateProfile_0) | **PUT** /api/user/profile | Update current user profile
[**uploadIdVerificationDocument**](UsersApi.md#uploadIdVerificationDocument) | **POST** /api/user/document | Upload ID verification document


<a name="beginForgotPassword"></a>
# **beginForgotPassword**
> beginForgotPassword(body)

Forgot Password Request



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
UserForgotPasswordRequest body = new UserForgotPasswordRequest(); // UserForgotPasswordRequest | 
try {
    apiInstance.beginForgotPassword(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#beginForgotPassword");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="beginTwoFactorSetup"></a>
# **beginTwoFactorSetup**
> WrappedString beginTwoFactorSetup(body)

Begin Two Factor Setup



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
WrappedString body = new WrappedString(); // WrappedString | 
try {
    WrappedString result = apiInstance.beginTwoFactorSetup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#beginTwoFactorSetup");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="confirmForgotPassword"></a>
# **confirmForgotPassword**
> confirmForgotPassword(body)

Forgot Password Confirm Reset



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
UserForgotPasswordRequest body = new UserForgotPasswordRequest(); // UserForgotPasswordRequest | 
try {
    apiInstance.confirmForgotPassword(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#confirmForgotPassword");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="confirmNewUser"></a>
# **confirmNewUser**
> confirmNewUser(body)

Confirm new user registration



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="confirmTwoFactorSetup"></a>
# **confirmTwoFactorSetup**
> confirmTwoFactorSetup(body)

Confirm Two Factor Code



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
WrappedString body = new WrappedString(); // WrappedString | 
try {
    apiInstance.confirmTwoFactorSetup(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#confirmTwoFactorSetup");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createApiKey"></a>
# **createApiKey**
> createApiKey(body)

Create API Key



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
AuthenticationTokenRequest body = new AuthenticationTokenRequest(); // AuthenticationTokenRequest | 
try {
    apiInstance.createApiKey(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#createApiKey");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteApiKey"></a>
# **deleteApiKey**
> deleteApiKey(token)

Delete/Revoke API Key



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String token = "token_example"; // String | 
try {
    apiInstance.deleteApiKey(token);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteApiKey");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProfile"></a>
# **getProfile**
> UserProfile getProfile()

Get current user profile



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
try {
    UserProfile result = apiInstance.getProfile();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getProfile");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserProfile**](UserProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTwoFactorStatus"></a>
# **getTwoFactorStatus**
> Boolean getTwoFactorStatus()

Check Two Factor Status



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
try {
    Boolean result = apiInstance.getTwoFactorStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getTwoFactorStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserWebsocketChannel"></a>
# **getUserWebsocketChannel**
> WrappedPrimitive getUserWebsocketChannel()

Get WebSocket Channel



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
try {
    WrappedPrimitive result = apiInstance.getUserWebsocketChannel();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserWebsocketChannel");
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

<a name="listApiKeys"></a>
# **listApiKeys**
> List&lt;AuthenticationToken&gt; listApiKeys()

List API Keys



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
try {
    List<AuthenticationToken> result = apiInstance.listApiKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#listApiKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AuthenticationToken&gt;**](AuthenticationToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerNewUser"></a>
# **registerNewUser**
> registerNewUser(body)

Register a new user



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reissueApiToken"></a>
# **reissueApiToken**
> reissueApiToken()

Reissue Temporary Token



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
try {
    apiInstance.reissueApiToken();
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#reissueApiToken");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resendVerificationEmail"></a>
# **resendVerificationEmail**
> resendVerificationEmail(body)

Resend verification email



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePassword"></a>
# **updatePassword**
> updatePassword(body)

Update user password



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
UserPasswordChangeRequest body = new UserPasswordChangeRequest(); // UserPasswordChangeRequest | 
try {
    apiInstance.updatePassword(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updatePassword");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProfile"></a>
# **updateProfile**
> User updateProfile(body)

Update User Profile



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
User body = new User(); // User | 
try {
    User result = apiInstance.updateProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateProfile");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProfileImage"></a>
# **updateProfileImage**
> updateProfileImage(body)

Update profile image



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
EncodedFile body = new EncodedFile(); // EncodedFile | 
try {
    apiInstance.updateProfileImage(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateProfileImage");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProfile_0"></a>
# **updateProfile_0**
> UserProfile updateProfile_0(body)

Update current user profile



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
UserProfile body = new UserProfile(); // UserProfile | 
try {
    UserProfile result = apiInstance.updateProfile_0(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateProfile_0");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadIdVerificationDocument"></a>
# **uploadIdVerificationDocument**
> uploadIdVerificationDocument(body)

Upload ID verification document



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
EncodedFile body = new EncodedFile(); // EncodedFile | 
try {
    apiInstance.uploadIdVerificationDocument(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#uploadIdVerificationDocument");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

