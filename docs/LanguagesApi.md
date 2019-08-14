# LanguagesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLanguage**](LanguagesApi.md#getLanguage) | **GET** /api/language/{id} | Read Language
[**listLanguages**](LanguagesApi.md#listLanguages) | **GET** /api/language | List Languages

<a name="getLanguage"></a>
# **getLanguage**
> Language getLanguage(id)

Read Language

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.LanguagesApi;


LanguagesApi apiInstance = new LanguagesApi();
Long id = 789L; // Long | 
try {
    Language result = apiInstance.getLanguage(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#getLanguage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Language**](Language.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLanguages"></a>
# **listLanguages**
> List&lt;Language&gt; listLanguages(offset, max)

List Languages

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.LanguagesApi;


LanguagesApi apiInstance = new LanguagesApi();
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<Language> result = apiInstance.listLanguages(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#listLanguages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;Language&gt;**](Language.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

