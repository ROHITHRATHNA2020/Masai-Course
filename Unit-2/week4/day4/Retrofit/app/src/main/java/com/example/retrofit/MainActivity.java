package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText metUserId;
    private Button mtbnCallApi;
    private TextView mtvFirstName;
    private TextView mtvLastName;
    private ImageView mivAvatar;
    private TextView mtvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        metUserId = findViewById(R.id.etUserId);
        mtbnCallApi = findViewById(R.id.btnCallApi);
        mtvFirstName = findViewById(R.id.tvfirstName);
        mtvLastName = findViewById(R.id.tvLastName);
        mivAvatar = findViewById(R.id.ivAvatar);
        mtvEmail = findViewById(R.id.tvEmail);
        mtbnCallApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ApiService apiService = Network.getInstance().create(ApiService.class);
               int userId = Integer.parseInt(metUserId.getText().toString());
                apiService.getUser(userId).enqueue(new Callback<ResponseModel>() {
                    @Override
                    public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                        ResponseModel model = response.body();
                        String firstName = model.getData().getFirstName();
                        String lastName = model.getData().getLastName();
                        String email = model.getData().getEmail();
                        mtvFirstName.setText(firstName);
                        mtvLastName.setText(lastName);
                        mtvEmail.setText(email);
                        Glide.with(mivAvatar).load(model.getData().getAvatar()).into(mivAvatar);

                    }

                    @Override
                    public void onFailure(Call<ResponseModel> call, Throwable t) {

                    }
                });
            }
        });

    }
}










