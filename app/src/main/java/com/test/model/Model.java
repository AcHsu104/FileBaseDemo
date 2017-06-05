package com.test.model;

import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Model extends BaseObservable{
    public final  ObservableField<String> name = new ObservableField<>();
    public final  ObservableField<String> tel = new ObservableField<>();
    public final  ObservableField<String> url = new ObservableField<>();
//    String name;
//    String tel = "hello";
//    String url = "https://www.gstatic.com/images/branding/googlelogo/2x/googlelogo_color_284x96dp.png";

//    @Bindable
//    public String getName() {
//        return name;
//    }
//    @Bindable
//    public String getTel() {
//        return tel;
//    }

//    public void setName(String name) {
//        this.name = name;
//        notifyPropertyChanged(BR.name);
//    }
//
//    public void setTel(String tel) {
//        this.tel = tel;
//        notifyPropertyChanged(BR.tel);
//    }

//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }

    @BindingAdapter("android:src")
    public static void setImageUrl(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).into(view);
    }

//        @BindingAdapter("onClick")
//        public void onModelCilck(Model model){
//            model.setTel("86868686");
////            if(binding != null)
////                binding.setModel(model);
//        }

//    @BindingAdapter("android:onClick")
//    public static void onModelCilck(View view){
////            model.setTel("86868686");
////            if(binding != null)
////                binding.setModel(model);
//    }

    public static String capitalize(final String word) {
        if (word != null && word.length() > 1) {
            return String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
        }
        return word;
    }
}