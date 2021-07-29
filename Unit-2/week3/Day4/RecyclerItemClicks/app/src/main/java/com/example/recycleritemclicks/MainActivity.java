package com.example.recycleritemclicks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    ArrayList<Model> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildModelList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        Adapter adapter = new Adapter(modelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void buildModelList() {
         modelList = new ArrayList<>();
         modelList.add(new Model(R.drawable.sunrise,"Sunrise","Blue Ocean Wave crash"));
        modelList.add(new Model(R.drawable.universe,"universe","world is  endless"));
        modelList.add(new Model(R.drawable.sunrise,"Sunrise","Blue Ocean Wave crash"));
        modelList.add(new Model(R.drawable.universe,"universe","world is  endless"));
        modelList.add(new Model(R.drawable.sunrise,"Sunrise","Blue Ocean Wave crash"));
        modelList.add(new Model(R.drawable.universe,"universe","world is  endless"));
        modelList.add(new Model(R.drawable.sunrise,"Sunrise","Blue Ocean Wave crash"));
        modelList.add(new Model(R.drawable.universe,"universe","world is  endless"));


    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }
}