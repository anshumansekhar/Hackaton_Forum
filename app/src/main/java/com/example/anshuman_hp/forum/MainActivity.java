package com.example.anshuman_hp.forum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView teacherRecycler;
    RecyclerView questionRecycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teacherRecycler=(RecyclerView)findViewById(R.id.topfacultyrecycler);
        questionRecycler=(RecyclerView)findViewById(R.id.QuestionsRecycler);
        questionRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        questionRecycler.setAdapter(new questionsAdapter());
        teacherRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));
        teacherRecycler.setAdapter(new teacheradapter());
    }
}
