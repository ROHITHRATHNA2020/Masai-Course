package com.example.evaluation;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET ("v1/us/daily.json")
    Call<ResponseModel> getUser();
}
