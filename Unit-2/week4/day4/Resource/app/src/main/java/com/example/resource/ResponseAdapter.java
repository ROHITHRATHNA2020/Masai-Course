package com.example.resource;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ResponseAdapter extends RecyclerView.Adapter<ResponseViewHolder> {

    private ArrayList<Model> modelList;

    public ResponseAdapter(ArrayList<Model> modelList){
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public ResponseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ResponseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResponseViewHolder holder, int position) {
        Model model = modelList.get(position);
        holder.setData(model);
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
}
