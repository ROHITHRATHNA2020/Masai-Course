package com.example.evaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText mtvEmail;
    private EditText mtvPass;
    private RadioButton mrgCheck;
    private Button mbtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mtvEmail = findViewById(R.id.etEmail);
        mtvPass = findViewById(R.id.etPass);
//        mrgCheck = findViewById(R.id.rgCheck);
        mbtnLogin = findViewById(R.id.btnLogin);
        mbtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mtvEmail.getText().toString().length()>8 && mtvPass.getText().toString().length()>5){
                    Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}