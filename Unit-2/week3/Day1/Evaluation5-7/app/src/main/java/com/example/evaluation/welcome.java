package com.example.evaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class welcome extends AppCompatActivity {

    private TextView mtvname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        mtvname = findViewById(R.id.name);
        Intent intent = getIntent();
        String name = intent.getStringExtra("key");
        mtvname.setText(name);
    }
}