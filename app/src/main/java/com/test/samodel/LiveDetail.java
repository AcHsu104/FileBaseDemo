package com.test.samodel;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ac on 2016/11/10.
 */

public class LiveDetail {

    /**
     * id : AP4FWsbL
     * account_id : 104.com.tw-test
     * title : Andylive
     * synopsis : Andylivechannel
     * status : started
     * start_time : 2016-11-10T09:41:14.000Z
     * started_at : 2016-11-10T09:41:18Z
     * ended_at : null
     * highest_resolution : _720p
     * stream_url : https://cms-rtcp-agent.straas.net/AP4FWsbL/video/playlist.m3u8
     * stream_server_url : rtmp://live-ea.straas.net/app
     * stream_key : 461b0cc12ae447b4981d38fc4b3c05b6
     * cover_url : null
     * cover_image : {"url":null}
     * embed_url : https://app.straas.net/104.com.tw-test/lives/AP4FWsbL
     * available : true
     * listed : true
     * projection : flat
     * category : {"id":133,"default":true,"name":"未分類","description":"預設分類","videos_count":19,"lives_count":4,"playlists_count":1,"total_count":24,"parent_id":null,"created_at":"2016-11-04T11:42:28Z","updated_at":"2016-11-04T11:42:28Z"}
     * poster_url : https://vod.straas.net/thumbnail/104.com.tw-test/AP4FWsbL/1478770878qny313rtxqykqpvi/img/l/0.jpg
     * thumbnail_urls : {"large":{"height":405,"url":"https://vod.straas.net/thumbnail/104.com.tw-test/AP4FWsbL/1478770878qny313rtxqykqpvi/img/l/0.jpg","width":720},"medium":{"height":270,"url":"https://vod.straas.net/thumbnail/104.com.tw-test/AP4FWsbL/1478770878qny313rtxqykqpvi/img/m/0.jpg","width":480},"small":{"height":72,"url":"https://vod.straas.net/thumbnail/104.com.tw-test/AP4FWsbL/1478770878qny313rtxqykqpvi/img/s/0.jpg","width":128}}
     * owner : {"id":"andychang","email":"andy.chang@104.com.tw","name":null,"avatar_url":null,"personal_url":null}
     * created_at : 2016-11-10T09:41:14Z
     * updated_at : 2016-11-10T09:42:09Z
     */

    private String id;
    private String account_id;
    private String title;
    private String synopsis;
    private String status;
    private String start_time;
    private String started_at;
    private String ended_at;
    private String highest_resolution;
    private String stream_url;
    private String stream_server_url;
    private String stream_key;
    private String cover_url;
    /**
     * url : null
     */

    private CoverImageBean cover_image;
    private String embed_url;
    private boolean available;
    private boolean listed;
    private String projection;
    /**
     * id : 133
     * default : true
     * name : 未分類
     * description : 預設分類
     * videos_count : 19
     * lives_count : 4
     * playlists_count : 1
     * total_count : 24
     * parent_id : null
     * created_at : 2016-11-04T11:42:28Z
     * updated_at : 2016-11-04T11:42:28Z
     */

    private CategoryBean category;
    private String poster_url;
    /**
     * large : {"height":405,"url":"https://vod.straas.net/thumbnail/104.com.tw-test/AP4FWsbL/1478770878qny313rtxqykqpvi/img/l/0.jpg","width":720}
     * medium : {"height":270,"url":"https://vod.straas.net/thumbnail/104.com.tw-test/AP4FWsbL/1478770878qny313rtxqykqpvi/img/m/0.jpg","width":480}
     * small : {"height":72,"url":"https://vod.straas.net/thumbnail/104.com.tw-test/AP4FWsbL/1478770878qny313rtxqykqpvi/img/s/0.jpg","width":128}
     */

    private ThumbnailUrlsBean thumbnail_urls;
    /**
     * id : andychang
     * email : andy.chang@104.com.tw
     * name : null
     * avatar_url : null
     * personal_url : null
     */

    private OwnerBean owner;
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

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getStarted_at() {
        return started_at;
    }

    public void setStarted_at(String started_at) {
        this.started_at = started_at;
    }

    public String getEnded_at() {
        return ended_at;
    }

    public void setEnded_at(String ended_at) {
        this.ended_at = ended_at;
    }

    public String getHighest_resolution() {
        return highest_resolution;
    }

    public void setHighest_resolution(String highest_resolution) {
        this.highest_resolution = highest_resolution;
    }

    public String getStream_url() {
        return stream_url;
    }

    public void setStream_url(String stream_url) {
        this.stream_url = stream_url;
    }

    public String getStream_server_url() {
        return stream_server_url;
    }

    public void setStream_server_url(String stream_server_url) {
        this.stream_server_url = stream_server_url;
    }

    public String getStream_key() {
        return stream_key;
    }

    public void setStream_key(String stream_key) {
        this.stream_key = stream_key;
    }

    public String getCover_url() {
        return cover_url;
    }

    public void setCover_url(String cover_url) {
        this.cover_url = cover_url;
    }

    public CoverImageBean getCover_image() {
        return cover_image;
    }

    public void setCover_image(CoverImageBean cover_image) {
        this.cover_image = cover_image;
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

    public String getProjection() {
        return projection;
    }

    public void setProjection(String projection) {
        this.projection = projection;
    }

    public CategoryBean getCategory() {
        return category;
    }

    public void setCategory(CategoryBean category) {
        this.category = category;
    }

    public String getPoster_url() {
        return poster_url;
    }

    public void setPoster_url(String poster_url) {
        this.poster_url = poster_url;
    }

    public ThumbnailUrlsBean getThumbnail_urls() {
        return thumbnail_urls;
    }

    public void setThumbnail_urls(ThumbnailUrlsBean thumbnail_urls) {
        this.thumbnail_urls = thumbnail_urls;
    }

    public OwnerBean getOwner() {
        return owner;
    }

    public void setOwner(OwnerBean owner) {
        this.owner = owner;
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

    public static class CoverImageBean {
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
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

    public static class ThumbnailUrlsBean {
        /**
         * height : 405
         * url : https://vod.straas.net/thumbnail/104.com.tw-test/AP4FWsbL/1478770878qny313rtxqykqpvi/img/l/0.jpg
         * width : 720
         */

        private LargeBean large;
        /**
         * height : 270
         * url : https://vod.straas.net/thumbnail/104.com.tw-test/AP4FWsbL/1478770878qny313rtxqykqpvi/img/m/0.jpg
         * width : 480
         */

        private MediumBean medium;
        /**
         * height : 72
         * url : https://vod.straas.net/thumbnail/104.com.tw-test/AP4FWsbL/1478770878qny313rtxqykqpvi/img/s/0.jpg
         * width : 128
         */

        private SmallBean small;

        public LargeBean getLarge() {
            return large;
        }

        public void setLarge(LargeBean large) {
            this.large = large;
        }

        public MediumBean getMedium() {
            return medium;
        }

        public void setMedium(MediumBean medium) {
            this.medium = medium;
        }

        public SmallBean getSmall() {
            return small;
        }

        public void setSmall(SmallBean small) {
            this.small = small;
        }

        public static class LargeBean {
            private int height;
            private String url;
            private int width;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }
        }

        public static class MediumBean {
            private int height;
            private String url;
            private int width;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }
        }

        public static class SmallBean {
            private int height;
            private String url;
            private int width;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }
        }
    }

    public static class OwnerBean {
        private String id;
        private String email;
        private String name;
        private String avatar_url;
        private String personal_url;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getPersonal_url() {
            return personal_url;
        }

        public void setPersonal_url(String personal_url) {
            this.personal_url = personal_url;
        }
    }
}
