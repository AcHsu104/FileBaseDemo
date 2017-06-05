package com.test;

/**
 * Created by ac on 2017/1/23.
 */

public class TestModel {
    static {
        System.loadLibrary("jniLib");
    }

    public native String StringFromJNI();
}
