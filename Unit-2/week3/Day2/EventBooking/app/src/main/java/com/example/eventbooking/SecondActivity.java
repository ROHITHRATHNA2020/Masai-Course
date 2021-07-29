package com.example.eventbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView mtvFirstName;
    private TextView mtvLastName;
    private TextView mtvEmail;
    private EditText metSeats;
    private EditText metDate;
    private Button mbtnPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mtvFirstName = findViewById(R.id.tvFirstName2);
        mtvLastName = findViewById(R.id.tvLastName2);
        mtvEmail = findViewById(R.id.tvEmail2);
        metSeats = findViewById(R.id.etSeats2);
        metDate = findViewById(R.id.etDate2);
        mbtnPreview = findViewById(R.id.btnPreview2);
        PreferenceHelper.getSharedPreference(this);
        String first = PreferenceHelper.getStringFromPreference("first");
        Log.d("rohitha",first);
        mtvFirstName.setText(first);

        String last = PreferenceHelper.getStringFromPreference("last");
        mtvLastName.setText(last);
        String email = PreferenceHelper.getStringFromPreference("email");
        mtvEmail.setText(email);
        PreferenceHelper.writeStringToPreference("seats",metSeats.getText().toString());
        PreferenceHelper.writeStringToPreference("date",metDate.getText().toString());
        mbtnPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,thirdActivity.class);
                startActivity(intent);
            }
        });

    }
}