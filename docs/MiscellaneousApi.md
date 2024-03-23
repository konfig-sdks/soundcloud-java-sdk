# MiscellaneousApi

All URIs are relative to *https://api.soundcloud.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resolveSoundcloudUrls**](MiscellaneousApi.md#resolveSoundcloudUrls) | **GET** /resolve | Resolves soundcloud.com and on.soundcloud.com URLs to Resource URLs to use with the API. |


<a name="resolveSoundcloudUrls"></a>
# **resolveSoundcloudUrls**
> resolveSoundcloudUrls(url).execute();

Resolves soundcloud.com and on.soundcloud.com URLs to Resource URLs to use with the API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MiscellaneousApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    
    configuration.authHeader  = "YOUR API KEY";
    SoundCloud client = new SoundCloud(configuration);
    String url = "https://soundcloud.com/user-434241656"; // SoundCloud URL
    try {
      client
              .miscellaneous
              .resolveSoundcloudUrls(url)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#resolveSoundcloudUrls");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .miscellaneous
              .resolveSoundcloudUrls(url)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#resolveSoundcloudUrls");
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
| **url** | **String**| SoundCloud URL | |

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
| **200** | OK |  -  |

