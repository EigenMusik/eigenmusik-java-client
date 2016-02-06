package com.eigenmusik.client.api;

import com.sun.jersey.api.client.GenericType;

import com.eigenmusik.client.ApiException;
import com.eigenmusik.client.ApiClient;
import com.eigenmusik.client.Configuration;
import com.eigenmusik.client.Pair;

import com.eigenmusik.client.model.Principal;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-06T19:24:59.502Z")
public class SourcesApi {
  private ApiClient EigenMusikapiClient;

  public SourcesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SourcesApi(ApiClient apiClient) {
    this.EigenMusikapiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return EigenMusikapiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.EigenMusikapiClient = apiClient;
  }

  
  /**
   * addSource
   * addSource
   * @param source source
   * @param code code
   * @param principal principal
   * @return String
   */
  public String addSourceUsingPOST(String source, String code, Principal principal) throws ApiException {
    Object EigenMusikpostBody = principal;
    
     // verify the required parameter 'source' is set
     if (source == null) {
        throw new ApiException(400, "Missing the required parameter 'source' when calling addSourceUsingPOST");
     }
     
     // verify the required parameter 'code' is set
     if (code == null) {
        throw new ApiException(400, "Missing the required parameter 'code' when calling addSourceUsingPOST");
     }
     
    // create path and map variables
    String EigenMusikpath = "/rest/source/add/{source}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "source" + "\\}", EigenMusikapiClient.escapeString(source.toString()));

    // query params
    List<Pair> EigenMusikqueryParams = new ArrayList<Pair>();
    Map<String, String> EigenMusikheaderParams = new HashMap<String, String>();
    Map<String, Object> EigenMusikformParams = new HashMap<String, Object>();

    

    

    

    final String[] EigenMusikaccepts = {
      "*/*"
    };
    final String EigenMusikaccept = EigenMusikapiClient.selectHeaderAccept(EigenMusikaccepts);

    final String[] EigenMusikcontentTypes = {
      "application/json"
    };
    final String EigenMusikcontentType = EigenMusikapiClient.selectHeaderContentType(EigenMusikcontentTypes);

    String[] EigenMusikauthNames = new String[] {  };

    
    GenericType<String> EigenMusikreturnType = new GenericType<String>() {};
    return EigenMusikapiClient.invokeAPI(EigenMusikpath, "POST", EigenMusikqueryParams, EigenMusikpostBody, EigenMusikheaderParams, EigenMusikformParams, EigenMusikaccept, EigenMusikcontentType, EigenMusikauthNames, EigenMusikreturnType);
    
  }
  
}
