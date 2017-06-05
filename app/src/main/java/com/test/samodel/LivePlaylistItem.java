package com.test.samodel;

/**
 * Created by ac on 2016/11/11.
 */

public class LivePlaylistItem {

    /**
     * id : 1
     * account_id : straas-dev-test
     * live_playlist_id : D8GAwESH
     * position : 1
     * live : {"id":"ffS7NMYZ","account_id":"straas-dev-test","title":"Officia doloremque sunt dicta culpa totam in.","synopsis":"Culpa magni vero dolorem repudiandae molestiae inventore dolore molestias.","status":"ready","start_time":"2016-11-01T02:44:05.000Z","started_at":null,"ended_at":null,"highest_resolution":"_720p","stream_url":"https://cms-rtcp-agent-staging.straas.net/ffS7NMYZ/video/playlist.m3u8","stream_server_url":"rtmp://livestaging-ea.straas.net/app","stream_key":"24b7c6cad5144b59b58f99dbb13a5f15","cover_url":null,"cover_image":{"url":null},"embed_url":"https://app-staging.straas.net/straas-dev-test/lives/ffS7NMYZ","available":true,"listed":true,"projection":"flat","poster_url":null,"thumbnail_urls":null,"created_at":"2016-11-01T04:58:40Z","updated_at":"2016-11-01T04:58:40Z"}
     * created_at : 2016-11-01T04:58:41Z
     * updated_at : 2016-11-01T04:58:41Z
     */

    private int id;
    private String account_id;
    private String live_playlist_id;
    private int position;
    /**
     * id : ffS7NMYZ
     * account_id : straas-dev-test
     * title : Officia doloremque sunt dicta culpa totam in.
     * synopsis : Culpa magni vero dolorem repudiandae molestiae inventore dolore molestias.
     * status : ready
     * start_time : 2016-11-01T02:44:05.000Z
     * started_at : null
     * ended_at : null
     * highest_resolution : _720p
     * stream_url : https://cms-rtcp-agent-staging.straas.net/ffS7NMYZ/video/playlist.m3u8
     * stream_server_url : rtmp://livestaging-ea.straas.net/app
     * stream_key : 24b7c6cad5144b59b58f99dbb13a5f15
     * cover_url : null
     * cover_image : {"url":null}
     * embed_url : https://app-staging.straas.net/straas-dev-test/lives/ffS7NMYZ
     * available : true
     * listed : true
     * projection : flat
     * poster_url : null
     * thumbnail_urls : null
     * created_at : 2016-11-01T04:58:40Z
     * updated_at : 2016-11-01T04:58:40Z
     */

    private LiveBean live;
    private String created_at;
    private String updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getLive_playlist_id() {
        return live_playlist_id;
    }

    public void setLive_playlist_id(String live_playlist_id) {
        this.live_playlist_id = live_playlist_id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public LiveBean getLive() {
        return live;
    }

    public void setLive(LiveBean live) {
        this.live = live;
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

    public static class LiveBean {
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

        public static class CoverImageBean {
            private String url;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
