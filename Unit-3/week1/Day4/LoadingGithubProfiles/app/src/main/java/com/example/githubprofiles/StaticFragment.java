package com.example.githubprofiles;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.HTTP;

public class StaticFragment extends Fragment {

    private RecyclerView recyclerView;
    private EditText metSearch;
    private Button mbtn;
    private Adapter adapter;
    private List<ResponseModel> responseModelList = new ArrayList<>();




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_static, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @NonNull Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);


    }

    private void BuildList() {
        ApiService apiService = Network.getInstance().create(ApiService.class);
        Call<List<ResponseModel>> call = apiService.getUser(metSearch.getText().toString());
        call.enqueue(new Callback<List<ResponseModel>>() {
            @Override
            public void onResponse(Call<List<ResponseModel>> call, Response<List<ResponseModel>> response) {
                if(response.code() == HttpURLConnection.HTTP_OK){
                    responseModelList = response.body();
                    adapter.updateData(responseModelList);
                }
            }

            @Override
            public void onFailure(Call<List<ResponseModel>> call, Throwable t) {

            }
        });
    }

    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
        metSearch = view.findViewById(R.id.etId);
        mbtn = view.findViewById(R.id.btnApiRequest);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BuildList();
                setRecyclerView();
            }
        });

    }

    private void setRecyclerView() {
        adapter = new Adapter(responseModelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}