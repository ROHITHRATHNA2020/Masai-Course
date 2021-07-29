package com.example.birds;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class BirdViewHolder extends RecyclerView.ViewHolder {

    private ImageView mtvAustralia;
    private TextView mtvName;
    private RelativeLayout relativeLayout;
    private ItemClickListeners itemClickListeners;

    public BirdViewHolder(@NonNull View itemView,ItemClickListeners itemClickListeners) {
        super(itemView);
        this.itemClickListeners = itemClickListeners;
        initViews(itemView);

    }

    private void initViews(View itemView) {
        mtvAustralia = itemView.findViewById(R.id.ivAustralia);
        mtvName = itemView.findViewById(R.id.tvName);
        relativeLayout = itemView.findViewById(R.id.relativeLayout);

    }

    public void setData(Bird bird){
        mtvAustralia.setImageResource(bird.getImage());
        mtvName.setText(bird.getName());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            itemClickListeners.onItemClicked(bird);

            }
        });
    }
}
