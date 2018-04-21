package com.example.cx49085.recourse.community.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.cx49085.recourse.R;
import com.example.cx49085.recourse.community.data.entity.VRAreaData;

import java.util.List;

import static com.example.cx49085.recourse.util.ImageUtil.getRequestOptions;


/**
 * Created by 10919 on 2018/4/6/006.
 */

public class VRAreaAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<VRAreaData> l;

    public VRAreaAdapter(Context context, List<VRAreaData> l) {
        this.context = context;
        this.l = l;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_vr_area, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Glide.with(context).load(l.get(position).getImg()).apply(getRequestOptions()).into(((ViewHolder)holder).img);
        ((ViewHolder)holder).name.setText(l.get(position).getName());
        ((ViewHolder)holder).num.setText(l.get(position).getNum());
//        ((ViewHolder)holder).constraintLayout.setBackgroundColor(context.getResources().getColor(l.get(position).getColor()));
    }

    @Override
    public int getItemCount() {
        return l.size();
    }

    private class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView img;
        private TextView name;
        private TextView num;
        private ConstraintLayout constraintLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            img = (ImageView)itemView.findViewById(R.id.item_vr_area_img);
            name = (TextView)itemView.findViewById(R.id.item_vr_area_name);
            num = (TextView)itemView.findViewById(R.id.item_vr_area_num);
            constraintLayout = (ConstraintLayout)itemView.findViewById(R.id.item_area_main);
        }
    }
}
