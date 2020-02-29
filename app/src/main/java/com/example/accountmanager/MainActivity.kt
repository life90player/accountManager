package com.example.accountmanager

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.accountmanager.base.BaseActivity

class MainActivity : BaseActivity() {
    private val mList = ArrayList<String>()
    private val mTestData:MutableLiveData<List<String>> = MutableLiveData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_main)
        mTestData.value = mList
        mTestData.observe(this,Observer{
            strings->showToast("dataChange")
        })
    }


}
