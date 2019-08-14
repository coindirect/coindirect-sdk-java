package org.coindirect.api;

import org.coindirect.api.invoker.ApiException;
import org.coindirect.api.invoker.ApiClient;
import org.coindirect.api.invoker.Configuration;
import org.coindirect.api.invoker.Pair;

import javax.ws.rs.core.GenericType;

import org.coindirect.api.model.GenericOption;
import org.coindirect.api.model.PaymentMethodCategory;
import org.coindirect.api.model.PaymentMethodType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentTypesAndCategoriesApi {
  private ApiClient apiClient;

  public PaymentTypesAndCategoriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PaymentTypesAndCategoriesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * List option for Payment Method Type
   * 
   * @param id  (required)
   * @return List&lt;GenericOption&gt;
   * @throws ApiException if fails to make API call
   */
  public List<GenericOption> listOptionsForPaymentMethodType(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listOptionsForPaymentMethodType");
    }
    // create path and map variables
    String localVarPath = "/api/public/payment/type/options/{id}"
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

    GenericType<List<GenericOption>> localVarReturnType = new GenericType<List<GenericOption>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List Payment Method Categories
   * 
   * @return List&lt;PaymentMethodCategory&gt;
   * @throws ApiException if fails to make API call
   */
  public List<PaymentMethodCategory> listPaymentMethodCategories() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/public/payment/categories";

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

    GenericType<List<PaymentMethodCategory>> localVarReturnType = new GenericType<List<PaymentMethodCategory>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List Payment Method Types
   * 
   * @param countryCode  (optional)
   * @return List&lt;PaymentMethodType&gt;
   * @throws ApiException if fails to make API call
   */
  public List<PaymentMethodType> listPaymentMethodTypes(String countryCode) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/public/payment/types";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryCode", countryCode));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<PaymentMethodType>> localVarReturnType = new GenericType<List<PaymentMethodType>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List Payment Method Types for Category
   * 
   * @param id  (required)
   * @param countryCode  (optional)
   * @return List&lt;PaymentMethodType&gt;
   * @throws ApiException if fails to make API call
   */
  public List<PaymentMethodType> listPaymentMethodTypesByCategory(Long id, String countryCode) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listPaymentMethodTypesByCategory");
    }
    // create path and map variables
    String localVarPath = "/api/public/payment/types/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryCode", countryCode));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<PaymentMethodType>> localVarReturnType = new GenericType<List<PaymentMethodType>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
