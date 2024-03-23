

# Track

Soundcloud Track object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Track title. |  [optional] |
|**description** | **String** | Track description. |  [optional] |
|**artworkUrl** | **String** | URL to a JPEG image. |  [optional] |
|**bpm** | **Integer** | Tempo. |  [optional] |
|**commentCount** | **Integer** | Number of comments. |  [optional] |
|**commentable** | **Boolean** | Is commentable. |  [optional] |
|**createdAt** | **String** | Created timestamp. |  [optional] |
|**downloadCount** | **Integer** | NUmber of downloads. |  [optional] |
|**downloadable** | **Object** |  |  [optional] |
|**duration** | **Integer** | Track duration. |  [optional] |
|**embeddableBy** | **String** | Embeddable by. |  [optional] |
|**favoritingsCount** | **Integer** | Number of favoritings. |  [optional] |
|**genre** | **String** | Genre |  [optional] |
|**id** | **Integer** | Track identifier. |  [optional] |
|**isrc** | **String** | ISRC code. |  [optional] |
|**keySignature** | **String** | Key signature. |  [optional] |
|**kind** | **String** | Type of object (track). |  [optional] |
|**labelName** | **String** | Label user name. |  [optional] |
|**license** | **String** | License |  [optional] |
|**permalinkUrl** | **String** | Permalink URL. |  [optional] |
|**playbackCount** | **Integer** | Number of plays. |  [optional] |
|**purchaseTitle** | **String** | Purchase title. |  [optional] |
|**purchaseUrl** | **String** | Purchase URL. |  [optional] |
|**release** | **String** | Release. |  [optional] |
|**releaseDay** | **Integer** | Day of release. |  [optional] |
|**releaseMonth** | **Integer** | Month of release. |  [optional] |
|**releaseYear** | **Integer** | Year of release. |  [optional] |
|**sharing** | **String** | Type of sharing (public/private). |  [optional] |
|**streamUrl** | **String** | URL to stream. |  [optional] |
|**streamable** | **Boolean** | Is streamable. |  [optional] |
|**tagList** | **String** | Tags. |  [optional] |
|**uri** | **String** | Track URI. |  [optional] |
|**user** | **Object** |  |  [optional] |
|**userFavorite** | **Boolean** | Is user&#39;s favourite. |  [optional] |
|**userPlaybackCount** | **Integer** | Number of plays by a user. |  [optional] |
|**waveformUrl** | **String** | Waveform URL. |  [optional] |
|**availableCountryCodes** | **String** | List of countries where track is available. |  [optional] |
|**access** | [**AccessEnum**](#AccessEnum) | Level of access the user (logged in or anonymous) has to the track.   * &#x60;playable&#x60; - user is allowed to listen to a full track.   * &#x60;preview&#x60; - user is allowed to preview a track, meaning a snippet is available   * &#x60;blocked&#x60; - user can only see the metadata of a track, no streaming is possible  |  [optional] |
|**downloadUrl** | **String** | URL to download a track. |  [optional] |
|**repostsCount** | **Integer** | Number of reposts. |  [optional] |
|**secretUri** | **String** | Secret URL. |  [optional] |
|**tags** | **String** | Tags. |  [optional] |
|**ean** | **String** | European Article Number. |  [optional] |
|**labelId** | **Integer** | Label user identifier. |  [optional] |
|**lastModified** | **String** | Last modified timestamp. |  [optional] |
|**permalink** | **String** | Playlist permalink. |  [optional] |
|**playlistType** | **String** | Type of playlist. |  [optional] |
|**trackCount** | **Integer** | Count of tracks. |  [optional] |
|**tracks** | [**List&lt;Track&gt;**](Track.md) | List of tracks. |  [optional] |
|**type** | **String** | Playlist type. |  [optional] |
|**userId** | **Integer** | User identifier. |  [optional] |
|**likesCount** | **Integer** | Count of playlist likes. |  [optional] |
|**label** | [**TrackLabel**](TrackLabel.md) |  |  [optional] |
|**tracksUri** | **String** | tracks URI. |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| PLAYABLE | &quot;playable&quot; |
| PREVIEW | &quot;preview&quot; |
| BLOCKED | &quot;blocked&quot; |



