package com.example.accountmanager.base.rv;

import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public abstract class BaseAdapter<T> extends RecyclerView.Adapter<BaseViewHolder> {
    public List<T> mList;
    private int mItemId;
    private SparseIntArray mItemIds;

    public BaseAdapter(List<T> mList, int mItenId) {
        this.mList = mList;
        this.mItemId = mItenId;
    }

    public List<T> getData(){
        return mList;
    }

    /**
     * @param ids 如果有多种viewholder使用这个构造
     */
    public BaseAdapter(List<T> mList, SparseIntArray ids) {
        this.mList = mList;
        this.mItemIds = ids;
    }

    @Override
    public int getItemViewType(int position) {
        if (mItemIds == null){
            return super.getItemViewType(position);
        }else {
            Object obj = mList.get(position);
            if (obj instanceof ItemType){
                return ((ItemType)obj).getItemType();
            }else {
                try {
                    throw new Exception("when mItemIds not null,your data of list must implements for ItemType !!!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return super.getItemViewType(position);
            }
        }
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (mItemIds == null){
            return new BaseViewHolder<T>(LayoutInflater.from(parent.getContext()).inflate(mItemId,parent,false));
        }else {
            return new BaseViewHolder<T>(LayoutInflater.from(parent.getContext()).inflate(mItemIds.get(viewType),parent,false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        bindData(holder,mList.get(position));
    }

    public abstract void bindData(BaseViewHolder v,T data);

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
