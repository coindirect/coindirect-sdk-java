# TransactionsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResource**](TransactionsApi.md#getResource) | **GET** /api/transaction/type/{id} | Read Transaction Type
[**getTransaction**](TransactionsApi.md#getTransaction) | **GET** /api/transaction/read/{id} | Get Transaction
[**listTransactionTypes**](TransactionsApi.md#listTransactionTypes) | **GET** /api/transaction/type | List Transaction Types
[**listTransactions**](TransactionsApi.md#listTransactions) | **GET** /api/transaction | List Transactions
[**listTransactionsForWallet**](TransactionsApi.md#listTransactionsForWallet) | **GET** /api/transaction/{id} | List Transactions for Wallet


<a name="getResource"></a>
# **getResource**
> TransactionType getResource(id)

Read Transaction Type



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
Long id = 789L; // Long | 
try {
    TransactionType result = apiInstance.getResource(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**TransactionType**](TransactionType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransaction"></a>
# **getTransaction**
> Transaction getTransaction(id)

Get Transaction



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
Long id = 789L; // Long | 
try {
    Transaction result = apiInstance.getTransaction(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTransactionTypes"></a>
# **listTransactionTypes**
> List&lt;TransactionType&gt; listTransactionTypes(offset, max)

List Transaction Types



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
Integer offset = 0; // Integer | start offset
Integer max = 10; // Integer | max results
try {
    List<TransactionType> result = apiInstance.listTransactionTypes(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#listTransactionTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional] [default to 0]
 **max** | **Integer**| max results | [optional] [default to 10]

### Return type

[**List&lt;TransactionType&gt;**](TransactionType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTransactions"></a>
# **listTransactions**
> List&lt;Transaction&gt; listTransactions(offset, max)

List Transactions



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
Integer offset = 0; // Integer | start offset
Integer max = 10; // Integer | max results
try {
    List<Transaction> result = apiInstance.listTransactions(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#listTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional] [default to 0]
 **max** | **Integer**| max results | [optional] [default to 10]

### Return type

[**List&lt;Transaction&gt;**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTransactionsForWallet"></a>
# **listTransactionsForWallet**
> List&lt;Transaction&gt; listTransactionsForWallet(id, offset, max)

List Transactions for Wallet



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
Long id = 789L; // Long | 
Integer offset = 0; // Integer | start offset
Integer max = 10; // Integer | max results
try {
    List<Transaction> result = apiInstance.listTransactionsForWallet(id, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#listTransactionsForWallet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **offset** | **Integer**| start offset | [optional] [default to 0]
 **max** | **Integer**| max results | [optional] [default to 10]

### Return type

[**List&lt;Transaction&gt;**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

