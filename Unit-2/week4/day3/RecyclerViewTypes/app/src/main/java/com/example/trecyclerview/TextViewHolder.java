package com.example.trecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TextViewHolder extends RecyclerView.ViewHolder {


    private ItemClickListener itemClickListener;
    private TextView mtvtitle;

    public TextViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        mtvtitle = itemView.findViewById(R.id.tvtitle);
    }


    public void setData(Model model) {
        mtvtitle.setText(model.getContent());
    }
}
