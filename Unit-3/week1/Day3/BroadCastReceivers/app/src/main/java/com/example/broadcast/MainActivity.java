package com.example.broadcast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mbtnSend;
    private TextView mtvData;
    private LocalClass localClass;
    private LocalBroadcastManager localBroadcastManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        localBroadcastManager = LocalBroadcastManager.getInstance(this);
        mbtnSend = findViewById(R.id.btnSend);
        mtvData = findViewById(R.id.tvData);
        registerLocalReceiver();
        mbtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.and03.rohith");
                intent.putExtra("key","hello masai school");
                localBroadcastManager.sendBroadcast(intent);
            }
        });
    }

    private void registerLocalReceiver(){
        localClass = new LocalClass();
        IntentFilter intentFilter = new IntentFilter("com.and03.rohith");
        localBroadcastManager.registerReceiver(localClass,intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        localBroadcastManager.unregisterReceiver(localClass);
    }


    private class LocalClass extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {
            if(intent!=null){
                String data = intent.getStringExtra("key");
                mtvData.setText(data);
            }
        }
    }
}