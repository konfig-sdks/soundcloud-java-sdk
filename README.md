<div align="left">

[![Visit Soundcloud](./header.png)](https://developers.soundcloud.com)

# [Soundcloud](https://developers.soundcloud.com)

Discover and play over 320 million music tracks. Join the world’s largest online community of artists, bands, DJs, and audio creators.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=SoundCloud&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>soundcloud-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:soundcloud-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/soundcloud-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SoundCloud;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LikesApi;
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
    try {
      client
              .likes
              .playlist(playlistId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LikesApi#playlist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .likes
              .playlist(playlistId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LikesApi#playlist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.soundcloud.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*LikesApi* | [**playlist**](docs/LikesApi.md#playlist) | **POST** /likes/playlists/{playlist_id} | Likes a playlist.
*LikesApi* | [**trackAction**](docs/LikesApi.md#trackAction) | **POST** /likes/tracks/{track_id} | Likes a track.
*LikesApi* | [**unlikePlaylist**](docs/LikesApi.md#unlikePlaylist) | **DELETE** /likes/playlists/{playlist_id} | Unlikes a playlist.
*LikesApi* | [**unlikeTrack**](docs/LikesApi.md#unlikeTrack) | **DELETE** /likes/tracks/{track_id} | Unlikes a track.
*MeApi* | [**deleteFollowedUser**](docs/MeApi.md#deleteFollowedUser) | **DELETE** /me/followings/{user_id} | Deletes a user who is followed by the authenticated user.
*MeApi* | [**followUser**](docs/MeApi.md#followUser) | **PUT** /me/followings/{user_id} | Follows a user.
*MeApi* | [**getActivities**](docs/MeApi.md#getActivities) | **GET** /me/activities | Returns the authenticated user&#39;s activities.
*MeApi* | [**getFollowedUser**](docs/MeApi.md#getFollowedUser) | **GET** /me/followings/{user_id} | Returns a user who is followed by the authenticated user. (use /users/{user_id} instead, to fetch the user details)
*MeApi* | [**getFollowedUsers**](docs/MeApi.md#getFollowedUsers) | **GET** /me/followings | Returns a list of users who are followed by the authenticated user.
*MeApi* | [**getFollowerById**](docs/MeApi.md#getFollowerById) | **GET** /me/followers/{follower_id} | Returns a user who is following the authenticated user. (use /users/{user_id} instead, to fetch the user details)
*MeApi* | [**getFollowersList**](docs/MeApi.md#getFollowersList) | **GET** /me/followers | Returns a list of users who are following the authenticated user.
*MeApi* | [**getLikedPlaylists**](docs/MeApi.md#getLikedPlaylists) | **GET** /me/likes/playlists | Returns a list of favorited or liked playlists of the authenticated user.
*MeApi* | [**getRecentActivities**](docs/MeApi.md#getRecentActivities) | **GET** /me/activities/all/own | Recent the authenticated user&#39;s activities.
*MeApi* | [**getRecentTracks**](docs/MeApi.md#getRecentTracks) | **GET** /me/activities/tracks | Returns the authenticated user&#39;s recent track related activities.
*MeApi* | [**getUserInformation**](docs/MeApi.md#getUserInformation) | **GET** /me | Returns the authenticated user’s information.
*MeApi* | [**listFollowedTracks**](docs/MeApi.md#listFollowedTracks) | **GET** /me/followings/tracks | Returns a list of recent tracks from users followed by the authenticated user.
*MeApi* | [**listLikedTracks**](docs/MeApi.md#listLikedTracks) | **GET** /me/likes/tracks | Returns a list of favorited or liked tracks of the authenticated user.
*MeApi* | [**listPlaylistsInfoTracksOwner**](docs/MeApi.md#listPlaylistsInfoTracksOwner) | **GET** /me/playlists | Returns user’s playlists (sets).
*MeApi* | [**listUserTracks**](docs/MeApi.md#listUserTracks) | **GET** /me/tracks | Returns a list of user&#39;s tracks.
*MiscellaneousApi* | [**resolveSoundcloudUrls**](docs/MiscellaneousApi.md#resolveSoundcloudUrls) | **GET** /resolve | Resolves soundcloud.com and on.soundcloud.com URLs to Resource URLs to use with the API.
*OauthApi* | [**authorizeUser**](docs/OauthApi.md#authorizeUser) | **GET** /connect | The OAuth2 authorization endpoint. Your app redirects a user to this endpoint, allowing them to delegate access to their account.
*OauthApi* | [**provisionAccessToken**](docs/OauthApi.md#provisionAccessToken) | **POST** /oauth2/token | This endpoint accepts POST requests and is used to provision access tokens once a user has authorized your application.
*PlaylistsApi* | [**createNewPlaylist**](docs/PlaylistsApi.md#createNewPlaylist) | **POST** /playlists | Creates a playlist.
*PlaylistsApi* | [**deletePlaylist**](docs/PlaylistsApi.md#deletePlaylist) | **DELETE** /playlists/{playlist_id} | Deletes a playlist.
*PlaylistsApi* | [**getPlaylistById**](docs/PlaylistsApi.md#getPlaylistById) | **GET** /playlists/{playlist_id} | Returns a playlist.
*PlaylistsApi* | [**getTracks**](docs/PlaylistsApi.md#getTracks) | **GET** /playlists/{playlist_id}/tracks | Returns tracks under a playlist.
*PlaylistsApi* | [**listReposters**](docs/PlaylistsApi.md#listReposters) | **GET** /playlists/{playlist_id}/reposters | Returns a collection of playlist&#39;s reposters.
*PlaylistsApi* | [**updatePlaylistById**](docs/PlaylistsApi.md#updatePlaylistById) | **PUT** /playlists/{playlist_id} | Updates a playlist.
*RepostsApi* | [**playlistAsAuthenticatedUser**](docs/RepostsApi.md#playlistAsAuthenticatedUser) | **POST** /reposts/playlists/{playlist_id} | Reposts a playlist as the authenticated user
*RepostsApi* | [**removeRepost**](docs/RepostsApi.md#removeRepost) | **DELETE** /reposts/tracks/{track_id} | Removes a repost on a track as the authenticated user
*RepostsApi* | [**removeRepostOnPlaylist**](docs/RepostsApi.md#removeRepostOnPlaylist) | **DELETE** /reposts/playlists/{playlist_id} | Removes a repost on a playlist as the authenticated user
*RepostsApi* | [**trackAsAuthenticatedUser**](docs/RepostsApi.md#trackAsAuthenticatedUser) | **POST** /reposts/tracks/{track_id} | Reposts a track as the authenticated user
*SearchApi* | [**byQuery**](docs/SearchApi.md#byQuery) | **GET** /tracks | Performs a track search based on a query
*SearchApi* | [**byQuery_0**](docs/SearchApi.md#byQuery_0) | **GET** /playlists | Performs a playlist search based on a query
*SearchApi* | [**userQuery**](docs/SearchApi.md#userQuery) | **GET** /users | Performs a user search based on a query
*TracksApi* | [**createComment**](docs/TracksApi.md#createComment) | **POST** /tracks/{track_id}/comments | Returns the newly created comment on success
*TracksApi* | [**deleteTrack**](docs/TracksApi.md#deleteTrack) | **DELETE** /tracks/{track_id} | Deletes a track.
*TracksApi* | [**getById**](docs/TracksApi.md#getById) | **GET** /tracks/{track_id} | Returns a track.
*TracksApi* | [**getComments**](docs/TracksApi.md#getComments) | **GET** /tracks/{track_id}/comments | Returns the comments posted on the track(track_id).
*TracksApi* | [**getFavoriters**](docs/TracksApi.md#getFavoriters) | **GET** /tracks/{track_id}/favoriters | Returns a list of users who have favorited or liked the track.
*TracksApi* | [**getRelatedTracks**](docs/TracksApi.md#getRelatedTracks) | **GET** /tracks/{track_id}/related | Returns all related tracks of track on SoundCloud.
*TracksApi* | [**getStreamableUrls**](docs/TracksApi.md#getStreamableUrls) | **GET** /tracks/{track_id}/streams | Returns a track&#39;s streamable URLs
*TracksApi* | [**listReposters**](docs/TracksApi.md#listReposters) | **GET** /tracks/{track_id}/reposters | Returns a collection of track&#39;s reposters.
*TracksApi* | [**updateTrackInformation**](docs/TracksApi.md#updateTrackInformation) | **PUT** /tracks/{track_id} | Updates a track&#39;s information.
*TracksApi* | [**uploadNewTrack**](docs/TracksApi.md#uploadNewTrack) | **POST** /tracks | Uploads a new track.
*UsersApi* | [**getFollowers**](docs/UsersApi.md#getFollowers) | **GET** /users/{user_id}/followers | Returns a list of user’s followers.
*UsersApi* | [**getFollowingById**](docs/UsersApi.md#getFollowingById) | **GET** /users/{user_id}/followings/{following_id} | Returns a user&#39;s following. (use /users/{user_id} instead, to fetch the user details)
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /users/{user_id} | Returns a user.
*UsersApi* | [**getUserFollowings**](docs/UsersApi.md#getUserFollowings) | **GET** /users/{user_id}/followings | Returns a list of user’s followings.
*UsersApi* | [**getUserPlaylists**](docs/UsersApi.md#getUserPlaylists) | **GET** /users/{user_id}/playlists | Returns a list of user&#39;s playlists.
*UsersApi* | [**getUserTracks**](docs/UsersApi.md#getUserTracks) | **GET** /users/{user_id}/tracks | Returns a list of user&#39;s tracks.
*UsersApi* | [**getUserWebProfiles**](docs/UsersApi.md#getUserWebProfiles) | **GET** /users/{user_id}/web-profiles | Returns list of user&#39;s links added to their profile (website, facebook, instagram).
*UsersApi* | [**listFavorites**](docs/UsersApi.md#listFavorites) | **GET** /users/{user_id}/favorites | Returns a list of user&#39;s favorited or liked tracks. (use /users/:userId/likes/tracks instead, to fetch a user&#39;s likes)
*UsersApi* | [**listLikedPlaylists**](docs/UsersApi.md#listLikedPlaylists) | **GET** /users/{user_id}/likes/playlists | Returns a list of user&#39;s liked playlists.
*UsersApi* | [**listLikedTracks**](docs/UsersApi.md#listLikedTracks) | **GET** /users/{user_id}/likes/tracks | Returns a list of user&#39;s liked tracks.


## Documentation for Models

 - [Activities](docs/Activities.md)
 - [ActivitiesCollectionInner](docs/ActivitiesCollectionInner.md)
 - [Comment](docs/Comment.md)
 - [CommentUser](docs/CommentUser.md)
 - [Comments](docs/Comments.md)
 - [CreateUpdatePlaylistFormRequest](docs/CreateUpdatePlaylistFormRequest.md)
 - [CreateUpdatePlaylistRequest](docs/CreateUpdatePlaylistRequest.md)
 - [CreateUpdatePlaylistRequestPlaylist](docs/CreateUpdatePlaylistRequestPlaylist.md)
 - [CreateUpdatePlaylistRequestPlaylistTracksInner](docs/CreateUpdatePlaylistRequestPlaylistTracksInner.md)
 - [Me](docs/Me.md)
 - [MeQuota](docs/MeQuota.md)
 - [OAuthToken](docs/OAuthToken.md)
 - [Playlist](docs/Playlist.md)
 - [Playlists](docs/Playlists.md)
 - [PlaylistsCreateNewPlaylistRequest](docs/PlaylistsCreateNewPlaylistRequest.md)
 - [SearchByQueryBpmParameter](docs/SearchByQueryBpmParameter.md)
 - [SearchByQueryCreatedAtParameter](docs/SearchByQueryCreatedAtParameter.md)
 - [SearchByQueryDurationParameter](docs/SearchByQueryDurationParameter.md)
 - [Streams](docs/Streams.md)
 - [TP](docs/TP.md)
 - [TooManyRequests](docs/TooManyRequests.md)
 - [TooManyRequestsAllOf](docs/TooManyRequestsAllOf.md)
 - [Track](docs/Track.md)
 - [TrackDataRequest](docs/TrackDataRequest.md)
 - [TrackLabel](docs/TrackLabel.md)
 - [TrackMetadataRequest](docs/TrackMetadataRequest.md)
 - [TrackMetadataRequestTrack](docs/TrackMetadataRequestTrack.md)
 - [Tracks](docs/Tracks.md)
 - [TracksCreateCommentRequest](docs/TracksCreateCommentRequest.md)
 - [TracksCreateCommentRequestComment](docs/TracksCreateCommentRequestComment.md)
 - [TracksUploadNewTrackRequest](docs/TracksUploadNewTrackRequest.md)
 - [TracksUploadNewTrackRequest1](docs/TracksUploadNewTrackRequest1.md)
 - [User](docs/User.md)
 - [UserSubscriptionsInner](docs/UserSubscriptionsInner.md)
 - [UserSubscriptionsInnerProduct](docs/UserSubscriptionsInnerProduct.md)
 - [Users](docs/Users.md)
 - [WebProfilesInner](docs/WebProfilesInner.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
