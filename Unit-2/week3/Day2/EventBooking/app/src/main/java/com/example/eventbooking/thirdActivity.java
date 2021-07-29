package com.example.eventbooking;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class thirdActivity extends AppCompatActivity {

    private TextView mtvFirstName;
    private TextView mtvLastName;
    private TextView mtvEmail;
    private TextView mtvSeats;
    private TextView mtvDate;
    private Button mbtnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        mtvFirstName = findViewById(R.id.tvFirstName3);
        mtvLastName = findViewById(R.id.tvSecondName3);
        mtvEmail = findViewById(R.id.tvEmail3);
        mtvSeats = findViewById(R.id.tvSeats3);
        mtvDate = findViewById(R.id.tvDate3);
        mbtnConfirm = findViewById(R.id.btnConfirm);
        String first = PreferenceHelper.getStringFromPreference( "first");
        mtvFirstName.setText(first);
        String last = PreferenceHelper.getStringFromPreference( "last");
        mtvLastName.setText(last);
        String email = PreferenceHelper.getStringFromPreference( "email");
        mtvEmail.setText(email);
        String seats = PreferenceHelper.getStringFromPreference( "seats");
        mtvSeats.setText(seats);
        String date = PreferenceHelper.getStringFromPreference( "date");
        mtvLastName.setText(date);
        mbtnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(mbtnConfirm.getContext())
                        .setTitle("Tickets Confirmed")
                        .setMessage(mtvDate.getText().toString())
                        .show();
            }
        });
    }
}

/*
 AlertDialog alertDialog = new AlertDialog.Builder(this,2)
                        .setTitle(mtvFirstName.getText().toString(),
                                mtvDate.getText().toString()+"",
                                mtvSeats.getText().toString()+"")
                        .setMessage("Tickets Confirmed")
                        .show();



AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Hey this is the Data")
                .setMessage(
                        model.getName() + "\n"
                                + model.getAge() + "\n"
                                + model.getDob() + "\n"
                                + model.getAddress()
                ).
                        setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        show();
 */