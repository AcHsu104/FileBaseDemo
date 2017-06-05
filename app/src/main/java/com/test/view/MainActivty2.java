package com.test.view;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;
import com.test.CalendarIntentHelper;
import com.test.R;
import com.test.databinding.MainBinding;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ac on 2016/11/16.
 */

public class MainActivty2 extends AppCompatActivity {
    MainBinding binding;
    String TAG = "MainActivty2";
    Activity mActivity;
    int PERMISSIONS_REQUEST_READ_CONTACTS = 500;

    private List<String> path = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = this;
        binding = DataBindingUtil.setContentView(
                this, R.layout.main);


        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

//        setContentView(R.layout.main);


//        RxJavaTest();
        if (ContextCompat.checkSelfPermission(mActivity, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            Log.i(TAG, "需要授权 ");
            if (ActivityCompat.shouldShowRequestPermissionRationale(mActivity, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                Log.i(TAG, "拒绝过了");
                // 提示用户如果想要正常使用，要手动去设置中授权。
                Toast.makeText(mActivity, "请在 设置-应用管理 中开启此应用的储存授权。", Toast.LENGTH_SHORT).show();
            } else {
                Log.i(TAG, "进行授权");
                ActivityCompat.requestPermissions(mActivity, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, PERMISSIONS_REQUEST_READ_CONTACTS);
            }
        } else {
            Log.i(TAG, "不需要授权 ");
            // 进行正常操作
//            openGalleryPick();
        }

    }

//    private void openGalleryPick(){
//        GalleryConfig galleryConfig = new GalleryConfig.Builder()
//                .imageLoader(new GlideImageLoader())    // ImageLoader 加载框架（必填）
//                .iHandlerCallBack(iHandlerCallBack)     // 监听接口（必填）
//                .provider("com.test.fileprovider")   // provider (必填)
//                .pathList(path)                         // 记录已选的图片
////                .multiSelect(false)                      // 是否多选   默认：false
//                .multiSelect(true, 9)                   // 配置是否多选的同时 配置多选数量   默认：false ， 9
//                .maxSize(9)                             // 配置多选时 的多选数量。    默认：9
//                .crop(false)                             // 快捷开启裁剪功能，仅当单选 或直接开启相机时有效
//                .crop(false, 1, 1, 500, 500)             // 配置裁剪功能的参数，   默认裁剪比例 1:1
//                .isShowCamera(true)                     // 是否现实相机按钮  默认：false
//                .filePath("/Gallery/Pictures")          // 图片存放路径
//                .build();
//
//        GalleryPick.getInstance().setGalleryConfig(galleryConfig).open(mActivity);
//    }
//
//    IHandlerCallBack iHandlerCallBack = new IHandlerCallBack() {
//        @Override
//        public void onStart() {
//            Log.i(TAG, "onStart: 开启");
//        }
//
//        @Override
//        public void onSuccess(List<String> photoList) {
//            Log.i(TAG, "onSuccess: 返回数据");
//            for (String s : photoList) {
//                Log.i(TAG, s);
//            }
//        }
//
//        @Override
//        public void onCancel() {
//            Log.i(TAG, "onCancel: 取消");
//        }
//
//        @Override
//        public void onFinish() {
//            Log.i(TAG, "onFinish: 结束");
//        }
//
//        @Override
//        public void onError() {
//            Log.i(TAG, "onError: 出错");
//        }
//    };

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String permissions[], @NonNull int[] grantResults) {
        if (requestCode == PERMISSIONS_REQUEST_READ_CONTACTS) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Log.i(TAG, "同意授权");
                // 进行正常操作。
//                openGalleryPick();
            } else {
                Log.i(TAG, "拒绝授权");
            }
        }
    }

    public void onViewClick(View view) {
        try {
            //建立事件開始時間
            Calendar beginTime = Calendar.getInstance();
            beginTime.set(2016, 11, 17, 14, 55);
//建立事件結束時間
            Calendar endTime = Calendar.getInstance();
            endTime.set(2016, 11, 17, 14, 57);
//建立 CalendarIntentHelper 實體
            CalendarIntentHelper calIntent = new CalendarIntentHelper();
//設定值
            calIntent.setTitle("事件標題");
            calIntent.setDescription("事件內容描述");
            calIntent.setBeginTimeInMillis(beginTime.getTimeInMillis());
            calIntent.setEndTimeInMillis(endTime.getTimeInMillis());
            calIntent.setLocation("事件地點");
//全部設定好後就能夠取得 Intent
            Intent intent = calIntent.getIntentAfterSetting();
//送出意圖
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
//            ActivityNotFoundException
            Toast.makeText(getApplicationContext(), "無安裝的應用程式可選取", Toast.LENGTH_SHORT).show();
        }

    }

    private void RxJavaTest() {

//        Observable observable =
                Observable.create(new Observable.OnSubscribe<String>(){
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("Hello");
                subscriber.onNext("Hi");
                subscriber.onNext("Aloha");
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io())  // 指定 subscribe() 发生在 IO 线程
                .observeOn(AndroidSchedulers.mainThread())  // 指定 Subscriber 的回调发生在主线程
                .subscribe(new Observer<String>() {
                    @Override
                    public void onCompleted() {
                        Log.e("onCompleted", "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(String s) {
                        Log.e("onNext", s);
                    }
                });



        //等於
//        Observable observable = Observable.just("Hello", "Hi", "Aloha");

//        String[] words = {"Hello", "Hi", "Aloha"};
//        Observable observable = Observable.from(words);
//        // 将会依次调用：
//        // onNext("Hello");
//        // onNext("Hi");
//        // onNext("Aloha");
//        // onCompleted();

    }
}
