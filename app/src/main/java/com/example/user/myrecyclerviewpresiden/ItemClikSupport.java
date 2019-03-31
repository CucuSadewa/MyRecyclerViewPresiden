package com.example.user.myrecyclerviewpresiden;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

public class ItemClikSupport {
    private final RecyclerView mRecyclerView;
    private AdapterView.OnItemClickListener mOnItemClickListener;
    private AdapterView.OnItemLongClickListener mOnItemLongClickListener;

    private ItemClikSupport(RecyclerView mRecyclerView, RecyclerView mRecyclerView1) {
        this.mRecyclerView = mRecyclerView1;
        mRecyclerView = recyclerView;
        mRecyclerView.setTag(R.id.item_click_support, this);
        mRecyclerView.addOnChildAttachStateChangeListener(mAttachListener);
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mOnItemClickListener != null){
                RecyclerView.ViewHolder holder = mRecyclerView.getChildViewHolder(v);
                mOnItemClickListener.onItemClick(mRecyclerView, holder.getAdapterPosition(), v);
            }
        }
    };
    private View.OnLongClickListener mOnLongClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            if (mOnItemLongClickListener != null){
                RecyclerView.ViewHolder holder = mRecyclerView.getChildViewHolder(v);
                return mOnItemLongClickListener.onItemLongClick(mRecyclerView, holder.getAdapterPosition(), v);
            }
            return false;
        }
    };

    private RecyclerView.OnChildAttachStateChangeListener mAttachListener
            = new RecyclerView.OnChildAttachStateChangeListener(){
        @Override
        public void onChildViewAttachedToWindom(View view){

        }
    }
}
