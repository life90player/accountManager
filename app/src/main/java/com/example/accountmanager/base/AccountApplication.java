package com.example.accountmanager.base;

import android.app.Application;

import java.util.Vector;

public class AccountApplication extends Application{
    private static AccountApplication mInstance;
    private static Vector<BaseActivity> mActivitys = new Vector<>();

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static AccountApplication getApplication(){
        return mInstance;
    }

    public static void addActivity(BaseActivity activity){
        mActivitys.add(activity);
    }

    public static void removeActivity(BaseActivity activity){
        mActivitys.remove(activity);
    }

    public static Vector<BaseActivity> getActivitys(){
        return mActivitys;
    }
}
