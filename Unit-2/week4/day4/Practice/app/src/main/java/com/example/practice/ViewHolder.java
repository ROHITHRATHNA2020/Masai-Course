package com.example.practice;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView mtvTitle;
    private TextView mtvuserId;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
    mtvTitle = itemView.findViewById(R.id.tvTitle);
    mtvuserId = itemView.findViewById(R.id.tvUser);

    }

    public void setData(Model model){
        mtvTitle.setText(model.getTitle());
        mtvuserId.setText(model.getUserId()+"");
    }
}
