package com.konfigthis.client;

import com.konfigthis.client.api.LikesApi;
import com.konfigthis.client.api.MeApi;
import com.konfigthis.client.api.MiscellaneousApi;
import com.konfigthis.client.api.OauthApi;
import com.konfigthis.client.api.PlaylistsApi;
import com.konfigthis.client.api.RepostsApi;
import com.konfigthis.client.api.SearchApi;
import com.konfigthis.client.api.TracksApi;
import com.konfigthis.client.api.UsersApi;

public class SoundCloud {
    private ApiClient apiClient;
    public final LikesApi likes;
    public final MeApi me;
    public final MiscellaneousApi miscellaneous;
    public final OauthApi oauth;
    public final PlaylistsApi playlists;
    public final RepostsApi reposts;
    public final SearchApi search;
    public final TracksApi tracks;
    public final UsersApi users;

    public SoundCloud() {
        this(null);
    }

    public SoundCloud(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.likes = new LikesApi(this.apiClient);
        this.me = new MeApi(this.apiClient);
        this.miscellaneous = new MiscellaneousApi(this.apiClient);
        this.oauth = new OauthApi(this.apiClient);
        this.playlists = new PlaylistsApi(this.apiClient);
        this.reposts = new RepostsApi(this.apiClient);
        this.search = new SearchApi(this.apiClient);
        this.tracks = new TracksApi(this.apiClient);
        this.users = new UsersApi(this.apiClient);
    }

}
