package com.test.presenter;

import android.util.Log;

import com.test.contract.MainActivityContract;
import com.test.server.Api;
import com.test.server.BaseModel;
import com.test.server.JobModel;
import com.test.server.QueryKey;

import java.util.HashMap;
import java.util.Map;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ac on 2016/11/3.
 */

public class MainPresenter implements MainActivityContract.Presenter{

    private MainActivityContract.View mainActivityContractView;
    public String API_SERVER = "m.e104.com.tw";
    /*- lab機:m.e104.com.tw(172.19.1.77)*/
    private int page = 0;

    public MainPresenter(MainActivityContract.View mainActivityContractView){
        this.mainActivityContractView = mainActivityContractView;
    }


    @Override
    public void start() {

    }

    @Override
    public void queryData() {
        if(mainActivityContractView != null)
            mainActivityContractView.onLoading();


        Map<String, String> query = new HashMap<String, String>();
        query.put(QueryKey.ID_CK, "");
        query.put(QueryKey.ID_CK_N, "");
        query.put(QueryKey.DEVICE_ID, "");
        // 20150908 add device_type
        query.put(QueryKey.DEVICE_TYPE, "2");
        query.put(QueryKey.KWS, "104");

        query.put(QueryKey.PAGE, String.valueOf(page));

        OkHttpClient.Builder client = new OkHttpClient.Builder();
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        client.addInterceptor(loggingInterceptor);

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://" + API_SERVER)
                .client(client.build())
                .build();
        Api service = retrofit.create(Api.class);



        Call<BaseModel<JobModel>> call = service.searchJobTest(query);

        call.enqueue(new Callback<BaseModel<JobModel>>() {
            @Override
            public void onResponse(Call<BaseModel<JobModel>> call, Response<BaseModel<JobModel>> response) {
                if(mainActivityContractView != null)
                    mainActivityContractView.onLoadingFinish();

                //请求成功操作
                Log.e("onResponse", response.message());
                Log.e("onResponse", response.body().toString());
                if(mainActivityContractView != null)
                    mainActivityContractView.onShowResult(response.body());
            }
            @Override
            public void onFailure(Call<BaseModel<JobModel>> call, Throwable t) {
                //请求失败操作
//                Log.e("onFailure", t.printStackTrace());
                if(mainActivityContractView != null)
                    mainActivityContractView.onLoading();

                if(mainActivityContractView != null)
                    mainActivityContractView.onLoading();

                t.printStackTrace();

            }
        });

//        Call<Result<List<SearchedJob>>> call = service.searchJob(query);
//        call.enqueue(new Callback<Result<List<SearchedJob>>>() {
//            @Override
//            public void onResponse(Call<Result<List<SearchedJob>>> call, Response<Result<List<SearchedJob>>> response) {
//                if(mainActivityContractView != null)
//                    mainActivityContractView.onLoadingFinish();
//
//                //请求成功操作
//                Log.e("onResponse", response.message());
//                Log.e("onResponse", response.body().toString());
//                if(mainActivityContractView != null)
//                    mainActivityContractView.onShowResult(response.body());
//            }
//            @Override
//            public void onFailure(Call<Result<List<SearchedJob>>> call, Throwable t) {
//                //请求失败操作
////                Log.e("onFailure", t.printStackTrace());
//                if(mainActivityContractView != null)
//                    mainActivityContractView.onLoading();
//
//                if(mainActivityContractView != null)
//                    mainActivityContractView.onLoading();
//
//                t.printStackTrace();
//
//            }
//        });
    }
}
