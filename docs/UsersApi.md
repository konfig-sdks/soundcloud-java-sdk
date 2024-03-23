# UsersApi

All URIs are relative to *https://api.soundcloud.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFollowers**](UsersApi.md#getFollowers) | **GET** /users/{user_id}/followers | Returns a list of user’s followers. |
| [**getFollowingById**](UsersApi.md#getFollowingById) | **GET** /users/{user_id}/followings/{following_id} | Returns a user&#39;s following. (use /users/{user_id} instead, to fetch the user details) |
| [**getUser**](UsersApi.md#getUser) | **GET** /users/{user_id} | Returns a user. |
| [**getUserFollowings**](UsersApi.md#getUserFollowings) | **GET** /users/{user_id}/followings | Returns a list of user’s followings. |
| [**getUserPlaylists**](UsersApi.md#getUserPlaylists) | **GET** /users/{user_id}/playlists | Returns a list of user&#39;s playlists. |
| [**getUserTracks**](UsersApi.md#getUserTracks) | **GET** /users/{user_id}/tracks | Returns a list of user&#39;s tracks. |
| [**getUserWebProfiles**](UsersApi.md#getUserWebProfiles) | **GET** /users/{user_id}/web-profiles | Returns list of user&#39;s links added to their profile (website, facebook, instagram). |
| [**listFavorites**](UsersApi.md#listFavorites) | **GET** /users/{user_id}/favorites | Returns a list of user&#39;s favorited or liked tracks. (use /users/:userId/likes/tracks instead, to fetch a user&#39;s likes) |
| [**listLikedPlaylists**](UsersApi.md#listLikedPlaylists) | **GET** /users/{user_id}/likes/playlists | Returns a list of user&#39;s liked playlists. |
| [**listLikedTracks**](UsersApi.md#listLikedTracks) | **GET** /users/{user_id}/likes/tracks | Returns a list of user&#39;s liked tracks. |


<a name="getFollowers"></a>
# **getFollowers**
> Users getFollowers(userId).limit(limit).execute();

Returns a list of user’s followers.

Returns a list of users that follows (user_id).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer userId = 948745750; // SoundCloud User id
    Integer limit = 50; // Number of results to return in the collection.
    try {
      Users result = client
              .users
              .getFollowers(userId)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getCollection());
      System.out.println(result.getNextHref());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getFollowers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Users> response = client
              .users
              .getFollowers(userId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getFollowers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Integer**| SoundCloud User id | |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |

### Return type

[**Users**](Users.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getFollowingById"></a>
# **getFollowingById**
> User getFollowingById(userId, followingId).execute();

Returns a user&#39;s following. (use /users/{user_id} instead, to fetch the user details)

Returns (following_id) that is followed by (user_id).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer userId = 948745750; // SoundCloud User id
    Integer followingId = 25219981; // SoundCloud User id to denote a Following of a user
    try {
      User result = client
              .users
              .getFollowingById(userId, followingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAvatarUrl());
      System.out.println(result.getCity());
      System.out.println(result.getCountry());
      System.out.println(result.getDiscogsName());
      System.out.println(result.getFirstName());
      System.out.println(result.getFollowersCount());
      System.out.println(result.getFollowingsCount());
      System.out.println(result.getFullName());
      System.out.println(result.getId());
      System.out.println(result.getKind());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getLastModified());
      System.out.println(result.getLastName());
      System.out.println(result.getMyspaceName());
      System.out.println(result.getPermalink());
      System.out.println(result.getPermalinkUrl());
      System.out.println(result.getPlan());
      System.out.println(result.getPlaylistCount());
      System.out.println(result.getPublicFavoritesCount());
      System.out.println(result.getRepostsCount());
      System.out.println(result.getTrackCount());
      System.out.println(result.getUri());
      System.out.println(result.getUsername());
      System.out.println(result.getWebsite());
      System.out.println(result.getWebsiteTitle());
      System.out.println(result.getSubscriptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getFollowingById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .users
              .getFollowingById(userId, followingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getFollowingById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Integer**| SoundCloud User id | |
| **followingId** | **Integer**| SoundCloud User id to denote a Following of a user | |

### Return type

[**User**](User.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUser"></a>
# **getUser**
> User getUser(userId).execute();

Returns a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer userId = 948745750; // SoundCloud User id
    try {
      User result = client
              .users
              .getUser(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAvatarUrl());
      System.out.println(result.getCity());
      System.out.println(result.getCountry());
      System.out.println(result.getDiscogsName());
      System.out.println(result.getFirstName());
      System.out.println(result.getFollowersCount());
      System.out.println(result.getFollowingsCount());
      System.out.println(result.getFullName());
      System.out.println(result.getId());
      System.out.println(result.getKind());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getLastModified());
      System.out.println(result.getLastName());
      System.out.println(result.getMyspaceName());
      System.out.println(result.getPermalink());
      System.out.println(result.getPermalinkUrl());
      System.out.println(result.getPlan());
      System.out.println(result.getPlaylistCount());
      System.out.println(result.getPublicFavoritesCount());
      System.out.println(result.getRepostsCount());
      System.out.println(result.getTrackCount());
      System.out.println(result.getUri());
      System.out.println(result.getUsername());
      System.out.println(result.getWebsite());
      System.out.println(result.getWebsiteTitle());
      System.out.println(result.getSubscriptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .users
              .getUser(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Integer**| SoundCloud User id | |

### Return type

[**User**](User.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUserFollowings"></a>
# **getUserFollowings**
> Users getUserFollowings(userId).limit(limit).execute();

Returns a list of user’s followings.

Returns list of users that (user_id) follows.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer userId = 948745750; // SoundCloud User id
    Integer limit = 50; // Number of results to return in the collection.
    try {
      Users result = client
              .users
              .getUserFollowings(userId)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getCollection());
      System.out.println(result.getNextHref());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserFollowings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Users> response = client
              .users
              .getUserFollowings(userId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserFollowings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Integer**| SoundCloud User id | |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |

### Return type

[**Users**](Users.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUserPlaylists"></a>
# **getUserPlaylists**
> Object getUserPlaylists(userId).access(access).showTracks(showTracks).limit(limit).linkedPartitioning(linkedPartitioning).execute();

Returns a list of user&#39;s playlists.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer userId = 948745750; // SoundCloud User id
    List<String> access = Arrays.asList(); // Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you'd like to see all possible tracks. See `Track#access` schema for more details. 
    Boolean showTracks = true; // A boolean flag to request a playlist with or without tracks. Default is `true`.
    Integer limit = 50; // Number of results to return in the collection.
    Boolean linkedPartitioning = true; // Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used)
    try {
      Object result = client
              .users
              .getUserPlaylists(userId)
              .access(access)
              .showTracks(showTracks)
              .limit(limit)
              .linkedPartitioning(linkedPartitioning)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserPlaylists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .users
              .getUserPlaylists(userId)
              .access(access)
              .showTracks(showTracks)
              .limit(limit)
              .linkedPartitioning(linkedPartitioning)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserPlaylists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Integer**| SoundCloud User id | |
| **access** | [**List&lt;String&gt;**](String.md)| Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you&#39;d like to see all possible tracks. See &#x60;Track#access&#x60; schema for more details.  | [optional] [enum: playable, preview, blocked] |
| **showTracks** | **Boolean**| A boolean flag to request a playlist with or without tracks. Default is &#x60;true&#x60;. | [optional] |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |
| **linkedPartitioning** | **Boolean**| Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used) | [optional] |

### Return type

**Object**

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUserTracks"></a>
# **getUserTracks**
> Object getUserTracks(userId).access(access).limit(limit).linkedPartitioning(linkedPartitioning).execute();

Returns a list of user&#39;s tracks.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer userId = 948745750; // SoundCloud User id
    List<String> access = Arrays.asList(); // Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you'd like to see all possible tracks. See `Track#access` schema for more details. 
    Integer limit = 50; // Number of results to return in the collection.
    Boolean linkedPartitioning = true; // Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used)
    try {
      Object result = client
              .users
              .getUserTracks(userId)
              .access(access)
              .limit(limit)
              .linkedPartitioning(linkedPartitioning)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserTracks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .users
              .getUserTracks(userId)
              .access(access)
              .limit(limit)
              .linkedPartitioning(linkedPartitioning)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserTracks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Integer**| SoundCloud User id | |
| **access** | [**List&lt;String&gt;**](String.md)| Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you&#39;d like to see all possible tracks. See &#x60;Track#access&#x60; schema for more details.  | [optional] [enum: playable, preview, blocked] |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |
| **linkedPartitioning** | **Boolean**| Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used) | [optional] |

### Return type

**Object**

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUserWebProfiles"></a>
# **getUserWebProfiles**
> List&lt;WebProfilesInner&gt; getUserWebProfiles(userId).limit(limit).execute();

Returns list of user&#39;s links added to their profile (website, facebook, instagram).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer userId = 948745750; // SoundCloud User id
    Integer limit = 50; // Number of results to return in the collection.
    try {
      List<WebProfilesInner> result = client
              .users
              .getUserWebProfiles(userId)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserWebProfiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<WebProfilesInner>> response = client
              .users
              .getUserWebProfiles(userId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserWebProfiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Integer**| SoundCloud User id | |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |

### Return type

[**List&lt;WebProfilesInner&gt;**](WebProfilesInner.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listFavorites"></a>
# **listFavorites**
> Object listFavorites(userId).limit(limit).linkedPartitioning(linkedPartitioning).execute();

Returns a list of user&#39;s favorited or liked tracks. (use /users/:userId/likes/tracks instead, to fetch a user&#39;s likes)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer userId = 948745750; // SoundCloud User id
    Integer limit = 50; // Number of results to return in the collection.
    Boolean linkedPartitioning = true; // Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used)
    try {
      Object result = client
              .users
              .listFavorites(userId)
              .limit(limit)
              .linkedPartitioning(linkedPartitioning)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listFavorites");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .users
              .listFavorites(userId)
              .limit(limit)
              .linkedPartitioning(linkedPartitioning)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listFavorites");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Integer**| SoundCloud User id | |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |
| **linkedPartitioning** | **Boolean**| Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used) | [optional] |

### Return type

**Object**

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listLikedPlaylists"></a>
# **listLikedPlaylists**
> Object listLikedPlaylists(userId).limit(limit).linkedPartitioning(linkedPartitioning).execute();

Returns a list of user&#39;s liked playlists.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer userId = 948745750; // SoundCloud User id
    Integer limit = 50; // Number of results to return in the collection.
    Boolean linkedPartitioning = true; // Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used)
    try {
      Object result = client
              .users
              .listLikedPlaylists(userId)
              .limit(limit)
              .linkedPartitioning(linkedPartitioning)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listLikedPlaylists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .users
              .listLikedPlaylists(userId)
              .limit(limit)
              .linkedPartitioning(linkedPartitioning)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listLikedPlaylists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Integer**| SoundCloud User id | |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |
| **linkedPartitioning** | **Boolean**| Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used) | [optional] |

### Return type

**Object**

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listLikedTracks"></a>
# **listLikedTracks**
> Object listLikedTracks(userId).access(access).limit(limit).linkedPartitioning(linkedPartitioning).execute();

Returns a list of user&#39;s liked tracks.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer userId = 948745750; // SoundCloud User id
    List<String> access = Arrays.asList(); // Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you'd like to see all possible tracks. See `Track#access` schema for more details. 
    Integer limit = 50; // Number of results to return in the collection.
    Boolean linkedPartitioning = true; // Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used)
    try {
      Object result = client
              .users
              .listLikedTracks(userId)
              .access(access)
              .limit(limit)
              .linkedPartitioning(linkedPartitioning)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listLikedTracks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .users
              .listLikedTracks(userId)
              .access(access)
              .limit(limit)
              .linkedPartitioning(linkedPartitioning)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listLikedTracks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Integer**| SoundCloud User id | |
| **access** | [**List&lt;String&gt;**](String.md)| Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you&#39;d like to see all possible tracks. See &#x60;Track#access&#x60; schema for more details.  | [optional] [enum: playable, preview, blocked] |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |
| **linkedPartitioning** | **Boolean**| Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used) | [optional] |

### Return type

**Object**

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

