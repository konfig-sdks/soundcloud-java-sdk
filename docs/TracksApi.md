# TracksApi

All URIs are relative to *https://api.soundcloud.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createComment**](TracksApi.md#createComment) | **POST** /tracks/{track_id}/comments | Returns the newly created comment on success |
| [**deleteTrack**](TracksApi.md#deleteTrack) | **DELETE** /tracks/{track_id} | Deletes a track. |
| [**getById**](TracksApi.md#getById) | **GET** /tracks/{track_id} | Returns a track. |
| [**getComments**](TracksApi.md#getComments) | **GET** /tracks/{track_id}/comments | Returns the comments posted on the track(track_id). |
| [**getFavoriters**](TracksApi.md#getFavoriters) | **GET** /tracks/{track_id}/favoriters | Returns a list of users who have favorited or liked the track. |
| [**getRelatedTracks**](TracksApi.md#getRelatedTracks) | **GET** /tracks/{track_id}/related | Returns all related tracks of track on SoundCloud. |
| [**getStreamableUrls**](TracksApi.md#getStreamableUrls) | **GET** /tracks/{track_id}/streams | Returns a track&#39;s streamable URLs |
| [**listReposters**](TracksApi.md#listReposters) | **GET** /tracks/{track_id}/reposters | Returns a collection of track&#39;s reposters. |
| [**updateTrackInformation**](TracksApi.md#updateTrackInformation) | **PUT** /tracks/{track_id} | Updates a track&#39;s information. |
| [**uploadNewTrack**](TracksApi.md#uploadNewTrack) | **POST** /tracks | Uploads a new track. |


<a name="createComment"></a>
# **createComment**
> Comment createComment(trackId, tracksCreateCommentRequest).execute();

Returns the newly created comment on success

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer trackId = 308946187; // SoundCloud Track id
    TracksCreateCommentRequestComment comment = new TracksCreateCommentRequestComment();
    try {
      Comment result = client
              .tracks
              .createComment(trackId)
              .comment(comment)
              .execute();
      System.out.println(result);
      System.out.println(result.getBody());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getId());
      System.out.println(result.getKind());
      System.out.println(result.getUserId());
      System.out.println(result.getTimestamp());
      System.out.println(result.getTrackId());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#createComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Comment> response = client
              .tracks
              .createComment(trackId)
              .comment(comment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#createComment");
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
| **trackId** | **Integer**| SoundCloud Track id | |
| **tracksCreateCommentRequest** | [**TracksCreateCommentRequest**](TracksCreateCommentRequest.md)| Body of a comment  | |

### Return type

[**Comment**](Comment.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |

<a name="deleteTrack"></a>
# **deleteTrack**
> deleteTrack(trackId).execute();

Deletes a track.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer trackId = 308946187; // SoundCloud Track id
    try {
      client
              .tracks
              .deleteTrack(trackId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#deleteTrack");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tracks
              .deleteTrack(trackId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#deleteTrack");
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
| **trackId** | **Integer**| SoundCloud Track id | |

### Return type

null (empty response body)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getById"></a>
# **getById**
> Track getById(trackId).secretToken(secretToken).execute();

Returns a track.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer trackId = 308946187; // SoundCloud Track id
    String secretToken = "secretToken_example"; // A secret token to fetch private playlists/tracks
    try {
      Track result = client
              .tracks
              .getById(trackId)
              .secretToken(secretToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getArtworkUrl());
      System.out.println(result.getBpm());
      System.out.println(result.getCommentCount());
      System.out.println(result.getCommentable());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDownloadCount());
      System.out.println(result.getDownloadable());
      System.out.println(result.getDuration());
      System.out.println(result.getEmbeddableBy());
      System.out.println(result.getFavoritingsCount());
      System.out.println(result.getGenre());
      System.out.println(result.getId());
      System.out.println(result.getIsrc());
      System.out.println(result.getKeySignature());
      System.out.println(result.getKind());
      System.out.println(result.getLabelName());
      System.out.println(result.getLicense());
      System.out.println(result.getPermalinkUrl());
      System.out.println(result.getPlaybackCount());
      System.out.println(result.getPurchaseTitle());
      System.out.println(result.getPurchaseUrl());
      System.out.println(result.getRelease());
      System.out.println(result.getReleaseDay());
      System.out.println(result.getReleaseMonth());
      System.out.println(result.getReleaseYear());
      System.out.println(result.getSharing());
      System.out.println(result.getStreamUrl());
      System.out.println(result.getStreamable());
      System.out.println(result.getTagList());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getUserFavorite());
      System.out.println(result.getUserPlaybackCount());
      System.out.println(result.getWaveformUrl());
      System.out.println(result.getAvailableCountryCodes());
      System.out.println(result.getAccess());
      System.out.println(result.getDownloadUrl());
      System.out.println(result.getRepostsCount());
      System.out.println(result.getSecretUri());
      System.out.println(result.getTags());
      System.out.println(result.getEan());
      System.out.println(result.getLabelId());
      System.out.println(result.getLastModified());
      System.out.println(result.getPermalink());
      System.out.println(result.getPlaylistType());
      System.out.println(result.getTrackCount());
      System.out.println(result.getTracks());
      System.out.println(result.getType());
      System.out.println(result.getUserId());
      System.out.println(result.getLikesCount());
      System.out.println(result.getLabel());
      System.out.println(result.getTracksUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Track> response = client
              .tracks
              .getById(trackId)
              .secretToken(secretToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getById");
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
| **trackId** | **Integer**| SoundCloud Track id | |
| **secretToken** | **String**| A secret token to fetch private playlists/tracks | [optional] |

### Return type

[**Track**](Track.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getComments"></a>
# **getComments**
> Comments getComments(trackId).limit(limit).offset(offset).linkedPartitioning(linkedPartitioning).execute();

Returns the comments posted on the track(track_id).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer trackId = 308946187; // SoundCloud Track id
    Integer limit = 50; // Number of results to return in the collection.
    Integer offset = 0; // Offset of first result. Deprecated, use `linked_partitioning` instead.
    Boolean linkedPartitioning = true; // Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used)
    try {
      Comments result = client
              .tracks
              .getComments(trackId)
              .limit(limit)
              .offset(offset)
              .linkedPartitioning(linkedPartitioning)
              .execute();
      System.out.println(result);
      System.out.println(result.getCollection());
      System.out.println(result.getNextHref());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getComments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Comments> response = client
              .tracks
              .getComments(trackId)
              .limit(limit)
              .offset(offset)
              .linkedPartitioning(linkedPartitioning)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getComments");
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
| **trackId** | **Integer**| SoundCloud Track id | |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |
| **offset** | **Integer**| Offset of first result. Deprecated, use &#x60;linked_partitioning&#x60; instead. | [optional] [default to 0] |
| **linkedPartitioning** | **Boolean**| Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used) | [optional] |

### Return type

[**Comments**](Comments.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getFavoriters"></a>
# **getFavoriters**
> Users getFavoriters(trackId).limit(limit).linkedPartitioning(linkedPartitioning).execute();

Returns a list of users who have favorited or liked the track.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer trackId = 308946187; // SoundCloud Track id
    Integer limit = 50; // Number of results to return in the collection.
    Boolean linkedPartitioning = true; // Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used)
    try {
      Users result = client
              .tracks
              .getFavoriters(trackId)
              .limit(limit)
              .linkedPartitioning(linkedPartitioning)
              .execute();
      System.out.println(result);
      System.out.println(result.getCollection());
      System.out.println(result.getNextHref());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getFavoriters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Users> response = client
              .tracks
              .getFavoriters(trackId)
              .limit(limit)
              .linkedPartitioning(linkedPartitioning)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getFavoriters");
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
| **trackId** | **Integer**| SoundCloud Track id | |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |
| **linkedPartitioning** | **Boolean**| Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used) | [optional] |

### Return type

[**Users**](Users.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getRelatedTracks"></a>
# **getRelatedTracks**
> Object getRelatedTracks(trackId).access(access).limit(limit).offset(offset).linkedPartitioning(linkedPartitioning).execute();

Returns all related tracks of track on SoundCloud.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer trackId = 308946187; // SoundCloud Track id
    List<String> access = Arrays.asList(); // Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you'd like to see all possible tracks. See `Track#access` schema for more details. 
    Integer limit = 50; // Number of results to return in the collection.
    Integer offset = 0; // Offset of first result. Deprecated, use `linked_partitioning` instead.
    Boolean linkedPartitioning = true; // Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used)
    try {
      Object result = client
              .tracks
              .getRelatedTracks(trackId)
              .access(access)
              .limit(limit)
              .offset(offset)
              .linkedPartitioning(linkedPartitioning)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getRelatedTracks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .tracks
              .getRelatedTracks(trackId)
              .access(access)
              .limit(limit)
              .offset(offset)
              .linkedPartitioning(linkedPartitioning)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getRelatedTracks");
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
| **trackId** | **Integer**| SoundCloud Track id | |
| **access** | [**List&lt;String&gt;**](String.md)| Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you&#39;d like to see all possible tracks. See &#x60;Track#access&#x60; schema for more details.  | [optional] [enum: playable, preview, blocked] |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |
| **offset** | **Integer**| Offset of first result. Deprecated, use &#x60;linked_partitioning&#x60; instead. | [optional] [default to 0] |
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

<a name="getStreamableUrls"></a>
# **getStreamableUrls**
> Streams getStreamableUrls(trackId).secretToken(secretToken).execute();

Returns a track&#39;s streamable URLs

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer trackId = 308946187; // SoundCloud Track id
    String secretToken = "secretToken_example"; // A secret token to fetch private playlists/tracks
    try {
      Streams result = client
              .tracks
              .getStreamableUrls(trackId)
              .secretToken(secretToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getHttpMp3128Url());
      System.out.println(result.getHlsMp3128Url());
      System.out.println(result.getHlsOpus64Url());
      System.out.println(result.getPreviewMp3128Url());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getStreamableUrls");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Streams> response = client
              .tracks
              .getStreamableUrls(trackId)
              .secretToken(secretToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getStreamableUrls");
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
| **trackId** | **Integer**| SoundCloud Track id | |
| **secretToken** | **String**| A secret token to fetch private playlists/tracks | [optional] |

### Return type

[**Streams**](Streams.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listReposters"></a>
# **listReposters**
> Users listReposters(trackId).limit(limit).execute();

Returns a collection of track&#39;s reposters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer trackId = 308946187; // SoundCloud Track id
    Integer limit = 50; // Number of results to return in the collection.
    try {
      Users result = client
              .tracks
              .listReposters(trackId)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getCollection());
      System.out.println(result.getNextHref());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#listReposters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Users> response = client
              .tracks
              .listReposters(trackId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#listReposters");
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
| **trackId** | **Integer**| SoundCloud Track id | |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |

### Return type

[**Users**](Users.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateTrackInformation"></a>
# **updateTrackInformation**
> Track updateTrackInformation(trackId).trackMetadataRequest(trackMetadataRequest).execute();

Updates a track&#39;s information.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer trackId = 308946187; // SoundCloud Track id
    TrackMetadataRequestTrack track = new TrackMetadataRequestTrack();
    try {
      Track result = client
              .tracks
              .updateTrackInformation(trackId)
              .track(track)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getArtworkUrl());
      System.out.println(result.getBpm());
      System.out.println(result.getCommentCount());
      System.out.println(result.getCommentable());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDownloadCount());
      System.out.println(result.getDownloadable());
      System.out.println(result.getDuration());
      System.out.println(result.getEmbeddableBy());
      System.out.println(result.getFavoritingsCount());
      System.out.println(result.getGenre());
      System.out.println(result.getId());
      System.out.println(result.getIsrc());
      System.out.println(result.getKeySignature());
      System.out.println(result.getKind());
      System.out.println(result.getLabelName());
      System.out.println(result.getLicense());
      System.out.println(result.getPermalinkUrl());
      System.out.println(result.getPlaybackCount());
      System.out.println(result.getPurchaseTitle());
      System.out.println(result.getPurchaseUrl());
      System.out.println(result.getRelease());
      System.out.println(result.getReleaseDay());
      System.out.println(result.getReleaseMonth());
      System.out.println(result.getReleaseYear());
      System.out.println(result.getSharing());
      System.out.println(result.getStreamUrl());
      System.out.println(result.getStreamable());
      System.out.println(result.getTagList());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getUserFavorite());
      System.out.println(result.getUserPlaybackCount());
      System.out.println(result.getWaveformUrl());
      System.out.println(result.getAvailableCountryCodes());
      System.out.println(result.getAccess());
      System.out.println(result.getDownloadUrl());
      System.out.println(result.getRepostsCount());
      System.out.println(result.getSecretUri());
      System.out.println(result.getTags());
      System.out.println(result.getEan());
      System.out.println(result.getLabelId());
      System.out.println(result.getLastModified());
      System.out.println(result.getPermalink());
      System.out.println(result.getPlaylistType());
      System.out.println(result.getTrackCount());
      System.out.println(result.getTracks());
      System.out.println(result.getType());
      System.out.println(result.getUserId());
      System.out.println(result.getLikesCount());
      System.out.println(result.getLabel());
      System.out.println(result.getTracksUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#updateTrackInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Track> response = client
              .tracks
              .updateTrackInformation(trackId)
              .track(track)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#updateTrackInformation");
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
| **trackId** | **Integer**| SoundCloud Track id | |
| **trackMetadataRequest** | [**TrackMetadataRequest**](TrackMetadataRequest.md)| Track payload | [optional] |

### Return type

[**Track**](Track.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data, multipart/x-www-form-urlencoded
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="uploadNewTrack"></a>
# **uploadNewTrack**
> Track uploadNewTrack().trackTitle(trackTitle).trackAssetData(trackAssetData).trackPermalink(trackPermalink).trackSharing(trackSharing).trackEmbeddableBy(trackEmbeddableBy).trackPurchaseUrl(trackPurchaseUrl).trackDescription(trackDescription).trackGenre(trackGenre).trackTagList(trackTagList).trackLabelName(trackLabelName).trackRelease(trackRelease).trackReleaseDate(trackReleaseDate).trackStreamable(trackStreamable).trackDownloadable(trackDownloadable).trackLicense(trackLicense).trackCommentable(trackCommentable).trackIsrc(trackIsrc).trackArtworkData(trackArtworkData).tracksUploadNewTrackRequest(tracksUploadNewTrackRequest).execute();

Uploads a new track.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    String trackTitle = "trackTitle_example";
    File trackAssetData = new File("/path/to/file");
    String trackPermalink = "trackPermalink_example";
    String trackSharing = "public";
    String trackEmbeddableBy = "all"; // who can embed this track \\\"all\\\", \\\"me\\\", or \\\"none\\\"
    String trackPurchaseUrl = "trackPurchaseUrl_example";
    String trackDescription = "trackDescription_example";
    String trackGenre = "trackGenre_example";
    String trackTagList = "trackTagList_example"; // The tag_list property contains a list of tags separated by spaces. Multiword tags are quoted in double quotes. We also support machine tags that follow the pattern NAMESPACE:KEY=VALUE. For example: geo:lat=43.555 camel:size=medium “machine:tag=with space” Machine tags are not revealed to the user on the track pages.
    String trackLabelName = "trackLabelName_example";
    String trackRelease = "trackRelease_example";
    String trackReleaseDate = "trackReleaseDate_example"; // string, formatted as yyyy-mm-dd, representing release date
    Boolean trackStreamable = true;
    Boolean trackDownloadable = true;
    String trackLicense = "no-rights-reserved"; // Possible values: no-rights-reserved, all-rights-reserved, cc-by, cc-by-nc, cc-by-nd, cc-by-sa, cc-by-nc-nd, cc-by-nc-sa
    Boolean trackCommentable = true;
    String trackIsrc = "trackIsrc_example";
    File trackArtworkData = new File("/path/to/file");
    try {
      Track result = client
              .tracks
              .uploadNewTrack()
              .trackTitle(trackTitle)
              .trackAssetData(trackAssetData)
              .trackPermalink(trackPermalink)
              .trackSharing(trackSharing)
              .trackEmbeddableBy(trackEmbeddableBy)
              .trackPurchaseUrl(trackPurchaseUrl)
              .trackDescription(trackDescription)
              .trackGenre(trackGenre)
              .trackTagList(trackTagList)
              .trackLabelName(trackLabelName)
              .trackRelease(trackRelease)
              .trackReleaseDate(trackReleaseDate)
              .trackStreamable(trackStreamable)
              .trackDownloadable(trackDownloadable)
              .trackLicense(trackLicense)
              .trackCommentable(trackCommentable)
              .trackIsrc(trackIsrc)
              .trackArtworkData(trackArtworkData)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getArtworkUrl());
      System.out.println(result.getBpm());
      System.out.println(result.getCommentCount());
      System.out.println(result.getCommentable());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDownloadCount());
      System.out.println(result.getDownloadable());
      System.out.println(result.getDuration());
      System.out.println(result.getEmbeddableBy());
      System.out.println(result.getFavoritingsCount());
      System.out.println(result.getGenre());
      System.out.println(result.getId());
      System.out.println(result.getIsrc());
      System.out.println(result.getKeySignature());
      System.out.println(result.getKind());
      System.out.println(result.getLabelName());
      System.out.println(result.getLicense());
      System.out.println(result.getPermalinkUrl());
      System.out.println(result.getPlaybackCount());
      System.out.println(result.getPurchaseTitle());
      System.out.println(result.getPurchaseUrl());
      System.out.println(result.getRelease());
      System.out.println(result.getReleaseDay());
      System.out.println(result.getReleaseMonth());
      System.out.println(result.getReleaseYear());
      System.out.println(result.getSharing());
      System.out.println(result.getStreamUrl());
      System.out.println(result.getStreamable());
      System.out.println(result.getTagList());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getUserFavorite());
      System.out.println(result.getUserPlaybackCount());
      System.out.println(result.getWaveformUrl());
      System.out.println(result.getAvailableCountryCodes());
      System.out.println(result.getAccess());
      System.out.println(result.getDownloadUrl());
      System.out.println(result.getRepostsCount());
      System.out.println(result.getSecretUri());
      System.out.println(result.getTags());
      System.out.println(result.getEan());
      System.out.println(result.getLabelId());
      System.out.println(result.getLastModified());
      System.out.println(result.getPermalink());
      System.out.println(result.getPlaylistType());
      System.out.println(result.getTrackCount());
      System.out.println(result.getTracks());
      System.out.println(result.getType());
      System.out.println(result.getUserId());
      System.out.println(result.getLikesCount());
      System.out.println(result.getLabel());
      System.out.println(result.getTracksUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#uploadNewTrack");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Track> response = client
              .tracks
              .uploadNewTrack()
              .trackTitle(trackTitle)
              .trackAssetData(trackAssetData)
              .trackPermalink(trackPermalink)
              .trackSharing(trackSharing)
              .trackEmbeddableBy(trackEmbeddableBy)
              .trackPurchaseUrl(trackPurchaseUrl)
              .trackDescription(trackDescription)
              .trackGenre(trackGenre)
              .trackTagList(trackTagList)
              .trackLabelName(trackLabelName)
              .trackRelease(trackRelease)
              .trackReleaseDate(trackReleaseDate)
              .trackStreamable(trackStreamable)
              .trackDownloadable(trackDownloadable)
              .trackLicense(trackLicense)
              .trackCommentable(trackCommentable)
              .trackIsrc(trackIsrc)
              .trackArtworkData(trackArtworkData)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#uploadNewTrack");
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
| **trackTitle** | **String**|  | [optional] |
| **trackAssetData** | **File**|  | [optional] |
| **trackPermalink** | **String**|  | [optional] |
| **trackSharing** | **String**|  | [optional] [default to public] [enum: public, private] |
| **trackEmbeddableBy** | **String**| who can embed this track \\\&quot;all\\\&quot;, \\\&quot;me\\\&quot;, or \\\&quot;none\\\&quot; | [optional] [enum: all, me, none] |
| **trackPurchaseUrl** | **String**|  | [optional] |
| **trackDescription** | **String**|  | [optional] |
| **trackGenre** | **String**|  | [optional] |
| **trackTagList** | **String**| The tag_list property contains a list of tags separated by spaces. Multiword tags are quoted in double quotes. We also support machine tags that follow the pattern NAMESPACE:KEY&#x3D;VALUE. For example: geo:lat&#x3D;43.555 camel:size&#x3D;medium “machine:tag&#x3D;with space” Machine tags are not revealed to the user on the track pages. | [optional] |
| **trackLabelName** | **String**|  | [optional] |
| **trackRelease** | **String**|  | [optional] |
| **trackReleaseDate** | **String**| string, formatted as yyyy-mm-dd, representing release date | [optional] |
| **trackStreamable** | **Boolean**|  | [optional] [default to true] |
| **trackDownloadable** | **Boolean**|  | [optional] [default to true] |
| **trackLicense** | **String**| Possible values: no-rights-reserved, all-rights-reserved, cc-by, cc-by-nc, cc-by-nd, cc-by-sa, cc-by-nc-nd, cc-by-nc-sa | [optional] [enum: no-rights-reserved, all-rights-reserved, cc-by, cc-by-nc, cc-by-nd, cc-by-sa, cc-by-nc-nd, cc-by-nc-sa] |
| **trackCommentable** | **Boolean**|  | [optional] [default to true] |
| **trackIsrc** | **String**|  | [optional] |
| **trackArtworkData** | **File**|  | [optional] |
| **tracksUploadNewTrackRequest** | [**TracksUploadNewTrackRequest**](TracksUploadNewTrackRequest.md)|  | [optional] |

### Return type

[**Track**](Track.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: multipart/form-data, multipart/x-www-form-urlencoded
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |

