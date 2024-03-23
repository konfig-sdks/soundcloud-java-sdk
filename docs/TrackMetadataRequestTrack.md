

# TrackMetadataRequestTrack


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**permalink** | **String** |  |  [optional] |
|**sharing** | [**SharingEnum**](#SharingEnum) |  |  [optional] |
|**embeddableBy** | [**EmbeddableByEnum**](#EmbeddableByEnum) | who can embed this track \&quot;all\&quot;, \&quot;me\&quot;, or \&quot;none\&quot; |  [optional] |
|**purchaseUrl** | **String** |  |  [optional] |
|**genre** | **String** |  |  [optional] |
|**tagList** | **String** | The tag_list property contains a list of tags separated by spaces. Multiword tags are quoted in double quotes. We also support machine tags that follow the pattern NAMESPACE:KEY&#x3D;VALUE. For example: geo:lat&#x3D;43.555 camel:size&#x3D;medium “machine:tag&#x3D;with space” Machine tags are not revealed to the user on the track pages. |  [optional] |
|**labelName** | **String** |  |  [optional] |
|**release** | **String** |  |  [optional] |
|**releaseDate** | **String** | string, formatted as yyyy-mm-dd, representing release date |  [optional] |
|**streamable** | **Boolean** |  |  [optional] |
|**downloadable** | **Boolean** |  |  [optional] |
|**license** | [**LicenseEnum**](#LicenseEnum) | Possible values: no-rights-reserved, all-rights-reserved, cc-by, cc-by-nc, cc-by-nd, cc-by-sa, cc-by-nc-nd, cc-by-nc-sa |  [optional] |
|**commentable** | **Boolean** |  |  [optional] |
|**isrc** | **String** |  |  [optional] |



## Enum: SharingEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;public&quot; |
| PRIVATE | &quot;private&quot; |



## Enum: EmbeddableByEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| ME | &quot;me&quot; |
| NONE | &quot;none&quot; |



## Enum: LicenseEnum

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



