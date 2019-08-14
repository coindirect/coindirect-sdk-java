package org.coindirect.api;

import org.coindirect.api.invoker.ApiException;
import org.coindirect.api.invoker.ApiClient;
import org.coindirect.api.invoker.Configuration;
import org.coindirect.api.invoker.Pair;

import javax.ws.rs.core.GenericType;

import org.coindirect.api.model.ExchangeRate;
import org.coindirect.api.model.Sentiment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SentimentApi {
  private ApiClient apiClient;

  public SentimentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SentimentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Read Last Exchange Rates
   * 
   * @param currency  (optional)
   * @return List&lt;ExchangeRate&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ExchangeRate> listExchangeRatesLast(String currency) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/exchange-rate/last";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ExchangeRate>> localVarReturnType = new GenericType<List<ExchangeRate>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Read Exchange Rates
   * 
   * @param baseCurrency  (optional)
   * @param counterCurrency  (optional)
   * @return List&lt;ExchangeRate&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ExchangeRate> listExchangeRatesRecent(String baseCurrency, String counterCurrency) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/exchange-rate/recent";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseCurrency", baseCurrency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "counterCurrency", counterCurrency));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ExchangeRate>> localVarReturnType = new GenericType<List<ExchangeRate>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Read Aggregated Sentiment
   * 
   * @param currency  (optional)
   * @param after  (optional)
   * @return List&lt;Sentiment&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Sentiment> listSentimentAggregated(List<String> currency, Long after) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/sentiment/aggregated";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "after", after));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Sentiment>> localVarReturnType = new GenericType<List<Sentiment>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Read Last Sentiment
   * 
   * @param currency  (optional)
   * @return List&lt;Sentiment&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Sentiment> listSentimentLast(List<String> currency) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/sentiment/last";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "currency", currency));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Sentiment>> localVarReturnType = new GenericType<List<Sentiment>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
