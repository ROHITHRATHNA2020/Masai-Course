package com.example.fragmentcomwe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PreviewActivity extends AppCompatActivity {

    private TextView mtvName;
    private TextView mtvAge;
    private TextView mtvGrade;
    private TextView mtvPer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        initViews();
        getDatafromIntent();
    }

    private void getDatafromIntent() {
        Model model = (Model) getIntent().getSerializableExtra("model");
        mtvName.setText(model.getName());
        mtvAge.setText(model.getAge()+" ");
        mtvGrade.setText(model.getGrade());
        mtvPer.setText(model.getPercentage());
    }

    private void initViews() {
        mtvName = findViewById(R.id.tvStudentName);
        mtvAge = findViewById(R.id.tvStudentAge);
        mtvGrade = findViewById(R.id.tvStudentGrade);
        mtvPer = findViewById(R.id.tvStudentPercentage);
    }
}