package com.test;

import android.app.Application;
import android.content.SharedPreferences;

public class MainApp extends Application
{
    private static MainApp mainApp;

//    client_id: fb8a9cbaaf663a5c
//    client_secret : otOoN3Exv5QIZsfV
    public String client_id = "fb8a9cbaaf663a5c";
    public String client_secret = "otOoN3Exv5QIZsfV";

    public String member_id = "104.com.tw-test";

    private final String TOKEN = "token";
    private final String TOKEN_TIME = "token_time";

    public final long dayUnixTime = 24 * 60 * 60;

    public static MainApp getInstance(){
        if(mainApp == null)
            mainApp = new MainApp();
        return mainApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mainApp = this;
    }

    public void setToken(String token){
        SharedPreferences settings = getSharedPreferences("104group",
                MODE_WORLD_READABLE);
        SharedPreferences.Editor PE = settings.edit();
        PE.putString(TOKEN, token);
        PE.commit();
    }

    public String getToken(){
        SharedPreferences settings = getSharedPreferences("104group",
                MODE_WORLD_READABLE);
        return settings.getString(TOKEN, "");
    }

    public void setTokenTime(long token_time){
        SharedPreferences settings = getSharedPreferences("104group",
                MODE_WORLD_READABLE);
        SharedPreferences.Editor PE = settings.edit();
        PE.putLong(TOKEN_TIME, token_time);
        PE.commit();
    }

    public long getTokenTime(){
        SharedPreferences settings = getSharedPreferences("104group",
                MODE_WORLD_READABLE);
        return settings.getLong(TOKEN_TIME, 0);
    }
}
