package com.example.recycleritemclicks;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListeners {

    private RecyclerView recyclerView;
    ArrayList<Model> modelList;

    private ItemClickListeners itemClickListeners;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildModelList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        Adapter adapter = new Adapter(modelList,this);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this,2);
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

    @Override
    public void onItemClicked(Model model) {
        new AlertDialog.Builder(this)
                .setTitle("Article Name is")
                .setMessage(model.getText()).show();

    }
}