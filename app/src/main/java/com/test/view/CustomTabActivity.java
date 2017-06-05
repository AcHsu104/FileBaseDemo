//package com.test.view;
//
//import android.app.PendingIntent;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.net.Uri;
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.customtabs.CustomTabsIntent;
//import android.support.v7.app.AppCompatActivity;
//
//import com.test.R;
//
///**
// * Created by ac on 2017/2/6.
// */
//
//public class CustomTabActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        CustomTabsIntent.Builder intentBuilder = new CustomTabsIntent.Builder();
//// 修改 ActionBar 的颜色
//        intentBuilder.setToolbarColor(color);
//// 添加一个分享按钮
//        String shareLabel = getString(R.string.label_action_share);
//        Bitmap icon = BitmapFactory.decodeResource(getResources(),android.R.drawable.ic_menu_share);
//        PendingIntent pendingIntent = createPendingIntent();
//        intentBuilder.setActionButton(icon, shareLabel, pendingIntent);
////是否显示网页标题
//        intentBuilder.setShowTitle(mShowTitleCheckBox.isChecked());
////自定义关闭 Custom tabs 的图标
//        intentBuilder.setCloseButtonIcon(BitmapFactory.decodeResource(getResources(), R.drawable.ic_arrow_back));
////自定义 Activity 转场 动画
//        intentBuilder.setStartAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
//        intentBuilder.setExitAnimations(this, android.R.anim.slide_in_left,android.R.anim.slide_out_right);
//// 最后调用助手类 CustomTabActivityHelper 的 openCustomTab 函数来打开一个网址
//        CustomTabActivityHelper.openCustomTab(this, intentBuilder.build(), Uri.parse(url), new WebviewFallback());
////        上面的 WebviewFallback 是一个回调接口实现，如果用户手机不支持 Chrome Custom tabs 功能，则调用该接口的 openUri 函数，这里面可以用之前的方式来打开网页，比如用 WebView 或者 用系统第三方浏览器。
////        另外在 这里 和 这里 还有其他高级用法的示例，可以进一步参考，比如： MainActivity.java 中，可以在 Activity.onStart 中先通过 CustomTabsClient.bindCustomTabsService(Context context, String packageName, CustomTabsServiceConnection connection) 函数来绑定到 CustomTabsService,绑定成功后，在通过 CustomTabsClient.warmup(long flags) 函数来预加载 Chrome,这些 Chrome 会加载一些基本控件，这样当打开的时候速度就会比较快；还可以通过CustomTabsClient.newSession(CustomTabsCallback callback) 函数来获取一个 Custom tabs 的回话，在 Callback 中可以监听该回话的导航操作，比如导航是失败了还是成功了。
////        可见，只是显示个网页，用 Custom Tabs 还是非常简单的，虽然在国内 Android 手机大部分都用的不是 Chrome 浏览器，还是建议开发者加上该功能，万一遇到几个用户使用了最新版本的 Chrome 浏览器，当他们使用您的应用的时候，是不是会眼前一亮呢？
//
//    }
//}
