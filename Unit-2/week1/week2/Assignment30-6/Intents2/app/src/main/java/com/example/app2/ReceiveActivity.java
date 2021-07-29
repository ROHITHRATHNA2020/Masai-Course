package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity {

    private TextView mtvCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        mtvCustom = findViewById(R.id.customerIntent);
        Intent intent = getIntent();
        String data = intent.getStringExtra("key");
        mtvCustom.setText(data);
    }
}