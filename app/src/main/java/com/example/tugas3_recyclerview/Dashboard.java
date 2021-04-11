package com.example.tugas3_recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Movie> movies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        recyclerView = findViewById(R.id.rv_recycleView);
        recyclerView.setHasFixedSize(true);

        movies.addAll(MovieData.getListData());
        showRecycleView();
    }

    private void showRecycleView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MovieAdapter adapter = new MovieAdapter(movies,this);
        recyclerView.setAdapter(adapter);
    }
}