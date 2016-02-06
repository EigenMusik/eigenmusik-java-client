package com.eigenmusik.client.model;

import java.util.Objects;
import com.eigenmusik.client.model.Sort;
import com.eigenmusik.client.model.Track;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-06T19:54:54.326Z")
public class PageTrack   {
  
  private List<Track> content = new ArrayList<Track>();
  private Boolean first = null;
  private Boolean last = null;
  private Integer number = null;
  private Integer numberOfElements = null;
  private Integer size = null;
  private Sort sort = null;
  private Long totalElements = null;
  private Integer totalPages = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("content")
  public List<Track> getContent() {
    return content;
  }
  public void setContent(List<Track> content) {
    this.content = content;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("first")
  public Boolean getFirst() {
    return first;
  }
  public void setFirst(Boolean first) {
    this.first = first;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("last")
  public Boolean getLast() {
    return last;
  }
  public void setLast(Boolean last) {
    this.last = last;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numberOfElements")
  public Integer getNumberOfElements() {
    return numberOfElements;
  }
  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sort")
  public Sort getSort() {
    return sort;
  }
  public void setSort(Sort sort) {
    this.sort = sort;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalElements")
  public Long getTotalElements() {
    return totalElements;
  }
  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageTrack pageTrack = (PageTrack) o;

    return true && Objects.equals(content, pageTrack.content) &&
        Objects.equals(first, pageTrack.first) &&
        Objects.equals(last, pageTrack.last) &&
        Objects.equals(number, pageTrack.number) &&
        Objects.equals(numberOfElements, pageTrack.numberOfElements) &&
        Objects.equals(size, pageTrack.size) &&
        Objects.equals(sort, pageTrack.sort) &&
        Objects.equals(totalElements, pageTrack.totalElements) &&
        Objects.equals(totalPages, pageTrack.totalPages)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, first, last, number, numberOfElements, size, sort, totalElements, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageTrack {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

