package com.example.dynamicfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FragmentA extends Fragment {

    private Button mbtn;
    private RecyclerView recyclerView;
    private Adapter adapter;
    List<ResponseModel> responseModelList = new ArrayList<>();

    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);

    }

    @Override
    public void onViewCreated(@NonNull  View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);

    }

    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
        mbtn = view.findViewById(R.id.btn);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRecyclerView();
                callApiService();
            }
        });

    }

    private void callApiService() {
        ApiService apiService = Network.getInstance().create(ApiService.class);
        Call<List<ResponseModel>> call = apiService.data("shivarajp",
                "2cbe00030c04472c9d8ad4b0ec112dbe",
                "raw","c651391e428182f08d60d59e79073f3fcf79b858","nobroker");
        call.enqueue(new Callback<List<ResponseModel>>() {
            @Override
            public void onResponse(Call<List<ResponseModel>> call, Response<List<ResponseModel>> response) {
                if (response.code() == HttpURLConnection.HTTP_OK) ;
                responseModelList = response.body();
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<ResponseModel>> call, Throwable t) {

            }
        });

    }

    private void setRecyclerView(){
         adapter = new Adapter(responseModelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }


}