package com.example.accountmanager.widget.dropDialog

import android.content.Context
import android.view.LayoutInflater
import android.widget.PopupWindow
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.accountmanager.R

class DrapDialog(private val mContext: Context) {
    private val mPopWindow: PopupWindow = PopupWindow(mContext)
    private val mRvData: RecyclerView
    private val mList:ArrayList<String> = ArrayList()
    private val mListLive:MutableLiveData<ArrayList<String>> = MutableLiveData()


    init {
        val v = LayoutInflater.from(mContext).inflate(R.layout.diaog_drop, null)
        mPopWindow.contentView = v
        mRvData = v.findViewById(R.id.rv_data)
        mRvData.adapter = DropAdapter(R.layout.item_drop,mList)
        val adapter = DropAdapter(R.layout.item_drop,mList)
        mRvData.addItemDecoration(DividerItemDecoration(mContext,DividerItemDecoration.VERTICAL))
        mRvData.layoutManager = LinearLayoutManager(mContext)
        mRvData.adapter =adapter
    }

}
