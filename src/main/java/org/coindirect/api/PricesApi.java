package org.coindirect.api;

import org.coindirect.api.invoker.ApiException;
import org.coindirect.api.invoker.ApiClient;
import org.coindirect.api.invoker.Configuration;
import org.coindirect.api.invoker.Pair;

import javax.ws.rs.core.GenericType;

import org.coindirect.api.model.CurrencySnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PricesApi {
  private ApiClient apiClient;

  public PricesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PricesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * List Latest Prices
   * 
   * @param baseCurrency  (optional)
   * @param countryCode  (optional)
   * @param offset start offset (optional)
   * @param max max results (optional)
   * @return List&lt;CurrencySnapshot&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CurrencySnapshot> listCurrencySnapshots(String baseCurrency, String countryCode, Integer offset, Integer max) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/currency/snapshot";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseCurrency", baseCurrency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryCode", countryCode));
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

    GenericType<List<CurrencySnapshot>> localVarReturnType = new GenericType<List<CurrencySnapshot>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
