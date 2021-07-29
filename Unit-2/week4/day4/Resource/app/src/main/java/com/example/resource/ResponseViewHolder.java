package com.example.resource;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ResponseViewHolder extends RecyclerView.ViewHolder {

    private TextView mtvFirst;
    private TextView mtvlast;
    private TextView mtvEmail;

    public ResponseViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvFirst = itemView.findViewById(R.id.tvFirst);
        mtvlast = itemView.findViewById(R.id.tvSecond);
        mtvEmail = itemView.findViewById(R.id.tvEmail);

    }

    public void setData(Model model){
        mtvFirst.setText(model.getFirstName());
        mtvlast.setText(model.getLastName());
        mtvEmail.setText(model.getEmail());

    }
}
