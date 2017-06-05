package com.test.server;

import java.util.List;

/**
 * Created by ac on 2016/11/3.
 */

public class JobModel {
    private String RECORDCOUNT;

    private String PAGECOUNT;

    private String PAGE;

    private String TOTALPAGE;

//    private List<SearchedJob> ad_list;

//    private List<SearchedJob> jobcat_list;

    private List<SearchedJob> LIST;

    public String getRECORDCOUNT() {
        return RECORDCOUNT;
    }

    public String getPAGECOUNT() {
        return PAGECOUNT;
    }

    public String getPAGE() {
        return PAGE;
    }

    public String getTOTALPAGE() {
        return TOTALPAGE;
    }

//    public List<SearchedJob> getAd_list() {
//        return ad_list;
//    }


//    public List<SearchedJob> getJobcat_list() {
//        return jobcat_list;
//    }


    public List<SearchedJob> getLIST() {
        return LIST;
    }
}
