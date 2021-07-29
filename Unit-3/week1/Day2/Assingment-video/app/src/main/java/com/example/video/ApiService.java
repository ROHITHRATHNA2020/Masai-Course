package com.example.video;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {
    @Headers("Authorization: Client-ID 1319c8f7d7ef748")
    @POST("3/upload")
    @Multipart
    Call<ResponseDTO> uploadVideo(
            @Part String file,
            @Part("title") Map<String, RequestBody> title
    );


}
