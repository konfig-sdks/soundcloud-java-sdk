

# OAuthToken


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**grantType** | [**GrantTypeEnum**](#GrantTypeEnum) | One of &#x60;authorization_code&#x60;, &#x60;client_credentials&#x60;, &#x60;refresh_token&#x60; |  |
|**clientId** | **String** | Client ID |  |
|**clientSecret** | **String** | Client secret |  |
|**code** | **String** | Authorization code. Required on &#x60;grant_type &#x3D; authorization_code&#x60;. |  [optional] |
|**redirectUri** | **String** | Redirect URI. Required on &#x60;grant_type &#x3D; (authorization_code|refresh_token)&#x60;. |  [optional] |
|**refreshToken** | **String** | Refresh token. Required on &#x60;grant_type &#x3D; refresh_token&#x60;. |  [optional] |



## Enum: GrantTypeEnum

| Name | Value |
|---- | -----|
| AUTHORIZATION_CODE | &quot;authorization_code&quot; |
| REFRESH_TOKEN | &quot;refresh_token&quot; |
| CLIENT_CREDENTIALS | &quot;client_credentials&quot; |



