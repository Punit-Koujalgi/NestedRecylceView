package com.punitk.nested_recylce_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainAdaptor extends RecyclerView.Adapter<MainAdaptor.MainAdaptorViewHolder>{

    private Context mContext;
    private ArrayList<String> mList=new ArrayList<>();

    public void setmList(ArrayList<String> mList) {
        this.mList = mList;
    }

    public MainAdaptor(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MainAdaptorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(mContext).inflate(R.layout.rv_card_item,parent,false);
        return new MainAdaptorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdaptorViewHolder holder, int position) {

        holder.mTextView.setText(mList.get(position));

        holder.mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        ArrayList<String> arrayList=new ArrayList<String>(){
            {
                    add("Item 1");
                    add("Item 2");
                    add("Item 3");
            }
        };
        holder.mRecyclerView.setAdapter(new SecondaryAdaptor(mContext,arrayList));

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MainAdaptorViewHolder extends RecyclerView.ViewHolder{

        private TextView mTextView;
        private RecyclerView mRecyclerView;

        public MainAdaptorViewHolder(@NonNull View itemView) {
            super(itemView);

            mTextView=itemView.findViewById(R.id.name);
            mRecyclerView=itemView.findViewById(R.id.rv_2);
        }
    }
}
