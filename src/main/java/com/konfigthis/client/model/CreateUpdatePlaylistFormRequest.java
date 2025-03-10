/*
 * SoundCloud Public API Specification
 * Discover and play over 320 million music tracks. Join the world’s largest online community of artists, bands, DJs, and audio creators.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * CreateUpdatePlaylistFormRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateUpdatePlaylistFormRequest {
  public static final String SERIALIZED_NAME_PLAYLIST_TITLE = "playlist[title]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_TITLE)
  private String playlistTitle;

  /**
   * Gets or Sets playlistSharing
   */
  @JsonAdapter(PlaylistSharingEnum.Adapter.class)
 public enum PlaylistSharingEnum {
    PUBLIC("public"),
    
    PRIVATE("private");

    private String value;

    PlaylistSharingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlaylistSharingEnum fromValue(String value) {
      for (PlaylistSharingEnum b : PlaylistSharingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PlaylistSharingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlaylistSharingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlaylistSharingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlaylistSharingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PLAYLIST_SHARING = "playlist[sharing]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_SHARING)
  private PlaylistSharingEnum playlistSharing = PlaylistSharingEnum.PUBLIC;

  public static final String SERIALIZED_NAME_PLAYLIST_DESCRIPTION = "playlist[description]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_DESCRIPTION)
  private String playlistDescription;

  public static final String SERIALIZED_NAME_PLAYLIST_TRACKS_ID = "playlist[tracks][][id]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_TRACKS_ID)
  private String playlistTracksId;

  public static final String SERIALIZED_NAME_PLAYLIST_ARTWORK_DATA = "playlist[artwork_data]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_ARTWORK_DATA)
  private File playlistArtworkData;

  public static final String SERIALIZED_NAME_PLAYLIST_EAN = "playlist[ean]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_EAN)
  private String playlistEan;

  public static final String SERIALIZED_NAME_PLAYLIST_GENRE = "playlist[genre]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_GENRE)
  private String playlistGenre;

  public static final String SERIALIZED_NAME_PLAYLIST_LABEL_NAME = "playlist[label_name]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_LABEL_NAME)
  private String playlistLabelName;

  public static final String SERIALIZED_NAME_PLAYLIST_LICENSE = "playlist[license]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_LICENSE)
  private String playlistLicense;

  public static final String SERIALIZED_NAME_PLAYLIST_PERMALINK = "playlist[permalink]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_PERMALINK)
  private String playlistPermalink;

  public static final String SERIALIZED_NAME_PLAYLIST_PERMALINK_URL = "playlist[permalink_url]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_PERMALINK_URL)
  private String playlistPermalinkUrl;

  public static final String SERIALIZED_NAME_PLAYLIST_PURCHASE_TITLE = "playlist[purchase_title]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_PURCHASE_TITLE)
  private String playlistPurchaseTitle;

  public static final String SERIALIZED_NAME_PLAYLIST_PURCHASE_URL = "playlist[purchase_url]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_PURCHASE_URL)
  private String playlistPurchaseUrl;

  public static final String SERIALIZED_NAME_PLAYLIST_RELEASE = "playlist[release]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_RELEASE)
  private String playlistRelease;

  public static final String SERIALIZED_NAME_PLAYLIST_RELEASE_DATE = "playlist[release_date]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_RELEASE_DATE)
  private String playlistReleaseDate;

  /**
   * Gets or Sets playlistSetType
   */
  @JsonAdapter(PlaylistSetTypeEnum.Adapter.class)
 public enum PlaylistSetTypeEnum {
    ALBUM("album"),
    
    PLAYLIST("playlist");

    private String value;

    PlaylistSetTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlaylistSetTypeEnum fromValue(String value) {
      for (PlaylistSetTypeEnum b : PlaylistSetTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PlaylistSetTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlaylistSetTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlaylistSetTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlaylistSetTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PLAYLIST_SET_TYPE = "playlist[set_type]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_SET_TYPE)
  private PlaylistSetTypeEnum playlistSetType;

  public static final String SERIALIZED_NAME_PLAYLIST_TAG_LIST = "playlist[tag_list]";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_TAG_LIST)
  private String playlistTagList;

  public CreateUpdatePlaylistFormRequest() {
  }

  public CreateUpdatePlaylistFormRequest playlistTitle(String playlistTitle) {
    
    
    
    
    this.playlistTitle = playlistTitle;
    return this;
  }

   /**
   * Get playlistTitle
   * @return playlistTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaylistTitle() {
    return playlistTitle;
  }


  public void setPlaylistTitle(String playlistTitle) {
    
    
    
    this.playlistTitle = playlistTitle;
  }


  public CreateUpdatePlaylistFormRequest playlistSharing(PlaylistSharingEnum playlistSharing) {
    
    
    
    
    this.playlistSharing = playlistSharing;
    return this;
  }

   /**
   * Get playlistSharing
   * @return playlistSharing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PUBLIC", value = "")

  public PlaylistSharingEnum getPlaylistSharing() {
    return playlistSharing;
  }


  public void setPlaylistSharing(PlaylistSharingEnum playlistSharing) {
    
    
    
    this.playlistSharing = playlistSharing;
  }


  public CreateUpdatePlaylistFormRequest playlistDescription(String playlistDescription) {
    
    
    
    
    this.playlistDescription = playlistDescription;
    return this;
  }

   /**
   * Get playlistDescription
   * @return playlistDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaylistDescription() {
    return playlistDescription;
  }


  public void setPlaylistDescription(String playlistDescription) {
    
    
    
    this.playlistDescription = playlistDescription;
  }


  public CreateUpdatePlaylistFormRequest playlistTracksId(String playlistTracksId) {
    
    
    
    
    this.playlistTracksId = playlistTracksId;
    return this;
  }

   /**
   * To pass multiple tracks, pass multiple comma-separated values, e.g. -F \&quot;playlist[tracks][][id]&#x3D;111,222\&quot;
   * @return playlistTracksId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To pass multiple tracks, pass multiple comma-separated values, e.g. -F \"playlist[tracks][][id]=111,222\"")

  public String getPlaylistTracksId() {
    return playlistTracksId;
  }


  public void setPlaylistTracksId(String playlistTracksId) {
    
    
    
    this.playlistTracksId = playlistTracksId;
  }


  public CreateUpdatePlaylistFormRequest playlistArtworkData(File playlistArtworkData) {
    
    
    
    
    this.playlistArtworkData = playlistArtworkData;
    return this;
  }

   /**
   * Get playlistArtworkData
   * @return playlistArtworkData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getPlaylistArtworkData() {
    return playlistArtworkData;
  }


  public void setPlaylistArtworkData(File playlistArtworkData) {
    
    
    
    this.playlistArtworkData = playlistArtworkData;
  }


  public CreateUpdatePlaylistFormRequest playlistEan(String playlistEan) {
    
    
    
    
    this.playlistEan = playlistEan;
    return this;
  }

   /**
   * Get playlistEan
   * @return playlistEan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaylistEan() {
    return playlistEan;
  }


  public void setPlaylistEan(String playlistEan) {
    
    
    
    this.playlistEan = playlistEan;
  }


  public CreateUpdatePlaylistFormRequest playlistGenre(String playlistGenre) {
    
    
    
    
    this.playlistGenre = playlistGenre;
    return this;
  }

   /**
   * Get playlistGenre
   * @return playlistGenre
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaylistGenre() {
    return playlistGenre;
  }


  public void setPlaylistGenre(String playlistGenre) {
    
    
    
    this.playlistGenre = playlistGenre;
  }


  public CreateUpdatePlaylistFormRequest playlistLabelName(String playlistLabelName) {
    
    
    
    
    this.playlistLabelName = playlistLabelName;
    return this;
  }

   /**
   * Get playlistLabelName
   * @return playlistLabelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaylistLabelName() {
    return playlistLabelName;
  }


  public void setPlaylistLabelName(String playlistLabelName) {
    
    
    
    this.playlistLabelName = playlistLabelName;
  }


  public CreateUpdatePlaylistFormRequest playlistLicense(String playlistLicense) {
    
    
    
    
    this.playlistLicense = playlistLicense;
    return this;
  }

   /**
   * Get playlistLicense
   * @return playlistLicense
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaylistLicense() {
    return playlistLicense;
  }


  public void setPlaylistLicense(String playlistLicense) {
    
    
    
    this.playlistLicense = playlistLicense;
  }


  public CreateUpdatePlaylistFormRequest playlistPermalink(String playlistPermalink) {
    
    
    
    
    this.playlistPermalink = playlistPermalink;
    return this;
  }

   /**
   * Get playlistPermalink
   * @return playlistPermalink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaylistPermalink() {
    return playlistPermalink;
  }


  public void setPlaylistPermalink(String playlistPermalink) {
    
    
    
    this.playlistPermalink = playlistPermalink;
  }


  public CreateUpdatePlaylistFormRequest playlistPermalinkUrl(String playlistPermalinkUrl) {
    
    
    
    
    this.playlistPermalinkUrl = playlistPermalinkUrl;
    return this;
  }

   /**
   * Get playlistPermalinkUrl
   * @return playlistPermalinkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaylistPermalinkUrl() {
    return playlistPermalinkUrl;
  }


  public void setPlaylistPermalinkUrl(String playlistPermalinkUrl) {
    
    
    
    this.playlistPermalinkUrl = playlistPermalinkUrl;
  }


  public CreateUpdatePlaylistFormRequest playlistPurchaseTitle(String playlistPurchaseTitle) {
    
    
    
    
    this.playlistPurchaseTitle = playlistPurchaseTitle;
    return this;
  }

   /**
   * Get playlistPurchaseTitle
   * @return playlistPurchaseTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaylistPurchaseTitle() {
    return playlistPurchaseTitle;
  }


  public void setPlaylistPurchaseTitle(String playlistPurchaseTitle) {
    
    
    
    this.playlistPurchaseTitle = playlistPurchaseTitle;
  }


  public CreateUpdatePlaylistFormRequest playlistPurchaseUrl(String playlistPurchaseUrl) {
    
    
    
    
    this.playlistPurchaseUrl = playlistPurchaseUrl;
    return this;
  }

   /**
   * Get playlistPurchaseUrl
   * @return playlistPurchaseUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaylistPurchaseUrl() {
    return playlistPurchaseUrl;
  }


  public void setPlaylistPurchaseUrl(String playlistPurchaseUrl) {
    
    
    
    this.playlistPurchaseUrl = playlistPurchaseUrl;
  }


  public CreateUpdatePlaylistFormRequest playlistRelease(String playlistRelease) {
    
    
    
    
    this.playlistRelease = playlistRelease;
    return this;
  }

   /**
   * Get playlistRelease
   * @return playlistRelease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaylistRelease() {
    return playlistRelease;
  }


  public void setPlaylistRelease(String playlistRelease) {
    
    
    
    this.playlistRelease = playlistRelease;
  }


  public CreateUpdatePlaylistFormRequest playlistReleaseDate(String playlistReleaseDate) {
    
    
    
    
    this.playlistReleaseDate = playlistReleaseDate;
    return this;
  }

   /**
   * Get playlistReleaseDate
   * @return playlistReleaseDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaylistReleaseDate() {
    return playlistReleaseDate;
  }


  public void setPlaylistReleaseDate(String playlistReleaseDate) {
    
    
    
    this.playlistReleaseDate = playlistReleaseDate;
  }


  public CreateUpdatePlaylistFormRequest playlistSetType(PlaylistSetTypeEnum playlistSetType) {
    
    
    
    
    this.playlistSetType = playlistSetType;
    return this;
  }

   /**
   * Get playlistSetType
   * @return playlistSetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlaylistSetTypeEnum getPlaylistSetType() {
    return playlistSetType;
  }


  public void setPlaylistSetType(PlaylistSetTypeEnum playlistSetType) {
    
    
    
    this.playlistSetType = playlistSetType;
  }


  public CreateUpdatePlaylistFormRequest playlistTagList(String playlistTagList) {
    
    
    
    
    this.playlistTagList = playlistTagList;
    return this;
  }

   /**
   * Get playlistTagList
   * @return playlistTagList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaylistTagList() {
    return playlistTagList;
  }


  public void setPlaylistTagList(String playlistTagList) {
    
    
    
    this.playlistTagList = playlistTagList;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CreateUpdatePlaylistFormRequest instance itself
   */
  public CreateUpdatePlaylistFormRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUpdatePlaylistFormRequest createUpdatePlaylistFormRequest = (CreateUpdatePlaylistFormRequest) o;
    return Objects.equals(this.playlistTitle, createUpdatePlaylistFormRequest.playlistTitle) &&
        Objects.equals(this.playlistSharing, createUpdatePlaylistFormRequest.playlistSharing) &&
        Objects.equals(this.playlistDescription, createUpdatePlaylistFormRequest.playlistDescription) &&
        Objects.equals(this.playlistTracksId, createUpdatePlaylistFormRequest.playlistTracksId) &&
        Objects.equals(this.playlistArtworkData, createUpdatePlaylistFormRequest.playlistArtworkData) &&
        Objects.equals(this.playlistEan, createUpdatePlaylistFormRequest.playlistEan) &&
        Objects.equals(this.playlistGenre, createUpdatePlaylistFormRequest.playlistGenre) &&
        Objects.equals(this.playlistLabelName, createUpdatePlaylistFormRequest.playlistLabelName) &&
        Objects.equals(this.playlistLicense, createUpdatePlaylistFormRequest.playlistLicense) &&
        Objects.equals(this.playlistPermalink, createUpdatePlaylistFormRequest.playlistPermalink) &&
        Objects.equals(this.playlistPermalinkUrl, createUpdatePlaylistFormRequest.playlistPermalinkUrl) &&
        Objects.equals(this.playlistPurchaseTitle, createUpdatePlaylistFormRequest.playlistPurchaseTitle) &&
        Objects.equals(this.playlistPurchaseUrl, createUpdatePlaylistFormRequest.playlistPurchaseUrl) &&
        Objects.equals(this.playlistRelease, createUpdatePlaylistFormRequest.playlistRelease) &&
        Objects.equals(this.playlistReleaseDate, createUpdatePlaylistFormRequest.playlistReleaseDate) &&
        Objects.equals(this.playlistSetType, createUpdatePlaylistFormRequest.playlistSetType) &&
        Objects.equals(this.playlistTagList, createUpdatePlaylistFormRequest.playlistTagList)&&
        Objects.equals(this.additionalProperties, createUpdatePlaylistFormRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playlistTitle, playlistSharing, playlistDescription, playlistTracksId, playlistArtworkData, playlistEan, playlistGenre, playlistLabelName, playlistLicense, playlistPermalink, playlistPermalinkUrl, playlistPurchaseTitle, playlistPurchaseUrl, playlistRelease, playlistReleaseDate, playlistSetType, playlistTagList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUpdatePlaylistFormRequest {\n");
    sb.append("    playlistTitle: ").append(toIndentedString(playlistTitle)).append("\n");
    sb.append("    playlistSharing: ").append(toIndentedString(playlistSharing)).append("\n");
    sb.append("    playlistDescription: ").append(toIndentedString(playlistDescription)).append("\n");
    sb.append("    playlistTracksId: ").append(toIndentedString(playlistTracksId)).append("\n");
    sb.append("    playlistArtworkData: ").append(toIndentedString(playlistArtworkData)).append("\n");
    sb.append("    playlistEan: ").append(toIndentedString(playlistEan)).append("\n");
    sb.append("    playlistGenre: ").append(toIndentedString(playlistGenre)).append("\n");
    sb.append("    playlistLabelName: ").append(toIndentedString(playlistLabelName)).append("\n");
    sb.append("    playlistLicense: ").append(toIndentedString(playlistLicense)).append("\n");
    sb.append("    playlistPermalink: ").append(toIndentedString(playlistPermalink)).append("\n");
    sb.append("    playlistPermalinkUrl: ").append(toIndentedString(playlistPermalinkUrl)).append("\n");
    sb.append("    playlistPurchaseTitle: ").append(toIndentedString(playlistPurchaseTitle)).append("\n");
    sb.append("    playlistPurchaseUrl: ").append(toIndentedString(playlistPurchaseUrl)).append("\n");
    sb.append("    playlistRelease: ").append(toIndentedString(playlistRelease)).append("\n");
    sb.append("    playlistReleaseDate: ").append(toIndentedString(playlistReleaseDate)).append("\n");
    sb.append("    playlistSetType: ").append(toIndentedString(playlistSetType)).append("\n");
    sb.append("    playlistTagList: ").append(toIndentedString(playlistTagList)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("playlist[title]");
    openapiFields.add("playlist[sharing]");
    openapiFields.add("playlist[description]");
    openapiFields.add("playlist[tracks][][id]");
    openapiFields.add("playlist[artwork_data]");
    openapiFields.add("playlist[ean]");
    openapiFields.add("playlist[genre]");
    openapiFields.add("playlist[label_name]");
    openapiFields.add("playlist[license]");
    openapiFields.add("playlist[permalink]");
    openapiFields.add("playlist[permalink_url]");
    openapiFields.add("playlist[purchase_title]");
    openapiFields.add("playlist[purchase_url]");
    openapiFields.add("playlist[release]");
    openapiFields.add("playlist[release_date]");
    openapiFields.add("playlist[set_type]");
    openapiFields.add("playlist[tag_list]");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateUpdatePlaylistFormRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateUpdatePlaylistFormRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateUpdatePlaylistFormRequest is not found in the empty JSON string", CreateUpdatePlaylistFormRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("playlist[title]") != null && !jsonObj.get("playlist[title]").isJsonNull()) && !jsonObj.get("playlist[title]").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist[title]` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist[title]").toString()));
      }
      if ((jsonObj.get("playlist[sharing]") != null && !jsonObj.get("playlist[sharing]").isJsonNull()) && !jsonObj.get("playlist[sharing]").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist[sharing]` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist[sharing]").toString()));
      }
      if ((jsonObj.get("playlist[description]") != null && !jsonObj.get("playlist[description]").isJsonNull()) && !jsonObj.get("playlist[description]").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist[description]` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist[description]").toString()));
      }
      if ((jsonObj.get("playlist[tracks][][id]") != null && !jsonObj.get("playlist[tracks][][id]").isJsonNull()) && !jsonObj.get("playlist[tracks][][id]").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist[tracks][][id]` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist[tracks][][id]").toString()));
      }
      if ((jsonObj.get("playlist[ean]") != null && !jsonObj.get("playlist[ean]").isJsonNull()) && !jsonObj.get("playlist[ean]").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist[ean]` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist[ean]").toString()));
      }
      if ((jsonObj.get("playlist[genre]") != null && !jsonObj.get("playlist[genre]").isJsonNull()) && !jsonObj.get("playlist[genre]").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist[genre]` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist[genre]").toString()));
      }
      if ((jsonObj.get("playlist[label_name]") != null && !jsonObj.get("playlist[label_name]").isJsonNull()) && !jsonObj.get("playlist[label_name]").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist[label_name]` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist[label_name]").toString()));
      }
      if ((jsonObj.get("playlist[license]") != null && !jsonObj.get("playlist[license]").isJsonNull()) && !jsonObj.get("playlist[license]").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist[license]` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist[license]").toString()));
      }
      if ((jsonObj.get("playlist[permalink]") != null && !jsonObj.get("playlist[permalink]").isJsonNull()) && !jsonObj.get("playlist[permalink]").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist[permalink]` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist[permalink]").toString()));
      }
      if ((jsonObj.get("playlist[permalink_url]") != null && !jsonObj.get("playlist[permalink_url]").isJsonNull()) && !jsonObj.get("playlist[permalink_url]").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist[permalink_url]` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist[permalink_url]").toString()));
      }
      if ((jsonObj.get("playlist[purchase_title]") != null && !jsonObj.get("playlist[purchase_title]").isJsonNull()) && !jsonObj.get("playlist[purchase_title]").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist[purchase_title]` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist[purchase_title]").toString()));
      }
      if ((jsonObj.get("playlist[purchase_url]") != null && !jsonObj.get("playlist[purchase_url]").isJsonNull()) && !jsonObj.get("playlist[purchase_url]").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist[purchase_url]` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist[purchase_url]").toString()));
      }
      if ((jsonObj.get("playlist[release]") != null && !jsonObj.get("playlist[release]").isJsonNull()) && !jsonObj.get("playlist[release]").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist[release]` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist[release]").toString()));
      }
      if ((jsonObj.get("playlist[release_date]") != null && !jsonObj.get("playlist[release_date]").isJsonNull()) && !jsonObj.get("playlist[release_date]").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist[release_date]` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist[release_date]").toString()));
      }
      if ((jsonObj.get("playlist[set_type]") != null && !jsonObj.get("playlist[set_type]").isJsonNull()) && !jsonObj.get("playlist[set_type]").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist[set_type]` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist[set_type]").toString()));
      }
      if ((jsonObj.get("playlist[tag_list]") != null && !jsonObj.get("playlist[tag_list]").isJsonNull()) && !jsonObj.get("playlist[tag_list]").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist[tag_list]` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist[tag_list]").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateUpdatePlaylistFormRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateUpdatePlaylistFormRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateUpdatePlaylistFormRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateUpdatePlaylistFormRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateUpdatePlaylistFormRequest>() {
           @Override
           public void write(JsonWriter out, CreateUpdatePlaylistFormRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateUpdatePlaylistFormRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateUpdatePlaylistFormRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateUpdatePlaylistFormRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateUpdatePlaylistFormRequest
  * @throws IOException if the JSON string is invalid with respect to CreateUpdatePlaylistFormRequest
  */
  public static CreateUpdatePlaylistFormRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateUpdatePlaylistFormRequest.class);
  }

 /**
  * Convert an instance of CreateUpdatePlaylistFormRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

