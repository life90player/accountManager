package com.example.accountmanager.network;

import androidx.annotation.NonNull;

import com.example.accountmanager.utils.LogUtils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpManager {
     //超时时间
    private final static int DEFAULT_TIME = 5;

    public static NetInterface getManager() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ServerConfig.baseUrl)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(getOkHttpClient()).build();
        return retrofit.create(NetInterface.class);
    }

    private static OkHttpClient getOkHttpClient() {
        //日志显示级别
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
        //新建log拦截器
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(@NonNull String message) {
                LogUtils.INSTANCE.d(getClass(), "OkHttp====Message:" + message);
            }
        });
        loggingInterceptor.setLevel(level);
        // 网络访问
        return new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .connectTimeout(DEFAULT_TIME, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_TIME, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIME, TimeUnit.SECONDS)
                .build();
    }

    public static<T> Map<String,String> formatParams(T t){
        Map<String,String> map = new HashMap<>();
        for (Field f: t.getClass().getDeclaredFields()){
            try {
                map.put(f.getName(),String.valueOf(f.get(t)));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

}
