# WalletsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**walletCreate**](WalletsApi.md#walletCreate) | **POST** /api/wallet | Create Wallet
[**walletAddressRead**](WalletsApi.md#walletAddressRead) | **POST** /api/wallet/deposit/{id} | Read Deposit Address
[**createTransferRequest**](WalletsApi.md#createTransferRequest) | **POST** /api/wallet/transfer | Create Transfer Request
[**walletWithdrawValidate**](WalletsApi.md#walletWithdrawValidate) | **POST** /api/wallet/withdraw/validate/{id} | Pre-validate Withdrawal
[**walletWithdraw**](WalletsApi.md#walletWithdraw) | **POST** /api/wallet/withdraw/{id} | Withdraw from Wallet
[**walletList**](WalletsApi.md#walletList) | **GET** /api/wallet | List Wallets
[**walletBalanceList**](WalletsApi.md#walletBalanceList) | **GET** /api/wallet/balances | List Wallet Balances
[**walletListFundingOption**](WalletsApi.md#walletListFundingOption) | **GET** /api/wallet/funding/{id} | List Funding Options
[**listTransferRequests**](WalletsApi.md#listTransferRequests) | **GET** /api/wallet/transfer | List Transfer Requests
[**getTransferRequestOutputEstimate**](WalletsApi.md#getTransferRequestOutputEstimate) | **PUT** /api/wallet/transfer | Estimate Transfer Request Output
[**listWithdrawalRequests**](WalletsApi.md#listWithdrawalRequests) | **GET** /api/wallet/withdrawal/request | List Withdrawal Requests
[**getWithdrawalRequest**](WalletsApi.md#getWithdrawalRequest) | **GET** /api/wallet/withdrawal/request/{id} | Read Withdrawal Request
[**convertibleCurrencyList**](WalletsApi.md#convertibleCurrencyList) | **GET** /api/wallet/{code}/convert | convertibleCurrencyList
[**walletRead**](WalletsApi.md#walletRead) | **GET** /api/wallet/{id} | Read Wallet
[**transferableCurrencyList**](WalletsApi.md#transferableCurrencyList) | **GET** /api/wallet/{id}/transfer | List Transferable Currencies

<a name="walletCreate"></a>
# **walletCreate**
> Wallet walletCreate(body)

Create Wallet

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.WalletsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

WalletsApi apiInstance = new WalletsApi();
WalletWallet body = new WalletWallet(); // WalletWallet | 
try {
    Wallet result = apiInstance.walletCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#walletCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WalletWallet**](WalletWallet.md)|  | [optional]

### Return type

[**Wallet**](Wallet.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="walletAddressRead"></a>
# **walletAddressRead**
> walletAddressRead(id)

Read Deposit Address

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.WalletsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

WalletsApi apiInstance = new WalletsApi();
Long id = 789L; // Long | 
try {
    apiInstance.walletAddressRead(id);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#walletAddressRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

null (empty response body)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTransferRequest"></a>
# **createTransferRequest**
> TransferRequest createTransferRequest(body)

Create Transfer Request

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.WalletsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

WalletsApi apiInstance = new WalletsApi();
TransferRequest body = new TransferRequest(); // TransferRequest | 
try {
    TransferRequest result = apiInstance.createTransferRequest(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#createTransferRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransferRequest**](TransferRequest.md)|  | [optional]

### Return type

[**TransferRequest**](TransferRequest.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="walletWithdrawValidate"></a>
# **walletWithdrawValidate**
> Errors walletWithdrawValidate(id, body)

Pre-validate Withdrawal

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.WalletsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

WalletsApi apiInstance = new WalletsApi();
Long id = 789L; // Long | 
Withdrawal body = new Withdrawal(); // Withdrawal | 
try {
    Errors result = apiInstance.walletWithdrawValidate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#walletWithdrawValidate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**Withdrawal**](Withdrawal.md)|  | [optional]

### Return type

[**Errors**](Errors.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="walletWithdraw"></a>
# **walletWithdraw**
> WithdrawalRequest walletWithdraw(id, body)

Withdraw from Wallet

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.WalletsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

WalletsApi apiInstance = new WalletsApi();
Long id = 789L; // Long | 
Withdrawal body = new Withdrawal(); // Withdrawal | 
try {
    WithdrawalRequest result = apiInstance.walletWithdraw(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#walletWithdraw");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**Withdrawal**](Withdrawal.md)|  | [optional]

### Return type

[**WithdrawalRequest**](WithdrawalRequest.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="walletList"></a>
# **walletList**
> List&lt;Wallet&gt; walletList(offset, max)

List Wallets

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.WalletsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

WalletsApi apiInstance = new WalletsApi();
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<Wallet> result = apiInstance.walletList(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#walletList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;Wallet&gt;**](Wallet.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="walletBalanceList"></a>
# **walletBalanceList**
> List&lt;Wallet&gt; walletBalanceList()

List Wallet Balances

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.WalletsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

WalletsApi apiInstance = new WalletsApi();
try {
    List<Wallet> result = apiInstance.walletBalanceList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#walletBalanceList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Wallet&gt;**](Wallet.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="walletListFundingOption"></a>
# **walletListFundingOption**
> List&lt;WalletFundingOption&gt; walletListFundingOption(id)

List Funding Options

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.WalletsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

WalletsApi apiInstance = new WalletsApi();
Long id = 789L; // Long | 
try {
    List<WalletFundingOption> result = apiInstance.walletListFundingOption(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#walletListFundingOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**List&lt;WalletFundingOption&gt;**](WalletFundingOption.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransferRequests"></a>
# **listTransferRequests**
> List&lt;TransferRequest&gt; listTransferRequests(offset, max)

List Transfer Requests

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.WalletsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

WalletsApi apiInstance = new WalletsApi();
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<TransferRequest> result = apiInstance.listTransferRequests(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#listTransferRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;TransferRequest&gt;**](TransferRequest.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransferRequestOutputEstimate"></a>
# **getTransferRequestOutputEstimate**
> WrappedPrimitive getTransferRequestOutputEstimate(body)

Estimate Transfer Request Output

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.WalletsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

WalletsApi apiInstance = new WalletsApi();
TransferRequest body = new TransferRequest(); // TransferRequest | 
try {
    WrappedPrimitive result = apiInstance.getTransferRequestOutputEstimate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#getTransferRequestOutputEstimate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransferRequest**](TransferRequest.md)|  | [optional]

### Return type

[**WrappedPrimitive**](WrappedPrimitive.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listWithdrawalRequests"></a>
# **listWithdrawalRequests**
> List&lt;WithdrawalRequest&gt; listWithdrawalRequests(offset, max)

List Withdrawal Requests

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.WalletsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

WalletsApi apiInstance = new WalletsApi();
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<WithdrawalRequest> result = apiInstance.listWithdrawalRequests(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#listWithdrawalRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;WithdrawalRequest&gt;**](WithdrawalRequest.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWithdrawalRequest"></a>
# **getWithdrawalRequest**
> WithdrawalRequest getWithdrawalRequest(id)

Read Withdrawal Request

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.WalletsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

WalletsApi apiInstance = new WalletsApi();
Long id = 789L; // Long | 
try {
    WithdrawalRequest result = apiInstance.getWithdrawalRequest(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#getWithdrawalRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**WithdrawalRequest**](WithdrawalRequest.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="convertibleCurrencyList"></a>
# **convertibleCurrencyList**
> List&lt;Currency&gt; convertibleCurrencyList(code)

convertibleCurrencyList

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.WalletsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

WalletsApi apiInstance = new WalletsApi();
String code = "code_example"; // String | 
try {
    List<Currency> result = apiInstance.convertibleCurrencyList(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#convertibleCurrencyList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**|  |

### Return type

[**List&lt;Currency&gt;**](Currency.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="walletRead"></a>
# **walletRead**
> Wallet walletRead(id)

Read Wallet

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.WalletsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

WalletsApi apiInstance = new WalletsApi();
Long id = 789L; // Long | 
try {
    Wallet result = apiInstance.walletRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#walletRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Wallet**](Wallet.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="transferableCurrencyList"></a>
# **transferableCurrencyList**
> List&lt;Currency&gt; transferableCurrencyList(id)

List Transferable Currencies

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiClient;
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.invoker.Configuration;
//import org.coindirect.api.invoker.auth.*;
//import org.coindirect.api.WalletsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Hawk
ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
Hawk.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Hawk.setApiKeyPrefix("Token");

WalletsApi apiInstance = new WalletsApi();
Long id = 789L; // Long | 
try {
    List<Currency> result = apiInstance.transferableCurrencyList(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#transferableCurrencyList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**List&lt;Currency&gt;**](Currency.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

