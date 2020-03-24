package com.example.accountmanager.module.unBack

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.accountmanager.base.BaseSubscriber
import com.example.accountmanager.base.BaseViewModel
import com.example.accountmanager.bean.BaseResponse
import com.example.accountmanager.bean.UnbackBean
import com.example.accountmanager.network.HttpManager
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class UnBackModel : BaseViewModel() {
    val mData: MutableLiveData<List<UnbackBean>> by lazy {
        val d = MutableLiveData<List<UnbackBean>>()
        d.value = ArrayList()
        d
    }
    val mPostOrder:LiveData<UnbackBean> by lazy {
        MutableLiveData<UnbackBean>(UnbackBean())
    }

    fun requestData() {
//        val list = DataMonitor.unbackList
//        mData.value = list
    }

    fun createUnBackOrder(){
        HttpManager.getManager()
                .postUnBackOrder(HttpManager.formatParams(mPostOrder.value))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object:BaseSubscriber<BaseResponse<String>>(){
                    override fun onStart() {
                        showPrograss()
                    }

                    override fun onCompleted() {
                        hidePrograss()
                    }

                    override fun onError(e: Throwable) {
                        showTost(e.message)
                    }

                    override fun onNext(t: BaseResponse<String>) {
                        showTost(t.message)
                    }
                })
    }

}

