package com.example.youtube;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<Youtube> youtubeList;

    public Adapter(ArrayList<Youtube> youtubeList){
        this.youtubeList = youtubeList;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Youtube youtube = youtubeList.get(position);
        holder.setData(youtube);
    }

    @Override
    public int getItemCount() {
        return youtubeList.size();
    }
}
