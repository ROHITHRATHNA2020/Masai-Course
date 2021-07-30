package com.example.broadcastnameage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

public class MainActivity extends AppCompatActivity {

    private Button mbtnSend;
    private TextView mtvName;
    private TextView mtvAge;
    private LocalReceiver localReceiver;
    private LocalBroadcastManager localBroadcastManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        localBroadcastManager = LocalBroadcastManager.getInstance(this);
        mbtnSend = findViewById(R.id.btnSend);
        mtvName = findViewById(R.id.tvName);
        mtvAge = findViewById(R.id.tvAge);
        registerLocalReceiver();
        mbtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.and03.rohith");
                intent.putExtra("key", "hello masai school");
                intent.putExtra("age",25);
                localBroadcastManager.sendBroadcast(intent);
            }
        });
    }

    private void registerLocalReceiver() {
        localReceiver = new LocalReceiver();
        IntentFilter intentFilter = new IntentFilter("com.and03.rohith");
        localBroadcastManager.registerReceiver(localReceiver, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        localBroadcastManager.unregisterReceiver(localReceiver);
    }


    private class LocalReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String data = intent.getStringExtra("key");
                int age = intent.getIntExtra("age",10);
                mtvName.setText(data);
                mtvAge.setText(age+"");
            }
        }
    }
}