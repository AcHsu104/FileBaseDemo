package com.test.server;

/**
 * Created by ac on 2016/11/3.
 */

public class BaseModel<T> {
    private String STATUS;
    private T OBJECT;

    public String getSTATUS() {
        return STATUS;
    }

    public T getOBJECT() {
        return OBJECT;
    }
}
