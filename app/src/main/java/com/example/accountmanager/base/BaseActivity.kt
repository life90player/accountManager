package com.example.accountmanager.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.accountmanager.utils.T
import com.example.accountmanager.widget.LoadingDialog

open class BaseActivity : AppCompatActivity() {
    private val mLoadingDialog by lazy { LoadingDialog(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        AccountApplication.addActivity(this)
        super.onCreate(savedInstanceState)
    }

    fun showLoading() {
        if (!mLoadingDialog.isShowing) {
            mLoadingDialog.show()
        }
    }

    fun hideLoading() {
        mLoadingDialog.dismiss()
    }

    fun showToast(toast: String) {
        T.showToast(toast)
    }

    override fun onDestroy() {
        AccountApplication.removeActivity(this)
        super.onDestroy()
    }

}
