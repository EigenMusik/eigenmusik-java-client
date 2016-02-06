package com.eigenmusik.client.api;

import com.sun.jersey.api.client.GenericType;

import com.eigenmusik.client.ApiException;
import com.eigenmusik.client.ApiClient;
import com.eigenmusik.client.Configuration;
import com.eigenmusik.client.Pair;

import com.eigenmusik.client.model.Pageable;
import com.eigenmusik.client.model.PageTrack;
import com.eigenmusik.client.model.Principal;
import com.eigenmusik.client.model.TrackStreamUrl;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-06T19:24:59.502Z")
public class TracksApi {
  private ApiClient EigenMusikapiClient;

  public TracksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TracksApi(ApiClient apiClient) {
    this.EigenMusikapiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return EigenMusikapiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.EigenMusikapiClient = apiClient;
  }

  
  /**
   * getTracks
   * getTracks
   * @param principal principal
   * @param pageable pageable
   * @return PageTrack
   */
  public PageTrack getTracksUsingGET(Principal principal, Pageable pageable) throws ApiException {
    Object EigenMusikpostBody = pageable;
    
    // create path and map variables
    String EigenMusikpath = "/rest/tracks".replaceAll("\\{format\\}","json");

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

    
    GenericType<PageTrack> EigenMusikreturnType = new GenericType<PageTrack>() {};
    return EigenMusikapiClient.invokeAPI(EigenMusikpath, "GET", EigenMusikqueryParams, EigenMusikpostBody, EigenMusikheaderParams, EigenMusikformParams, EigenMusikaccept, EigenMusikcontentType, EigenMusikauthNames, EigenMusikreturnType);
    
  }
  
  /**
   * getStreamUrl
   * getStreamUrl
   * @param trackId trackId
   * @param principal principal
   * @param pageable pageable
   * @return TrackStreamUrl
   */
  public TrackStreamUrl getStreamUrlUsingGET(Long trackId, Principal principal, Pageable pageable) throws ApiException {
    Object EigenMusikpostBody = pageable;
    
     // verify the required parameter 'trackId' is set
     if (trackId == null) {
        throw new ApiException(400, "Missing the required parameter 'trackId' when calling getStreamUrlUsingGET");
     }
     
    // create path and map variables
    String EigenMusikpath = "/rest/tracks/ /stream/{trackId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "trackId" + "\\}", EigenMusikapiClient.escapeString(trackId.toString()));

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

    
    GenericType<TrackStreamUrl> EigenMusikreturnType = new GenericType<TrackStreamUrl>() {};
    return EigenMusikapiClient.invokeAPI(EigenMusikpath, "GET", EigenMusikqueryParams, EigenMusikpostBody, EigenMusikheaderParams, EigenMusikformParams, EigenMusikaccept, EigenMusikcontentType, EigenMusikauthNames, EigenMusikreturnType);
    
  }
  
}
