package com.example.practice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("/api/users")
    Call<ResponseModel> getUser();

}

/*
 @GET("/api/users/{userId}")
    Call<List<ResponseModel>> userId( @Path("userdId") int userid);

    @GET("/api/users/{userId}")
    Call<ResponseModel> getUser(@Path("userId") int userId);

 */