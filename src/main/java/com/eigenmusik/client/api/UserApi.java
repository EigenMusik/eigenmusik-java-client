package com.eigenmusik.client.api;

import com.sun.jersey.api.client.GenericType;

import com.eigenmusik.client.ApiException;
import com.eigenmusik.client.ApiClient;
import com.eigenmusik.client.Configuration;
import com.eigenmusik.client.Pair;

import com.eigenmusik.client.model.InlineResponse200;
import com.eigenmusik.client.model.Principal;
import com.eigenmusik.client.model.User;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-06T19:54:54.326Z")
public class UserApi {
  private ApiClient EigenMusikapiClient;

  public UserApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserApi(ApiClient apiClient) {
    this.EigenMusikapiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return EigenMusikapiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.EigenMusikapiClient = apiClient;
  }

  
  /**
   * getMe
   * getMe
   * @param principal principal
   * @return InlineResponse200
   */
  public InlineResponse200 getMeUsingGET(Principal principal) throws ApiException {
    Object EigenMusikpostBody = principal;
    
    // create path and map variables
    String EigenMusikpath = "/user/me".replaceAll("\\{format\\}","json");

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

    
    GenericType<InlineResponse200> EigenMusikreturnType = new GenericType<InlineResponse200>() {};
    return EigenMusikapiClient.invokeAPI(EigenMusikpath, "GET", EigenMusikqueryParams, EigenMusikpostBody, EigenMusikheaderParams, EigenMusikformParams, EigenMusikaccept, EigenMusikcontentType, EigenMusikauthNames, EigenMusikreturnType);
    
  }
  
  /**
   * register
   * register
   * @param user user
   * @return InlineResponse200
   */
  public InlineResponse200 registerUsingPOST(User user) throws ApiException {
    Object EigenMusikpostBody = user;
    
     // verify the required parameter 'user' is set
     if (user == null) {
        throw new ApiException(400, "Missing the required parameter 'user' when calling registerUsingPOST");
     }
     
    // create path and map variables
    String EigenMusikpath = "/user/register".replaceAll("\\{format\\}","json");

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

    
    GenericType<InlineResponse200> EigenMusikreturnType = new GenericType<InlineResponse200>() {};
    return EigenMusikapiClient.invokeAPI(EigenMusikpath, "POST", EigenMusikqueryParams, EigenMusikpostBody, EigenMusikheaderParams, EigenMusikformParams, EigenMusikaccept, EigenMusikcontentType, EigenMusikauthNames, EigenMusikreturnType);
    
  }
  
}
