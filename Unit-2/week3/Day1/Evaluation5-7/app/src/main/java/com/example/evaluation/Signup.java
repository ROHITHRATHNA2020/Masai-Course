package com.example.evaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Signup extends AppCompatActivity {


    private TextView mtvSignIn;
    private EditText metName;
    private EditText metEmail;
    private EditText metPass;
    private Button mbtnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        metName = findViewById(R.id.etName);
        metEmail = findViewById(R.id.etEmail);
        metPass = findViewById(R.id.etPass);
        mtvSignIn = findViewById(R.id.tvSignIn);
        mbtnSignUp = findViewById(R.id.btnSignup);
        String name = metName.getText().toString();
        String email = metEmail.getText().toString();
        String pass = metPass.getText().toString();
        if(email.length()>=5){
            if(pass.length() <= 4){
                metPass.setError("min 4 characters");
            }else{
                Intent intent = new Intent(Signup.this,welcome.class);
                intent.putExtra("key",name);
                startActivity(intent);
            }
        }
        mtvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signup.this,Signin.class);
                startActivity(intent);
            }
        });
    }
}