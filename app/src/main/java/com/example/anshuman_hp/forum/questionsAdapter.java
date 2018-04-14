package com.example.anshuman_hp.forum;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Anshuman-HP on 31-03-2017.
 */

public class questionsAdapter extends RecyclerView.Adapter<QuestionHolder>{
    @Override
    public QuestionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.questioncard,parent,false);
        return new QuestionHolder(view);

    }

    @Override
    public void onBindViewHolder(QuestionHolder holder, int position) {
        holder.isfav.setText("YES");
        holder.numofreports.setText("20");
        holder.numoflikes.setText("40");
        holder.numofdislikes.setText("1");
        holder.questionphoto.setImageResource(R.mipmap.ic_launcher);
        holder.questionusername.setText("Anshuman");
        holder.Question.setText("Is IGIT the Best in Sports");
        holder.quesuserprofimage.setImageResource(R.mipmap.ic_launcher_round);


    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
