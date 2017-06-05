package com.test.samodel;

/**
 * Created by ac on 2016/11/11.
 */

public class PlaylistItem {

    /**
     * id : 2
     * account_id : straas-dev-test
     * playlist_id : WWcpgFPh
     * video_id : SQjKTgWP
     * position : 1
     * video : {"id":"SQjKTgWP","account_id":"straas-dev-test","title":"Voluptatem fugiat quo iste error quibusdam.","synopsis":"Iste nesciunt incidunt ea consequatur cumque assumenda ex ducimus.","accomplished":true,"duration":4173848,"resolution":"_1080p","stream_url":"https://cms-vod-staging.straas.net/test.m3u8","embed_url":"https://app-staging.straas.net/straas-dev-test/videos/SQjKTgWP","live_id":null,"available":true,"listed":true,"projection":"flat","poster_url":null,"thumbnail_urls":null,"live_started_at":null,"live_ended_at":null,"created_at":"2016-11-01T04:58:45Z","updated_at":"2016-11-01T04:58:45Z"}
     * created_at : 2016-11-01T04:58:45Z
     * updated_at : 2016-11-01T04:58:45Z
     */

    private int id;
    private String account_id;
    private String playlist_id;
    private String video_id;
    private int position;
    /**
     * id : SQjKTgWP
     * account_id : straas-dev-test
     * title : Voluptatem fugiat quo iste error quibusdam.
     * synopsis : Iste nesciunt incidunt ea consequatur cumque assumenda ex ducimus.
     * accomplished : true
     * duration : 4173848
     * resolution : _1080p
     * stream_url : https://cms-vod-staging.straas.net/test.m3u8
     * embed_url : https://app-staging.straas.net/straas-dev-test/videos/SQjKTgWP
     * live_id : null
     * available : true
     * listed : true
     * projection : flat
     * poster_url : null
     * thumbnail_urls : null
     * live_started_at : null
     * live_ended_at : null
     * created_at : 2016-11-01T04:58:45Z
     * updated_at : 2016-11-01T04:58:45Z
     */

    private VideoBean video;
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

    public String getPlaylist_id() {
        return playlist_id;
    }

    public void setPlaylist_id(String playlist_id) {
        this.playlist_id = playlist_id;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public VideoBean getVideo() {
        return video;
    }

    public void setVideo(VideoBean video) {
        this.video = video;
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

    public static class VideoBean {
        private String id;
        private String account_id;
        private String title;
        private String synopsis;
        private boolean accomplished;
        private int duration;
        private String resolution;
        private String stream_url;
        private String embed_url;
        private String live_id;
        private boolean available;
        private boolean listed;
        private String projection;
        private String poster_url;
        private String thumbnail_urls;
        private String live_started_at;
        private String live_ended_at;
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

        public boolean isAccomplished() {
            return accomplished;
        }

        public void setAccomplished(boolean accomplished) {
            this.accomplished = accomplished;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public String getResolution() {
            return resolution;
        }

        public void setResolution(String resolution) {
            this.resolution = resolution;
        }

        public String getStream_url() {
            return stream_url;
        }

        public void setStream_url(String stream_url) {
            this.stream_url = stream_url;
        }

        public String getEmbed_url() {
            return embed_url;
        }

        public void setEmbed_url(String embed_url) {
            this.embed_url = embed_url;
        }

        public String getLive_id() {
            return live_id;
        }

        public void setLive_id(String live_id) {
            this.live_id = live_id;
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

        public String getLive_started_at() {
            return live_started_at;
        }

        public void setLive_started_at(String live_started_at) {
            this.live_started_at = live_started_at;
        }

        public String getLive_ended_at() {
            return live_ended_at;
        }

        public void setLive_ended_at(String live_ended_at) {
            this.live_ended_at = live_ended_at;
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
