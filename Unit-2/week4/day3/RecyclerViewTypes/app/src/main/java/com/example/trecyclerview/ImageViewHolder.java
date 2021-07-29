package com.example.trecyclerview;

import android.media.Image;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ImageViewHolder extends RecyclerView.ViewHolder {
    private ItemClickListener itemClickListener;
    private TextView mtviamgetitle;
    private ImageView mtvscene;


    public ImageViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtviamgetitle = itemView.findViewById(R.id.tvimagetitle);
        mtvscene = itemView.findViewById(R.id.ivscene);
    }

    public void setData(Model model){
         mtvscene.setImageResource(model.getResId());
         mtviamgetitle.setText(model.getContent());

    }
}
