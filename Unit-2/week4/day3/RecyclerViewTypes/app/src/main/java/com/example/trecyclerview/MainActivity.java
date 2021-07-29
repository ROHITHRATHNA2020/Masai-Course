package com.example.trecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private RecyclerView recyclerView;
    private List<Model> modelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        buildModelList();
        setRecyclerData();
    }


    private void buildModelList() {
        modelList.add(new Model("this is simple text header",0,Model.text_type));
        modelList.add(new Model("this is how scenery looks",R.drawable.maldives,Model.image_type));
        modelList.add(new Model("this is cool,samajavaragamana",R.raw.samajavaragamana,Model.audio_type));
        modelList.add(new Model("this is simple text header",0,Model.text_type));
        modelList.add(new Model("this is simple text header",0,Model.text_type));
        modelList.add(new Model("this is how scenery looks",R.drawable.maldives,Model.image_type));
        modelList.add(new Model("this is simple text header",0,Model.text_type));
        modelList.add(new Model("this is how scenery looks",R.drawable.maldives,Model.image_type));
        modelList.add(new Model("this is cool,samajavaragamana",R.raw.samajavaragamana,Model.audio_type));
        modelList.add(new Model("this is simple text header",0,Model.text_type));
        modelList.add(new Model("this is how scenery looks",R.drawable.maldives,Model.image_type));
        modelList.add(new Model("this is cool,samajavaragamana",R.raw.samajavaragamana,Model.audio_type));
        modelList.add(new Model("this is cool,samajavaragamana",R.raw.samajavaragamana,Model.audio_type));
        modelList.add(new Model("this is how scenery looks",R.drawable.maldives,Model.image_type));
        modelList.add(new Model("this is cool,samajavaragamana",R.raw.samajavaragamana,Model.audio_type));


    }


    private void setRecyclerData() {
        MultipleViewAdapter multipleViewAdapter = new MultipleViewAdapter(modelList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(multipleViewAdapter);
    }

    @Override
    public void ItemClicked( Model model,int position) {

    }
}