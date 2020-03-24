package com.example.accountmanager.widget

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.accountmanager.R

class LoadingDialog public constructor(context: Context) : AlertDialog(context,R.style.dialog) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_loading)
    }
}
