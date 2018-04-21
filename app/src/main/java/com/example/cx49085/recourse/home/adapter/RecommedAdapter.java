package com.example.cx49085.recourse.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.request.RequestOptions;
import com.example.cx49085.recourse.R;
import com.example.cx49085.recourse.home.data.HomeDataManager;
import com.example.cx49085.recourse.home.data.entity.RecommendData;
import com.example.cx49085.recourse.util.GlideBlurformation;
import com.example.cx49085.recourse.util.GlideRoundTransform;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.glide.transformations.BlurTransformation;

import static com.example.cx49085.recourse.util.ImageUtil.getRequestOptions;

/**
 * Created by cx49085 on 2018/4/5.
 */

public class RecommedAdapter extends RecyclerView.Adapter{

    private Context context = null;
    private List<RecommendData> recommendDatas = new ArrayList<RecommendData>();
    public RecommedAdapter(Context context,List<RecommendData> l)
    {
        this.context = context;
        this.recommendDatas = l;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recommend_main, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).tv.setText(recommendDatas.get(position).getTitle());
        ((ViewHolder)holder).course_num_tv.setText(recommendDatas.get(position).getCourse_num());
        ((ViewHolder)holder).course_detail_tv.setText(recommendDatas.get(position).getCourse_introduction());

        RequestOptions requestOptions = getRequestOptions();
        Glide.with(context).load(recommendDatas.get(position).getImg()).apply(getRequestOptions().bitmapTransform(new GlideRoundTransform(4))).into(((ViewHolder)holder).iv);
    }

    @Override
    public int getItemCount() {
        return recommendDatas.size();
    }

    private class ViewHolder extends RecyclerView.ViewHolder{
        //ImageView bgiv;
        ImageView iv;
        TextView tv;
        TextView course_num_tv;
        TextView course_detail_tv;
        public ViewHolder(View itemView) {
            super(itemView);
            iv = (ImageView)itemView.findViewById(R.id.item_recommend_image);
            //bgiv = (ImageView)itemView.findViewById(R.id.item_recommend_bgimage);
            tv = (TextView)itemView.findViewById(R.id.item_recommend_title);
            course_num_tv = (TextView)itemView.findViewById(R.id.item_recommend_courseNum);
            course_detail_tv = (TextView)itemView.findViewById(R.id.item_recommend_detail);

        }
    }
}
