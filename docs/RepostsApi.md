# RepostsApi

All URIs are relative to *https://api.soundcloud.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**playlistAsAuthenticatedUser**](RepostsApi.md#playlistAsAuthenticatedUser) | **POST** /reposts/playlists/{playlist_id} | Reposts a playlist as the authenticated user |
| [**removeRepost**](RepostsApi.md#removeRepost) | **DELETE** /reposts/tracks/{track_id} | Removes a repost on a track as the authenticated user |
| [**removeRepostOnPlaylist**](RepostsApi.md#removeRepostOnPlaylist) | **DELETE** /reposts/playlists/{playlist_id} | Removes a repost on a playlist as the authenticated user |
| [**trackAsAuthenticatedUser**](RepostsApi.md#trackAsAuthenticatedUser) | **POST** /reposts/tracks/{track_id} | Reposts a track as the authenticated user |


<a name="playlistAsAuthenticatedUser"></a>
# **playlistAsAuthenticatedUser**
> playlistAsAuthenticatedUser(playlistId).execute();

Reposts a playlist as the authenticated user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RepostsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer playlistId = 1205584273; // SoundCloud playlist id
    try {
      client
              .reposts
              .playlistAsAuthenticatedUser(playlistId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RepostsApi#playlistAsAuthenticatedUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .reposts
              .playlistAsAuthenticatedUser(playlistId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RepostsApi#playlistAsAuthenticatedUser");
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
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="removeRepost"></a>
# **removeRepost**
> removeRepost(trackId).execute();

Removes a repost on a track as the authenticated user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RepostsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer trackId = 1015448728; // SoundCloud Track id
    try {
      client
              .reposts
              .removeRepost(trackId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RepostsApi#removeRepost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .reposts
              .removeRepost(trackId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RepostsApi#removeRepost");
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
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeRepostOnPlaylist"></a>
# **removeRepostOnPlaylist**
> removeRepostOnPlaylist(playlistId).execute();

Removes a repost on a playlist as the authenticated user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RepostsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer playlistId = 1205584273; // SoundCloud playlist id
    try {
      client
              .reposts
              .removeRepostOnPlaylist(playlistId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RepostsApi#removeRepostOnPlaylist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .reposts
              .removeRepostOnPlaylist(playlistId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RepostsApi#removeRepostOnPlaylist");
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
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="trackAsAuthenticatedUser"></a>
# **trackAsAuthenticatedUser**
> trackAsAuthenticatedUser(trackId).execute();

Reposts a track as the authenticated user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RepostsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    Integer trackId = 1015448728; // SoundCloud Track id
    try {
      client
              .reposts
              .trackAsAuthenticatedUser(trackId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RepostsApi#trackAsAuthenticatedUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .reposts
              .trackAsAuthenticatedUser(trackId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RepostsApi#trackAsAuthenticatedUser");
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
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

