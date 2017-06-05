package com.test.view;

import android.content.ContentValues;
import android.database.Cursor;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.test.HttpClient;
import com.test.MainApp;
import com.test.R;
import com.test.TestModel;
import com.test.contentprovider.NotePad;
import com.test.contract.MainActivityContract;
import com.test.databinding.ActivityMainBinding;
import com.test.model.Model;
import com.test.query.SaQueryKey;
import com.test.samodel.Catalog;
import com.test.samodel.Live;
import com.test.samodel.LiveDetail;
import com.test.samodel.Member;
import com.test.samodel.MemberToken;
import com.test.samodel.Token;
import com.test.server.Api;
import com.test.server.BaseModel;
import com.test.server.JobModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    private MainActivityContract.Presenter mainPresenter;
//    https://cms.straas.io/api/<API_VERSION>/<API_TYPE>/<RESOURCE>
    private String API_SERVER = "https://cms.straas.io/api/";

    private Token token;

    @Override
    public void onLoading() {
        binding.progressbar.setVisibility(View.VISIBLE);
    }

    @Override
    public void onLoadingFinish() {
        binding.progressbar.setVisibility(View.GONE);
    }

    @Override
    public void onResultError() {
        Toast.makeText(this, "Query Fail", Toast.LENGTH_SHORT);
    }

    @Override
    public void onShowResult(BaseModel<JobModel> result) {
        if(result != null && result.getOBJECT().getLIST() != null)
            binding.setName(result.getOBJECT().getRECORDCOUNT());

        binding.recyclerview.setAdapter(new CustomAdapter(result.getOBJECT().getLIST()));
    }

    @Override
    public void setPresenter(MainActivityContract.Presenter presenter) {

    }

//    public class EventHandler extends BaseObservable {
////        public void onTaskClickWithParams(View view, Task task) {
////            task.run();
////        }
//
//        public void onModelCilck(Model model){
//            model.tel.set("86868686");
////            if(binding != null)
////                binding.setModel(model);
//        }
//
//        public void onModelCilck(){
////            model.setTel("86868686");
////            if(binding != null)
////                binding.setModel(model);
//        }
//
//    }



//    public static String API_SERVER = "m.e104.com.tw";
///*- lab機:m.e104.com.tw(172.19.1.77)*/
//    private int page = 0;
    private ActivityMainBinding binding;
    public String name = "123";

    private Model model = new Model();

    public String getName() {
        return name;
    }

    public View.OnClickListener avatarClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//            getToken(MainApp.getInstance().client_id, MainApp.getInstance().client_secret);
            getToken(MainApp.getInstance().client_id, MainApp.getInstance().client_secret);
//            Toast.makeText(MainActivity.this, model.name.get()
//                    , Toast.LENGTH_SHORT).show();
//            mBinding.setImageUrl(Randoms.nextImgUrl());
        }
    };

    public void onBtnClick(View view){
        //handler code...
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);


        binding = DataBindingUtil.setContentView(
                this, R.layout.activity_main);

        binding.setHandler(this);

        TestModel mTestModel = new TestModel();
        Log.e(getLocalClassName(), mTestModel.StringFromJNI());

        if(TextUtils.isEmpty(MainApp.getInstance().getToken()) ||
                (System.currentTimeMillis() / 1000) -  MainApp.getInstance().getTokenTime() > MainApp.getInstance().dayUnixTime){
            getToken(MainApp.getInstance().client_id, MainApp.getInstance().client_secret);
        }else
        {
            token = new Token();
            token.setToken(MainApp.getInstance().getToken());
            binding.txtTel.setText("Token : " + (!TextUtils.isEmpty(token.getToken()) ?
                    token.getToken() : "non token"));
        }

//        binding.setModel(model);
//        model.url.set("https://www.gstatic.com/images/branding/googlelogo/2x/googlelogo_color_284x96dp.png");


//        //点击按钮改变User的数据
//        binding.btn.setOnClickListener(new android.view.View.OnClickListener() {
//            @Override
//            public void onClick(android.view.View v) {
//                getToken(MainApp.getInstance().client_id, MainApp.getInstance().client_secret);
//            }
//        });

        //点击按钮改变User的数据
        binding.btn2.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
//                model.tel.set("world");
//                model.setUserPassword("87654321");
//                getLive();
                createMemberToken();
            }
        });


        //点击按钮改变User的数据
        binding.btn3.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
//                model.tel.set("world");
//                model.setUserPassword("87654321");

                createMember();
//                getLiveDetail("AP4FWsbL");

//                Intent intent = new Intent(MainActivity.this, MainActivty2.class);
//                startActivity(intent);


            }
        });


        //点击按钮改变User的数据
        binding.btn4.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
            insert();
            }
        });

        binding.btn5.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                displayNote();
            }
        });

//        mainPresenter = new MainPresenter(this);
//        mainPresenter.queryData();

//        model.setTel("world");

//        binding.setName("123456");
        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        binding.recyclerview.setHasFixedSize(true);
        binding.recyclerview.setLayoutManager(mLinearLayoutManager);


//        Map<String, String> query = new HashMap<String, String>();
//        query.put(QueryKey.ID_CK, "");
//        query.put(QueryKey.ID_CK_N, "");
//        query.put(QueryKey.DEVICE_ID, "");
//        // 20150908 add device_type
//        query.put(QueryKey.DEVICE_TYPE, "2");
//        query.put(QueryKey.KWS, "104");
//
//        query.put(QueryKey.PAGE, String.valueOf(page));
//
//        OkHttpClient.Builder client = new OkHttpClient.Builder();
//        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
//        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        client.addInterceptor(loggingInterceptor);
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .addConverterFactory(GsonConverterFactory.create())
//                .baseUrl("http://" + API_SERVER)
//                .client(client.build())
//                .build();
//        Api service = retrofit.create(Api.class);
//
//
//        Call<Result<List<SearchedJob>>> call = service.searchJob(query);
//        call.enqueue(new Callback<Result<List<SearchedJob>>>() {
//            @Override
//            public void onResponse(Call<Result<List<SearchedJob>>> call, Response<Result<List<SearchedJob>>> response) {
//                //请求成功操作
//                Log.e("onResponse", response.message());
//                Log.e("onResponse", response.body().toString());
//            }
//            @Override
//            public void onFailure(Call<Result<List<SearchedJob>>> call, Throwable t) {
//                //请求失败操作
////                Log.e("onFailure", t.printStackTrace());
//                t.printStackTrace();
//            }
//        });


//        query.put(QueryKey.PAGE_SIZE, MainApp.getInstance().pageSize);
//        query.put(MainApp.getInstance().query_device_id,
//                MainApp.getInstance().device_id_hash);
    }

//    protected StringBuffer queryToQueryString(Map<String, String> query) {
//        StringBuffer queryStr = new StringBuffer();
//        if (query != null && query.size() > 0) {
//            Set<String> keys = query.keySet();
//            for (String key : keys) {
//                queryStr.append(key).append("=").append(query.get(key))
//                        .append("&");
//            }
//
//            queryStr.append("random=").append(System.currentTimeMillis());
//
//            //queryStr.deleteCharAt(queryStr.length() - 1);
//        }
//        return queryStr;
//    }

    private void insert(){
        /*插入数据*/
        ContentValues values = new ContentValues();
        values.put(NotePad.Notes.TITLE, "title1");
        values.put(NotePad.Notes.NOTE, "NOTENOTE1");
        getContentResolver().insert(NotePad.Notes.CONTENT_URI, values);

        values.clear();
        values.put(NotePad.Notes.TITLE, "title2");
        values.put(NotePad.Notes.NOTE, "NOTENOTE2");
        getContentResolver().insert(NotePad.Notes.CONTENT_URI, values);
    }

    private void displayNote(){
        String columns[] = new String[] { NotePad.Notes._ID,
                NotePad.Notes.TITLE,
                NotePad.Notes.NOTE,
                NotePad.Notes.CREATEDDATE,
                NotePad.Notes.MODIFIEDDATE};

        Uri myUri = NotePad.Notes.CONTENT_URI;
        Cursor cur = managedQuery(myUri, columns, null, null, null);
        if (cur.moveToFirst()) {
            String id = null;
            String titile = null;
            do {
                id = cur.getString(cur.getColumnIndex(NotePad.Notes._ID));
                titile = cur.getString(cur.getColumnIndex(NotePad.Notes.TITLE));
                binding.editText.append("TITILE:"+id + "\t" + "NOTE:" + titile + "\n");
//                Toast toast = Toast.makeText(this, "TITILE:"+id + "\t" + "NOTE:" + titile, Toast.LENGTH_LONG);
//                toast.setGravity(Gravity.TOP|Gravity.CENTER, 0, 40);
//                toast.show();
            } while (cur.moveToNext());
        }
    }

    private void getLiveDetail(String live_id){
        Map<String, String> query = new HashMap<String, String>();
//        query.put(SaQueryKey.CLIENT_ID, client_id);
//        query.put(SaQueryKey.CLIENT_SECRET, client_secret);
        query.put("includes", "category,owner");


        Call<LiveDetail> call = /*new HttpClient().init(Api.class)*/
                HttpClient.getInstance().init(Api.class).getLiveDetails((token != null ? "Bearer " + token.getToken() : "") , live_id , query);

        call.enqueue(new Callback<LiveDetail>() {
            @Override
            public void onResponse(Call<LiveDetail> call, Response<LiveDetail> response) {
                //请求成功操作
                Log.e("onResponse", response.message());
                binding.editText.setText(response.message());
                if(response != null && response.body() != null){
                    Log.e("onResponse", response.body().toString());
                }

            }
            @Override
            public void onFailure(Call<LiveDetail> call, Throwable t) {
                //请求失败操作
                t.printStackTrace();
            }
        });
    }

    private void getLive(){
        Map<String, String> query = new HashMap<String, String>();
//        query.put(SaQueryKey.CLIENT_ID, client_id);
//        query.put(SaQueryKey.CLIENT_SECRET, client_secret);
        query.put("status", "ready,started");

        Call<List<Live>> call = /*new HttpClient().init(Api.class).*/
                HttpClient.getInstance().init(Api.class).getLives((token != null ? "Bearer " + token.getToken() : "") , query);

        call.enqueue(new Callback<List<Live>>() {
            @Override
            public void onResponse(Call<List<Live>> call, Response<List<Live>> response) {
                //请求成功操作
                Log.e("onResponse", response.message());
                binding.editText.setText(response.message());

                if(response.errorBody() != null) {
//                    ApiErrorUtils.parseError(response).getError();
                    getToken(MainApp.getInstance().client_id, MainApp.getInstance().client_secret);
                }else{
                    if(response != null && response.body() != null){
                        Log.e("onResponse", response.body().toString());
                    }
                }

            }
            @Override
            public void onFailure(Call<List<Live>> call, Throwable t) {
                //请求失败操作
                t.printStackTrace();
            }
        });
    }

    private void getCatalog(){
        Map<String, String> query = new HashMap<String, String>();
//        query.put(SaQueryKey.CLIENT_ID, client_id);
//        query.put(SaQueryKey.CLIENT_SECRET, client_secret);

        Call<List<Catalog>> call = /*new HttpClient().init(Api.class).*/
                HttpClient.getInstance().init(Api.class).getCategories((token != null ? "Bearer " + token.getToken() : "") , query);
        call.enqueue(new Callback<List<Catalog>>() {
            @Override
            public void onResponse(Call<List<Catalog>> call, Response<List<Catalog>> response) {
                //请求成功操作
                Log.e("onResponse", response.message());
                if(response != null && response.body() != null){
                    Log.e("onResponse", response.body().toString());
                }

            }
            @Override
            public void onFailure(Call<List<Catalog>> call, Throwable t) {
                //请求失败操作
                t.printStackTrace();
            }
        });
    }

    private void getToken(String client_id, String client_secret){
        Map<String, String> query = new HashMap<String, String>();
        query.put(SaQueryKey.CLIENT_ID, client_id);
        query.put(SaQueryKey.CLIENT_SECRET, client_secret);

        Call<Token> call = /*new HttpClient().init(Api.class).*/
                HttpClient.getInstance().init(Api.class).getToken(HttpClient.getJsonBody(query));


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
//        Api service = retrofit.create(Api.class);
//
//
//        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"),(new JSONObject(query)).toString());
//
//        Call<Token> call = service.getToken(body);

        call.enqueue(new Callback<Token>() {
            @Override
            public void onResponse(Call<Token> call, Response<Token> response) {
//                if(mainActivityContractView != null)
//                    mainActivityContractView.onLoadingFinish();

                //请求成功操作
                Log.e("onResponse", response.message());
                Log.e("onResponse", response.body().toString());

                if(response != null && response.body() != null){
                    token = response.body();
                    if(token != null){
                        binding.txtTel.setText("Token : " + (!TextUtils.isEmpty(token.getToken()) ?
                                token.getToken() : "non token"));
                        MainApp.getInstance().setToken(token.getToken());
                        MainApp.getInstance().setTokenTime(System.currentTimeMillis() / 1000);
                    }

                }
//                if(mainActivityContractView != null)
//                    mainActivityContractView.onShowResult(response.body());
            }
            @Override
            public void onFailure(Call<Token> call, Throwable t) {
                //请求失败操作
//                Log.e("onFailure", t.printStackTrace());
//                if(mainActivityContractView != null)
//                    mainActivityContractView.onLoading();
//
//                if(mainActivityContractView != null)
//                    mainActivityContractView.onLoading();

                t.printStackTrace();

            }
        });


//        Call<Token> call_ = /*new HttpClient().init(Api.class).*/
//                HttpClient.getInstance().init(Api.class).getToken_(HttpClient.getJsonBody(query))
//                        .subscribeOn(Schedulers.newThread())
//                        .observeOn(AndroidSchedulers.mainThread())
//                        .subscribe(new Observer<Token>() {
//                            @Override
//                            public void onCompleted() {
//                                Log.e("onCompleted", "onCompleted");
//                            }
//
//                            @Override
//                            public void onError(Throwable e) {
//                                Log.e("onError", "onError");
//                            }
//
//                            @Override
//                            public void onNext(Token token) {
//                                Log.e("onNext", token.getToken());
//                            }
//                        });

    }

    private void createMember(){
        Map<String, String> query = new HashMap<String, String>();
//        query.put(SaQueryKey.CLIENT_ID, client_id);
//        query.put(SaQueryKey.CLIENT_SECRET, client_secret);
        if(!TextUtils.isEmpty(binding.editIdText.getText().toString())){
            query.put("id", binding.editIdText.getText().toString());
            query.put("name", binding.editIdText.getText().toString());
        }

        if(!TextUtils.isEmpty(binding.editEmailText.getText().toString())){
            query.put("email", binding.editEmailText.getText().toString());
        }

        query.put("avatar_url", "https://free.com.tw/blog/wp-content/uploads/2014/08/Placekitten480-g.jpg");
        query.put("personal_url", "https://free.com.tw/blog/wp-content/uploads/2014/08/Placekitten480-g.jpg");


        Call<Member> call = /*new HttpClient().init(Api.class)*/
                HttpClient.getInstance().init(Api.class).createNewMember((token != null ? "Bearer " + token.getToken() : "") , HttpClient.getJsonBody(query));

        call.enqueue(new Callback<Member>() {
            @Override
            public void onResponse(Call<Member> call, Response<Member> response) {
                //请求成功操作
                Log.e("onResponse", response.message());
//                binding.editText.setText(response.message());
                if(response != null && response.body() != null){
                    Log.e("onResponse", response.body().toString());
                }

            }
            @Override
            public void onFailure(Call<Member> call, Throwable t) {
                //请求失败操作
                t.printStackTrace();
            }
        });
    }

    private void createMemberToken(){
        String memberId = "";

        if(!TextUtils.isEmpty(binding.editIdText.getText().toString())){
            memberId = binding.editIdText.getText().toString();
        }else{
            memberId = "achsu";
        }

        Call<MemberToken> call = /*new HttpClient().init(Api.class)*/
                HttpClient.getInstance().init(Api.class).createMemberToken((token != null ? "Bearer " + token.getToken() : "") , memberId);

        call.enqueue(new Callback<MemberToken>() {
            @Override
            public void onResponse(Call<MemberToken> call, Response<MemberToken> response) {
                //请求成功操作
                Log.e("onResponse", response.message());
                binding.editText.setText(response.message());
                if(response != null && response.body() != null){
                    Log.e("onResponse", response.body().toString());
                }

            }
            @Override
            public void onFailure(Call<MemberToken> call, Throwable t) {
                //请求失败操作
                t.printStackTrace();
            }
        });
    }

    private void refreshMemberToken(){
        Map<String, String> query = new HashMap<String, String>();
//        query.put(SaQueryKey.CLIENT_ID, client_id);
//        query.put(SaQueryKey.CLIENT_SECRET, client_secret);
        query.put("refresh_token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiYWYzYThiZmJhODQ3NTYwYjgwMWRmODA4OTcwYzBlMjMiLCJyZXhwIjoxNDg3MjM4ODYyLCJleHAiOjE0Nzg2ODUyNjJ9.75BXKRjhaltOlAyI89EwdE9-yiYAhvSnfivmPk3SwZw");


        Call<MemberToken> call = /*new HttpClient().init(Api.class)*/
                HttpClient.getInstance().init(Api.class).refreshMemberToken((token != null ? "Bearer " + token.getToken() : "") , HttpClient.getJsonBody(query));

        call.enqueue(new Callback<MemberToken>() {
            @Override
            public void onResponse(Call<MemberToken> call, Response<MemberToken> response) {
                //请求成功操作
                Log.e("onResponse", response.message());
                binding.editText.setText(response.message());
                if(response != null && response.body() != null){
                    Log.e("onResponse", response.body().toString());
                }

            }
            @Override
            public void onFailure(Call<MemberToken> call, Throwable t) {
                //请求失败操作
                t.printStackTrace();
            }
        });
    }

}
