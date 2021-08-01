package com.example.animalapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListeners {

    private RecyclerView recyclerView;

    ArrayList<Animal> animalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildAnimalList();
        setRecyclerView();

    }

    private void setRecyclerView() {
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList,this);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(animalAdapter);
    }


    private void buildAnimalList() {
        animalList = new ArrayList<>();
       animalList.add(new Animal(R.drawable.lion,"Lion","Roars"));
        animalList.add(new Animal(R.drawable.elephant,"Elephant","Rumbling"));
        animalList.add(new Animal(R.drawable.horse,"Horse","Neigh"));
        animalList.add(new Animal(R.drawable.dog,"Dog","Barks"));
        animalList.add(new Animal(R.drawable.peacock,"Peacock","tweets"));
        animalList.add(new Animal(R.drawable.rabbit,"rabbit","Roars"));
        animalList.add(new Animal(R.drawable.squirrel,"Squirrel","Roars"));
        animalList.add(new Animal(R.drawable.tiger,"Tiger","prusten"));
        animalList.add(new Animal(R.drawable.lion,"Lion","prusten"));
        animalList.add(new Animal(R.drawable.horse,"Horse","Neigh"));
        animalList.add(new Animal(R.drawable.dog,"Dog","Barks"));
        animalList.add(new Animal(R.drawable.peacock,"Peacock","tweets"));
        animalList.add(new Animal(R.drawable.rabbit,"rabbit","Roars"));
        animalList.add(new Animal(R.drawable.squirrel,"Squirrel","Roars"));
        animalList.add(new Animal(R.drawable.tiger,"Tiger","prusten"));
        animalList.add(new Animal(R.drawable.lion,"Lion","prusten"));
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }


    @Override
    public void onItemClicked(Animal animal) {
        new AlertDialog.Builder(this)
                .setMessage(animal.getName()).show();

    }
}