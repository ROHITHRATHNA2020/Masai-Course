package com.example.broadcastnameage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mtvName;
    private TextView mtvAge;
    private Button mbtnSend;
    private BroadcastReceiver broadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        broadcastReceiver = BroadcastReceiver.  
    }

    private void initViews() {
    mtvName = findViewById(R.id.tvName);
    mtvAge = findViewById(R.id.tvAge);
    mbtnSend = findViewById(R.id.btnSend);
    }
}