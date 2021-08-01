package com.example.birds;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListeners {

    private RecyclerView recyclerView;
    ArrayList<Bird> birdList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildRecyclerData();
        setRecyclerView();

    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void setRecyclerView() {
        BirdAdapter birdAdapter = new BirdAdapter(birdList,this);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this,4);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(birdAdapter);

    }

    private void buildRecyclerData() {
        for (int i = 0; i < 100; i++) {
            if (i % 4 == 0) {
                birdList.add(new Bird(R.drawable.america, "America"));
            } else if (i % 4 == 1) {
                birdList.add(new Bird(R.drawable.australia, "Australia"));
            } else if (i % 4 == 2) {
                birdList.add(new Bird(R.drawable.india, "India"));
            } else if (i % 4 == 3) {
                birdList.add(new Bird(R.drawable.newzealand, "newZealand"));
            }
        }
    }

    @Override
    public void onItemClicked(Bird bird) {
        new AlertDialog.Builder(this)
                .setTitle("My Name is")
                .setMessage(bird.getName() +"\n"
                ).show();

    }
}