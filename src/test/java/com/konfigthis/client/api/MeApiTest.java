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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Activities;
import com.konfigthis.client.model.Me;
import com.konfigthis.client.model.Track;
import com.konfigthis.client.model.User;
import com.konfigthis.client.model.Users;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MeApi
 */
@Disabled
public class MeApiTest {

    private static MeApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new MeApi(apiClient);
    }

    /**
     * Deletes a user who is followed by the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFollowedUserTest() throws ApiException {
        Integer userId = null;
        api.deleteFollowedUser(userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Follows a user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void followUserTest() throws ApiException {
        Integer userId = null;
        api.followUser(userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns the authenticated user&#39;s activities.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getActivitiesTest() throws ApiException {
        List<String> access = null;
        Integer limit = null;
        Activities response = api.getActivities()
                .access(access)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a user who is followed by the authenticated user. (use /users/{user_id} instead, to fetch the user details)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFollowedUserTest() throws ApiException {
        Integer userId = null;
        User response = api.getFollowedUser(userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of users who are followed by the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFollowedUsersTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        Users response = api.getFollowedUsers()
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a user who is following the authenticated user. (use /users/{user_id} instead, to fetch the user details)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFollowerByIdTest() throws ApiException {
        Integer followerId = null;
        User response = api.getFollowerById(followerId)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of users who are following the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFollowersListTest() throws ApiException {
        Integer limit = null;
        Users response = api.getFollowersList()
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of favorited or liked playlists of the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLikedPlaylistsTest() throws ApiException {
        Integer limit = null;
        Boolean linkedPartitioning = null;
        Object response = api.getLikedPlaylists()
                .limit(limit)
                .linkedPartitioning(linkedPartitioning)
                .execute();
        // TODO: test validations
    }

    /**
     * Recent the authenticated user&#39;s activities.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRecentActivitiesTest() throws ApiException {
        List<String> access = null;
        Integer limit = null;
        Activities response = api.getRecentActivities()
                .access(access)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns the authenticated user&#39;s recent track related activities.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRecentTracksTest() throws ApiException {
        List<String> access = null;
        Integer limit = null;
        Activities response = api.getRecentTracks()
                .access(access)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns the authenticated user’s information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserInformationTest() throws ApiException {
        Me response = api.getUserInformation()
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of recent tracks from users followed by the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFollowedTracksTest() throws ApiException {
        List<String> access = null;
        Integer limit = null;
        Integer offset = null;
        List<Track> response = api.listFollowedTracks()
                .access(access)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of favorited or liked tracks of the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listLikedTracksTest() throws ApiException {
        Integer limit = null;
        List<String> access = null;
        Boolean linkedPartitioning = null;
        Object response = api.listLikedTracks()
                .limit(limit)
                .access(access)
                .linkedPartitioning(linkedPartitioning)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns user’s playlists (sets).
     *
     * Returns playlist info, playlist tracks and tracks owner info.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPlaylistsInfoTracksOwnerTest() throws ApiException {
        Boolean showTracks = null;
        Boolean linkedPartitioning = null;
        Integer limit = null;
        Object response = api.listPlaylistsInfoTracksOwner()
                .showTracks(showTracks)
                .linkedPartitioning(linkedPartitioning)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of user&#39;s tracks.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserTracksTest() throws ApiException {
        Integer limit = null;
        Boolean linkedPartitioning = null;
        Object response = api.listUserTracks()
                .limit(limit)
                .linkedPartitioning(linkedPartitioning)
                .execute();
        // TODO: test validations
    }

}
