package com.eigenmusik.client.model;

import java.util.Objects;
import com.eigenmusik.client.model.TrackSource;
import com.eigenmusik.client.model.UserProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-06T18:41:28.441Z")
public class Track   {
  
  private String album = null;
  private String artist = null;
  private UserProfile createdBy = null;
  private Date createdOn = null;
  private Long duration = null;
  private Long id = null;
  private String name = null;
  private TrackSource trackSource = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("album")
  public String getAlbum() {
    return album;
  }
  public void setAlbum(String album) {
    this.album = album;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("artist")
  public String getArtist() {
    return artist;
  }
  public void setArtist(String artist) {
    this.artist = artist;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createdBy")
  public UserProfile getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UserProfile createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createdOn")
  public Date getCreatedOn() {
    return createdOn;
  }
  public void setCreatedOn(Date createdOn) {
    this.createdOn = createdOn;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("duration")
  public Long getDuration() {
    return duration;
  }
  public void setDuration(Long duration) {
    this.duration = duration;
  }

  
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
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trackSource")
  public TrackSource getTrackSource() {
    return trackSource;
  }
  public void setTrackSource(TrackSource trackSource) {
    this.trackSource = trackSource;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Track track = (Track) o;

    return true && Objects.equals(album, track.album) &&
        Objects.equals(artist, track.artist) &&
        Objects.equals(createdBy, track.createdBy) &&
        Objects.equals(createdOn, track.createdOn) &&
        Objects.equals(duration, track.duration) &&
        Objects.equals(id, track.id) &&
        Objects.equals(name, track.name) &&
        Objects.equals(trackSource, track.trackSource)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(album, artist, createdBy, createdOn, duration, id, name, trackSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Track {\n");
    
    sb.append("    album: ").append(toIndentedString(album)).append("\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    trackSource: ").append(toIndentedString(trackSource)).append("\n");
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

