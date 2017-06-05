package com.test.samodel;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ac on 2016/11/10.
 */

public class Catalog {

    /**
     * id : 8
     * default : false
     * name : category-5
     * description : Ipsum quis ut provident ducimus nemo veniam molestiae rerum.
     * videos_count : 1
     * lives_count : 0
     * playlists_count : 0
     * total_count : 1
     * parent_id : null
     * created_at : 2016-11-01T04:58:39Z
     * updated_at : 2016-11-01T04:58:39Z
     */

    private int id;
    @SerializedName("default")
    private boolean defaultX;
    private String name;
    private String description;
    private int videos_count;
    private int lives_count;
    private int playlists_count;
    private int total_count;
    private String parent_id;
    private String created_at;
    private String updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDefaultX() {
        return defaultX;
    }

    public void setDefaultX(boolean defaultX) {
        this.defaultX = defaultX;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVideos_count() {
        return videos_count;
    }

    public void setVideos_count(int videos_count) {
        this.videos_count = videos_count;
    }

    public int getLives_count() {
        return lives_count;
    }

    public void setLives_count(int lives_count) {
        this.lives_count = lives_count;
    }

    public int getPlaylists_count() {
        return playlists_count;
    }

    public void setPlaylists_count(int playlists_count) {
        this.playlists_count = playlists_count;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
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
