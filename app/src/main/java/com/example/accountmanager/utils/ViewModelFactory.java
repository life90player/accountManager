package com.example.accountmanager.utils;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.accountmanager.base.AccountApplication;

public class ViewModelFactory<T extends ViewModel> {
    public static ViewModelFactory mInstance;

    private ViewModelFactory(){

    }

    public T createViewModel(Class<T> cls){
        return ViewModelProvider.AndroidViewModelFactory.getInstance(AccountApplication.getApplication())
                .create(cls);
    }

    public static ViewModelFactory getInstance(){
        if (null == mInstance){
            mInstance = new ViewModelFactory();
        }
        return mInstance;
    }
}
