package com.example.scopefunctions

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiClient {

    @GET("/api/users/{id}")
    fun getUserDetails(@Path("10") id :Int): Call<ResponseDTO>




}