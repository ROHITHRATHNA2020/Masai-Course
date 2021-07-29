package com.example.youtube;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView mtvLink;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
    mtvLink = itemView.findViewById(R.id.tvLink);
    }

    public void setData(Youtube youtube){
        mtvLink.setText(youtube.getLink());
    }
}
