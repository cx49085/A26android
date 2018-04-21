package com.example.cx49085.recourse.mine.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.cx49085.recourse.R;
import com.example.cx49085.recourse.mine.data.Rv1DataManager;
import com.example.cx49085.recourse.mine.data.entity.Rv1Data;

import java.util.List;

import static com.example.cx49085.recourse.util.ImageUtil.getRequestOptions;

/**
 * Created by cx49085 on 2018/4/6.
 */

public class Rv1Adapter extends RecyclerView.Adapter {

    Context context;
    List<Rv1Data> rv1DataList ;
    public Rv1Adapter(Context context, List<Rv1Data> list)
    {
        this.context = context;
        this.rv1DataList = list;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_rv1_mine, null));

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ((ViewHolder)holder).tv.setText(rv1DataList.get(position).getTitle());
        Glide.with(context).load(rv1DataList.get(position).getImg()).apply(getRequestOptions()).into(((ViewHolder)holder).iv);

    }

    @Override
    public int getItemCount() {
        return rv1DataList.size();
    }

    class ViewHolder extends  RecyclerView.ViewHolder{
        ImageView iv;
        TextView tv;

        public ViewHolder(View itemView) {
            super(itemView);
            iv = (ImageView)itemView.findViewById(R.id.item_rv1_img);
            tv = (TextView)itemView.findViewById(R.id.item_rv1_title);
        }
    }
}
