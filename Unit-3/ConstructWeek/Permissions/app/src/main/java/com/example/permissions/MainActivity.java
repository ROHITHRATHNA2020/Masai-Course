package com.example.permissions;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mbtnSend;
    private Button mbtnReceieve;
    private static final int REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtnSend = findViewById(R.id.btnSend);
        mbtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requestPermission();
            }
        });
        mbtnReceieve = findViewById(R.id.btnReceive);
        mbtnReceieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requestPermission();
            }
        });
    }

    private void requestPermission() {
        String[] permissions ={Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.CHANGE_WIFI_STATE};
        ActivityCompat.requestPermissions(MainActivity.this,permissions,REQUEST_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED){
            showToast("Both the permission granted");
        }else if(grantResults[0]==PackageManager.PERMISSION_GRANTED && grantResults[1]==PackageManager.PERMISSION_DENIED){
            showToast("location granted but wifi denied");
            if(ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,permissions[0])){
                showToast("location granted but wifi denied");
            }else{
                showToast("location denied by checking donot show again checkbox");

            }
        }else if(grantResults[0]==PackageManager.PERMISSION_DENIED && grantResults[1]==PackageManager.PERMISSION_GRANTED){
            showToast("wifi granted and location denied");
        }else if(grantResults[0]==PackageManager.PERMISSION_DENIED && grantResults[1]==PackageManager.PERMISSION_DENIED){
            showToast("Both are denied");
            if(ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,permissions[0])
                    && ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,permissions[1])){
                showToast("location and wifi got denied");
            }else{
                showToast("location and storage denied by checking donot show again checkbox");
            }
        }

    }
    public void showToast(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

}