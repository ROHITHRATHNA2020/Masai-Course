package com.example.birds;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BirdAdapter extends RecyclerView.Adapter<BirdViewHolder> {

    private ArrayList<Bird> birdList;
    private ItemClickListeners itemClickListeners;

    public BirdAdapter(ArrayList<Bird> birdList,ItemClickListeners itemClickListeners) {
        this.birdList = birdList;
        this.itemClickListeners = itemClickListeners;
    }

    @Override
    public BirdViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bird_layout, parent, false);
        return new BirdViewHolder(view,itemClickListeners);
    }

    @Override
    public void onBindViewHolder(@NonNull BirdViewHolder holder, int position) {
        Bird bird = birdList.get(position);
        holder.setData(bird);

    }

    @Override
    public int getItemCount() {
        return birdList.size();
    }
}
