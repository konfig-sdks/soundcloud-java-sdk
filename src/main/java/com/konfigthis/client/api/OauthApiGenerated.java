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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.OAuthToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OauthApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OauthApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public OauthApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call authorizeUserCall(String clientId, String redirectUri, String responseType, String state, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/connect";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (clientId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("client_id", clientId));
        }

        if (redirectUri != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("redirect_uri", redirectUri));
        }

        if (responseType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("response_type", responseType));
        }

        if (state != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("state", state));
        }

        final String[] localVarAccepts = {
            "application/json; charset=utf-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call authorizeUserValidateBeforeCall(String clientId, String redirectUri, String responseType, String state, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling authorizeUser(Async)");
        }

        // verify the required parameter 'redirectUri' is set
        if (redirectUri == null) {
            throw new ApiException("Missing the required parameter 'redirectUri' when calling authorizeUser(Async)");
        }

        // verify the required parameter 'responseType' is set
        if (responseType == null) {
            throw new ApiException("Missing the required parameter 'responseType' when calling authorizeUser(Async)");
        }

        return authorizeUserCall(clientId, redirectUri, responseType, state, _callback);

    }


    private ApiResponse<Void> authorizeUserWithHttpInfo(String clientId, String redirectUri, String responseType, String state) throws ApiException {
        okhttp3.Call localVarCall = authorizeUserValidateBeforeCall(clientId, redirectUri, responseType, state, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call authorizeUserAsync(String clientId, String redirectUri, String responseType, String state, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = authorizeUserValidateBeforeCall(clientId, redirectUri, responseType, state, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class AuthorizeUserRequestBuilder {
        private final String clientId;
        private final String redirectUri;
        private final String responseType;
        private String state;

        private AuthorizeUserRequestBuilder(String clientId, String redirectUri, String responseType) {
            this.clientId = clientId;
            this.redirectUri = redirectUri;
            this.responseType = responseType;
        }

        /**
         * Set state
         * @param state Any value included here will be appended to the redirect URI. Use this for CSRF protection. (optional)
         * @return AuthorizeUserRequestBuilder
         */
        public AuthorizeUserRequestBuilder state(String state) {
            this.state = state;
            return this;
        }
        
        /**
         * Build call for authorizeUser
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 302 </td><td> Redirect to connect portal </td><td>  * Location - Redirect to connect poral \&quot;https://secure.soundcloud.com/connect\&quot; <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return authorizeUserCall(clientId, redirectUri, responseType, state, _callback);
        }


        /**
         * Execute authorizeUser request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 302 </td><td> Redirect to connect portal </td><td>  * Location - Redirect to connect poral \&quot;https://secure.soundcloud.com/connect\&quot; <br>  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            authorizeUserWithHttpInfo(clientId, redirectUri, responseType, state);
        }

        /**
         * Execute authorizeUser request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 302 </td><td> Redirect to connect portal </td><td>  * Location - Redirect to connect poral \&quot;https://secure.soundcloud.com/connect\&quot; <br>  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return authorizeUserWithHttpInfo(clientId, redirectUri, responseType, state);
        }

        /**
         * Execute authorizeUser request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 302 </td><td> Redirect to connect portal </td><td>  * Location - Redirect to connect poral \&quot;https://secure.soundcloud.com/connect\&quot; <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return authorizeUserAsync(clientId, redirectUri, responseType, state, _callback);
        }
    }

    /**
     * The OAuth2 authorization endpoint. Your app redirects a user to this endpoint, allowing them to delegate access to their account.
     * &lt;h3&gt;Security Advice&lt;/h3&gt; * [OAuth Authorization Code flow](https://datatracker.ietf.org/doc/html/draft-ietf-oauth-security-topics-16#section-2.1.1) (&#x60;response_type&#x3D;code&#x60;) is the only allowed method of authorization. * Use the &#x60;state&#x60; parameter for [CSRF protection](https://tools.ietf.org/html/draft-ietf-oauth-security-topics-16#section-4.7). Pass a sufficient  random nonce here and verify this nonce again after retrieving the token. 
     * @param clientId The client id belonging to your application (required)
     * @param redirectUri The redirect uri you have configured for your application (required)
     * @param responseType Support only the Authorization Code Flow (required)
     * @return AuthorizeUserRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 302 </td><td> Redirect to connect portal </td><td>  * Location - Redirect to connect poral \&quot;https://secure.soundcloud.com/connect\&quot; <br>  </td></tr>
     </table>
     */
    public AuthorizeUserRequestBuilder authorizeUser(String clientId, String redirectUri, String responseType) throws IllegalArgumentException {
        if (clientId == null) throw new IllegalArgumentException("\"clientId\" is required but got null");
            

        if (redirectUri == null) throw new IllegalArgumentException("\"redirectUri\" is required but got null");
            

        if (responseType == null) throw new IllegalArgumentException("\"responseType\" is required but got null");
            

        return new AuthorizeUserRequestBuilder(clientId, redirectUri, responseType);
    }
    private okhttp3.Call provisionAccessTokenCall(String grantType, String clientId, String clientSecret, OAuthToken oauthToken, String code, String redirectUri, String refreshToken, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = oauthToken;

        // create path and map variables
        String localVarPath = "/oauth2/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (grantType != null) {
            localVarFormParams.put("grant_type", grantType);
        }

        if (clientId != null) {
            localVarFormParams.put("client_id", clientId);
        }

        if (clientSecret != null) {
            localVarFormParams.put("client_secret", clientSecret);
        }

        if (code != null) {
            localVarFormParams.put("code", code);
        }

        if (redirectUri != null) {
            localVarFormParams.put("redirect_uri", redirectUri);
        }

        if (refreshToken != null) {
            localVarFormParams.put("refresh_token", refreshToken);
        }

        final String[] localVarAccepts = {
            "application/json; charset=utf-8",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded",
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call provisionAccessTokenValidateBeforeCall(String grantType, String clientId, String clientSecret, OAuthToken oauthToken, String code, String redirectUri, String refreshToken, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new ApiException("Missing the required parameter 'grantType' when calling provisionAccessToken(Async)");
        }

        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling provisionAccessToken(Async)");
        }

        // verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new ApiException("Missing the required parameter 'clientSecret' when calling provisionAccessToken(Async)");
        }

        // verify the required parameter 'oauthToken' is set
        if (oauthToken == null) {
            throw new ApiException("Missing the required parameter 'oauthToken' when calling provisionAccessToken(Async)");
        }

        return provisionAccessTokenCall(grantType, clientId, clientSecret, oauthToken, code, redirectUri, refreshToken, _callback);

    }


    private ApiResponse<Void> provisionAccessTokenWithHttpInfo(String grantType, String clientId, String clientSecret, OAuthToken oauthToken, String code, String redirectUri, String refreshToken) throws ApiException {
        okhttp3.Call localVarCall = provisionAccessTokenValidateBeforeCall(grantType, clientId, clientSecret, oauthToken, code, redirectUri, refreshToken, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call provisionAccessTokenAsync(String grantType, String clientId, String clientSecret, OAuthToken oauthToken, String code, String redirectUri, String refreshToken, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = provisionAccessTokenValidateBeforeCall(grantType, clientId, clientSecret, oauthToken, code, redirectUri, refreshToken, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class ProvisionAccessTokenRequestBuilder {
        private final String grantType;
        private final String clientId;
        private final String clientSecret;
        private String code;
        private String redirectUri;
        private String refreshToken;

        private ProvisionAccessTokenRequestBuilder(String grantType, String clientId, String clientSecret) {
            this.grantType = grantType;
            this.clientId = clientId;
            this.clientSecret = clientSecret;
        }

        /**
         * Set code
         * @param code Authorization code. Required on &#x60;grant_type &#x3D; authorization_code&#x60;. (optional)
         * @return ProvisionAccessTokenRequestBuilder
         */
        public ProvisionAccessTokenRequestBuilder code(String code) {
            this.code = code;
            return this;
        }
        
        /**
         * Set redirectUri
         * @param redirectUri Redirect URI. Required on &#x60;grant_type &#x3D; (authorization_code|refresh_token)&#x60;. (optional)
         * @return ProvisionAccessTokenRequestBuilder
         */
        public ProvisionAccessTokenRequestBuilder redirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        
        /**
         * Set refreshToken
         * @param refreshToken Refresh token. Required on &#x60;grant_type &#x3D; refresh_token&#x60;. (optional)
         * @return ProvisionAccessTokenRequestBuilder
         */
        public ProvisionAccessTokenRequestBuilder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        
        /**
         * Build call for provisionAccessToken
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            OAuthToken oauthToken = buildBodyParams();
            return provisionAccessTokenCall(grantType, clientId, clientSecret, oauthToken, code, redirectUri, refreshToken, _callback);
        }

        private OAuthToken buildBodyParams() {
            OAuthToken oauthToken = new OAuthToken();
            if (this.grantType != null)
            oauthToken.grantType(OAuthToken.GrantTypeEnum.fromValue(this.grantType));
            oauthToken.clientId(this.clientId);
            oauthToken.clientSecret(this.clientSecret);
            oauthToken.code(this.code);
            oauthToken.redirectUri(this.redirectUri);
            oauthToken.refreshToken(this.refreshToken);
            return oauthToken;
        }

        /**
         * Execute provisionAccessToken request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            OAuthToken oauthToken = buildBodyParams();
            provisionAccessTokenWithHttpInfo(grantType, clientId, clientSecret, oauthToken, code, redirectUri, refreshToken);
        }

        /**
         * Execute provisionAccessToken request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            OAuthToken oauthToken = buildBodyParams();
            return provisionAccessTokenWithHttpInfo(grantType, clientId, clientSecret, oauthToken, code, redirectUri, refreshToken);
        }

        /**
         * Execute provisionAccessToken request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            OAuthToken oauthToken = buildBodyParams();
            return provisionAccessTokenAsync(grantType, clientId, clientSecret, oauthToken, code, redirectUri, refreshToken, _callback);
        }
    }

    /**
     * This endpoint accepts POST requests and is used to provision access tokens once a user has authorized your application.
     * 
     * @param grantType One of &#x60;authorization_code&#x60;, &#x60;client_credentials&#x60;, &#x60;refresh_token&#x60; (required)
     * @param clientId Client ID (required)
     * @param clientSecret Client secret (required)
     * @param oauthToken  (required)
     * @return ProvisionAccessTokenRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ProvisionAccessTokenRequestBuilder provisionAccessToken(String grantType, String clientId, String clientSecret) throws IllegalArgumentException {
        if (grantType == null) throw new IllegalArgumentException("\"grantType\" is required but got null");
            

        if (clientId == null) throw new IllegalArgumentException("\"clientId\" is required but got null");
            

        if (clientSecret == null) throw new IllegalArgumentException("\"clientSecret\" is required but got null");
            

        return new ProvisionAccessTokenRequestBuilder(grantType, clientId, clientSecret);
    }
}
