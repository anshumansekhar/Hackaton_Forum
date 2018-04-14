package com.example.anshuman_hp.forum;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.jivimberg.library.AutoResizeTextView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Anshuman-HP on 31-03-2017.
 */

public class QuestionHolder extends RecyclerView.ViewHolder {
    CircleImageView quesuserprofimage;
    TextView questionusername;
    ImageView questionphoto;
    AutoResizeTextView Question;
    TextView numoflikes,numofdislikes,numofreports,isfav;
    public QuestionHolder(View itemView) {
        super(itemView);
        quesuserprofimage=(CircleImageView)itemView.findViewById(R.id.questionuserimage);
        questionusername=(TextView)itemView.findViewById(R.id.quesusername);
        questionphoto=(ImageView)itemView.findViewById(R.id.quesimage);
        Question=(AutoResizeTextView)itemView.findViewById(R.id.question);
        numofdislikes=(TextView)itemView.findViewById(R.id.numdislikes);
        numoflikes=(TextView)itemView.findViewById(R.id.numlikes);
        numofreports=(TextView)itemView.findViewById(R.id.report);
        isfav=(TextView)itemView.findViewById(R.id.isfav);
    }
}
