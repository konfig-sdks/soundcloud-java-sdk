# OauthApi

All URIs are relative to *https://api.soundcloud.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authorizeUser**](OauthApi.md#authorizeUser) | **GET** /connect | The OAuth2 authorization endpoint. Your app redirects a user to this endpoint, allowing them to delegate access to their account. |
| [**provisionAccessToken**](OauthApi.md#provisionAccessToken) | **POST** /oauth2/token | This endpoint accepts POST requests and is used to provision access tokens once a user has authorized your application. |


<a name="authorizeUser"></a>
# **authorizeUser**
> authorizeUser(clientId, redirectUri, responseType).state(state).execute();

The OAuth2 authorization endpoint. Your app redirects a user to this endpoint, allowing them to delegate access to their account.

&lt;h3&gt;Security Advice&lt;/h3&gt; * [OAuth Authorization Code flow](https://datatracker.ietf.org/doc/html/draft-ietf-oauth-security-topics-16#section-2.1.1) (&#x60;response_type&#x3D;code&#x60;) is the only allowed method of authorization. * Use the &#x60;state&#x60; parameter for [CSRF protection](https://tools.ietf.org/html/draft-ietf-oauth-security-topics-16#section-4.7). Pass a sufficient  random nonce here and verify this nonce again after retrieving the token. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OauthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    SoundCloud client = new SoundCloud(configuration);
    String clientId = "some client"; // The client id belonging to your application
    String redirectUri = "https://soundcloud.com"; // The redirect uri you have configured for your application
    String responseType = "code"; // Support only the Authorization Code Flow
    String state = "encrypted_session_info"; // Any value included here will be appended to the redirect URI. Use this for CSRF protection.
    try {
      client
              .oauth
              .authorizeUser(clientId, redirectUri, responseType)
              .state(state)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#authorizeUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .oauth
              .authorizeUser(clientId, redirectUri, responseType)
              .state(state)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#authorizeUser");
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
| **clientId** | **String**| The client id belonging to your application | |
| **redirectUri** | **String**| The redirect uri you have configured for your application | |
| **responseType** | **String**| Support only the Authorization Code Flow | [enum: code] |
| **state** | **String**| Any value included here will be appended to the redirect URI. Use this for CSRF protection. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **302** | Redirect to connect portal |  * Location - Redirect to connect poral \&quot;https://secure.soundcloud.com/connect\&quot; <br>  |

<a name="provisionAccessToken"></a>
# **provisionAccessToken**
> provisionAccessToken(grantType, clientId, clientSecret, oauthToken).code(code).redirectUri(redirectUri).refreshToken(refreshToken).execute();

This endpoint accepts POST requests and is used to provision access tokens once a user has authorized your application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OauthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.soundcloud.com";
    SoundCloud client = new SoundCloud(configuration);
    String grantType = "authorization_code"; // One of `authorization_code`, `client_credentials`, `refresh_token`
    String clientId = "clientId_example"; // Client ID
    String clientSecret = "clientSecret_example"; // Client secret
    String code = "code_example"; // Authorization code. Required on `grant_type = authorization_code`.
    String redirectUri = "redirectUri_example"; // Redirect URI. Required on `grant_type = (authorization_code|refresh_token)`.
    String refreshToken = "refreshToken_example"; // Refresh token. Required on `grant_type = refresh_token`.
    try {
      client
              .oauth
              .provisionAccessToken(grantType, clientId, clientSecret)
              .code(code)
              .redirectUri(redirectUri)
              .refreshToken(refreshToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#provisionAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .oauth
              .provisionAccessToken(grantType, clientId, clientSecret)
              .code(code)
              .redirectUri(redirectUri)
              .refreshToken(refreshToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#provisionAccessToken");
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
| **grantType** | **String**| One of &#x60;authorization_code&#x60;, &#x60;client_credentials&#x60;, &#x60;refresh_token&#x60; | [enum: authorization_code, refresh_token, client_credentials] |
| **clientId** | **String**| Client ID | |
| **clientSecret** | **String**| Client secret | |
| **oauthToken** | [**OAuthToken**](OAuthToken.md)|  | |
| **code** | **String**| Authorization code. Required on &#x60;grant_type &#x3D; authorization_code&#x60;. | [optional] |
| **redirectUri** | **String**| Redirect URI. Required on &#x60;grant_type &#x3D; (authorization_code|refresh_token)&#x60;. | [optional] |
| **refreshToken** | **String**| Refresh token. Required on &#x60;grant_type &#x3D; refresh_token&#x60;. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

