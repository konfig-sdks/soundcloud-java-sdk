

# TracksUploadNewTrackRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**trackTitle** | **String** |  |  |
|**trackAssetData** | **File** |  |  |
|**trackPermalink** | **String** |  |  [optional] |
|**trackSharing** | [**TrackSharingEnum**](#TrackSharingEnum) |  |  [optional] |
|**trackEmbeddableBy** | [**TrackEmbeddableByEnum**](#TrackEmbeddableByEnum) | who can embed this track \&quot;all\&quot;, \&quot;me\&quot;, or \&quot;none\&quot; |  [optional] |
|**trackPurchaseUrl** | **String** |  |  [optional] |
|**trackDescription** | **String** |  |  [optional] |
|**trackGenre** | **String** |  |  [optional] |
|**trackTagList** | **String** | The tag_list property contains a list of tags separated by spaces. Multiword tags are quoted in double quotes. We also support machine tags that follow the pattern NAMESPACE:KEY&#x3D;VALUE. For example: geo:lat&#x3D;43.555 camel:size&#x3D;medium “machine:tag&#x3D;with space” Machine tags are not revealed to the user on the track pages. |  [optional] |
|**trackLabelName** | **String** |  |  [optional] |
|**trackRelease** | **String** |  |  [optional] |
|**trackReleaseDate** | **String** | string, formatted as yyyy-mm-dd, representing release date |  [optional] |
|**trackStreamable** | **Boolean** |  |  [optional] |
|**trackDownloadable** | **Boolean** |  |  [optional] |
|**trackLicense** | [**TrackLicenseEnum**](#TrackLicenseEnum) | Possible values: no-rights-reserved, all-rights-reserved, cc-by, cc-by-nc, cc-by-nd, cc-by-sa, cc-by-nc-nd, cc-by-nc-sa |  [optional] |
|**trackCommentable** | **Boolean** |  |  [optional] |
|**trackIsrc** | **String** |  |  [optional] |
|**trackArtworkData** | **File** |  |  [optional] |



## Enum: TrackSharingEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;public&quot; |
| PRIVATE | &quot;private&quot; |



## Enum: TrackEmbeddableByEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| ME | &quot;me&quot; |
| NONE | &quot;none&quot; |



## Enum: TrackLicenseEnum

| Name | Value |
|---- | -----|
| NO_RIGHTS_RESERVED | &quot;no-rights-reserved&quot; |
| ALL_RIGHTS_RESERVED | &quot;all-rights-reserved&quot; |
| CC_BY | &quot;cc-by&quot; |
| CC_BY_NC | &quot;cc-by-nc&quot; |
| CC_BY_ND | &quot;cc-by-nd&quot; |
| CC_BY_SA | &quot;cc-by-sa&quot; |
| CC_BY_NC_ND | &quot;cc-by-nc-nd&quot; |
| CC_BY_NC_SA | &quot;cc-by-nc-sa&quot; |



