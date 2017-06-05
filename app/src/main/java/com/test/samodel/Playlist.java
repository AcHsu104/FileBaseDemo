package com.test.samodel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ac on 2016/11/11.
 */

public class Playlist {

    /**
     * id : con7qmgz
     * account_id : straas-dev-test
     * title : video title3
     * synopsis : Ratione laboriosam dolores optio corporis fuga voluptas nihil at.
     * videos_count : 0
     * embed_url : https://app-staging.straas.net/straas-dev-test/playlists/con7qmgz
     * available : false
     * listed : false
     * category : {"id":83,"default":true,"name":"未分類","description":"預設分類","videos_count":0,"lives_count":0,"playlists_count":0,"total_count":0,"parent_id":null,"created_at":"2016-11-01T04:58:45Z","updated_at":"2016-11-01T04:58:45Z"}
     * monetization_rules : []
     * has_monetization_rules : false
     * poster_url : null
     * thumbnail_urls : null
     * created_at : 2016-11-01T04:58:45Z
     * updated_at : 2016-11-01T04:58:45Z
     */

    private String id;
    private String account_id;
    private String title;
    private String synopsis;
    private int videos_count;
    private String embed_url;
    private boolean available;
    private boolean listed;
    /**
     * id : 83
     * default : true
     * name : 未分類
     * description : 預設分類
     * videos_count : 0
     * lives_count : 0
     * playlists_count : 0
     * total_count : 0
     * parent_id : null
     * created_at : 2016-11-01T04:58:45Z
     * updated_at : 2016-11-01T04:58:45Z
     */

    private CategoryBean category;
    private boolean has_monetization_rules;
    private String poster_url;
    private String thumbnail_urls;
    private String created_at;
    private String updated_at;
    private List<?> monetization_rules;

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

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getVideos_count() {
        return videos_count;
    }

    public void setVideos_count(int videos_count) {
        this.videos_count = videos_count;
    }

    public String getEmbed_url() {
        return embed_url;
    }

    public void setEmbed_url(String embed_url) {
        this.embed_url = embed_url;
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

    public CategoryBean getCategory() {
        return category;
    }

    public void setCategory(CategoryBean category) {
        this.category = category;
    }

    public boolean isHas_monetization_rules() {
        return has_monetization_rules;
    }

    public void setHas_monetization_rules(boolean has_monetization_rules) {
        this.has_monetization_rules = has_monetization_rules;
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

    public List<?> getMonetization_rules() {
        return monetization_rules;
    }

    public void setMonetization_rules(List<?> monetization_rules) {
        this.monetization_rules = monetization_rules;
    }

    public static class CategoryBean {
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
}
