package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button mbtnSend;
    private EditText metName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbtnSend = findViewById(R.id.btnSend);
        metName = findViewById(R.id.etName);

        mbtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("android.content.Intent.ACTION_SEND");
                intent.setType("plain/text");
                intent.putExtra("key","Rohithrathna");

                PackageManager packageManager = getPackageManager();
                List<ResolveInfo> list = packageManager.queryIntentActivities(intent,0);
                if(list!=null && list.size()>=1){
                    startActivity(intent);
                }
            }
        });
    }
}
