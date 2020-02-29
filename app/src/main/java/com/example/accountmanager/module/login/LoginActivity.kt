package com.example.accountmanager.module.login

import android.os.Bundle
import android.view.View
import com.example.accountmanager.R

import com.example.accountmanager.base.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tv_login.setOnClickListener (this)
    }

    override fun onClick(v: View?) {//登录

    }

}
