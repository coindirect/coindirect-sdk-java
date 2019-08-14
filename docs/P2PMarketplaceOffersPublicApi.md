# P2PMarketplaceOffersPublicApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getP2POffer**](P2PMarketplaceOffersPublicApi.md#getP2POffer) | **GET** /api/public/offer/{id} | Get offer information
[**listP2PBuyOffers**](P2PMarketplaceOffersPublicApi.md#listP2PBuyOffers) | **GET** /api/public/offer/buy/{currencyForSale}/{currencyAccepted} | Find buy offers
[**listP2PSellOffers**](P2PMarketplaceOffersPublicApi.md#listP2PSellOffers) | **GET** /api/public/offer/sell/{currencyForSale}/{currencyAccepted} | List sell offers

<a name="getP2POffer"></a>
# **getP2POffer**
> OfferToSell getP2POffer(id)

Get offer information

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOffersPublicApi;


P2PMarketplaceOffersPublicApi apiInstance = new P2PMarketplaceOffersPublicApi();
Long id = 789L; // Long | 
try {
    OfferToSell result = apiInstance.getP2POffer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOffersPublicApi#getP2POffer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**OfferToSell**](OfferToSell.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listP2PBuyOffers"></a>
# **listP2PBuyOffers**
> List&lt;OfferToBuy&gt; listP2PBuyOffers(currencyForSale, currencyAccepted, category, type, search, affiliateCode, countryCode, vendorId, offset, max)

Find buy offers

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOffersPublicApi;


P2PMarketplaceOffersPublicApi apiInstance = new P2PMarketplaceOffersPublicApi();
String currencyForSale = "currencyForSale_example"; // String | 
String currencyAccepted = "currencyAccepted_example"; // String | 
Long category = 789L; // Long | 
Long type = 789L; // Long | 
String search = "search_example"; // String | 
String affiliateCode = "affiliateCode_example"; // String | 
String countryCode = "countryCode_example"; // String | 
Long vendorId = 789L; // Long | 
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<OfferToBuy> result = apiInstance.listP2PBuyOffers(currencyForSale, currencyAccepted, category, type, search, affiliateCode, countryCode, vendorId, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOffersPublicApi#listP2PBuyOffers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyForSale** | **String**|  |
 **currencyAccepted** | **String**|  |
 **category** | **Long**|  | [optional]
 **type** | **Long**|  | [optional]
 **search** | **String**|  | [optional]
 **affiliateCode** | **String**|  | [optional]
 **countryCode** | **String**|  | [optional]
 **vendorId** | **Long**|  | [optional]
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;OfferToBuy&gt;**](OfferToBuy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listP2PSellOffers"></a>
# **listP2PSellOffers**
> List&lt;OfferToSell&gt; listP2PSellOffers(currencyForSale, currencyAccepted, category, type, search, affiliateCode, minimumAvailable, countryCode, vendorId, offset, max)

List sell offers

### Example
```java
// Import classes:
//import org.coindirect.api.invoker.ApiException;
//import org.coindirect.api.P2PMarketplaceOffersPublicApi;


P2PMarketplaceOffersPublicApi apiInstance = new P2PMarketplaceOffersPublicApi();
String currencyForSale = "currencyForSale_example"; // String | 
String currencyAccepted = "currencyAccepted_example"; // String | 
Long category = 789L; // Long | 
Long type = 789L; // Long | 
String search = "search_example"; // String | 
String affiliateCode = "affiliateCode_example"; // String | 
BigDecimal minimumAvailable = new BigDecimal(); // BigDecimal | 
String countryCode = "countryCode_example"; // String | 
Long vendorId = 789L; // Long | 
Integer offset = 56; // Integer | start offset
Integer max = 56; // Integer | max results
try {
    List<OfferToSell> result = apiInstance.listP2PSellOffers(currencyForSale, currencyAccepted, category, type, search, affiliateCode, minimumAvailable, countryCode, vendorId, offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOffersPublicApi#listP2PSellOffers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyForSale** | **String**|  |
 **currencyAccepted** | **String**|  |
 **category** | **Long**|  | [optional]
 **type** | **Long**|  | [optional]
 **search** | **String**|  | [optional]
 **affiliateCode** | **String**|  | [optional]
 **minimumAvailable** | **BigDecimal**|  | [optional]
 **countryCode** | **String**|  | [optional]
 **vendorId** | **Long**|  | [optional]
 **offset** | **Integer**| start offset | [optional]
 **max** | **Integer**| max results | [optional]

### Return type

[**List&lt;OfferToSell&gt;**](OfferToSell.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

