package com.example.accountmanager.base;

import android.app.Application;

public class AccountApplication extends Application{
    private static AccountApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static AccountApplication getApplication(){
        return mInstance;
    }
}
