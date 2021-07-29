package com.example.evaluation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Model> modelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initViews();
        setReyclerData();
        setRecyclerView();
    }

    private void setReyclerData() {
        ApiService apiService = Network.getRetrofitInstance().create(ApiService.class);
        apiService.getUser().enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                ResponseModel model = response.body();
                int date = model.getDate();
                int positive = model.getPositive();
                int negative = model.getNegative();
                int hospitalizedCurrently = model.getHospitalizedCurrently();
                int  onVentilatorCurrently = model.getOnVentilatorCurrently();
                int death = model.getDeath();
                String dateChecked = model.getDateChecked();

//                modelList.add(new Model(date,positive,negative,hospitalizedCurrently,onVentilatorCurrently,death,dateChecked));
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {

            }
        });
    }

    private void setRecyclerView() {
        Adapter adapter = new Adapter(modelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void initViews() {
        recyclerView  = findViewById(R.id.recyclerView);
    }
}