package com.example.cx49085.recourse.download.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.cx49085.recourse.R;
import com.example.cx49085.recourse.download.data.entity.DownloadData;
import com.example.cx49085.recourse.home.adapter.RecommedAdapter;
import com.example.cx49085.recourse.util.GlideRoundTransform;

import java.util.List;

import static com.example.cx49085.recourse.util.ImageUtil.getRequestOptions;

/**
 * Created by cx49085 on 2018/4/8.
 */

public class DownloadAdapter extends RecyclerView.Adapter{

    private Context context ;
    private List<DownloadData> list ;

    public DownloadAdapter(Context context,List<DownloadData> list)
    {
        this.context = context;
        this.list = list;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DownloadAdapter.ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_rv_download, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((DownloadAdapter.ViewHolder)holder).name.setText(list.get(position).getName());
        ((DownloadAdapter.ViewHolder)holder).num.setText(list.get(position).getNum());
        ((DownloadAdapter.ViewHolder)holder).classes.setText(list.get(position).getClasses());

        RequestOptions requestOptions = getRequestOptions();
        Glide.with(context).load(list.get(position).getImg()).apply(getRequestOptions().bitmapTransform(new GlideRoundTransform(8))).into(((DownloadAdapter.ViewHolder)holder).iv);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class ViewHolder extends RecyclerView.ViewHolder{
        //ImageView bgiv;
        ImageView iv;
        TextView name;
        TextView num;
        TextView classes;
        public ViewHolder(View itemView) {
            super(itemView);
            iv = (ImageView)itemView.findViewById(R.id.item_rv_download_img);
            name = (TextView)itemView.findViewById(R.id.item_rv_download_title);
            num = (TextView)itemView.findViewById(R.id.item_rv_download_num);
            classes = (TextView)itemView.findViewById(R.id.item_rv_download_class);

        }
    }
}
