package com.example.accountmanager.widget.dropDialog;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.accountmanager.R;

import java.util.List;

public class DropAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public DropAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_txt,item);
    }
}
