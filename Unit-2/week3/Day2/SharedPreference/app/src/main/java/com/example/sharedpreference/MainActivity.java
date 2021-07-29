package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mtvData;
    private Button mbtnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtvData =findViewById(R.id.tvData);
        mbtnSave = findViewById(R.id.btnSave);
        PreferenceHelper.getSharedPrefernce(this);
        int value =  PreferenceHelper.getIntToPreference(MainActivity.this,"value");
        mtvData.setText(value+"");
        mbtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreferenceHelper.writeIntToPreference(25,MainActivity.this,"value");

            }
        });
    }
}