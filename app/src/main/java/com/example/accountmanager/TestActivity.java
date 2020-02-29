package com.example.accountmanager;

import android.os.Bundle;
import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import com.example.accountmanager.base.BaseActivity;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TestActivity extends BaseActivity {
    private MutableLiveData<List<String>> mData = new MutableLiveData<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main);
        mData.observe(this, new Observer<List<String>>() {
            @Override
            public void onChanged(List<String> strings) {
                showToast(strings.get(0));
            }
        });
    }

    public void test(View v){
    }


}
