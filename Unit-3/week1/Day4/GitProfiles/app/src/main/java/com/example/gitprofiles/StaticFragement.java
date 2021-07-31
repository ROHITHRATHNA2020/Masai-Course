package com.example.gitprofiles;

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

public class StaticFragement extends Fragment {

    private RecyclerView recyclerView;
    private Button mbtn;
    private EditText metUserName;
    private GitAdapter gitAdapter;
    private List<ResponseModel> responseModelList = new ArrayList<>();




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_static_fragement, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @NonNull Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerview);
        metUserName = view.findViewById(R.id.etSearch);
        mbtn = view.findViewById(R.id.btnB);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BuildList();
                setRecyclerView();
            }


        });
    }

    private void BuildList() {
        ApiService apiservice = Network.getInstance().create(ApiService.class);
        Call<List<ResponseModel>> call = apiservice.getData(metUserName.getText().toString());
        call.enqueue(new Callback<List<ResponseModel>>() {
            @Override
            public void onResponse(Call<List<ResponseModel>> call, Response<List<ResponseModel>> response) {
                if (response.code() == HttpURLConnection.HTTP_OK) {
                    responseModelList = response.body();
                    gitAdapter.updateData(responseModelList);
                }
            }

            @Override
            public void onFailure(Call<List<ResponseModel>> call, Throwable t) {

            }
        });
    }

    private void setRecyclerView() {
        gitAdapter = new GitAdapter(responseModelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(gitAdapter);

    }


}

/*
    private void BuildList() {
        Apiservice apiservice=Network.getInstance().create(Apiservice.class);
        Call<List<ResponseModel>>call=apiservice.getData(UserName.getText().toString());
        call.enqueue(new Callback<List<ResponseModel>>() {
            @Override
            public void onResponse(Call<List<ResponseModel>> call, Response<List<ResponseModel>> response) {
                if(response.code()== HttpURLConnection.HTTP_OK){
                    responseModelList=response.body();
                    gitAdapter.updateData(responseModelList);
                }
            }

            @Override
            public void onFailure(Call<List<ResponseModel>> call, Throwable t) {

            }
        });
    }

}
 */