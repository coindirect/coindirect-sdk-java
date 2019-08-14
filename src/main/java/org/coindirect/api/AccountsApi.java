package org.coindirect.api;

import org.coindirect.api.invoker.ApiException;
import org.coindirect.api.invoker.ApiClient;
import org.coindirect.api.invoker.Configuration;
import org.coindirect.api.invoker.Pair;

import javax.ws.rs.core.GenericType;

import org.coindirect.api.model.AccountDocument;
import org.coindirect.api.model.AccountPreference;
import org.coindirect.api.model.AccountProgress;
import org.coindirect.api.model.AffiliateTransaction;
import org.coindirect.api.model.Campaign;
import org.coindirect.api.model.Errors;
import org.coindirect.api.model.Wallet;
import org.coindirect.api.model.WrappedPrimitive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountsApi {
  private ApiClient apiClient;

  public AccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccountsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Upload a document for an account
   * 
   * @param body  (optional)
   * @return AccountDocument
   * @throws ApiException if fails to make API call
   */
  public AccountDocument createAccountDocument(AccountDocument body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/api/account/document";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AccountDocument> localVarReturnType = new GenericType<AccountDocument>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Read Account Preference
   * 
   * @param name  (required)
   * @return AccountPreference
   * @throws ApiException if fails to make API call
   */
  public AccountPreference getAccountPreference(String name) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getAccountPreference");
    }
    // create path and map variables
    String localVarPath = "/api/account/preference/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AccountPreference> localVarReturnType = new GenericType<AccountPreference>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Check progress of account setup
   * 
   * @return AccountProgress
   * @throws ApiException if fails to make API call
   */
  public AccountProgress getAccountProgress() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/account/progress";

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

    GenericType<AccountProgress> localVarReturnType = new GenericType<AccountProgress>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get WebSocket Channel
   * 
   * @return WrappedPrimitive
   * @throws ApiException if fails to make API call
   */
  public WrappedPrimitive getAccountWebsocketChannel() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/account/channel";

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

    GenericType<WrappedPrimitive> localVarReturnType = new GenericType<WrappedPrimitive>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get affiliate code
   * 
   * @param type  (optional)
   * @return WrappedPrimitive
   * @throws ApiException if fails to make API call
   */
  public WrappedPrimitive getAffiliateCode(String type) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/account/affiliate/code";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));



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
   * Get running campaigns
   * 
   * @param type  (optional)
   * @return Campaign
   * @throws ApiException if fails to make API call
   */
  public Campaign getRunningCampaigns(String type) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/account/affiliate/campaigns";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Campaign> localVarReturnType = new GenericType<Campaign>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List uploaded documents for an account
   * 
   * @return List&lt;AccountDocument&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AccountDocument> listAccountDocuments() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/account/document";

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

    GenericType<List<AccountDocument>> localVarReturnType = new GenericType<List<AccountDocument>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List Account Preferences
   * This will return a key/value object of the preferences that have been stored for this account.
   * @param offset start offset (optional)
   * @param max max results (optional)
   * @return Map&lt;String, Object&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> listAccountPreferences(Integer offset, Integer max) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/account/preference";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "max", max));



    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Map<String, Object>> localVarReturnType = new GenericType<Map<String, Object>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get affiliate balances
   * 
   * @return List&lt;Wallet&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Wallet> listAffiliateBalances() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/account/affiliate/balance";

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

    GenericType<List<Wallet>> localVarReturnType = new GenericType<List<Wallet>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get affiliate code types
   * 
   * @return List&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public List<String> listAffiliateCodeTypes() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/account/affiliate/code/types";

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

    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get affiliate transactions
   * 
   * @param offset start offset (optional)
   * @param max max results (optional)
   * @return List&lt;AffiliateTransaction&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AffiliateTransaction> listAffiliateTransactions(Integer offset, Integer max) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/account/affiliate/transaction";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<List<AffiliateTransaction>> localVarReturnType = new GenericType<List<AffiliateTransaction>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update Account Preference
   * 
   * @param name  (required)
   * @param body  (optional)
   * @return AccountPreference
   * @throws ApiException if fails to make API call
   */
  public AccountPreference updateAccountPreference(String name, AccountPreference body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling updateAccountPreference");
    }
    // create path and map variables
    String localVarPath = "/api/account/preference/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/xml", "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AccountPreference> localVarReturnType = new GenericType<AccountPreference>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
