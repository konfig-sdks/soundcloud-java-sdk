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
import com.konfigthis.client.model.UserSubscriptionsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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
 * TrackLabel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TrackLabel {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AVATAR_URL = "avatar_url";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private String avatarUrl;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_DISCOGS_NAME = "discogs_name";
  @SerializedName(SERIALIZED_NAME_DISCOGS_NAME)
  private String discogsName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_FOLLOWERS_COUNT = "followers_count";
  @SerializedName(SERIALIZED_NAME_FOLLOWERS_COUNT)
  private Integer followersCount;

  public static final String SERIALIZED_NAME_FOLLOWINGS_COUNT = "followings_count";
  @SerializedName(SERIALIZED_NAME_FOLLOWINGS_COUNT)
  private Integer followingsCount;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "last_modified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private OffsetDateTime lastModified;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MYSPACE_NAME = "myspace_name";
  @SerializedName(SERIALIZED_NAME_MYSPACE_NAME)
  private String myspaceName;

  public static final String SERIALIZED_NAME_PERMALINK = "permalink";
  @SerializedName(SERIALIZED_NAME_PERMALINK)
  private String permalink;

  public static final String SERIALIZED_NAME_PERMALINK_URL = "permalink_url";
  @SerializedName(SERIALIZED_NAME_PERMALINK_URL)
  private String permalinkUrl;

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  private String plan;

  public static final String SERIALIZED_NAME_PLAYLIST_COUNT = "playlist_count";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_COUNT)
  private Integer playlistCount;

  public static final String SERIALIZED_NAME_PUBLIC_FAVORITES_COUNT = "public_favorites_count";
  @SerializedName(SERIALIZED_NAME_PUBLIC_FAVORITES_COUNT)
  private Integer publicFavoritesCount;

  public static final String SERIALIZED_NAME_REPOSTS_COUNT = "reposts_count";
  @SerializedName(SERIALIZED_NAME_REPOSTS_COUNT)
  private Integer repostsCount;

  public static final String SERIALIZED_NAME_TRACK_COUNT = "track_count";
  @SerializedName(SERIALIZED_NAME_TRACK_COUNT)
  private Integer trackCount;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_WEBSITE_TITLE = "website_title";
  @SerializedName(SERIALIZED_NAME_WEBSITE_TITLE)
  private String websiteTitle;

  public static final String SERIALIZED_NAME_SUBSCRIPTIONS = "subscriptions";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONS)
  private List<UserSubscriptionsInner> subscriptions = null;

  public TrackLabel() {
  }

  public TrackLabel description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public TrackLabel avatarUrl(String avatarUrl) {
    
    
    
    
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * URL to a JPEG image
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to a JPEG image")

  public String getAvatarUrl() {
    return avatarUrl;
  }


  public void setAvatarUrl(String avatarUrl) {
    
    
    
    this.avatarUrl = avatarUrl;
  }


  public TrackLabel city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "city")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public TrackLabel country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "country")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public TrackLabel discogsName(String discogsName) {
    
    
    
    
    this.discogsName = discogsName;
    return this;
  }

   /**
   * discogs name
   * @return discogsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "discogs name")

  public String getDiscogsName() {
    return discogsName;
  }


  public void setDiscogsName(String discogsName) {
    
    
    
    this.discogsName = discogsName;
  }


  public TrackLabel firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * first name
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "first name")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public TrackLabel followersCount(Integer followersCount) {
    
    
    
    
    this.followersCount = followersCount;
    return this;
  }

   /**
   * number of followers
   * @return followersCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "number of followers")

  public Integer getFollowersCount() {
    return followersCount;
  }


  public void setFollowersCount(Integer followersCount) {
    
    
    
    this.followersCount = followersCount;
  }


  public TrackLabel followingsCount(Integer followingsCount) {
    
    
    
    
    this.followingsCount = followingsCount;
    return this;
  }

   /**
   * number of followed users
   * @return followingsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "number of followed users")

  public Integer getFollowingsCount() {
    return followingsCount;
  }


  public void setFollowingsCount(Integer followingsCount) {
    
    
    
    this.followingsCount = followingsCount;
  }


  public TrackLabel fullName(String fullName) {
    
    
    
    
    this.fullName = fullName;
    return this;
  }

   /**
   * first and last name
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "first and last name")

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    
    
    
    this.fullName = fullName;
  }


  public TrackLabel id(Integer id) {
    
    
    
    
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


  public TrackLabel kind(String kind) {
    
    
    
    
    this.kind = kind;
    return this;
  }

   /**
   * kind of resource
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "kind of resource")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    
    
    
    this.kind = kind;
  }


  public TrackLabel createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * profile creation datetime
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "profile creation datetime")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public TrackLabel lastModified(OffsetDateTime lastModified) {
    
    
    
    
    this.lastModified = lastModified;
    return this;
  }

   /**
   * last modified datetime
   * @return lastModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "last modified datetime")

  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  public void setLastModified(OffsetDateTime lastModified) {
    
    
    
    this.lastModified = lastModified;
  }


  public TrackLabel lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * last name
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "last name")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public TrackLabel myspaceName(String myspaceName) {
    
    
    
    
    this.myspaceName = myspaceName;
    return this;
  }

   /**
   * myspace name
   * @return myspaceName
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "myspace name")

  public String getMyspaceName() {
    return myspaceName;
  }


  public void setMyspaceName(String myspaceName) {
    
    
    
    this.myspaceName = myspaceName;
  }


  public TrackLabel permalink(String permalink) {
    
    
    
    
    this.permalink = permalink;
    return this;
  }

   /**
   * permalink of the resource
   * @return permalink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "permalink of the resource")

  public String getPermalink() {
    return permalink;
  }


  public void setPermalink(String permalink) {
    
    
    
    this.permalink = permalink;
  }


  public TrackLabel permalinkUrl(String permalinkUrl) {
    
    
    
    
    this.permalinkUrl = permalinkUrl;
    return this;
  }

   /**
   * URL to the SoundCloud.com page
   * @return permalinkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to the SoundCloud.com page")

  public String getPermalinkUrl() {
    return permalinkUrl;
  }


  public void setPermalinkUrl(String permalinkUrl) {
    
    
    
    this.permalinkUrl = permalinkUrl;
  }


  public TrackLabel plan(String plan) {
    
    
    
    
    this.plan = plan;
    return this;
  }

   /**
   * subscription plan of the user
   * @return plan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "subscription plan of the user")

  public String getPlan() {
    return plan;
  }


  public void setPlan(String plan) {
    
    
    
    this.plan = plan;
  }


  public TrackLabel playlistCount(Integer playlistCount) {
    
    
    
    
    this.playlistCount = playlistCount;
    return this;
  }

   /**
   * number of public playlists
   * @return playlistCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "number of public playlists")

  public Integer getPlaylistCount() {
    return playlistCount;
  }


  public void setPlaylistCount(Integer playlistCount) {
    
    
    
    this.playlistCount = playlistCount;
  }


  public TrackLabel publicFavoritesCount(Integer publicFavoritesCount) {
    
    
    
    
    this.publicFavoritesCount = publicFavoritesCount;
    return this;
  }

   /**
   * number of favorited public tracks
   * @return publicFavoritesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "number of favorited public tracks")

  public Integer getPublicFavoritesCount() {
    return publicFavoritesCount;
  }


  public void setPublicFavoritesCount(Integer publicFavoritesCount) {
    
    
    
    this.publicFavoritesCount = publicFavoritesCount;
  }


  public TrackLabel repostsCount(Integer repostsCount) {
    
    
    
    
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


  public TrackLabel trackCount(Integer trackCount) {
    
    
    
    
    this.trackCount = trackCount;
    return this;
  }

   /**
   * number of public tracks
   * @return trackCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "number of public tracks")

  public Integer getTrackCount() {
    return trackCount;
  }


  public void setTrackCount(Integer trackCount) {
    
    
    
    this.trackCount = trackCount;
  }


  public TrackLabel uri(String uri) {
    
    
    
    
    this.uri = uri;
    return this;
  }

   /**
   * API resource URL
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "API resource URL")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    
    
    
    this.uri = uri;
  }


  public TrackLabel username(String username) {
    
    
    
    
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


  public TrackLabel website(String website) {
    
    
    
    
    this.website = website;
    return this;
  }

   /**
   * a URL to the website
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a URL to the website")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    
    
    
    this.website = website;
  }


  public TrackLabel websiteTitle(String websiteTitle) {
    
    
    
    
    this.websiteTitle = websiteTitle;
    return this;
  }

   /**
   * a custom title for the website
   * @return websiteTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a custom title for the website")

  public String getWebsiteTitle() {
    return websiteTitle;
  }


  public void setWebsiteTitle(String websiteTitle) {
    
    
    
    this.websiteTitle = websiteTitle;
  }


  public TrackLabel subscriptions(List<UserSubscriptionsInner> subscriptions) {
    
    
    
    
    this.subscriptions = subscriptions;
    return this;
  }

  public TrackLabel addSubscriptionsItem(UserSubscriptionsInner subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

   /**
   * a list subscriptions associated with the user
   * @return subscriptions
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a list subscriptions associated with the user")

  public List<UserSubscriptionsInner> getSubscriptions() {
    return subscriptions;
  }


  public void setSubscriptions(List<UserSubscriptionsInner> subscriptions) {
    
    
    
    this.subscriptions = subscriptions;
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
   * @return the TrackLabel instance itself
   */
  public TrackLabel putAdditionalProperty(String key, Object value) {
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
    TrackLabel trackLabel = (TrackLabel) o;
    return Objects.equals(this.description, trackLabel.description) &&
        Objects.equals(this.avatarUrl, trackLabel.avatarUrl) &&
        Objects.equals(this.city, trackLabel.city) &&
        Objects.equals(this.country, trackLabel.country) &&
        Objects.equals(this.discogsName, trackLabel.discogsName) &&
        Objects.equals(this.firstName, trackLabel.firstName) &&
        Objects.equals(this.followersCount, trackLabel.followersCount) &&
        Objects.equals(this.followingsCount, trackLabel.followingsCount) &&
        Objects.equals(this.fullName, trackLabel.fullName) &&
        Objects.equals(this.id, trackLabel.id) &&
        Objects.equals(this.kind, trackLabel.kind) &&
        Objects.equals(this.createdAt, trackLabel.createdAt) &&
        Objects.equals(this.lastModified, trackLabel.lastModified) &&
        Objects.equals(this.lastName, trackLabel.lastName) &&
        Objects.equals(this.myspaceName, trackLabel.myspaceName) &&
        Objects.equals(this.permalink, trackLabel.permalink) &&
        Objects.equals(this.permalinkUrl, trackLabel.permalinkUrl) &&
        Objects.equals(this.plan, trackLabel.plan) &&
        Objects.equals(this.playlistCount, trackLabel.playlistCount) &&
        Objects.equals(this.publicFavoritesCount, trackLabel.publicFavoritesCount) &&
        Objects.equals(this.repostsCount, trackLabel.repostsCount) &&
        Objects.equals(this.trackCount, trackLabel.trackCount) &&
        Objects.equals(this.uri, trackLabel.uri) &&
        Objects.equals(this.username, trackLabel.username) &&
        Objects.equals(this.website, trackLabel.website) &&
        Objects.equals(this.websiteTitle, trackLabel.websiteTitle) &&
        Objects.equals(this.subscriptions, trackLabel.subscriptions)&&
        Objects.equals(this.additionalProperties, trackLabel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, avatarUrl, city, country, discogsName, firstName, followersCount, followingsCount, fullName, id, kind, createdAt, lastModified, lastName, myspaceName, permalink, permalinkUrl, plan, playlistCount, publicFavoritesCount, repostsCount, trackCount, uri, username, website, websiteTitle, subscriptions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackLabel {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    discogsName: ").append(toIndentedString(discogsName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
    sb.append("    followingsCount: ").append(toIndentedString(followingsCount)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    myspaceName: ").append(toIndentedString(myspaceName)).append("\n");
    sb.append("    permalink: ").append(toIndentedString(permalink)).append("\n");
    sb.append("    permalinkUrl: ").append(toIndentedString(permalinkUrl)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    playlistCount: ").append(toIndentedString(playlistCount)).append("\n");
    sb.append("    publicFavoritesCount: ").append(toIndentedString(publicFavoritesCount)).append("\n");
    sb.append("    repostsCount: ").append(toIndentedString(repostsCount)).append("\n");
    sb.append("    trackCount: ").append(toIndentedString(trackCount)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    websiteTitle: ").append(toIndentedString(websiteTitle)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("avatar_url");
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("discogs_name");
    openapiFields.add("first_name");
    openapiFields.add("followers_count");
    openapiFields.add("followings_count");
    openapiFields.add("full_name");
    openapiFields.add("id");
    openapiFields.add("kind");
    openapiFields.add("created_at");
    openapiFields.add("last_modified");
    openapiFields.add("last_name");
    openapiFields.add("myspace_name");
    openapiFields.add("permalink");
    openapiFields.add("permalink_url");
    openapiFields.add("plan");
    openapiFields.add("playlist_count");
    openapiFields.add("public_favorites_count");
    openapiFields.add("reposts_count");
    openapiFields.add("track_count");
    openapiFields.add("uri");
    openapiFields.add("username");
    openapiFields.add("website");
    openapiFields.add("website_title");
    openapiFields.add("subscriptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrackLabel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TrackLabel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrackLabel is not found in the empty JSON string", TrackLabel.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("avatar_url") != null && !jsonObj.get("avatar_url").isJsonNull()) && !jsonObj.get("avatar_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar_url").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("discogs_name") != null && !jsonObj.get("discogs_name").isJsonNull()) && !jsonObj.get("discogs_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discogs_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discogs_name").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("full_name") != null && !jsonObj.get("full_name").isJsonNull()) && !jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("myspace_name") != null && !jsonObj.get("myspace_name").isJsonNull()) && !jsonObj.get("myspace_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `myspace_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("myspace_name").toString()));
      }
      if ((jsonObj.get("permalink") != null && !jsonObj.get("permalink").isJsonNull()) && !jsonObj.get("permalink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permalink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permalink").toString()));
      }
      if ((jsonObj.get("permalink_url") != null && !jsonObj.get("permalink_url").isJsonNull()) && !jsonObj.get("permalink_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permalink_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permalink_url").toString()));
      }
      if ((jsonObj.get("plan") != null && !jsonObj.get("plan").isJsonNull()) && !jsonObj.get("plan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan").toString()));
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("website") != null && !jsonObj.get("website").isJsonNull()) && !jsonObj.get("website").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website").toString()));
      }
      if ((jsonObj.get("website_title") != null && !jsonObj.get("website_title").isJsonNull()) && !jsonObj.get("website_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website_title").toString()));
      }
      if (jsonObj.get("subscriptions") != null && !jsonObj.get("subscriptions").isJsonNull()) {
        JsonArray jsonArraysubscriptions = jsonObj.getAsJsonArray("subscriptions");
        if (jsonArraysubscriptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subscriptions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subscriptions` to be an array in the JSON string but got `%s`", jsonObj.get("subscriptions").toString()));
          }

          // validate the optional field `subscriptions` (array)
          for (int i = 0; i < jsonArraysubscriptions.size(); i++) {
            UserSubscriptionsInner.validateJsonObject(jsonArraysubscriptions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrackLabel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrackLabel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrackLabel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrackLabel.class));

       return (TypeAdapter<T>) new TypeAdapter<TrackLabel>() {
           @Override
           public void write(JsonWriter out, TrackLabel value) throws IOException {
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
           public TrackLabel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TrackLabel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TrackLabel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrackLabel
  * @throws IOException if the JSON string is invalid with respect to TrackLabel
  */
  public static TrackLabel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrackLabel.class);
  }

 /**
  * Convert an instance of TrackLabel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

