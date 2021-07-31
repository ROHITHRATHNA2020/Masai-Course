package com.example.githubprofiles;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView mtvName;
    private TextView mtvLogin;
    private ImageView mivAvatar;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvName = itemView.findViewById(R.id.tvName);
        mtvLogin = itemView.findViewById(R.id.tvlogin);
        mivAvatar = itemView.findViewById(R.id.ivAvatar);
    }

    public void setData(ResponseModel responseModel){
        mtvName.setText(responseModel.getName());
        mtvLogin.setText(responseModel.getOwner().getLogin());
        Glide.with(mivAvatar).load(responseModel.getOwner().getAvatarUrl()).into(mivAvatar);
    }


}
