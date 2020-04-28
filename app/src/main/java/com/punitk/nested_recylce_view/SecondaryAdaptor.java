package com.punitk.nested_recylce_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SecondaryAdaptor extends RecyclerView.Adapter<SecondaryAdaptor.SecondaryAdaptorViewHolder> {

    Context mContext;
    ArrayList<String> mList;

    public SecondaryAdaptor(Context mContext,ArrayList<String> mList) {
        this.mContext = mContext;
        this.mList=mList;
    }

    @NonNull
    @Override
    public SecondaryAdaptorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SecondaryAdaptorViewHolder(LayoutInflater.from(mContext).inflate(R.layout.rv_card_details,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SecondaryAdaptorViewHolder holder, int position) {
        holder.textView.setText(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class SecondaryAdaptorViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        public SecondaryAdaptorViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.name);
        }
    }
}
