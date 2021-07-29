package com.example.retrofit11;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostViewHolder extends RecyclerView.ViewHolder {

    private TextView mtvName;
    private TextView mtvEmail;
    private TextView mtvBody;

    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);

    }

    private void initViews(View itemView) {
        mtvBody = itemView.findViewById(R.id.tvBody);
        mtvEmail = itemView.findViewById(R.id.tvEmail);
        mtvName = itemView.findViewById(R.id.tvEmail);

    }

    public void setData(ResponseModel responseModel){
        mtvEmail.setText(responseModel.getEmail());
        mtvName.setText(responseModel.getName());
        mtvBody.setText(responseModel.getBody());
    }
}
