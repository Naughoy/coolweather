package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by yxh18_000 on 2017/3/3 0003.
 */

public class HttpUtil {
    public  static void sendOkHttpRequest(String address,okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback); //注册一个回调来处理服务器响应
    }
}
