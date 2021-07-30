package com.example.broadcastpreclass;

import android.Manifest;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.security.Permissions;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mbtn1;
    private Button mbtn2;
    private Button mbtn3;
    private AirplaneModeReceiver receiver;
    private LocalBroadcastReceiver localBroadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mbtn1 = findViewById(R.id.button1);
        mbtn2 = findViewById(R.id.button2);
        mbtn3 = findViewById(R.id.button3);
        mbtn1.setOnClickListener(this);
        mbtn2.setOnClickListener(this);
        mbtn3.setOnClickListener(this);
        receiver = new AirplaneModeReceiver();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.AIRPLANE_MODE");
        registerReceiver(receiver, intentFilter);
        localBroadcastReceiver = new LocalBroadcastReceiver();
        IntentFilter intentFilter1 = new IntentFilter("com.xyz.rohith");
        registerReceiver(localBroadcastReceiver,intentFilter1);

        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:

                break;
            case R.id.button2:
                Intent intent = new Intent("com.xyz.rohith");
                sendBroadcast(intent, Manifest.permission.CAMERA);

                break;
            case R.id.button3:
                break;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}