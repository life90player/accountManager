package com.example.accountmanager.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BaseFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void showLoading(){
        if (null != getActivity()){
            ((BaseActivity)getActivity()).showLoading();
        }
    }

    public void hideLoadDing(){
        if (null != getActivity()){
            ((BaseActivity)getActivity()).hideLoading();
        }
    }
}
