package com.eigenmusik.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-06T19:24:59.502Z")
public class TrackStreamUrl   {
  
  private String streamUrl = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("streamUrl")
  public String getStreamUrl() {
    return streamUrl;
  }
  public void setStreamUrl(String streamUrl) {
    this.streamUrl = streamUrl;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackStreamUrl trackStreamUrl = (TrackStreamUrl) o;

    return true && Objects.equals(streamUrl, trackStreamUrl.streamUrl)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackStreamUrl {\n");
    
    sb.append("    streamUrl: ").append(toIndentedString(streamUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

