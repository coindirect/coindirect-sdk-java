package org.coindirect.api;

import org.coindirect.api.invoker.ApiException;
import org.coindirect.api.invoker.ApiClient;
import org.coindirect.api.invoker.Configuration;
import org.coindirect.api.invoker.Pair;

import javax.ws.rs.core.GenericType;

import org.coindirect.api.model.HistoricalData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExchangeHistoricalDataApi {
  private ApiClient apiClient;

  public ExchangeHistoricalDataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExchangeHistoricalDataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieve Historical Data
   * 
   * @param market  (required)
   * @param history  (required)
   * @param grouping  (required)
   * @param limit  (optional)
   * @param fill  (optional)
   * @return HistoricalData
   * @throws ApiException if fails to make API call
   */
  public HistoricalData getHistoricalExchangeData(String market, String history, String grouping, Long limit, String fill) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'market' is set
    if (market == null) {
      throw new ApiException(400, "Missing the required parameter 'market' when calling getHistoricalExchangeData");
    }
    // verify the required parameter 'history' is set
    if (history == null) {
      throw new ApiException(400, "Missing the required parameter 'history' when calling getHistoricalExchangeData");
    }
    // verify the required parameter 'grouping' is set
    if (grouping == null) {
      throw new ApiException(400, "Missing the required parameter 'grouping' when calling getHistoricalExchangeData");
    }
    // create path and map variables
    String localVarPath = "/api/v1/exchange/historical/{market}/{history}/{grouping}"
      .replaceAll("\\{" + "market" + "\\}", apiClient.escapeString(market.toString()))
      .replaceAll("\\{" + "history" + "\\}", apiClient.escapeString(history.toString()))
      .replaceAll("\\{" + "grouping" + "\\}", apiClient.escapeString(grouping.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fill", fill));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<HistoricalData> localVarReturnType = new GenericType<HistoricalData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieve Historical Trades
   * 
   * @param market  (required)
   * @param history  (required)
   * @param limit  (optional)
   * @throws ApiException if fails to make API call
   */
  public void getHistoricalExchangeTrades(String market, String history, Long limit) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'market' is set
    if (market == null) {
      throw new ApiException(400, "Missing the required parameter 'market' when calling getHistoricalExchangeTrades");
    }
    // verify the required parameter 'history' is set
    if (history == null) {
      throw new ApiException(400, "Missing the required parameter 'history' when calling getHistoricalExchangeTrades");
    }
    // create path and map variables
    String localVarPath = "/api/v1/exchange/historical/trades/{market}/{history}"
      .replaceAll("\\{" + "market" + "\\}", apiClient.escapeString(market.toString()))
      .replaceAll("\\{" + "history" + "\\}", apiClient.escapeString(history.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));



    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
