package com.example.accountmanager.module.main;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.accountmanager.base.BaseFragment;

import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter {
    private List<BaseFragment> mList;

    public PagerAdapter(List<BaseFragment> list,@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        mList = list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }
}
