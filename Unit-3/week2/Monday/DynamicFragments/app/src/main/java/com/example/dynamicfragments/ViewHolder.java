package com.example.dynamicfragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ViewHolder extends RecyclerView.ViewHolder {

    private ImageView ivImage;
    private TextView mtvText;
    private TextView mtvDescription;

    public ViewHolder(@NonNull  View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
    ivImage = itemView.findViewById(R.id.ivImage);
    mtvText = itemView.findViewById(R.id.tvText);
    mtvDescription = itemView.findViewById(R.id.tvDescription);
    }

    public void setData(ResponseModel responseModel){
        Glide.with(ivImage).load(responseModel.getImage()).into(ivImage);

        mtvText.setText(responseModel.getSubTitle());
        mtvDescription.setText(responseModel.getTitle());
    }


}
