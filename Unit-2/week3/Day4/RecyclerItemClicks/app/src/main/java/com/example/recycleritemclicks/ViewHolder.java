package com.example.recycleritemclicks;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    private ImageView sunrise;
    private TextView mtvtext;
    private TextView mtvdescription;

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