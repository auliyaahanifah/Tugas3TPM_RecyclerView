package com.example.tugas3_recyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;

public class MovieDetail extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Movie ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ImageView ivPhoto = findViewById(R.id.iv_photo);
        TextView tv_title = findViewById(R.id.tv_title);
        TextView tv_director = findViewById(R.id.tv_director);
        TextView tv_release = findViewById(R.id.tv_release);
        TextView tv_runningt = findViewById(R.id.tv_runingt);
        TextView tv_desc = findViewById(R.id.tv_desc);

        tv_title.setText(getIntent().getStringExtra("Movie Title"));
        tv_director.setText("Director          : " + getIntent().getStringExtra("Director"));
        tv_release.setText("Release Date   : " + getIntent().getStringExtra("Release Date"));
        tv_runningt.setText("Running Time : " + getIntent().getStringExtra("Running Time"));
        tv_desc.setText(getIntent().getStringExtra("Desc"));


        Glide.with(getApplicationContext())
                .load(getIntent().getIntExtra("photo", 0))
                .into(ivPhoto);
    }
}