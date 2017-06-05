package com.test;

import org.json.JSONObject;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ac on 2016/11/10.
 */

public class HttpClient {
    private static String API_SERVER = "https://cms.straas.io/api/";
    private static HttpClient httpClient;

    private Retrofit retrofit;

    public static boolean Debug = true;
    public static boolean RxDemo = false;

    public HttpClient(){
        OkHttpClient.Builder client = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS);

        if(Debug){
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            client.addInterceptor(loggingInterceptor);
        }


        if(RxDemo){
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(API_SERVER)
                    .client(client.build())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
        }else{
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(API_SERVER)
                    .client(client.build())
                    .build();
        }

    }



    public static HttpClient getInstance(){
        if(httpClient == null){
            httpClient = new HttpClient();
        }
        return httpClient;
    }


    public <T> T init(final Class<T> service){
//        OkHttpClient.Builder client = new OkHttpClient.Builder();
//        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
//        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        client.addInterceptor(loggingInterceptor);
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .addConverterFactory(GsonConverterFactory.create())
//                .baseUrl(API_SERVER)
//                .client(client.build())
//                .build();
        return retrofit.create(service);
    }

     public static RequestBody getJsonBody(Map<String, String> query){
         RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"),(new JSONObject(query)).toString());
         return body;
     }

}
