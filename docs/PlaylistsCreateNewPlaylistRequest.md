

# PlaylistsCreateNewPlaylistRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**playlistTitle** | **String** |  |  |
|**playlistSharing** | [**PlaylistSharingEnum**](#PlaylistSharingEnum) |  |  [optional] |
|**playlistDescription** | **String** |  |  [optional] |
|**playlistTracksId** | **String** | To pass multiple tracks, pass multiple comma-separated values, e.g. -F \&quot;playlist[tracks][][id]&#x3D;111,222\&quot; |  [optional] |
|**playlistArtworkData** | **File** |  |  [optional] |
|**playlistEan** | **String** |  |  [optional] |
|**playlistGenre** | **String** |  |  [optional] |
|**playlistLabelName** | **String** |  |  [optional] |
|**playlistLicense** | **String** |  |  [optional] |
|**playlistPermalink** | **String** |  |  [optional] |
|**playlistPermalinkUrl** | **String** |  |  [optional] |
|**playlistPurchaseTitle** | **String** |  |  [optional] |
|**playlistPurchaseUrl** | **String** |  |  [optional] |
|**playlistRelease** | **String** |  |  [optional] |
|**playlistReleaseDate** | **String** |  |  [optional] |
|**playlistSetType** | [**PlaylistSetTypeEnum**](#PlaylistSetTypeEnum) |  |  [optional] |
|**playlistTagList** | **String** |  |  [optional] |



## Enum: PlaylistSharingEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;public&quot; |
| PRIVATE | &quot;private&quot; |



## Enum: PlaylistSetTypeEnum

| Name | Value |
|---- | -----|
| ALBUM | &quot;album&quot; |
| PLAYLIST | &quot;playlist&quot; |



