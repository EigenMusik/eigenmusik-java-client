package com.eigenmusik.client.model;

import java.util.Objects;
import com.eigenmusik.client.model.UserProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-06T19:24:59.502Z")
public class SourceAccount   {
  
  private Long id = null;
  private UserProfile owner = null;


  public enum SourceEnum {
    SOUNDCLOUD("SOUNDCLOUD");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SourceEnum source = null;
  private Long uri = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  public UserProfile getOwner() {
    return owner;
  }
  public void setOwner(UserProfile owner) {
    this.owner = owner;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("source")
  public SourceEnum getSource() {
    return source;
  }
  public void setSource(SourceEnum source) {
    this.source = source;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uri")
  public Long getUri() {
    return uri;
  }
  public void setUri(Long uri) {
    this.uri = uri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceAccount sourceAccount = (SourceAccount) o;

    return true && Objects.equals(id, sourceAccount.id) &&
        Objects.equals(owner, sourceAccount.owner) &&
        Objects.equals(source, sourceAccount.source) &&
        Objects.equals(uri, sourceAccount.uri)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, source, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

