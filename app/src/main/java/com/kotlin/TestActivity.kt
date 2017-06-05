package com.kotlin

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.test.R;
import com.test.databinding.ActivityMainBinding
import junit.framework.Test

//import kotlin.jvm.javaClass;

/**
 * Created by ac on 2017/6/5.
 */

public class TestActivity: AppCompatActivity(){

    var databinding: ActivityMainBinding = null!!;

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main);

        databinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main);

        databinding.btn.setOnClickListener { databinding.btn.setText("HelloBtn"); }

//        var intent = Intent(this, javaClass<TestActivity>);

        databinding.btn2.setOnClickListener {
//            var intent = Intent(this, TestActivity::class);
//            startActivity(intent);

//            startActivity<TestActivity>()
            startActivity(Intent(this, TestActivity::class))
        }

    }

    fun test() = async(){

    }
}