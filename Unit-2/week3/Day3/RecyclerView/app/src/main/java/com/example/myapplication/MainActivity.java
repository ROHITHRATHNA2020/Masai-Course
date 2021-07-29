package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Menu> menuList;
    private RecyclerView mrecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrecyclerView = findViewById(R.id.recyclerView );
        buildRecyclerviewData();
        setRecyclerViewAdapter();
    }

    private void setRecyclerViewAdapter() {
        menuAdapter menuAdapter = new menuAdapter(menuList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mrecyclerView.setLayoutManager(linearLayoutManager);
        mrecyclerView.setAdapter(menuAdapter);

    }


    public void buildRecyclerviewData(){
        menuList = new ArrayList<>();
        menuList.add(new Menu(R.drawable.idli,"idli",20.3));
        menuList.add(new Menu(R.drawable.vada,"vada",25.3));
        menuList.add(new Menu(R.drawable.chillichicken,"chilliChiken",20.3));
        menuList.add(new Menu(R.drawable.idli,"idli",20.3));
        menuList.add(new Menu(R.drawable.vada,"vada",25.3));
        menuList.add(new Menu(R.drawable.chillichicken,"chilliChiken",20.3));
        menuList.add(new Menu(R.drawable.idli,"idli",20.3));
        menuList.add(new Menu(R.drawable.vada,"vada",25.3));
        menuList.add(new Menu(R.drawable.chillichicken,"chilliChiken",20.3));
        menuList.add(new Menu(R.drawable.idli,"idli",20.3));
        menuList.add(new Menu(R.drawable.vada,"vada",25.3));
        menuList.add(new Menu(R.drawable.chillichicken,"chilliChiken",20.3));
        menuList.add(new Menu(R.drawable.idli,"idli",20.3));
        menuList.add(new Menu(R.drawable.vada,"vada",25.3));
        menuList.add(new Menu(R.drawable.chillichicken,"chilliChiken",20.3));
    }


}