package com.example.trecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MultipleViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Model> modelList;
    private ItemClickListener itemClickListener;

    public MultipleViewAdapter(List<Model> modelList, ItemClickListener itemClickListener) {
        this.modelList = modelList;
        this.itemClickListener = itemClickListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case Model.text_type:
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_layout, parent, false);
                return new TextViewHolder(view, itemClickListener);
            case Model.audio_type:
                View audioview = LayoutInflater.from(parent.getContext()).inflate(R.layout.audio_layout, parent, false);
                return new AudioViewHolder(audioview, itemClickListener);
            case Model.image_type:
                View imageview = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_layout, parent, false);
                return new ImageViewHolder(imageview, itemClickListener);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewType = modelList.get(position).getItemViewType();
        Model model = modelList.get(position);
        switch (viewType) {
            case Model.text_type:
                if (holder instanceof TextViewHolder) {
                    ((TextViewHolder) holder).setData(model);
                }
                break;
            case Model.audio_type:
                if (holder instanceof AudioViewHolder) {
                    ((AudioViewHolder) holder).setData(model);
                }
                break;
            case Model.image_type:
                if (holder instanceof TextViewHolder) {
                    ((ImageViewHolder) holder).setData(model);
                }

        }

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        int viewType = modelList.get(position).getItemViewType();
        return viewType;
    }
}
