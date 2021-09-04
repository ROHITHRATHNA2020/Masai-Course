package com.example.scopefunctions

import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

class Network {

    companion object{

        private val httpLoggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);


        fun getInstance() : Retrofit{

            return Retrofit.Builder()
                .baseUrl("https:/reqres.in/")
                .addConverterFactory()
        }

    }
}