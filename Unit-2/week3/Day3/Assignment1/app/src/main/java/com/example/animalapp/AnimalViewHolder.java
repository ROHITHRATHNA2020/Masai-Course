package com.example.animalapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    private ImageView mtvAnimal;
    private TextView mtvName;
    private TextView mtvSound;

    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvAnimal = itemView.findViewById(R.id.ivAnimal);
        mtvName = itemView.findViewById(R.id.tvName);
        mtvSound = itemView.findViewById(R.id.tvSound);

    }

    public void setData(Animal animal){
        mtvAnimal.setImageResource(animal.getImage());
        mtvName.setText(animal.getName());
        mtvSound.setText(animal.getSound());
    }


}
