package com.example.accountmanager.module.unBack

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.accountmanager.bean.UnbackBean
import com.example.accountmanager.module.monitData.DataMonitor

class UnBackModel : ViewModel() {
    private val mData: MutableLiveData<List<UnbackBean>> by lazy {
        val d = MutableLiveData<List<UnbackBean>>()
        d.value = ArrayList()
        d
    }

    val listLiveData: MutableLiveData<List<UnbackBean>>
        get() {
            return mData
        }

    fun requestData() {
        val list = DataMonitor.unbackList
        mData.value = list
    }

}
