package org.coindirect.api;

import org.coindirect.api.invoker.ApiException;
import org.coindirect.api.invoker.ApiClient;
import org.coindirect.api.invoker.Configuration;
import org.coindirect.api.invoker.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import org.coindirect.api.model.Currency;
import org.coindirect.api.model.CurrencyRate;
import org.coindirect.api.model.WrappedPrimitive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrenciesApi {
  private ApiClient apiClient;

  public CurrenciesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CurrenciesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Convert Currency Value
   * 
   * @param fromCode  (required)
   * @param toCode  (required)
   * @param amount  (optional)
   * @return WrappedPrimitive
   * @throws ApiException if fails to make API call
   */
  public WrappedPrimitive convertCurrency(String fromCode, String toCode, BigDecimal amount) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fromCode' is set
    if (fromCode == null) {
      throw new ApiException(400, "Missing the required parameter 'fromCode' when calling convertCurrency");
    }
    // verify the required parameter 'toCode' is set
    if (toCode == null) {
      throw new ApiException(400, "Missing the required parameter 'toCode' when calling convertCurrency");
    }
    // create path and map variables
    String localVarPath = "/api/currency/convert/{fromCode}/{toCode}"
      .replaceAll("\\{" + "fromCode" + "\\}", apiClient.escapeString(fromCode.toString()))
      .replaceAll("\\{" + "toCode" + "\\}", apiClient.escapeString(toCode.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<WrappedPrimitive> localVarReturnType = new GenericType<WrappedPrimitive>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List Crypto Currencies
   * 
   * @param allowDeposits  (optional)
   * @param all  (optional)
   * @param offset start offset (optional)
   * @param max max results (optional)
   * @return List&lt;Currency&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Currency> listCurrenciesCrypto(Boolean allowDeposits, Boolean all, Integer offset, Integer max) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/currency/crypto";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allowDeposits", allowDeposits));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "all", all));
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

    GenericType<List<Currency>> localVarReturnType = new GenericType<List<Currency>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List Fiat Currencies
   * 
   * @param usable  (optional)
   * @param all  (optional)
   * @param offset start offset (optional)
   * @param max max results (optional)
   * @return List&lt;Currency&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Currency> listCurrenciesFiat(Boolean usable, Boolean all, Integer offset, Integer max) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/currency/fiat";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usable", usable));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "all", all));
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

    GenericType<List<Currency>> localVarReturnType = new GenericType<List<Currency>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Read Currency Metadata
   * 
   * @param code  (required)
   * @return Currency
   * @throws ApiException if fails to make API call
   */
  public Currency getCurrencyMetadata(String code) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling getCurrencyMetadata");
    }
    // create path and map variables
    String localVarPath = "/api/currency/metadata/{code}"
      .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

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

    GenericType<Currency> localVarReturnType = new GenericType<Currency>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get Values for Currency
   * 
   * @param baseCurrency  (required)
   * @param all  (optional)
   * @return List&lt;CurrencyRate&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CurrencyRate> getValuesForCurrency(String baseCurrency, Boolean all) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'baseCurrency' is set
    if (baseCurrency == null) {
      throw new ApiException(400, "Missing the required parameter 'baseCurrency' when calling getValuesForCurrency");
    }
    // create path and map variables
    String localVarPath = "/api/currency/values/{baseCurrency}"
      .replaceAll("\\{" + "baseCurrency" + "\\}", apiClient.escapeString(baseCurrency.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "all", all));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CurrencyRate>> localVarReturnType = new GenericType<List<CurrencyRate>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Read Currency
   * 
   * @param id  (required)
   * @return Currency
   * @throws ApiException if fails to make API call
   */
  public Currency getCurrency(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCurrency");
    }
    // create path and map variables
    String localVarPath = "/api/currency/{id}"
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

    GenericType<Currency> localVarReturnType = new GenericType<Currency>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
