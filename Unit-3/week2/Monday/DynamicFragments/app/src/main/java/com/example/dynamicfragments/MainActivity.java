package com.example.dynamicfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {


    private FragmentManager fragmentManager;
    private FrameLayout flContainer;
    private LinearLayout linearlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
       

    }

    private void initView() {
        fragmentManager = getSupportFragmentManager();
        linearlayout = findViewById(R.id.linearLayout);
        flContainer = findViewById(R.id.flcontainer);
        linearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replace();
            }
        });

    }


    public void replace(){
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        FragmentA fragmentA = new FragmentA();
        transaction.replace(R.id.flcontainer,fragmentA,"fragmentA").commit();
    }
}
