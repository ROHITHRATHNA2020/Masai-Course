package com.example.sports;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView sportRecyclerView;
    private ArrayList<SportModel> sportModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        BuildRecyclerData();
        setRecyclerView();
    }

    private void setRecyclerView() {
    SportAdapter sportAdapter = new SportAdapter(sportModelList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        sportRecyclerView.setAdapter(sportAdapter);
        sportRecyclerView.setLayoutManager(gridLayoutManager);
    }

    private void BuildRecyclerData() {
    sportModelList.add(new SportModel(R.drawable.aquagym,"AQUAMAN"));
    sportModelList.add(new SportModel(R.drawable.archery,"ARCHERY"));
    sportModelList.add(new SportModel(R.drawable.bodybuiling,"BODYBULIDING"));
    sportModelList.add(new SportModel(R.drawable.boxing,"BOXING"));
        sportModelList.add(new SportModel(R.drawable.aquagym,"AQUAMAN"));
        sportModelList.add(new SportModel(R.drawable.archery,"ARCHERY"));
        sportModelList.add(new SportModel(R.drawable.bodybuiling,"BODYBULIDING"));
        sportModelList.add(new SportModel(R.drawable.boxing,"BOXING"));
        sportModelList.add(new SportModel(R.drawable.aquagym,"AQUAMAN"));
        sportModelList.add(new SportModel(R.drawable.archery,"ARCHERY"));
        sportModelList.add(new SportModel(R.drawable.bodybuiling,"BODYBULIDING"));
        sportModelList.add(new SportModel(R.drawable.boxing,"BOXING"));

    }

    private void initViews() {
    sportRecyclerView = findViewById(R.id.sportRecyclerView);
    }
}