package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class menuViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView mtvtextView;
    private TextView mtvitemPrice;
    public menuViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        imageView = itemView.findViewById(R.id.item);
        mtvtextView = itemView.findViewById(R.id.ivName);
        mtvitemPrice = itemView.findViewById(R.id.ivprice);
    }

    public void setData(Menu menu){
        imageView.setImageResource(menu.getImage());
        mtvtextView.setText(menu.getItemName());
        mtvitemPrice.setText(menu.getPrice()+"");

    }
}
