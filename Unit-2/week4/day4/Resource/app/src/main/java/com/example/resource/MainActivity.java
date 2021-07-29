package com.example.resource;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText metNumber;
    private Button mbtnContinue;
    private RecyclerView recyclerView;
    private ArrayList<Model> modelList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        metNumber = findViewById(R.id.etNumber);
        mbtnContinue = findViewById(R.id.btnContinue);
        recyclerView = findViewById(R.id.recyclerView);

        mbtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callApi();


            }
        });

        setDataList();
        setRecyclerView();

    }

    ResponseModel responseModel;

    private void callApi() {
        ApiService apiService = Network.getInstance().create(ApiService.class);
        apiService.getUser(Integer.parseInt(metNumber.getText().toString())).enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                if (response != null && response.body() != null) {
                    responseModel = response.body();
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("number",metNumber.getText().toString());
                    intent.putExtra("name",responseModel.getData().getName());
                    intent.putExtra("color",responseModel.getData().getColor());
                    intent.putExtra("company",responseModel.getData().getPantoneValue());
                    startActivity(intent);

                }
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {

            }
        });

    }

    private void setDataList() {
        modelList.add(new Model("rohith", "rathna", "romeo"));
        modelList.add(new Model("rohith", "rathna", "romeo"));
        modelList.add(new Model("rohith", "rathna", "romeo"));
        modelList.add(new Model("rohith", "rathna", "romeo"));

    }

    private void setRecyclerView() {
        ResponseAdapter responseModel = new ResponseAdapter(modelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(responseModel);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}