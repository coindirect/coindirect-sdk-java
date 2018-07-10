# WalletsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTransferRequest**](WalletsApi.md#createTransferRequest) | **POST** /api/wallet/transfer | Create Transfer Request
[**createWallet**](WalletsApi.md#createWallet) | **POST** /api/wallet | Create Wallet
[**getConvertibleCurrencies**](WalletsApi.md#getConvertibleCurrencies) | **GET** /api/wallet/{code}/convert | Get convertible currencies
[**getTransferRequestOutputEstimate**](WalletsApi.md#getTransferRequestOutputEstimate) | **PUT** /api/wallet/transfer | Estimate Transfer Request Output
[**getTransferableCurrencies**](WalletsApi.md#getTransferableCurrencies) | **GET** /api/wallet/{id}/transfer | Get transferable currencies
[**getWallet**](WalletsApi.md#getWallet) | **GET** /api/wallet/{id} | Read Wallet
[**getWalletDepositAddress**](WalletsApi.md#getWalletDepositAddress) | **POST** /api/wallet/deposit/{id} | Get Deposit Address
[**getWalletFundingOptions**](WalletsApi.md#getWalletFundingOptions) | **GET** /api/wallet/funding/{id} | Get Funding Options
[**getWithdrawalRequest**](WalletsApi.md#getWithdrawalRequest) | **GET** /api/wallet/withdrawal/request/{id} | Read Withdrawal Request
[**listTransferRequests**](WalletsApi.md#listTransferRequests) | **GET** /api/wallet/transfer | List Transfer Requests
[**listWallets**](WalletsApi.md#listWallets) | **GET** /api/wallet | List Wallets
[**listWithdrawalRequests**](WalletsApi.md#listWithdrawalRequests) | **GET** /api/wallet/withdrawal/request | List Withdrawal Requests
[**withdrawFromWallet**](WalletsApi.md#withdrawFromWallet) | **POST** /api/wallet/withdraw/{id} | Withdraw from Wallet


<a name="createTransferRequest"></a>
# **createTransferRequest**
> TransferRequest createTransferRequest(body)

Create Transfer Request



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.WalletsApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWallet"></a>
# **createWallet**
> Wallet createWallet(body)

Create Wallet



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.WalletsApi;


WalletsApi apiInstance = new WalletsApi();
Wallet body = new Wallet(); // Wallet | 
try {
    Wallet result = apiInstance.createWallet(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#createWallet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Wallet**](Wallet.md)|  | [optional]

### Return type

[**Wallet**](Wallet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConvertibleCurrencies"></a>
# **getConvertibleCurrencies**
> List&lt;Currency&gt; getConvertibleCurrencies(code)

Get convertible currencies



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.WalletsApi;


WalletsApi apiInstance = new WalletsApi();
String code = "code_example"; // String | 
try {
    List<Currency> result = apiInstance.getConvertibleCurrencies(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#getConvertibleCurrencies");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransferRequestOutputEstimate"></a>
# **getTransferRequestOutputEstimate**
> WrappedPrimitive getTransferRequestOutputEstimate(body)

Estimate Transfer Request Output



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.WalletsApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransferableCurrencies"></a>
# **getTransferableCurrencies**
> List&lt;Currency&gt; getTransferableCurrencies(id)

Get transferable currencies



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.WalletsApi;


WalletsApi apiInstance = new WalletsApi();
Long id = 789L; // Long | 
try {
    List<Currency> result = apiInstance.getTransferableCurrencies(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#getTransferableCurrencies");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWallet"></a>
# **getWallet**
> Wallet getWallet(id)

Read Wallet



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.WalletsApi;


WalletsApi apiInstance = new WalletsApi();
Long id = 789L; // Long | 
try {
    Wallet result = apiInstance.getWallet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#getWallet");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWalletDepositAddress"></a>
# **getWalletDepositAddress**
> getWalletDepositAddress(id)

Get Deposit Address



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.WalletsApi;


WalletsApi apiInstance = new WalletsApi();
Long id = 789L; // Long | 
try {
    apiInstance.getWalletDepositAddress(id);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#getWalletDepositAddress");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWalletFundingOptions"></a>
# **getWalletFundingOptions**
> List&lt;WalletFundingOption&gt; getWalletFundingOptions(id)

Get Funding Options



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.WalletsApi;


WalletsApi apiInstance = new WalletsApi();
Long id = 789L; // Long | 
try {
    List<WalletFundingOption> result = apiInstance.getWalletFundingOptions(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#getWalletFundingOptions");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWithdrawalRequest"></a>
# **getWithdrawalRequest**
> WithdrawalRequest getWithdrawalRequest(id)

Read Withdrawal Request



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.WalletsApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTransferRequests"></a>
# **listTransferRequests**
> List&lt;TransferRequest&gt; listTransferRequests(offset, max)

List Transfer Requests



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.WalletsApi;


WalletsApi apiInstance = new WalletsApi();
Integer offset = 0; // Integer | start offset
Integer max = 10; // Integer | max results
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
 **offset** | **Integer**| start offset | [optional] [default to 0]
 **max** | **Integer**| max results | [optional] [default to 10]

### Return type

[**List&lt;TransferRequest&gt;**](TransferRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listWallets"></a>
# **listWallets**
> List&lt;Wallet&gt; listWallets(offset, max)

List Wallets



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.WalletsApi;


WalletsApi apiInstance = new WalletsApi();
Integer offset = 0; // Integer | start offset
Integer max = 10; // Integer | max results
try {
    List<Wallet> result = apiInstance.listWallets(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#listWallets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional] [default to 0]
 **max** | **Integer**| max results | [optional] [default to 10]

### Return type

[**List&lt;Wallet&gt;**](Wallet.md)

### Authorization

No authorization required

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
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.WalletsApi;


WalletsApi apiInstance = new WalletsApi();
Integer offset = 0; // Integer | start offset
Integer max = 10; // Integer | max results
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
 **offset** | **Integer**| start offset | [optional] [default to 0]
 **max** | **Integer**| max results | [optional] [default to 10]

### Return type

[**List&lt;WithdrawalRequest&gt;**](WithdrawalRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="withdrawFromWallet"></a>
# **withdrawFromWallet**
> WithdrawalRequest withdrawFromWallet(id, body)

Withdraw from Wallet



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.WalletsApi;


WalletsApi apiInstance = new WalletsApi();
Long id = 789L; // Long | 
Withdrawal body = new Withdrawal(); // Withdrawal | 
try {
    WithdrawalRequest result = apiInstance.withdrawFromWallet(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#withdrawFromWallet");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

