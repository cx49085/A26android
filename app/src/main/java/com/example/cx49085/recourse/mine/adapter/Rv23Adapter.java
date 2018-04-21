package com.example.cx49085.recourse.mine.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.cx49085.recourse.R;
import com.example.cx49085.recourse.mine.data.entity.Rv23Data;

import java.util.ArrayList;
import java.util.List;

import static com.example.cx49085.recourse.util.ImageUtil.getRequestOptions;

/**
 * Created by cx49085 on 2018/4/7.
 */

public class Rv23Adapter extends RecyclerView.Adapter{

    Context context;
    List<Rv23Data> list = new ArrayList<Rv23Data>();
    public Rv23Adapter(Context context,List<Rv23Data> list)
    {
        this.context = context;
        this.list = list;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_rv23_mine, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((Rv23Adapter.ViewHolder)holder).tv.setText(list.get(position).getTitle());
        Glide.with(context).load(list.get(position).getImg()).apply(getRequestOptions()).into(((Rv23Adapter.ViewHolder)holder).iv);
//        ((Rv23Adapter.ViewHolder)holder).tv.setText(R.string.name_hobby);
//        Glide.with(context).load(R.drawable.ic_mine_hobby).apply(getRequestOptions()).into(((Rv23Adapter.ViewHolder)holder).iv);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv;
        private TextView tv;
        public ViewHolder(View itemView) {
            super(itemView);
            iv = (ImageView)itemView.findViewById(R.id.item_rv23_img);
            tv = (TextView)itemView.findViewById(R.id.item_rv23_title);
        }
    }
}
