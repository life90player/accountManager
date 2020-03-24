package com.example.accountmanager.utils

import android.util.Log

import com.example.accountmanager.BuildConfig
import com.example.accountmanager.bean.BaseResponse
import com.example.accountmanager.bean.UnbackBean
import com.example.accountmanager.network.HttpManager

import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

object LogUtils {

    fun d(c: Class<*>, message: String) {
        if (BuildConfig.DEBUG) {
            Log.d(c.simpleName, message)
        }
        HttpManager.getManager()
                .postUnBackOrder(HttpManager.formatParams(UnbackBean()))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Subscriber<BaseResponse<String>>() {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {

                    }

                    override fun onNext(stringBaseResponse: BaseResponse<String>) {

                    }
                })

    }

}
