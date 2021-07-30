package com.example.broadcastsecurity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class LocalReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent!=null){
            Log.d("TAG",intent.getAction());
           Intent activityIntent = new Intent(context,ReceiveActivity.class);
           String message = intent.getStringExtra("message");
           activityIntent.putExtra("message",message);
           context.startActivity(activityIntent);
        }
    }
}
