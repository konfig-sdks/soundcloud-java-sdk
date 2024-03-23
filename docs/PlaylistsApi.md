# PlaylistsApi

All URIs are relative to *https://api.soundcloud.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewPlaylist**](PlaylistsApi.md#createNewPlaylist) | **POST** /playlists | Creates a playlist. |
| [**deletePlaylist**](PlaylistsApi.md#deletePlaylist) | **DELETE** /playlists/{playlist_id} | Deletes a playlist. |
| [**getPlaylistById**](PlaylistsApi.md#getPlaylistById) | **GET** /playlists/{playlist_id} | Returns a playlist. |
| [**getTracks**](PlaylistsApi.md#getTracks) | **GET** /playlists/{playlist_id}/tracks | Returns tracks under a playlist. |
| [**listReposters**](PlaylistsApi.md#listReposters) | **GET** /playlists/{playlist_id}/reposters | Returns a collection of playlist&#39;s reposters. |
| [**updatePlaylistById**](PlaylistsApi.md#updatePlaylistById) | **PUT** /playlists/{playlist_id} | Updates a playlist. |


<a name="createNewPlaylist"></a>
# **createNewPlaylist**
> Playlist createNewPlaylist().createUpdatePlaylistRequest(createUpdatePlaylistRequest).execute();

Creates a playlist.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    CreateUpdatePlaylistRequestPlaylist playlist = new CreateUpdatePlaylistRequestPlaylist();
    try {
      Playlist result = client
              .playlists
              .createNewPlaylist()
              .playlist(playlist)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getKind());
      System.out.println(result.getArtworkUrl());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDownloadable());
      System.out.println(result.getDuration());
      System.out.println(result.getEan());
      System.out.println(result.getEmbeddableBy());
      System.out.println(result.getGenre());
      System.out.println(result.getLabelId());
      System.out.println(result.getLabelName());
      System.out.println(result.getLastModified());
      System.out.println(result.getLicense());
      System.out.println(result.getPermalink());
      System.out.println(result.getPermalinkUrl());
      System.out.println(result.getPlaylistType());
      System.out.println(result.getPurchaseTitle());
      System.out.println(result.getPurchaseUrl());
      System.out.println(result.getRelease());
      System.out.println(result.getReleaseDay());
      System.out.println(result.getReleaseMonth());
      System.out.println(result.getReleaseYear());
      System.out.println(result.getSharing());
      System.out.println(result.getStreamable());
      System.out.println(result.getTagList());
      System.out.println(result.getTrackCount());
      System.out.println(result.getTracks());
      System.out.println(result.getType());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getUserId());
      System.out.println(result.getLikesCount());
      System.out.println(result.getLabel());
      System.out.println(result.getTracksUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#createNewPlaylist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Playlist> response = client
              .playlists
              .createNewPlaylist()
              .playlist(playlist)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#createNewPlaylist");
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
| **createUpdatePlaylistRequest** | [**CreateUpdatePlaylistRequest**](CreateUpdatePlaylistRequest.md)| Create Playlist request | [optional] |

### Return type

[**Playlist**](Playlist.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |

<a name="deletePlaylist"></a>
# **deletePlaylist**
> deletePlaylist(playlistId).execute();

Deletes a playlist.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer playlistId = 10; // SoundCloud playlist id
    try {
      client
              .playlists
              .deletePlaylist(playlistId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#deletePlaylist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .playlists
              .deletePlaylist(playlistId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#deletePlaylist");
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
| **playlistId** | **Integer**| SoundCloud playlist id | |

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

<a name="getPlaylistById"></a>
# **getPlaylistById**
> Playlist getPlaylistById(playlistId).secretToken(secretToken).access(access).showTracks(showTracks).execute();

Returns a playlist.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer playlistId = 1212781357; // SoundCloud playlist id
    String secretToken = "secretToken_example"; // A secret token to fetch private playlists/tracks
    List<String> access = Arrays.asList(); // Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you'd like to see all possible tracks. See `Track#access` schema for more details. 
    Boolean showTracks = true; // A boolean flag to request a playlist with or without tracks. Default is `true`.
    try {
      Playlist result = client
              .playlists
              .getPlaylistById(playlistId)
              .secretToken(secretToken)
              .access(access)
              .showTracks(showTracks)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getKind());
      System.out.println(result.getArtworkUrl());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDownloadable());
      System.out.println(result.getDuration());
      System.out.println(result.getEan());
      System.out.println(result.getEmbeddableBy());
      System.out.println(result.getGenre());
      System.out.println(result.getLabelId());
      System.out.println(result.getLabelName());
      System.out.println(result.getLastModified());
      System.out.println(result.getLicense());
      System.out.println(result.getPermalink());
      System.out.println(result.getPermalinkUrl());
      System.out.println(result.getPlaylistType());
      System.out.println(result.getPurchaseTitle());
      System.out.println(result.getPurchaseUrl());
      System.out.println(result.getRelease());
      System.out.println(result.getReleaseDay());
      System.out.println(result.getReleaseMonth());
      System.out.println(result.getReleaseYear());
      System.out.println(result.getSharing());
      System.out.println(result.getStreamable());
      System.out.println(result.getTagList());
      System.out.println(result.getTrackCount());
      System.out.println(result.getTracks());
      System.out.println(result.getType());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getUserId());
      System.out.println(result.getLikesCount());
      System.out.println(result.getLabel());
      System.out.println(result.getTracksUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getPlaylistById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Playlist> response = client
              .playlists
              .getPlaylistById(playlistId)
              .secretToken(secretToken)
              .access(access)
              .showTracks(showTracks)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getPlaylistById");
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
| **playlistId** | **Integer**| SoundCloud playlist id | |
| **secretToken** | **String**| A secret token to fetch private playlists/tracks | [optional] |
| **access** | [**List&lt;String&gt;**](String.md)| Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you&#39;d like to see all possible tracks. See &#x60;Track#access&#x60; schema for more details.  | [optional] [enum: playable, preview, blocked] |
| **showTracks** | **Boolean**| A boolean flag to request a playlist with or without tracks. Default is &#x60;true&#x60;. | [optional] |

### Return type

[**Playlist**](Playlist.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getTracks"></a>
# **getTracks**
> Object getTracks(playlistId).secretToken(secretToken).access(access).linkedPartitioning(linkedPartitioning).execute();

Returns tracks under a playlist.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer playlistId = 1212781357; // SoundCloud playlist id
    String secretToken = "secretToken_example"; // A secret token to fetch private playlists/tracks
    List<String> access = Arrays.asList(); // Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you'd like to see all possible tracks. See `Track#access` schema for more details. 
    Boolean linkedPartitioning = true; // Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used)
    try {
      Object result = client
              .playlists
              .getTracks(playlistId)
              .secretToken(secretToken)
              .access(access)
              .linkedPartitioning(linkedPartitioning)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getTracks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .playlists
              .getTracks(playlistId)
              .secretToken(secretToken)
              .access(access)
              .linkedPartitioning(linkedPartitioning)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getTracks");
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
| **playlistId** | **Integer**| SoundCloud playlist id | |
| **secretToken** | **String**| A secret token to fetch private playlists/tracks | [optional] |
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

<a name="listReposters"></a>
# **listReposters**
> Users listReposters(playlistId).limit(limit).execute();

Returns a collection of playlist&#39;s reposters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer playlistId = 1212781357; // SoundCloud playlist id
    Integer limit = 50; // Number of results to return in the collection.
    try {
      Users result = client
              .playlists
              .listReposters(playlistId)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getCollection());
      System.out.println(result.getNextHref());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#listReposters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Users> response = client
              .playlists
              .listReposters(playlistId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#listReposters");
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
| **playlistId** | **Integer**| SoundCloud playlist id | |
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

<a name="updatePlaylistById"></a>
# **updatePlaylistById**
> Playlist updatePlaylistById(playlistId).createUpdatePlaylistRequest(createUpdatePlaylistRequest).execute();

Updates a playlist.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer playlistId = 10; // SoundCloud playlist id
    CreateUpdatePlaylistRequestPlaylist playlist = new CreateUpdatePlaylistRequestPlaylist();
    try {
      Playlist result = client
              .playlists
              .updatePlaylistById(playlistId)
              .playlist(playlist)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getKind());
      System.out.println(result.getArtworkUrl());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDownloadable());
      System.out.println(result.getDuration());
      System.out.println(result.getEan());
      System.out.println(result.getEmbeddableBy());
      System.out.println(result.getGenre());
      System.out.println(result.getLabelId());
      System.out.println(result.getLabelName());
      System.out.println(result.getLastModified());
      System.out.println(result.getLicense());
      System.out.println(result.getPermalink());
      System.out.println(result.getPermalinkUrl());
      System.out.println(result.getPlaylistType());
      System.out.println(result.getPurchaseTitle());
      System.out.println(result.getPurchaseUrl());
      System.out.println(result.getRelease());
      System.out.println(result.getReleaseDay());
      System.out.println(result.getReleaseMonth());
      System.out.println(result.getReleaseYear());
      System.out.println(result.getSharing());
      System.out.println(result.getStreamable());
      System.out.println(result.getTagList());
      System.out.println(result.getTrackCount());
      System.out.println(result.getTracks());
      System.out.println(result.getType());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getUserId());
      System.out.println(result.getLikesCount());
      System.out.println(result.getLabel());
      System.out.println(result.getTracksUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#updatePlaylistById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Playlist> response = client
              .playlists
              .updatePlaylistById(playlistId)
              .playlist(playlist)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#updatePlaylistById");
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
| **playlistId** | **Integer**| SoundCloud playlist id | |
| **createUpdatePlaylistRequest** | [**CreateUpdatePlaylistRequest**](CreateUpdatePlaylistRequest.md)| Playlist payload | [optional] |

### Return type

[**Playlist**](Playlist.md)

### Authorization

[AuthHeader](../README.md#AuthHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

