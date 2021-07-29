package com.example.resource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class item_layout extends AppCompatActivity {

    private TextView mtvNumber;
    private TextView mtvName;
    private TextView mtvYear;
    private TextView mtvColor;
    private List<DataModel> dataModelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_layout);
        mtvNumber = findViewById(R.id.tvNumber);
        mtvName = findViewById(R.id.tvName);
        mtvYear = findViewById(R.id.tvYear);
        mtvColor = findViewById(R.id.tvColor);
        Intent intent = getIntent();
        int n = intent.getIntExtra("key",1);
        mtvNumber.setText(n);
        ApiService apiService = Network.getInstance().create(ApiService.class);
//        apiService.getUser(n).enqueue(new Callback<ResponseModel>() {
//            @Override
//            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
//                ResponseModel model = response.body();
//                String name = model.getData()
//            }
//
//            @Override
//            public void onFailure(Call<ResponseModel> call, Throwable t) {
//
//            }
//        });

    }
}