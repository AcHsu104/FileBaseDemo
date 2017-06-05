package com.test.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;

/**
 * Created by ac on 2017/2/6.
 */

public class ChromeActivtiy extends AppCompatActivity{
//    EditText

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Html.fromHtml()
        String formatted = "";
        Spannable spannable = new SpannableString(formatted);
        Html.toHtml(spannable);
//        EditText
    }
}
