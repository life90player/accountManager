package com.example.accountmanager.network;

import com.example.accountmanager.bean.BaseResponse;

import java.util.Map;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

public interface NetInterface {

    @GET("user")
    Observable<BaseResponse<String>> getUnBackOrder();

    @POST("account/insertUnBackOrder")
    @FormUrlEncoded
    Observable<BaseResponse<String>> postUnBackOrder(@FieldMap Map<String,String> params);

}
