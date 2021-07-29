package com.example.callerapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView mtvName;
    private TextView mtvNumber;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvName = itemView.findViewById(R.id.tvName);
        mtvNumber = itemView.findViewById(R.id.tvNumber);

    }

    public void setData(Contacts contacts){
        mtvName.setText(contacts.getName());
        mtvNumber.setText(contacts.getNumber());
    }


}
