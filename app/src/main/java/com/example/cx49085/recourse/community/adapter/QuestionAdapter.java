package com.example.cx49085.recourse.community.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cx49085.recourse.R;
import com.example.cx49085.recourse.community.data.entity.QuestionData;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * Created by 10919 on 2018/4/6/006.
 */

public class QuestionAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<QuestionData> l;

    public QuestionAdapter(Context context, List<QuestionData> l) {
        this.context = context;
        this.l = l;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_question, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).title.setText(l.get(position).getTitle());
        ((ViewHolder)holder).state.setText(l.get(position).getState());
        ((ViewHolder)holder).answerNum.setText(String.valueOf(l.get(position).getAnswerNum()));
        ((ViewHolder)holder).username.setText(String.valueOf(l.get(position).getUsername()));
        ((ViewHolder)holder).time.setText(String.valueOf(l.get(position).getTime()));
        ((ViewHolder)holder).username.setText(String.valueOf(l.get(position).getUsername()));
        ((ViewHolder)holder).detail.setText(String.valueOf(l.get(position).getDetail()));
        ((ViewHolder)holder).img.setImageResource(l.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return l.size();
    }

    private class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private TextView state;
        private TextView answerNum;
        private TextView time;
        private TextView username;
        private CircleImageView img;
        private TextView detail;
        public ViewHolder(View itemView) {
            super(itemView);
            img = (CircleImageView)itemView.findViewById(R.id.item_icon_head);
            username = (TextView)itemView.findViewById(R.id.item_question_user_id);
            title = (TextView) itemView.findViewById(R.id.item_question_title);
            state = (TextView)itemView.findViewById(R.id.item_question_state);
            time = (TextView) itemView.findViewById( R.id.item_question_time);
            detail = (TextView)itemView.findViewById(R.id.item_question_detail);
            answerNum = (TextView)itemView.findViewById(R.id.item_question_answer_num);
        }
    }
}
