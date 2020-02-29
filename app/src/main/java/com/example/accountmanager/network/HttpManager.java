package com.example.accountmanager.network;

import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpManager {
    private int TIME_OUT = 3;//请求超时

    public OkHttpClient getHttpClient() {
        return new OkHttpClient.Builder()
                .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
                .build();

    }

    public void getManager(){
        Retrofit retrofit = new Retrofit.Builder()
                .client(getHttpClient())
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm").create()))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(NetInterface.base_url)
                .build();
//                .create(NetInterface.class);
    }



}
