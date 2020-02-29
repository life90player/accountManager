package com.example.accountmanager.base

import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import com.example.accountmanager.widget.LoadingDialog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

open class BaseActivity : AppCompatActivity() {
    private lateinit var mLoadingDialog :LoadingDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun showLoading() {
        if (!this::mLoadingDialog.isInitialized){
            mLoadingDialog = LoadingDialog(this)
        }
        if (!mLoadingDialog.isShowing){
            mLoadingDialog.show()
        }
    }

    fun hideLoading() {
        if (this::mLoadingDialog.isInitialized){
            mLoadingDialog.dismiss()
        }
    }

    fun showToast(toast: String){
        GlobalScope.launch(Dispatchers.Main){

        }
        Toast.makeText(this,toast,LENGTH_SHORT).show()
    }

}
