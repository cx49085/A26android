package com.example.cx49085.recourse.community.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cx49085.recourse.R;
import com.example.cx49085.recourse.community.data.entity.NoteData;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * Created by 10919 on 2018/4/6/006.
 */

public class NoteAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<NoteData> l;

    public NoteAdapter(Context context, List<NoteData> l) {
        this.context = context;
        this.l = l;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_note, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).title.setText(l.get(position).getTitle());
        ((ViewHolder)holder).info.setText(l.get(position).getInfo());
        ((ViewHolder)holder).goodNum.setText(String.valueOf(l.get(position).getGoodNum()));
        ((ViewHolder)holder).broswe.setText(String.valueOf(l.get(position).getBrowseNum()));
        ((ViewHolder)holder).time.setText(l.get(position).getTime());
        ((ViewHolder)holder).username.setText(l.get(position).getUsername());
        ((ViewHolder)holder).head.setImageResource(l.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return l.size();
    }

    private class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private TextView info;
        private TextView time;
        private TextView username;
        private TextView goodNum;
        private TextView broswe;
        private CircleImageView head;
        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.item_note_title);
            info = (TextView)itemView.findViewById(R.id.item_note_info);
            goodNum = (TextView)itemView.findViewById(R.id.item_note_good_num);
            broswe = (TextView)itemView.findViewById(R.id.item_note_browse_num);
            time = (TextView)itemView.findViewById(R.id.item_note_time);
            username = (TextView)itemView.findViewById(R.id.item_note_user_id);
            head = (CircleImageView)itemView.findViewById(R.id.item_note_head);
        }
    }
}
