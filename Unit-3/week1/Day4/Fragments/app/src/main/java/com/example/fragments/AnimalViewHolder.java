package com.example.fragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    private TextView mtvName;
    private ImageView mivAnimal;

    public AnimalViewHolder(@NonNull  View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvName = itemView.findViewById(R.id.tvName);
        mivAnimal = itemView.findViewById(R.id.ivAnimal);

    }

    public void setData(Animal animal){
        mtvName.setText(animal.getName());
        mivAnimal.setImageResource(animal.getImageId());
    }
}
