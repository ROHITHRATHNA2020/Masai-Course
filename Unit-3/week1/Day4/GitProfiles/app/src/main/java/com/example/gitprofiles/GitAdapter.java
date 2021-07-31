package com.example.gitprofiles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class GitAdapter extends RecyclerView.Adapter<GitViewHolder> {


    List<ResponseModel> responseModels;

    public GitAdapter(List<ResponseModel> responseModels) {
        this.responseModels = responseModels;
    }

    @NotNull
    @Override
    public GitViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new GitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull GitViewHolder holder, int position) {
        ResponseModel responseModel = responseModels.get(position);
        holder.setData(responseModel);
    }

    @Override
    public int getItemCount() {
        return responseModels.size();
    }

    public void updateData(List<ResponseModel> responseModelItems) {
        this.responseModels = responseModelItems;
        notifyDataSetChanged();
    }
}
