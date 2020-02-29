package com.example.accountmanager.widget

import android.content.Context
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.example.accountmanager.R

class LoadingDialog public constructor(context: Context) : AlertDialog(context) {

    override fun setContentView(view: View) {
        setContentView(R.layout.dialog_loading)
    }
}
