# MeApi

All URIs are relative to *https://api.soundcloud.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteFollowedUser**](MeApi.md#deleteFollowedUser) | **DELETE** /me/followings/{user_id} | Deletes a user who is followed by the authenticated user. |
| [**followUser**](MeApi.md#followUser) | **PUT** /me/followings/{user_id} | Follows a user. |
| [**getActivities**](MeApi.md#getActivities) | **GET** /me/activities | Returns the authenticated user&#39;s activities. |
| [**getFollowedUser**](MeApi.md#getFollowedUser) | **GET** /me/followings/{user_id} | Returns a user who is followed by the authenticated user. (use /users/{user_id} instead, to fetch the user details) |
| [**getFollowedUsers**](MeApi.md#getFollowedUsers) | **GET** /me/followings | Returns a list of users who are followed by the authenticated user. |
| [**getFollowerById**](MeApi.md#getFollowerById) | **GET** /me/followers/{follower_id} | Returns a user who is following the authenticated user. (use /users/{user_id} instead, to fetch the user details) |
| [**getFollowersList**](MeApi.md#getFollowersList) | **GET** /me/followers | Returns a list of users who are following the authenticated user. |
| [**getLikedPlaylists**](MeApi.md#getLikedPlaylists) | **GET** /me/likes/playlists | Returns a list of favorited or liked playlists of the authenticated user. |
| [**getRecentActivities**](MeApi.md#getRecentActivities) | **GET** /me/activities/all/own | Recent the authenticated user&#39;s activities. |
| [**getRecentTracks**](MeApi.md#getRecentTracks) | **GET** /me/activities/tracks | Returns the authenticated user&#39;s recent track related activities. |
| [**getUserInformation**](MeApi.md#getUserInformation) | **GET** /me | Returns the authenticated user’s information. |
| [**listFollowedTracks**](MeApi.md#listFollowedTracks) | **GET** /me/followings/tracks | Returns a list of recent tracks from users followed by the authenticated user. |
| [**listLikedTracks**](MeApi.md#listLikedTracks) | **GET** /me/likes/tracks | Returns a list of favorited or liked tracks of the authenticated user. |
| [**listPlaylistsInfoTracksOwner**](MeApi.md#listPlaylistsInfoTracksOwner) | **GET** /me/playlists | Returns user’s playlists (sets). |
| [**listUserTracks**](MeApi.md#listUserTracks) | **GET** /me/tracks | Returns a list of user&#39;s tracks. |


<a name="deleteFollowedUser"></a>
# **deleteFollowedUser**
> deleteFollowedUser(userId).execute();

Deletes a user who is followed by the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer userId = 743372812; // SoundCloud User id
    try {
      client
              .me
              .deleteFollowedUser(userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#deleteFollowedUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .me
              .deleteFollowedUser(userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#deleteFollowedUser");
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

null (empty response body)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="followUser"></a>
# **followUser**
> followUser(userId).execute();

Follows a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer userId = 743372812; // SoundCloud User id
    try {
      client
              .me
              .followUser(userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#followUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .me
              .followUser(userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#followUser");
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

null (empty response body)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **201** | Success |  -  |

<a name="getActivities"></a>
# **getActivities**
> Activities getActivities().access(access).limit(limit).execute();

Returns the authenticated user&#39;s activities.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    List<String> access = Arrays.asList(); // Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you'd like to see all possible tracks. See `Track#access` schema for more details. 
    Integer limit = 50; // Number of results to return in the collection.
    try {
      Activities result = client
              .me
              .getActivities()
              .access(access)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getCollection());
      System.out.println(result.getNextHref());
      System.out.println(result.getFutureHref());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getActivities");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Activities> response = client
              .me
              .getActivities()
              .access(access)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getActivities");
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
| **access** | [**List&lt;String&gt;**](String.md)| Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you&#39;d like to see all possible tracks. See &#x60;Track#access&#x60; schema for more details.  | [optional] [enum: playable, preview, blocked] |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |

### Return type

[**Activities**](Activities.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getFollowedUser"></a>
# **getFollowedUser**
> User getFollowedUser(userId).execute();

Returns a user who is followed by the authenticated user. (use /users/{user_id} instead, to fetch the user details)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeApi;
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
              .me
              .getFollowedUser(userId)
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
      System.err.println("Exception when calling MeApi#getFollowedUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .me
              .getFollowedUser(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getFollowedUser");
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

<a name="getFollowedUsers"></a>
# **getFollowedUsers**
> Users getFollowedUsers().limit(limit).offset(offset).execute();

Returns a list of users who are followed by the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer limit = 50; // Number of results to return in the collection.
    Integer offset = 0; // Offset of first result. Deprecated, use `linked_partitioning` instead.
    try {
      Users result = client
              .me
              .getFollowedUsers()
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getCollection());
      System.out.println(result.getNextHref());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getFollowedUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Users> response = client
              .me
              .getFollowedUsers()
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getFollowedUsers");
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
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |
| **offset** | **Integer**| Offset of first result. Deprecated, use &#x60;linked_partitioning&#x60; instead. | [optional] [default to 0] |

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

<a name="getFollowerById"></a>
# **getFollowerById**
> User getFollowerById(followerId).execute();

Returns a user who is following the authenticated user. (use /users/{user_id} instead, to fetch the user details)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer followerId = 743372812; // SoundCloud User id to denote a Follower
    try {
      User result = client
              .me
              .getFollowerById(followerId)
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
      System.err.println("Exception when calling MeApi#getFollowerById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .me
              .getFollowerById(followerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getFollowerById");
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
| **followerId** | **Integer**| SoundCloud User id to denote a Follower | |

### Return type

[**User**](User.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getFollowersList"></a>
# **getFollowersList**
> Users getFollowersList().limit(limit).execute();

Returns a list of users who are following the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer limit = 50; // Number of results to return in the collection.
    try {
      Users result = client
              .me
              .getFollowersList()
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getCollection());
      System.out.println(result.getNextHref());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getFollowersList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Users> response = client
              .me
              .getFollowersList()
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getFollowersList");
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

<a name="getLikedPlaylists"></a>
# **getLikedPlaylists**
> Object getLikedPlaylists().limit(limit).linkedPartitioning(linkedPartitioning).execute();

Returns a list of favorited or liked playlists of the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer limit = 50; // Number of results to return in the collection.
    Boolean linkedPartitioning = true; // Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used)
    try {
      Object result = client
              .me
              .getLikedPlaylists()
              .limit(limit)
              .linkedPartitioning(linkedPartitioning)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getLikedPlaylists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .me
              .getLikedPlaylists()
              .limit(limit)
              .linkedPartitioning(linkedPartitioning)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getLikedPlaylists");
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

<a name="getRecentActivities"></a>
# **getRecentActivities**
> Activities getRecentActivities().access(access).limit(limit).execute();

Recent the authenticated user&#39;s activities.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    List<String> access = Arrays.asList(); // Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you'd like to see all possible tracks. See `Track#access` schema for more details. 
    Integer limit = 50; // Number of results to return in the collection.
    try {
      Activities result = client
              .me
              .getRecentActivities()
              .access(access)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getCollection());
      System.out.println(result.getNextHref());
      System.out.println(result.getFutureHref());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getRecentActivities");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Activities> response = client
              .me
              .getRecentActivities()
              .access(access)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getRecentActivities");
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
| **access** | [**List&lt;String&gt;**](String.md)| Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you&#39;d like to see all possible tracks. See &#x60;Track#access&#x60; schema for more details.  | [optional] [enum: playable, preview, blocked] |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |

### Return type

[**Activities**](Activities.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getRecentTracks"></a>
# **getRecentTracks**
> Activities getRecentTracks().access(access).limit(limit).execute();

Returns the authenticated user&#39;s recent track related activities.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    List<String> access = Arrays.asList(); // Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you'd like to see all possible tracks. See `Track#access` schema for more details. 
    Integer limit = 50; // Number of results to return in the collection.
    try {
      Activities result = client
              .me
              .getRecentTracks()
              .access(access)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getCollection());
      System.out.println(result.getNextHref());
      System.out.println(result.getFutureHref());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getRecentTracks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Activities> response = client
              .me
              .getRecentTracks()
              .access(access)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getRecentTracks");
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
| **access** | [**List&lt;String&gt;**](String.md)| Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you&#39;d like to see all possible tracks. See &#x60;Track#access&#x60; schema for more details.  | [optional] [enum: playable, preview, blocked] |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |

### Return type

[**Activities**](Activities.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUserInformation"></a>
# **getUserInformation**
> Me getUserInformation().execute();

Returns the authenticated user’s information.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    try {
      Me result = client
              .me
              .getUserInformation()
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAvatarUrl());
      System.out.println(result.getCity());
      System.out.println(result.getCommentsCount());
      System.out.println(result.getCountry());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDiscogsName());
      System.out.println(result.getFirstName());
      System.out.println(result.getFollowersCount());
      System.out.println(result.getFollowingsCount());
      System.out.println(result.getFullName());
      System.out.println(result.getId());
      System.out.println(result.getKind());
      System.out.println(result.getLastModified());
      System.out.println(result.getLastName());
      System.out.println(result.getLikesCount());
      System.out.println(result.getLocale());
      System.out.println(result.getOnline());
      System.out.println(result.getMyspaceName());
      System.out.println(result.getPermalink());
      System.out.println(result.getPermalinkUrl());
      System.out.println(result.getPlan());
      System.out.println(result.getPlaylistCount());
      System.out.println(result.getPrimaryEmailConfirmed());
      System.out.println(result.getPrivatePlaylistsCount());
      System.out.println(result.getPrivateTracksCount());
      System.out.println(result.getPublicFavoritesCount());
      System.out.println(result.getQuota());
      System.out.println(result.getRepostsCount());
      System.out.println(result.getSubscriptions());
      System.out.println(result.getTrackCount());
      System.out.println(result.getUploadSecondsLeft());
      System.out.println(result.getUri());
      System.out.println(result.getUsername());
      System.out.println(result.getWebsite());
      System.out.println(result.getWebsiteTitle());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getUserInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Me> response = client
              .me
              .getUserInformation()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#getUserInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Me**](Me.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listFollowedTracks"></a>
# **listFollowedTracks**
> List&lt;Track&gt; listFollowedTracks().access(access).limit(limit).offset(offset).execute();

Returns a list of recent tracks from users followed by the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    List<String> access = Arrays.asList(); // Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you'd like to see all possible tracks. See `Track#access` schema for more details. 
    Integer limit = 50; // Number of results to return in the collection.
    Integer offset = 0; // Offset of first result. Deprecated, use `linked_partitioning` instead.
    try {
      List<Track> result = client
              .me
              .listFollowedTracks()
              .access(access)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#listFollowedTracks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Track>> response = client
              .me
              .listFollowedTracks()
              .access(access)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#listFollowedTracks");
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
| **access** | [**List&lt;String&gt;**](String.md)| Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you&#39;d like to see all possible tracks. See &#x60;Track#access&#x60; schema for more details.  | [optional] [enum: playable, preview, blocked] |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |
| **offset** | **Integer**| Offset of first result. Deprecated, use &#x60;linked_partitioning&#x60; instead. | [optional] [default to 0] |

### Return type

[**List&lt;Track&gt;**](Track.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listLikedTracks"></a>
# **listLikedTracks**
> Object listLikedTracks().limit(limit).access(access).linkedPartitioning(linkedPartitioning).execute();

Returns a list of favorited or liked tracks of the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer limit = 50; // Number of results to return in the collection.
    List<String> access = Arrays.asList(); // Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you'd like to see all possible tracks. See `Track#access` schema for more details. 
    Boolean linkedPartitioning = true; // Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used)
    try {
      Object result = client
              .me
              .listLikedTracks()
              .limit(limit)
              .access(access)
              .linkedPartitioning(linkedPartitioning)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#listLikedTracks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .me
              .listLikedTracks()
              .limit(limit)
              .access(access)
              .linkedPartitioning(linkedPartitioning)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#listLikedTracks");
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
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |
| **access** | [**List&lt;String&gt;**](String.md)| Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you&#39;d like to see all possible tracks. See &#x60;Track#access&#x60; schema for more details.  | [optional] [enum: playable, preview, blocked] |
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

<a name="listPlaylistsInfoTracksOwner"></a>
# **listPlaylistsInfoTracksOwner**
> Object listPlaylistsInfoTracksOwner().showTracks(showTracks).linkedPartitioning(linkedPartitioning).limit(limit).execute();

Returns user’s playlists (sets).

Returns playlist info, playlist tracks and tracks owner info.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Boolean showTracks = true; // A boolean flag to request a playlist with or without tracks. Default is `true`.
    Boolean linkedPartitioning = true; // Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used)
    Integer limit = 50; // Number of results to return in the collection.
    try {
      Object result = client
              .me
              .listPlaylistsInfoTracksOwner()
              .showTracks(showTracks)
              .linkedPartitioning(linkedPartitioning)
              .limit(limit)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#listPlaylistsInfoTracksOwner");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .me
              .listPlaylistsInfoTracksOwner()
              .showTracks(showTracks)
              .linkedPartitioning(linkedPartitioning)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#listPlaylistsInfoTracksOwner");
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
| **showTracks** | **Boolean**| A boolean flag to request a playlist with or without tracks. Default is &#x60;true&#x60;. | [optional] |
| **linkedPartitioning** | **Boolean**| Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used) | [optional] |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |

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

<a name="listUserTracks"></a>
# **listUserTracks**
> Object listUserTracks().limit(limit).linkedPartitioning(linkedPartitioning).execute();

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
import com.konfigthis.client.api.MeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer limit = 50; // Number of results to return in the collection.
    Boolean linkedPartitioning = true; // Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used)
    try {
      Object result = client
              .me
              .listUserTracks()
              .limit(limit)
              .linkedPartitioning(linkedPartitioning)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#listUserTracks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .me
              .listUserTracks()
              .limit(limit)
              .linkedPartitioning(linkedPartitioning)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeApi#listUserTracks");
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

