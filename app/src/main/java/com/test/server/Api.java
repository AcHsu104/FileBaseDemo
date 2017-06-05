package com.test.server;

import com.test.samodel.Catalog;
import com.test.samodel.Live;
import com.test.samodel.LiveDetail;
import com.test.samodel.LivePlaylist;
import com.test.samodel.LivePlaylistDetail;
import com.test.samodel.LivePlaylistItem;
import com.test.samodel.Member;
import com.test.samodel.MemberToken;
import com.test.samodel.Playlist;
import com.test.samodel.PlaylistDetail;
import com.test.samodel.PlaylistItem;
import com.test.samodel.Token;
import com.test.samodel.Video;
import com.test.samodel.VideoDetail;

import java.util.List;
import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;


/**
 * Created by ac on 2016/10/20.
 */

public interface Api {
    String FETCH_JOB_SEARCHED_LIST_URL = "/api/1.0/joblist/searched.php";

    String GET_TOKEN = "v1/app/token";

    String GET_CATEGORIES = "v1/app/categories";


    //Live
    String GET_LIVE_DETAILS = "v1/app/lives/{id}";
    String GET_LIVES = "v1/app/lives";


    //Member
    String CREATE_MEMBER_TOKEN = "v1/app/members/{id}/token";
    String REFRESH_MEMBER_TOKEN = "v1/app/members/token";
    String CREATE_NEW_MEMBER = "v1/app/members";


    //Video
    String GET_VIDEO_DETAILS = "v1/app/videos/{id}";
    String GET_VIDEOS = "v1/app/videos";


    //LivePlaylist
    String GET_LIVE_PLAYLIST_DETAILS = "v1/app/live_playlists/{id}";
    String GET_LIVE_PLAYLISTS = "/v1/app/live_playlists";
    String GET_LIVE_PLAYLISTITEM_DETAILS = "v1/app/live_playlists/{id}/live_playlist_items";


    //VideoPlaylist
    String GET_PLAYLIST_DETAILS = "v1/app/playlists/{id}";
    String GET_PLAYLISTS = "/v1/app/playlists";
    String GET_PLAYLISTITEM_DETAILS = "v1/app/playlists/{id}/playlist_items";


    //        @FormUrlEncoded
    @GET(FETCH_JOB_SEARCHED_LIST_URL)
    Call<Result<List<SearchedJob>>> searchJob(
//                @FieldMap Map<String, String> params
            @QueryMap Map<String, String> params
    );

    @GET(FETCH_JOB_SEARCHED_LIST_URL)
    Call<BaseModel<JobModel>> searchJobTest(
//                @FieldMap Map<String, String> params
            @QueryMap Map<String, String> params
    );

    /**
     * Parameters
     * Name	Description	Type
     * client_id Required	Application client id.	String
     * client_secret Required	Application client secret.	String
     *
     * @param body
     * @return
     */

//        @FormUrlEncoded
    @Headers("Content-Type: application/json")
    @POST(GET_TOKEN)
    Call<Token> getToken(
            @Body RequestBody body
//                @Body Client client
//                @FieldMap Map<String, String> params
//                @QueryMap Map<String, String> params
    );

    //        @FormUrlEncoded
    @Headers("Content-Type: application/json")
    @POST(GET_TOKEN)
    Observable<Token> getToken_(
            @Body RequestBody body
//                @Body Client client
//                @FieldMap Map<String, String> params
//                @QueryMap Map<String, String> params
    );

    /**
     * Parameters
     * Name	Description	Type
     * "Authorization token"
     * @param token
     *
     * page	Page of results to fetch.	Integer
     * per_page	Number of results to return per page.	Integer
     * parent_ids	Filter the subcategories contained in the parent category. Use null to filter the root categories (i.e., parent_ids=null.)	String
     *
     * @param params
     * @return
     */
    @Headers("Content-Type: application/json")
    @GET(GET_CATEGORIES)
    Call<List<Catalog>> getCategories(
            @Header("Authorization") String token,
            @QueryMap Map<String, String> params
    );


    /**
     * "Authorization token"
     * @param token
     *
     * @param live_id
     *
     * Parameters
     * Name	Description	Type
     * id Required	The live id.	String
     * includes	Include extra resource details. Allow included resources: {category,tags,monetizable_info,videos,sync_status_url_anatomy,owner}. For example, includes=category,tags.	String
     *
     * @param params
     * @return
     */
    @Headers("Content-Type: application/json")
    @GET(GET_LIVE_DETAILS)
    Call<LiveDetail> getLiveDetails(
            @Header("Authorization") String token,
            @Path("id") String live_id,
            @QueryMap Map<String, String> params);

    /**
     * "Authorization token"
     * @param token
     *
     * Parameters
     * Name	Description	Type
     * page	Page of results to fetch.	Integer
     * per_page	Number of results to return per page.	Integer
     * listed	Filter the listed items.	Boolean
     * available	Filter the available items.	Boolean
     * category_ids	Filter the item which exists in the category. Multiple ids are allowed. For example, category_ids=1,3,5	String
     * owner[member_id]	Filter the item which is owned by the member registered in your member system.	String
     * sort	Data sorted with {+,-} by which column {created_at}. Apply - to sort in descending order. For example, sort=-created_at.	String
     * includes	Include extra resource details. Allow included resources: {tag,category,monetizable_info,videos}. For example, includes=tag,category.	String
     * status	The live status. {ready,started,ended}	String     *
     *
     * @param params
     * @return
     */
    @Headers("Content-Type: application/json")
    @GET(GET_LIVES)
    Call<List<Live>> getLives(
            @Header("Authorization") String token,
            @QueryMap Map<String, String> params);

    /**
     * "Authorization token"
     * @param token
     *
     * Parameters
     * Name	Description	Type
    id Required	The id of the member who exists in your member system.	String
    email	The email of the member who exists in your member system.	String
    name	The name of the member who exists in your member system.	String
    avatar_url	The avatar url of the member who exists in your member system.	String
    personal_url	The personal url of the member who exists in your member system.	String
     *
     * @param member_id
     * @return
     */
    @Headers("Content-Type: application/json")
    @POST(CREATE_MEMBER_TOKEN)
    Call<MemberToken> createMemberToken(
            @Header("Authorization") String token,
            @Path("id") String member_id);

//    refresh_token
    @Headers("Content-Type: application/json")
    @POST(REFRESH_MEMBER_TOKEN)
    Call<MemberToken> refreshMemberToken(
            @Header("Authorization") String token,
            @Body RequestBody body );

    /**
     * "Authorization token"
     * @param token
     *
     * Parameters
     * Name	Description	Type
    id Required	The id of the member who exists in your member system.	String
    email	The email of the member who exists in your member system.	String
    name	The name of the member who exists in your member system.	String
    avatar_url	The avatar url of the member who exists in your member system.	String
    personal_url	The personal url of the member who exists in your member system.	String
     *
     * @param body
     * @return
     */
    @Headers("Content-Type: application/json")
    @POST(CREATE_NEW_MEMBER)
    Call<Member> createNewMember(
            @Header("Authorization") String token,
            @Body RequestBody body);




    /**
     * "Authorization token"
     * @param token
     *Parameters
    Name	Description	Type
    page	Page of results to fetch.	Integer
    per_page	Number of results to return per page.	Integer
    ids	The video ids. Filter the item which id is the same one.	String
    category_ids	Filter the item which exists in the category. Multiple ids are allowed. For example, category_ids=1,3,5	String
    ad_tag_ids	Filter the item related to the ad tag. Multiple ids are allowed. For example, ad_tags=1,2	String
    owner[member_id]	Filter the item which is owned by the member registered in your member system.	String
    sort	Data sorted with {+,-} by which column {created_at}. Apply - to sort in descending order. For example, sort=-created_at.	String
    includes	Include extra resource details. Allow included resources: {monetization_rules,category,metadata,tags,monetizable_info}. For example, includes=monetization_rules,category.	String
    listed	Filter the listed items.	Boolean
    available	Filter the available items.	Boolean
    contains_passcode_sets	Filter the monetizable item which contains passcode sets.	String
    type	Choose video generated type. {live_record,uploaded}	String
     * @param params
     * @return
     */
    @Headers("Content-Type: application/json")
    @GET(GET_VIDEOS)
    Call<List<Video>> getVideos(
            @Header("Authorization") String token,
            @QueryMap Map<String, String> params);


    /**
     * "Authorization token"
     * @param token
     *
     * Parameters
     * Name	Description	Type
    id Required	The video id.	String
    includes	Include extra resource details. Allow included resources: {monetization_rules,category,metadata,tags,monetizable_info,owner}. For example, includes=monetization_rules,category.Ò
     *
     * @param video_id
     * @param params
     * @return
     */
    @Headers("Content-Type: application/json")
    @GET(GET_VIDEO_DETAILS)
    Call<VideoDetail> getVideoDetail(
            @Header("Authorization") String token,
            @Path("id") String video_id,
            @QueryMap Map<String, String> params);



    /**
     * "Authorization token"
     * @param token
     *
     * Parameters
    Name	Description	Type
    id Required	The live playlist id.	String
    includes	Include extra resource details. Allow included resources: {monetization_rules,monetizable_info}. For example, includes=monetization_rules,monetizable_info.	String     *
     * @param live_playlist_id
     * @param params
     * @return
     */
    @Headers("Content-Type: application/json")
    @GET(GET_LIVE_PLAYLIST_DETAILS)
    Call<LivePlaylistDetail> getLivePlaylistDetail(
            @Header("Authorization") String token,
            @Path("id") String live_playlist_id,
            @QueryMap Map<String, String> params);



    /**
     * "Authorization token"
     * @param token
     *
     * Parameters
    Name	Description	Type
    page	Page of results to fetch.	Integer
    per_page	Number of results to return per page.	Integer
    sort	Data sorted with {+,-} by which column {created_at}. Apply - to sort in descending order. For example, sort=-created_at.	String
    includes	Include extra resource details. Allow included resources: {monetization_rules,monetizable_info}. For example, includes=monetization_rules,monetizable_info.	String
    listed	Filter the listed items.	Boolean
    available	Filter the available items.	Boolean
    contains_passcode_sets	Filter the monetizable item which contains passcode sets.	String
     * @param params
     * @return
     */
    @Headers("Content-Type: application/json")
    @GET(GET_LIVE_PLAYLISTS)
    Call<List<LivePlaylist>> getLivePlaylists(
            @Header("Authorization") String token,
            @QueryMap Map<String, String> params);


    /**
     * "Authorization token"
     * @param token
     *
     * Parameters
    Name	Description	Type
    id Required	The live playlist id.	String
    page	Page of results to fetch.	Integer
    per_page	Number of results to return per page.	Integer
     * @param params
     * @return
     */
    @Headers("Content-Type: application/json")
    @GET(GET_LIVE_PLAYLISTITEM_DETAILS)
    Call<List<LivePlaylistItem>> getLivePlaylistitemDetails(
            @Header("Authorization") String token,
            @Path("id") String live_playlist_id,
            @QueryMap Map<String, String> params);



    /**
     * "Authorization token"
     * @param token
     *
     * Parameters
    Name	Description	Type
    id Required	The playlist id.	String
    includes	Include extra resource details. Allow included resources: {monetization_rules,category,monetizable_info,trailer}. For example, includes=monetization_rules,category.	String
     * @param playlist_id
     * @param params
     * @return
     */
    @Headers("Content-Type: application/json")
    @GET(GET_PLAYLIST_DETAILS)
    Call<PlaylistDetail> getPlaylistDetail(
            @Header("Authorization") String token,
            @Path("id") String playlist_id,
            @QueryMap Map<String, String> params);



    /**
     * "Authorization token"
     * @param token
     *
     * Parameters
    Name	Description	Type
    page	Page of results to fetch.	Integer
    per_page	Number of results to return per page.	Integer
    ids	The playlist ids. Filter the item which id is the same one.	String
    category_ids	Filter the item which exists in the category. Multiple ids are allowed. For example, category_ids=1,3,5	String
    sort	Data sorted with {+,-} by which column {created_at}. Apply - to sort in descending order. For example, sort=-created_at.	String
    includes	Include extra resource details. Allow included resources: {monetization_rules,category,monetizable_info,trailer}. For example, includes=monetization_rules,category.	String
    listed	Filter the listed items.	Boolean
    available	Filter the available items.	Boolean
    contains_passcode_sets	Filter the monetizable item which contains passcode sets.	String
     * @param params
     * @return
     */
    @Headers("Content-Type: application/json")
    @GET(GET_PLAYLISTS)
    Call<List<Playlist>> getPlaylists(
            @Header("Authorization") String token,
            @QueryMap Map<String, String> params);


    /**
     * "Authorization token"
     * @param token
     *
     * Parameters
    Name	Description	Type
    id Required	The playlist id.	String
    page	Page of results to fetch.	Integer
    per_page	Number of results to return per page.	Integer
     @param playlist_id
     * @param params
     * @return
     */
    @Headers("Content-Type: application/json")
    @GET(GET_PLAYLISTITEM_DETAILS)
    Call<List<PlaylistItem>> getPlaylistitemDetails(
            @Header("Authorization") String token,
            @Path("id") String playlist_id,
            @QueryMap Map<String, String> params);


//        @FormUrlEncoded
//        @POST("/oauth/access_token")
//        void getToken(
//                @FieldMap Map<String, String> params,
//                Callback<FacebookLoginUserResponse> callback
//        );
//    }
}
