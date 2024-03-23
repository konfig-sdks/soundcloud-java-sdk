

# CreateUpdatePlaylistRequestPlaylist


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Title of the playlist |  [optional] |
|**description** | **String** | Description of the playlist |  [optional] |
|**sharing** | [**SharingEnum**](#SharingEnum) | public or private |  [optional] |
|**tracks** | [**List&lt;CreateUpdatePlaylistRequestPlaylistTracksInner&gt;**](CreateUpdatePlaylistRequestPlaylistTracksInner.md) | List of tracks to add to playlist |  [optional] |
|**artworkData** | **File** |  |  [optional] |
|**ean** | **String** | The European Article Number |  [optional] |
|**genre** | **String** | Playlist&#39;s genre |  [optional] |
|**labelName** | **String** | Label name |  [optional] |
|**license** | **String** | License number |  [optional] |
|**permalink** | **String** | Playlist&#39;s permalink |  [optional] |
|**permalinkUrl** | **String** | Full permalink URL |  [optional] |
|**purchaseTitle** | **String** | Purchase title |  [optional] |
|**purchaseUrl** | **String** | Purchase URL |  [optional] |
|**release** | **String** | Playlist&#39;s release |  [optional] |
|**releaseDate** | **String** | Release date |  [optional] |
|**setType** | [**SetTypeEnum**](#SetTypeEnum) | Playlist or album type |  [optional] |
|**tagList** | **String** | A comma-separated list of tags |  [optional] |



## Enum: SharingEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;public&quot; |
| PRIVATE | &quot;private&quot; |



## Enum: SetTypeEnum

| Name | Value |
|---- | -----|
| ALBUM | &quot;album&quot; |
| PLAYLIST | &quot;playlist&quot; |



