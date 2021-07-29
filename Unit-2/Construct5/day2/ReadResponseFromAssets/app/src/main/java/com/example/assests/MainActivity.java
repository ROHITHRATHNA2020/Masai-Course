package com.example.assests;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button mbtn;
    private RecyclerView recyclerView;
    private List<FormulasModel> formulasModelList = new ArrayList<>();
    private FormulaAdapter formulaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewsandListeners();
        setRecyclerView();
    }

    private void setRecyclerView() {
        formulaAdapter = new FormulaAdapter(formulasModelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(formulaAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    private void initViewsandListeners() {
        mbtn = findViewById(R.id.btn);
        recyclerView = findViewById(R.id.recyclerView);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startBackgroundThread();
            }
        });
    }

    private void startBackgroundThread() {
        Thread thread = new Thread(runnable);
        thread.start();
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            ReadJsonFromAssets();
        }
    };

    private void ReadJsonFromAssets(){
        try {
            InputStream inputStream = getAssets().open("formula.json");
            int data = inputStream.read();
            StringBuilder builder = new StringBuilder();
            while(data != -1){
                char ch = (char)data;
                builder.append(ch);
                data = inputStream.read();
            }
            buildJsonFromPojo(builder);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void buildJsonFromPojo(StringBuilder builder){
        String json = builder.toString();
        Gson gson = new Gson();
        Type type = new TypeToken<ResponseModel>(){}.getType();
        ResponseModel response = gson.fromJson(json,type);
        formulasModelList = response.getFormulas();
        updateUI();
    }

    private void updateUI() {
    runOnUiThread(new Runnable() {
        @Override
        public void run() {
            formulaAdapter.updateData(formulasModelList);
        }
    });
    }
}