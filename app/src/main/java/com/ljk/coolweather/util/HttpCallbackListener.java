package com.ljk.coolweather.util;

/**
 * Created by LJK on 2016/7/31.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
