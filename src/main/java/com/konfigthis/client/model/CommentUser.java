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
 * SoundCloud User object
 */
@ApiModel(description = "SoundCloud User object")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CommentUser {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_PERMALINK = "permalink";
  @SerializedName(SERIALIZED_NAME_PERMALINK)
  private String permalink;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "last_modified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private String lastModified;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_PERMALINK_URL = "permalink_url";
  @SerializedName(SERIALIZED_NAME_PERMALINK_URL)
  private String permalinkUrl;

  public static final String SERIALIZED_NAME_AVATAR_URL = "avatar_url";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private String avatarUrl;

  public static final String SERIALIZED_NAME_FOLLOWERS_COUNT = "followers_count";
  @SerializedName(SERIALIZED_NAME_FOLLOWERS_COUNT)
  private Integer followersCount;

  public static final String SERIALIZED_NAME_FOLLOWINGS_COUNT = "followings_count";
  @SerializedName(SERIALIZED_NAME_FOLLOWINGS_COUNT)
  private Integer followingsCount;

  public static final String SERIALIZED_NAME_REPOSTS_COUNT = "reposts_count";
  @SerializedName(SERIALIZED_NAME_REPOSTS_COUNT)
  private Integer repostsCount;

  public CommentUser() {
  }

  public CommentUser id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "unique identifier")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public CommentUser kind(String kind) {
    
    
    
    
    this.kind = kind;
    return this;
  }

   /**
   * kind of resource.
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "kind of resource.")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    
    
    
    this.kind = kind;
  }


  public CommentUser permalink(String permalink) {
    
    
    
    
    this.permalink = permalink;
    return this;
  }

   /**
   * permalink of the resource.
   * @return permalink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "permalink of the resource.")

  public String getPermalink() {
    return permalink;
  }


  public void setPermalink(String permalink) {
    
    
    
    this.permalink = permalink;
  }


  public CommentUser username(String username) {
    
    
    
    
    this.username = username;
    return this;
  }

   /**
   * username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "username")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    
    
    
    this.username = username;
  }


  public CommentUser lastModified(String lastModified) {
    
    
    
    
    this.lastModified = lastModified;
    return this;
  }

   /**
   * last modified timestamp.
   * @return lastModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "last modified timestamp.")

  public String getLastModified() {
    return lastModified;
  }


  public void setLastModified(String lastModified) {
    
    
    
    this.lastModified = lastModified;
  }


  public CommentUser uri(String uri) {
    
    
    
    
    this.uri = uri;
    return this;
  }

   /**
   * API resource URL.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "API resource URL.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    
    
    
    this.uri = uri;
  }


  public CommentUser permalinkUrl(String permalinkUrl) {
    
    
    
    
    this.permalinkUrl = permalinkUrl;
    return this;
  }

   /**
   * URL to the SoundCloud.com page.
   * @return permalinkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to the SoundCloud.com page.")

  public String getPermalinkUrl() {
    return permalinkUrl;
  }


  public void setPermalinkUrl(String permalinkUrl) {
    
    
    
    this.permalinkUrl = permalinkUrl;
  }


  public CommentUser avatarUrl(String avatarUrl) {
    
    
    
    
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * URL to a JPEG image.
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to a JPEG image.")

  public String getAvatarUrl() {
    return avatarUrl;
  }


  public void setAvatarUrl(String avatarUrl) {
    
    
    
    this.avatarUrl = avatarUrl;
  }


  public CommentUser followersCount(Integer followersCount) {
    
    
    
    
    this.followersCount = followersCount;
    return this;
  }

   /**
   * number of followers.
   * @return followersCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "number of followers.")

  public Integer getFollowersCount() {
    return followersCount;
  }


  public void setFollowersCount(Integer followersCount) {
    
    
    
    this.followersCount = followersCount;
  }


  public CommentUser followingsCount(Integer followingsCount) {
    
    
    
    
    this.followingsCount = followingsCount;
    return this;
  }

   /**
   * number of followed users.
   * @return followingsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "number of followed users.")

  public Integer getFollowingsCount() {
    return followingsCount;
  }


  public void setFollowingsCount(Integer followingsCount) {
    
    
    
    this.followingsCount = followingsCount;
  }


  public CommentUser repostsCount(Integer repostsCount) {
    
    
    
    
    this.repostsCount = repostsCount;
    return this;
  }

   /**
   * number of reposts from user
   * @return repostsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "number of reposts from user")

  public Integer getRepostsCount() {
    return repostsCount;
  }


  public void setRepostsCount(Integer repostsCount) {
    
    
    
    this.repostsCount = repostsCount;
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
   * @return the CommentUser instance itself
   */
  public CommentUser putAdditionalProperty(String key, Object value) {
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
    CommentUser commentUser = (CommentUser) o;
    return Objects.equals(this.id, commentUser.id) &&
        Objects.equals(this.kind, commentUser.kind) &&
        Objects.equals(this.permalink, commentUser.permalink) &&
        Objects.equals(this.username, commentUser.username) &&
        Objects.equals(this.lastModified, commentUser.lastModified) &&
        Objects.equals(this.uri, commentUser.uri) &&
        Objects.equals(this.permalinkUrl, commentUser.permalinkUrl) &&
        Objects.equals(this.avatarUrl, commentUser.avatarUrl) &&
        Objects.equals(this.followersCount, commentUser.followersCount) &&
        Objects.equals(this.followingsCount, commentUser.followingsCount) &&
        Objects.equals(this.repostsCount, commentUser.repostsCount)&&
        Objects.equals(this.additionalProperties, commentUser.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, permalink, username, lastModified, uri, permalinkUrl, avatarUrl, followersCount, followingsCount, repostsCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    permalink: ").append(toIndentedString(permalink)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    permalinkUrl: ").append(toIndentedString(permalinkUrl)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
    sb.append("    followingsCount: ").append(toIndentedString(followingsCount)).append("\n");
    sb.append("    repostsCount: ").append(toIndentedString(repostsCount)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("kind");
    openapiFields.add("permalink");
    openapiFields.add("username");
    openapiFields.add("last_modified");
    openapiFields.add("uri");
    openapiFields.add("permalink_url");
    openapiFields.add("avatar_url");
    openapiFields.add("followers_count");
    openapiFields.add("followings_count");
    openapiFields.add("reposts_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommentUser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CommentUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommentUser is not found in the empty JSON string", CommentUser.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      if ((jsonObj.get("permalink") != null && !jsonObj.get("permalink").isJsonNull()) && !jsonObj.get("permalink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permalink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permalink").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("last_modified") != null && !jsonObj.get("last_modified").isJsonNull()) && !jsonObj.get("last_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_modified").toString()));
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("permalink_url") != null && !jsonObj.get("permalink_url").isJsonNull()) && !jsonObj.get("permalink_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permalink_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permalink_url").toString()));
      }
      if ((jsonObj.get("avatar_url") != null && !jsonObj.get("avatar_url").isJsonNull()) && !jsonObj.get("avatar_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommentUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommentUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommentUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommentUser.class));

       return (TypeAdapter<T>) new TypeAdapter<CommentUser>() {
           @Override
           public void write(JsonWriter out, CommentUser value) throws IOException {
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
           public CommentUser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CommentUser instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CommentUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommentUser
  * @throws IOException if the JSON string is invalid with respect to CommentUser
  */
  public static CommentUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommentUser.class);
  }

 /**
  * Convert an instance of CommentUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

