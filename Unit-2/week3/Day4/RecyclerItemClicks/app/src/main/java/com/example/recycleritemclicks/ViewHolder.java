package com.example.recycleritemclicks;

import android.view.View;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    private ImageView sunrise;
    private TextView mtvtext;
    private TextView mtvdescription;
    private ItemClickListeners itemClickListeners;
    private LinearLayout ll1;


    public ViewHolder(@NonNull  View itemView,ItemClickListeners itemClickListeners) {
        super(itemView);
        this.itemClickListeners = itemClickListeners;
        initViews(itemView);
    }
    private void initViews(View itemView) {
        sunrise = itemView.findViewById(R.id.ivsunrise);
        mtvtext = itemView.findViewById(R.id.tvtext);
        mtvdescription = itemView.findViewById(R.id.tvdescription);
        ll1 = itemView.findViewById(R.id.ll1);

    }

    public void setData(Model model){
        sunrise.setImageResource(model.getImage());
        mtvtext.setText(model.getText());
        mtvdescription.setText(model.getDescription());
        ll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListeners.onItemClicked(model);
            }
        });

    }
}
/*
package com.example.recycleritemclicks;



public class ViewHolder extends RecyclerView.ViewHolder {



    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        sunrise = itemView.findViewById(R.id.ivsunrise);
        mtvtext = itemView.findViewById(R.id.tvtext);
        mtvdescription = itemView.findViewById(R.id.tvdescription);

    }

    public void setData(Model model){
        sunrise.setImageResource(model.getImage());
        mtvtext.setText(model.getText());
        mtvdescription.setText(model.getDescription());
    }
}
/*

 */
