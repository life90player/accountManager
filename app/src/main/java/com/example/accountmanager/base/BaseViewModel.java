package com.example.accountmanager.base;

import androidx.lifecycle.ViewModel;

import com.example.accountmanager.utils.T;

public class BaseViewModel extends ViewModel {

    public void showPrograss(){
        AccountApplication.getActivitys().lastElement().showLoading();
    }

    public void hidePrograss(){
        AccountApplication.getActivitys().lastElement().hideLoading();
    }

    public void showTost(String message){
        T.showToast(message);
    }
}
