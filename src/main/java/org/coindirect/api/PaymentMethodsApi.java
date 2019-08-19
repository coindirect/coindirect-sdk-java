package org.coindirect.api;

import org.coindirect.api.invoker.ApiException;
import org.coindirect.api.invoker.ApiClient;
import org.coindirect.api.invoker.Configuration;
import org.coindirect.api.invoker.Pair;

import javax.ws.rs.core.GenericType;

import org.coindirect.api.model.PayInMethod;
import org.coindirect.api.model.PayOutMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentMethodsApi {
  private ApiClient apiClient;

  public PaymentMethodsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PaymentMethodsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * List Pay In Methods
   * Available pay out methods will be listed based on the parameters provided
   * @param country  (optional)
   * @param currency  (optional)
   * @param uuid  (optional)
   * @param merchant  (optional)
   * @return List&lt;PayInMethod&gt;
   * @throws ApiException if fails to make API call
   */
  public List<PayInMethod> payInMethodList(String country, String currency, String uuid, String merchant) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/pay/in/method";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "uuid", uuid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "merchant", merchant));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<PayInMethod>> localVarReturnType = new GenericType<List<PayInMethod>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List Pay Out Methods
   * Available pay out methods will be listed based on the parameters provided
   * @param country  (optional)
   * @param currency  (optional)
   * @param uuid  (optional)
   * @param merchant  (optional)
   * @return List&lt;PayOutMethod&gt;
   * @throws ApiException if fails to make API call
   */
  public List<PayOutMethod> payOutMethodList(String country, String currency, String uuid, String merchant) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/pay/out/method";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "uuid", uuid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "merchant", merchant));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<PayOutMethod>> localVarReturnType = new GenericType<List<PayOutMethod>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
