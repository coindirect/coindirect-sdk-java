package org.coindirect.api;

import org.coindirect.api.invoker.ApiException;
import org.coindirect.api.invoker.ApiClient;
import org.coindirect.api.invoker.Configuration;
import org.coindirect.api.invoker.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import org.coindirect.api.model.OfferToBuy;
import org.coindirect.api.model.OfferToSell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P2PMarketplaceOffersPublicApi {
  private ApiClient apiClient;

  public P2PMarketplaceOffersPublicApi() {
    this(Configuration.getDefaultApiClient());
  }

  public P2PMarketplaceOffersPublicApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Find buy offers
   * 
   * @param currencyForSale  (required)
   * @param currencyAccepted  (required)
   * @param category  (optional)
   * @param type  (optional)
   * @param search  (optional)
   * @param affiliateCode  (optional)
   * @param countryCode  (optional)
   * @param vendorId  (optional)
   * @param offset start offset (optional)
   * @param max max results (optional)
   * @return List&lt;OfferToBuy&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OfferToBuy> listP2PBuyOffers(String currencyForSale, String currencyAccepted, Long category, Long type, String search, String affiliateCode, String countryCode, Long vendorId, Integer offset, Integer max) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'currencyForSale' is set
    if (currencyForSale == null) {
      throw new ApiException(400, "Missing the required parameter 'currencyForSale' when calling listP2PBuyOffers");
    }
    // verify the required parameter 'currencyAccepted' is set
    if (currencyAccepted == null) {
      throw new ApiException(400, "Missing the required parameter 'currencyAccepted' when calling listP2PBuyOffers");
    }
    // create path and map variables
    String localVarPath = "/api/public/offer/buy/{currencyForSale}/{currencyAccepted}"
      .replaceAll("\\{" + "currencyForSale" + "\\}", apiClient.escapeString(currencyForSale.toString()))
      .replaceAll("\\{" + "currencyAccepted" + "\\}", apiClient.escapeString(currencyAccepted.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "category", category));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "affiliateCode", affiliateCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryCode", countryCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "vendorId", vendorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "max", max));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OfferToBuy>> localVarReturnType = new GenericType<List<OfferToBuy>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List sell offers
   * 
   * @param currencyForSale  (required)
   * @param currencyAccepted  (required)
   * @param category  (optional)
   * @param type  (optional)
   * @param search  (optional)
   * @param affiliateCode  (optional)
   * @param minimumAvailable  (optional)
   * @param countryCode  (optional)
   * @param vendorId  (optional)
   * @param offset start offset (optional)
   * @param max max results (optional)
   * @return List&lt;OfferToSell&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OfferToSell> listP2PSellOffers(String currencyForSale, String currencyAccepted, Long category, Long type, String search, String affiliateCode, BigDecimal minimumAvailable, String countryCode, Long vendorId, Integer offset, Integer max) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'currencyForSale' is set
    if (currencyForSale == null) {
      throw new ApiException(400, "Missing the required parameter 'currencyForSale' when calling listP2PSellOffers");
    }
    // verify the required parameter 'currencyAccepted' is set
    if (currencyAccepted == null) {
      throw new ApiException(400, "Missing the required parameter 'currencyAccepted' when calling listP2PSellOffers");
    }
    // create path and map variables
    String localVarPath = "/api/public/offer/sell/{currencyForSale}/{currencyAccepted}"
      .replaceAll("\\{" + "currencyForSale" + "\\}", apiClient.escapeString(currencyForSale.toString()))
      .replaceAll("\\{" + "currencyAccepted" + "\\}", apiClient.escapeString(currencyAccepted.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "category", category));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "affiliateCode", affiliateCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minimumAvailable", minimumAvailable));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryCode", countryCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "vendorId", vendorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "max", max));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OfferToSell>> localVarReturnType = new GenericType<List<OfferToSell>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get offer information
   * 
   * @param id  (required)
   * @return OfferToSell
   * @throws ApiException if fails to make API call
   */
  public OfferToSell getP2POffer(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getP2POffer");
    }
    // create path and map variables
    String localVarPath = "/api/public/offer/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OfferToSell> localVarReturnType = new GenericType<OfferToSell>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
