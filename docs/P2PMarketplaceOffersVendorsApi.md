# P2PMarketplaceOffersVendorsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createP2PBuyOffer**](P2PMarketplaceOffersVendorsApi.md#createP2PBuyOffer) | **POST** /api/offer/buy | Create Offer to Buy
[**createP2PSellOffer**](P2PMarketplaceOffersVendorsApi.md#createP2PSellOffer) | **POST** /api/offer/sell | Create Offer to Sell
[**deleteP2POffer**](P2PMarketplaceOffersVendorsApi.md#deleteP2POffer) | **DELETE** /api/offer/{id} | Delete Offer
[**evaluateP2PEquation**](P2PMarketplaceOffersVendorsApi.md#evaluateP2PEquation) | **POST** /api/offer/equation | Execution Equation
[**getP2POffer**](P2PMarketplaceOffersVendorsApi.md#getP2POffer) | **GET** /api/offer/{id} | Read an Offer
[**listP2PExchanges**](P2PMarketplaceOffersVendorsApi.md#listP2PExchanges) | **GET** /api/offer/exchanges | List Exchanges for Equations
[**listP2POffers**](P2PMarketplaceOffersVendorsApi.md#listP2POffers) | **GET** /api/offer | List Offers
[**listP2PVariables**](P2PMarketplaceOffersVendorsApi.md#listP2PVariables) | **GET** /api/offer/variables | List Variables for Equations
[**updateP2POffer**](P2PMarketplaceOffersVendorsApi.md#updateP2POffer) | **PUT** /api/offer/{id} | Update Offer


<a name="createP2PBuyOffer"></a>
# **createP2PBuyOffer**
> Offer createP2PBuyOffer(body)

Create Offer to Buy



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.P2PMarketplaceOffersVendorsApi;


P2PMarketplaceOffersVendorsApi apiInstance = new P2PMarketplaceOffersVendorsApi();
Offer body = new Offer(); // Offer | 
try {
    Offer result = apiInstance.createP2PBuyOffer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOffersVendorsApi#createP2PBuyOffer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Offer**](Offer.md)|  | [optional]

### Return type

[**Offer**](Offer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createP2PSellOffer"></a>
# **createP2PSellOffer**
> Offer createP2PSellOffer(body)

Create Offer to Sell



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.P2PMarketplaceOffersVendorsApi;


P2PMarketplaceOffersVendorsApi apiInstance = new P2PMarketplaceOffersVendorsApi();
Offer body = new Offer(); // Offer | 
try {
    Offer result = apiInstance.createP2PSellOffer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOffersVendorsApi#createP2PSellOffer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Offer**](Offer.md)|  | [optional]

### Return type

[**Offer**](Offer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteP2POffer"></a>
# **deleteP2POffer**
> deleteP2POffer(id)

Delete Offer



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.P2PMarketplaceOffersVendorsApi;


P2PMarketplaceOffersVendorsApi apiInstance = new P2PMarketplaceOffersVendorsApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteP2POffer(id);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOffersVendorsApi#deleteP2POffer");
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

<a name="evaluateP2PEquation"></a>
# **evaluateP2PEquation**
> Equation evaluateP2PEquation(body)

Execution Equation



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.P2PMarketplaceOffersVendorsApi;


P2PMarketplaceOffersVendorsApi apiInstance = new P2PMarketplaceOffersVendorsApi();
Equation body = new Equation(); // Equation | 
try {
    Equation result = apiInstance.evaluateP2PEquation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOffersVendorsApi#evaluateP2PEquation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Equation**](Equation.md)|  | [optional]

### Return type

[**Equation**](Equation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getP2POffer"></a>
# **getP2POffer**
> Offer getP2POffer(id)

Read an Offer



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.P2PMarketplaceOffersVendorsApi;


P2PMarketplaceOffersVendorsApi apiInstance = new P2PMarketplaceOffersVendorsApi();
Long id = 789L; // Long | 
try {
    Offer result = apiInstance.getP2POffer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOffersVendorsApi#getP2POffer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Offer**](Offer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listP2PExchanges"></a>
# **listP2PExchanges**
> List&lt;Exchange&gt; listP2PExchanges()

List Exchanges for Equations



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.P2PMarketplaceOffersVendorsApi;


P2PMarketplaceOffersVendorsApi apiInstance = new P2PMarketplaceOffersVendorsApi();
try {
    List<Exchange> result = apiInstance.listP2PExchanges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOffersVendorsApi#listP2PExchanges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Exchange&gt;**](Exchange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listP2POffers"></a>
# **listP2POffers**
> List&lt;Offer&gt; listP2POffers(offset, max)

List Offers



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.P2PMarketplaceOffersVendorsApi;


P2PMarketplaceOffersVendorsApi apiInstance = new P2PMarketplaceOffersVendorsApi();
Integer offset = 0; // Integer | start offset
Integer max = 10; // Integer | max results
try {
    List<Offer> result = apiInstance.listP2POffers(offset, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOffersVendorsApi#listP2POffers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| start offset | [optional] [default to 0]
 **max** | **Integer**| max results | [optional] [default to 10]

### Return type

[**List&lt;Offer&gt;**](Offer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listP2PVariables"></a>
# **listP2PVariables**
> List&lt;String&gt; listP2PVariables()

List Variables for Equations



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.P2PMarketplaceOffersVendorsApi;


P2PMarketplaceOffersVendorsApi apiInstance = new P2PMarketplaceOffersVendorsApi();
try {
    List<String> result = apiInstance.listP2PVariables();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOffersVendorsApi#listP2PVariables");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateP2POffer"></a>
# **updateP2POffer**
> Offer updateP2POffer(id, body)

Update Offer



### Example
```java
// Import classes:
//import org.coindirect.client.invoker.ApiException;
//import org.coindirect.client.api.P2PMarketplaceOffersVendorsApi;


P2PMarketplaceOffersVendorsApi apiInstance = new P2PMarketplaceOffersVendorsApi();
Long id = 789L; // Long | 
Offer body = new Offer(); // Offer | 
try {
    Offer result = apiInstance.updateP2POffer(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling P2PMarketplaceOffersVendorsApi#updateP2POffer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **body** | [**Offer**](Offer.md)|  | [optional]

### Return type

[**Offer**](Offer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

