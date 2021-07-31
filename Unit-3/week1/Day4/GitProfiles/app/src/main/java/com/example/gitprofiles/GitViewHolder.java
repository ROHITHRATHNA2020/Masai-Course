package com.example.gitprofiles;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class GitViewHolder extends RecyclerView.ViewHolder {
    private ImageView mtvImg;
    private TextView mtvName;
    private TextView mtvLogin;

    public GitViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvImg = itemView.findViewById(R.id.ivImg);
        mtvName = itemView.findViewById(R.id.tvName);
        mtvLogin = itemView.findViewById(R.id.tvLogin);
    }

    public void setData(ResponseModel responseModel) {
        mtvName.setText(responseModel.getName());
        mtvLogin.setText(responseModel.getOwner().getLogin());
        Glide.with(mtvImg).load(responseModel.getOwner().getAvatarUrl()).into(
        mtvImg);


    }
}
