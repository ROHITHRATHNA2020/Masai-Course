package com.example.evaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signin extends AppCompatActivity {

    private EditText msName;
    private EditText msPass;
    private Button mbtnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        msName = findViewById(R.id.sname);
        msPass = findViewById(R.id.pass);
        mbtnSignIn = findViewById(R.id.btnSignin);
        String name = msName.getText().toString();
        String pass = msPass.getText().toString();
        mbtnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signin.this, welcome.class);
                intent.putExtra("key", name);
                startActivity(intent);
            }
        });

    }
}