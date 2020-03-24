package com.example.accountmanager.utils;

import android.widget.Toast;

import com.example.accountmanager.base.AccountApplication;

public class T {
    public static void showToast(String msg){
        Toast.makeText(AccountApplication.getActivitys().lastElement(),msg,Toast.LENGTH_SHORT).show();
    }

}
