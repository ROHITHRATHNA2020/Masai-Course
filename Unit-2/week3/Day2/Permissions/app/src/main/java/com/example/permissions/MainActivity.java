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

    private Button mrp;
    private static final int REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrp = findViewById(R.id.rp);
        mrp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] permissions ={Manifest.permission.CAMERA,Manifest.permission.READ_EXTERNAL_STORAGE};
                ActivityCompat.requestPermissions(MainActivity.this,permissions,REQUEST_CODE);
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
       if(grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED){
           showToast("Both the permission granted");
        }else if(grantResults[0]==PackageManager.PERMISSION_GRANTED && grantResults[1]==PackageManager.PERMISSION_DENIED){
           showToast("Camera granted but storage denied");
           if(ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,permissions[0])){
               showToast("Camera granted but storage denied");
           }else{
               showToast("Camera denied by checking donot show again checkbox");

           }
       }else if(grantResults[0]==PackageManager.PERMISSION_DENIED && grantResults[1]==PackageManager.PERMISSION_GRANTED){
           showToast("storage granted and camera denied");
       }else if(grantResults[0]==PackageManager.PERMISSION_DENIED && grantResults[1]==PackageManager.PERMISSION_DENIED){
           showToast("Both are denied");
           if(ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,permissions[0])
                   && ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,permissions[1])){
               showToast("camera and storage got denied");
           }else{
               showToast("Camera and storage denied by checking donot show again checkbox");
           }
//           String[] permissions1 ={Manifest.permission.CAMERA,Manifest.permission.READ_EXTERNAL_STORAGE};
//           ActivityCompat.requestPermissions(MainActivity.this,permissions1,REQUEST_CODE);

       }

    }
    public void showToast(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

}