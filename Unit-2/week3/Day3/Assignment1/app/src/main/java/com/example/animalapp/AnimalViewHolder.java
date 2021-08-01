package com.example.animalapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    private ImageView mtvAnimal;
    private TextView mtvName;
    private TextView mtvSound;
    private CardView mcd;
    private ItemClickListeners itemClickListeners;

    public AnimalViewHolder(@NonNull View itemView,ItemClickListeners itemClickListeners) {
        super(itemView);
        this.itemClickListeners = itemClickListeners;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvAnimal = itemView.findViewById(R.id.ivAnimal);
        mtvName = itemView.findViewById(R.id.tvName);
        mtvSound = itemView.findViewById(R.id.tvSound);
        mcd =itemView.findViewById(R.id.cd1);

    }

    public void setData(Animal animal){
        mtvAnimal.setImageResource(animal.getImage());
        mtvName.setText(animal.getName());
        mtvSound.setText(animal.getSound());
        mcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListeners.onItemClicked(animal);
            }
        });
    }


}
