package com.kimhyojung.android.chap12_customview_recyclercardview01;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER on 2016-10-04.
 */
public class MyRecycleCardAdapter extends RecyclerView.Adapter<MyRecycleCardAdapter.ViewHolder>{

    ArrayList<CardDatas> datas;
    int layout;
    Context context;
    LayoutInflater inflater;


    public MyRecycleCardAdapter(ArrayList<CardDatas> datas, int layout, Context context){
        this.datas = datas;
        this.layout=layout;
        this.context=context;
    }


    @Override
    public MyRecycleCardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyRecycleCardAdapter.ViewHolder holder, int position) {
        CardDatas data = datas.get(position);
        holder.image1.setBackgroundResource(data.image1);
        holder.image2.setBackgroundResource(data.image2);
        holder.title.setText(data.name);
        holder.type.setText(data.str);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image1;
        ImageView image2;
        TextView title;
        TextView type;

        public ViewHolder(View itemView){
            super(itemView);
            image1=(ImageView)itemView.findViewById(R.id.imageView);
            image2=(ImageView)itemView.findViewById(R.id.imageView2);
            title=(TextView)itemView.findViewById(R.id.textView);
            type=(TextView)itemView.findViewById(R.id.textView2);
        }
    }
}
