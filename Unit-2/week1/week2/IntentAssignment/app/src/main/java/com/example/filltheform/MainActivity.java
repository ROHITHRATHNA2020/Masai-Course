package com.example.filltheform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText metEmail;
    private EditText metcc;
    private EditText mettext;
    private Button mbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        metEmail = findViewById(R.id.etEmail);
        metcc = findViewById(R.id.etcc);
        mettext = findViewById(R.id.ettext);
        mbtn = findViewById(R.id.btn);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = metEmail.getText().toString();
                String[] cc = metcc.getText().toString().split(",");
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", mail, null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, mettext.getText().toString());
                emailIntent.putExtra(Intent.EXTRA_EMAIL, cc);
                startActivity(Intent.createChooser(emailIntent, null));
            }
        });
    }
}