package com.test.view;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.R;
import com.test.databinding.ListItemBinding;
import com.test.server.SearchedJob;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ac on 2016/10/27.
 */

public class CustomAdapter<T extends SearchedJob> extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

    private static final String TAG = "CustomAdapter";
    private List<T> jobModelList = new ArrayList<>();

    public CustomAdapter(List<T> jobModelList){
        this.jobModelList = jobModelList;
    }

        public static class ViewHolder extends RecyclerView.ViewHolder{
            ListItemBinding mBinding;

            public ViewHolder(View v){
                super(v);
                mBinding = DataBindingUtil.bind(itemView);
                v.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d(TAG, "Element " + getAdapterPosition() + " clicked.");
                    }
                });

            }
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            SearchedJob searchedJob = jobModelList.get(position);

            if(searchedJob != null){
                holder.mBinding.txtTel.setText(searchedJob.getName() + "");
            }

        }

        @Override
        public int getItemCount() {
            return jobModelList.size();
        }

    }

