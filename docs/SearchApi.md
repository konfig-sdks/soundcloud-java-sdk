# SearchApi

All URIs are relative to *https://api.soundcloud.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**byQuery**](SearchApi.md#byQuery) | **GET** /tracks | Performs a track search based on a query |
| [**byQuery_0**](SearchApi.md#byQuery_0) | **GET** /playlists | Performs a playlist search based on a query |
| [**userQuery**](SearchApi.md#userQuery) | **GET** /users | Performs a user search based on a query |


<a name="byQuery"></a>
# **byQuery**
> Object byQuery().q(q).ids(ids).genres(genres).tags(tags).bpm(bpm).duration(duration).createdAt(createdAt).access(access).limit(limit).offset(offset).linkedPartitioning(linkedPartitioning).execute();

Performs a track search based on a query

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SearchApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    String q = "hello"; // search
    String ids = "1,2,3"; // A comma separated list of track ids to filter on
    String genres = "Pop,House"; // A comma separated list of genres
    String tags = "test"; // A comma separated list of tags
    SearchByQueryBpmParameter bpm = new HashMap(); // Return tracks with a specified bpm[from], bpm[to]
    SearchByQueryDurationParameter duration = new HashMap(); // Return tracks within a specified duration range
    SearchByQueryCreatedAtParameter createdAt = new HashMap(); // (yyyy-mm-dd hh:mm:ss) return tracks created within the specified dates
    List<String> access = Arrays.asList(); // Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you'd like to see all possible tracks. See `Track#access` schema for more details. 
    Integer limit = 50; // Number of results to return in the collection.
    Integer offset = 0; // Offset of first result. Deprecated, use `linked_partitioning` instead.
    Boolean linkedPartitioning = true; // Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used)
    try {
      Object result = client
              .search
              .byQuery()
              .q(q)
              .ids(ids)
              .genres(genres)
              .tags(tags)
              .bpm(bpm)
              .duration(duration)
              .createdAt(createdAt)
              .access(access)
              .limit(limit)
              .offset(offset)
              .linkedPartitioning(linkedPartitioning)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#byQuery");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .search
              .byQuery()
              .q(q)
              .ids(ids)
              .genres(genres)
              .tags(tags)
              .bpm(bpm)
              .duration(duration)
              .createdAt(createdAt)
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
      System.err.println("Exception when calling SearchApi#byQuery");
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
| **q** | **String**| search | [optional] |
| **ids** | **String**| A comma separated list of track ids to filter on | [optional] |
| **genres** | **String**| A comma separated list of genres | [optional] |
| **tags** | **String**| A comma separated list of tags | [optional] |
| **bpm** | [**SearchByQueryBpmParameter**](.md)| Return tracks with a specified bpm[from], bpm[to] | [optional] |
| **duration** | [**SearchByQueryDurationParameter**](.md)| Return tracks within a specified duration range | [optional] |
| **createdAt** | [**SearchByQueryCreatedAtParameter**](.md)| (yyyy-mm-dd hh:mm:ss) return tracks created within the specified dates | [optional] |
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
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **500** | Internal Server Error |  -  |

<a name="byQuery_0"></a>
# **byQuery_0**
> Object byQuery_0().q(q).access(access).showTracks(showTracks).limit(limit).offset(offset).linkedPartitioning(linkedPartitioning).execute();

Performs a playlist search based on a query

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SearchApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    String q = "hello"; // search
    List<String> access = Arrays.asList(); // Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you'd like to see all possible tracks. See `Track#access` schema for more details. 
    Boolean showTracks = true; // A boolean flag to request a playlist with or without tracks. Default is `true`.
    Integer limit = 50; // Number of results to return in the collection.
    Integer offset = 0; // Offset of first result. Deprecated, use `linked_partitioning` instead.
    Boolean linkedPartitioning = true; // Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used)
    try {
      Object result = client
              .search
              .byQuery_0()
              .q(q)
              .access(access)
              .showTracks(showTracks)
              .limit(limit)
              .offset(offset)
              .linkedPartitioning(linkedPartitioning)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#byQuery_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .search
              .byQuery_0()
              .q(q)
              .access(access)
              .showTracks(showTracks)
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
      System.err.println("Exception when calling SearchApi#byQuery_0");
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
| **q** | **String**| search | [optional] |
| **access** | [**List&lt;String&gt;**](String.md)| Filters content by level of access the user (logged in or anonymous) has to the track. The result list will include only tracks with the specified access. Include all options if you&#39;d like to see all possible tracks. See &#x60;Track#access&#x60; schema for more details.  | [optional] [enum: playable, preview, blocked] |
| **showTracks** | **Boolean**| A boolean flag to request a playlist with or without tracks. Default is &#x60;true&#x60;. | [optional] |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |
| **offset** | **Integer**| Offset of first result. Deprecated, use &#x60;linked_partitioning&#x60; instead. | [optional] [default to 0] |
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

<a name="userQuery"></a>
# **userQuery**
> Users userQuery().q(q).ids(ids).limit(limit).offset(offset).linkedPartitioning(linkedPartitioning).execute();

Performs a user search based on a query

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SearchApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    String q = "hello"; // search
    String ids = "1,2,3"; // A comma separated list of track ids to filter on
    Integer limit = 50; // Number of results to return in the collection.
    Integer offset = 0; // Offset of first result. Deprecated, use `linked_partitioning` instead.
    Boolean linkedPartitioning = true; // Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used)
    try {
      Users result = client
              .search
              .userQuery()
              .q(q)
              .ids(ids)
              .limit(limit)
              .offset(offset)
              .linkedPartitioning(linkedPartitioning)
              .execute();
      System.out.println(result);
      System.out.println(result.getCollection());
      System.out.println(result.getNextHref());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#userQuery");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Users> response = client
              .search
              .userQuery()
              .q(q)
              .ids(ids)
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
      System.err.println("Exception when calling SearchApi#userQuery");
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
| **q** | **String**| search | [optional] |
| **ids** | **String**| A comma separated list of track ids to filter on | [optional] |
| **limit** | **Integer**| Number of results to return in the collection. | [optional] [default to 50] |
| **offset** | **Integer**| Offset of first result. Deprecated, use &#x60;linked_partitioning&#x60; instead. | [optional] [default to 0] |
| **linkedPartitioning** | **Boolean**| Returns paginated collection of items (recommended, returning a list without pagination is deprecated and should not be used) | [optional] |

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

