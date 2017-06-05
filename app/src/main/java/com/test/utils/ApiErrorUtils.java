package com.test.utils;

import com.google.gson.Gson;
import com.test.samodel.ApiError;

import java.io.IOException;

import retrofit2.Response;
import retrofit2.adapter.rxjava.HttpException;

/**
 * Created by ac on 2016/11/11.
 */

public class ApiErrorUtils {

    public static ApiError parseError(Response<?> response) {
        try {
            return new Gson().fromJson(response.errorBody().string(),
                    ApiError.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ApiError handle(Throwable throwable) {
        if (throwable instanceof HttpException) {
            HttpException error = (HttpException) throwable;
            try {
                return new Gson().fromJson(error.response().errorBody().string(),
                        ApiError.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throwable.printStackTrace();
        }
        return null;
    }
}
