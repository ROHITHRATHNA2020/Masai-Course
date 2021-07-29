package com.example.youtube;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    ArrayList<Youtube > youtubeList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        BuildRecyclerData();
        setRecyclerData();
    }

    private void setRecyclerData() {
        Adapter adapter = new Adapter(youtubeList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void BuildRecyclerData() {
        youtubeList.add(new Youtube("https:www.youtube.com/"));
        youtubeList.add(new Youtube("https:www.youtube.com/"));
        youtubeList.add(new Youtube("https:www.youtube.com/"));
        youtubeList.add(new Youtube("https:www.youtube.com/"));
        youtubeList.add(new Youtube("https:www.youtube.com/"));
        youtubeList.add(new Youtube("https:www.youtube.com/"));
        youtubeList.add(new Youtube("https:www.youtube.com/"));
        youtubeList.add(new Youtube("https:www.youtube.com/"));
        youtubeList.add(new Youtube("https:www.youtube.com/"));
        youtubeList.add(new Youtube("https:www.youtube.com/"));
        youtubeList.add(new Youtube("https:www.youtube.com/"));
        youtubeList.add(new Youtube("https:www.youtube.com/"));
        youtubeList.add(new Youtube("https:www.youtube.com/"));
        youtubeList.add(new Youtube("https:www.youtube.com/"));
    }
}