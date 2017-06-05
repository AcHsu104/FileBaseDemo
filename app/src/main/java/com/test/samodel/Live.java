package com.test.samodel;

/**
 * Created by ac on 2016/11/10.
 */

public class Live {


    /**
     * id : zW2z4W8p
     * account_id : 104.com.tw-test
     * title : Default title
     * synopsis : Default synopsis
     * status : started
     * start_time : 2016-11-11T01:35:15.000Z
     * started_at : 2016-11-11T01:35:18Z
     * ended_at : null
     * highest_resolution : _720p
     * stream_url : https://cms-rtcp-agent.straas.net/zW2z4W8p/video/playlist.m3u8
     * stream_server_url : rtmp://live-ea.straas.net/app
     * stream_key : a720be4446194431b74fec6c6a944cf1
     * cover_url : null
     * cover_image : {"url":null}
     * embed_url : https://app.straas.net/104.com.tw-test/lives/zW2z4W8p
     * available : true
     * listed : true
     * projection : flat
     * poster_url : https://vod.straas.net/thumbnail/104.com.tw-test/zW2z4W8p/1478828118oo3l7y1qbop9cnmi/img/l/0.jpg
     * thumbnail_urls : {"large":{"height":405,"url":"https://vod.straas.net/thumbnail/104.com.tw-test/zW2z4W8p/1478828118oo3l7y1qbop9cnmi/img/l/0.jpg","width":720},"medium":{"height":270,"url":"https://vod.straas.net/thumbnail/104.com.tw-test/zW2z4W8p/1478828118oo3l7y1qbop9cnmi/img/m/0.jpg","width":480},"small":{"height":72,"url":"https://vod.straas.net/thumbnail/104.com.tw-test/zW2z4W8p/1478828118oo3l7y1qbop9cnmi/img/s/0.jpg","width":128}}
     * created_at : 2016-11-11T01:35:15Z
     * updated_at : 2016-11-11T01:36:10Z
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
    private String poster_url;
    /**
     * large : {"height":405,"url":"https://vod.straas.net/thumbnail/104.com.tw-test/zW2z4W8p/1478828118oo3l7y1qbop9cnmi/img/l/0.jpg","width":720}
     * medium : {"height":270,"url":"https://vod.straas.net/thumbnail/104.com.tw-test/zW2z4W8p/1478828118oo3l7y1qbop9cnmi/img/m/0.jpg","width":480}
     * small : {"height":72,"url":"https://vod.straas.net/thumbnail/104.com.tw-test/zW2z4W8p/1478828118oo3l7y1qbop9cnmi/img/s/0.jpg","width":128}
     */

    private ThumbnailUrlsBean thumbnail_urls;
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

    public ThumbnailUrlsBean getThumbnail_urls() {
        return thumbnail_urls;
    }

    public void setThumbnail_urls(ThumbnailUrlsBean thumbnail_urls) {
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

    public static class ThumbnailUrlsBean {
        /**
         * height : 405
         * url : https://vod.straas.net/thumbnail/104.com.tw-test/zW2z4W8p/1478828118oo3l7y1qbop9cnmi/img/l/0.jpg
         * width : 720
         */

        private LargeBean large;
        /**
         * height : 270
         * url : https://vod.straas.net/thumbnail/104.com.tw-test/zW2z4W8p/1478828118oo3l7y1qbop9cnmi/img/m/0.jpg
         * width : 480
         */

        private MediumBean medium;
        /**
         * height : 72
         * url : https://vod.straas.net/thumbnail/104.com.tw-test/zW2z4W8p/1478828118oo3l7y1qbop9cnmi/img/s/0.jpg
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
}
