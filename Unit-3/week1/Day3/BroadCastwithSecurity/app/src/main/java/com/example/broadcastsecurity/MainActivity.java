package com.example.broadcastsecurity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button mbtnSend;
    private LocalReceiver localReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtnSend = findViewById(R.id.btnSend);
        registerLocalReceiver();
        mbtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.action.rohith");
                intent.putExtra("message","hi there");
                sendBroadcast(intent);
            }
        });
    }

    private void registerLocalReceiver(){
        localReceiver = new LocalReceiver();
        IntentFilter intentFilter = new IntentFilter("com.action.rohith");
        registerReceiver(localReceiver,intentFilter);
    }

}