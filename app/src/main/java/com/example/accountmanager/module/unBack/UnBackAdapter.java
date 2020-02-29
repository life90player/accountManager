package com.example.accountmanager.module.unBack;

import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.accountmanager.bean.UnbackBean;
import com.example.accountmanager.databinding.ItemUnbackBinding;

import java.util.List;


public class UnBackAdapter extends BaseQuickAdapter<UnbackBean, com.chad.library.adapter.base.BaseViewHolder> {
    public UnBackAdapter(int layoutResId, @Nullable List<UnbackBean> data) {
        super(layoutResId, data);
    }

//    public UnBackAdapter(List<UnbackBean> mList, int mItenId) {
//        super(mList, mItenId);
//    }


        @Override
    protected void convert(BaseViewHolder helper, UnbackBean item) {
        ItemUnbackBinding binding = DataBindingUtil.getBinding(helper.itemView);
        if (binding != null) {
            binding.setData(item);
            binding.executePendingBindings();
        }
    }

        @Override
    protected BaseViewHolder onCreateDefViewHolder(ViewGroup parent, int viewType) {
        BaseViewHolder holder = super.onCreateDefViewHolder(parent, viewType);
        DataBindingUtil.bind(holder.itemView);
        return holder;
    }

//    @NonNull
//    @Override
//    public com.example.accountmanager.base.rv.BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        BaseViewHolder holder = super.onCreateViewHolder(parent, viewType);
//        DataBindingUtil.bind(holder.itemView);
//        return super.onCreateViewHolder(parent, viewType);
//    }
//
//    @Override
//    public void bindData(BaseViewHolder v, UnbackBean data) {
//        ItemUnbackBinding binding = DataBindingUtil.getBinding(v.itemView);
//        if (binding != null) {
//            binding.setData(data);
//            binding.executePendingBindings();
//        }
//    }


}
