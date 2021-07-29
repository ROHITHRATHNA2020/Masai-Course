package com.example.eventbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText metFirstName;
    private EditText metLastName;
    private EditText metEmail;
    private EditText metPhoneNumber;
    private Button mbtnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        metFirstName = findViewById(R.id.etFirstName);
        metLastName = findViewById(R.id.etLastName);
        metEmail = findViewById(R.id.etEmail);
        metPhoneNumber = findViewById(R.id.etPhoneNo);
        mbtnNext = findViewById(R.id.btnNext);
        PreferenceHelper.getSharedPreference(this);
        PreferenceHelper.writeStringToPreference("first",metFirstName.getText().toString());
        Log.d("TAG",metFirstName.getText().toString());
        PreferenceHelper.writeStringToPreference("last",metLastName.getText().toString());
        PreferenceHelper.writeStringToPreference("email",metEmail.getText().toString());
        PreferenceHelper.writeStringToPreference("phone",metPhoneNumber.getText().toString());
        mbtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                Log.d("rohith",metFirstName.getText().toString());
                startActivity(intent);
            }
        });

    }
}