package com.test.samodel;

/**
 * Created by ac on 2016/11/11.
 */

public class LivePlaylist {

    /**
     * id : 5jXkjwex
     * account_id : straas-dev-test
     * title : video title1
     * available : false
     * listed : false
     * poster_url : null
     * thumbnail_urls : null
     * created_at : 2016-11-01T04:58:40Z
     * updated_at : 2016-11-01T04:58:40Z
     */

    private String id;
    private String account_id;
    private String title;
    private boolean available;
    private boolean listed;
    private String poster_url;
    private String thumbnail_urls;
    private String created_at;
    private String updated_at;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isListed() {
        return listed;
    }

    public void setListed(boolean listed) {
        this.listed = listed;
    }

    public String getPoster_url() {
        return poster_url;
    }

    public void setPoster_url(String poster_url) {
        this.poster_url = poster_url;
    }

    public String getThumbnail_urls() {
        return thumbnail_urls;
    }

    public void setThumbnail_urls(String thumbnail_urls) {
        this.thumbnail_urls = thumbnail_urls;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
