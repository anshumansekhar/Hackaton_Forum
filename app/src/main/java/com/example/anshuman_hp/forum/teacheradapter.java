package com.example.anshuman_hp.forum;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Anshuman-HP on 31-03-2017.
 */

public class teacheradapter extends RecyclerView.Adapter<teacherHolder> {
    @Override
    public teacherHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.teacher_card,parent,false);
        return new teacherHolder(view);

    }

    @Override
    public void onBindViewHolder(teacherHolder holder, int position) {
        holder.profname.setText("Anshuman");
        holder.profimage.setImageResource(R.mipmap.ic_launcher_round);

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
