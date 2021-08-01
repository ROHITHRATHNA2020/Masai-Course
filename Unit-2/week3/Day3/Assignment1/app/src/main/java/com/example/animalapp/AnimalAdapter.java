package com.example.animalapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {

    private ArrayList<Animal> animalList;
    private ItemClickListeners itemClickListeners;

    public AnimalAdapter(ArrayList<Animal> animalList,ItemClickListeners itemClickListeners){
        this.animalList = animalList;
        this.itemClickListeners = itemClickListeners;
    }

    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_layout,parent,false);
        return new AnimalViewHolder(view,itemClickListeners);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Animal animal = animalList.get(position);
        holder.setData(animal);
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }
}
